package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.tgnet.TLRPC;

public final class AnimatedFileDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    private static int activeChoreographersCount;
    private final int MAX_TRIES;
    private boolean PRERENDER_FRAME;
    private final RectF actualDrawRect;
    private boolean applyTransformation;
    private AnimatedFileBuffer backgroundBuffer;
    private final Paint[] backgroundPaint;
    private final BitmapsCache bitmapsCache;
    Runnable cacheGenRunnable;
    AnimatedFileNative cacheGenerateDecoder;
    long cacheGenerateTimestamp;
    BitmapsCache.Metadata cacheMetadata;
    private Runnable cancelCache;
    private final int currentAccount;
    public long currentTime;
    private DispatchQueue decodeQueue;
    private boolean decodeSingleFrame;
    private boolean decoderCreated;
    private int decoderTryCount;
    private boolean destroyWhenDone;
    private final TLRPC.Document document;
    private final RectF dstRect;
    private final RectF[] dstRectBackground;
    private float endTime;
    private boolean forceDecodeAfterNextFrame;
    boolean generatingCache;
    Bitmap generatingCacheBitmap;
    private int invalidateAfter;
    private boolean invalidateParentViewWithSecond;
    private boolean invalidatePath;
    private boolean isChoreographerRegistered;
    private volatile boolean isPaused;
    private volatile boolean isRecycled;
    private boolean isRestarted;
    private volatile boolean isRunning;
    public boolean isWebmSticker;
    private long lastFrameDecodeTime;
    private long lastFrameTime;
    int lastMetadata;
    private int lastTimeStamp;
    private boolean limitFps;
    private final Runnable loadFrameRunnable;
    private Runnable loadFrameTask;
    private final boolean loop;
    private volatile AnimatedFileNative mDecoder;
    private final Runnable mStartTask;
    private final Choreographer60FpsContent.FrameCallback mUiThreadChoreographerCallback;
    private final int[] metaData;
    private AnimatedFileBuffer nextRenderingBuffer;
    private AnimatedFileBuffer nextRenderingBuffer2;
    private View parentView;
    private final ArrayList parents;
    private final File path;
    private boolean pendingRemoveLoading;
    private int pendingRemoveLoadingFramesReset;
    private volatile long pendingSeekTo;
    private volatile long pendingSeekToUI;
    private final boolean precache;
    private boolean ptrFail;
    private boolean recycleWithSecond;
    private AnimatedFileBuffer renderingBuffer;
    private int renderingHeight;
    private int renderingWidth;
    public int repeatCount;
    private final Path[] roundPath;
    private final int[] roundRadius;
    private int[] roundRadiusBackup;
    private float scaleFactor;
    private float scaleX;
    private float scaleY;
    private boolean scheduledForSeek;
    private final ArrayList secondParentViews;
    private final Matrix[] shaderMatrix;
    private boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    private float startTime;
    private AnimatedFileDrawableStream stream;
    private final long streamFileSize;
    private final int streamLoadingPriority;
    private boolean swapBuffersAllowedByChoreographer;
    private final Object sync;
    private int ticksWithoutDraw;
    int tryCount;
    private final Runnable uiRunnable;
    private final Runnable uiRunnableGenerateCache;
    private final Runnable uiRunnableNoFrame;
    private final ArrayList unusedBuffers;
    private boolean useSharedQueue;
    private static final float[] radii = new float[8];
    private static final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    private static final Xfermode SRC_XFERMODE = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    @Override
    public int getOpacity() {
        return -2;
    }

    public void uiRunnableNoFrameImpl() {
        chekDestroyDecoder();
        this.loadFrameTask = null;
        if (this.pendingSeekToUI >= 0 && this.pendingSeekTo == -1) {
            this.pendingSeekToUI = -1L;
            this.invalidateAfter = 0;
        }
        scheduleNextGetFrame();
        invalidateInternal();
    }

    public void uiRunnableGenerateCacheImpl() {
        if (this.isRecycled || this.destroyWhenDone || this.generatingCache || this.cacheGenRunnable != null) {
            return;
        }
        this.startTime = System.currentTimeMillis();
        if (RLottieDrawable.lottieCacheGenerateQueue == null) {
            RLottieDrawable.createCacheGenQueue();
        }
        this.generatingCache = true;
        this.loadFrameTask = null;
        BitmapsCache.incrementTaskCounter();
        DispatchQueue dispatchQueue = RLottieDrawable.lottieCacheGenerateQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$uiRunnableGenerateCacheImpl$1();
            }
        };
        this.cacheGenRunnable = runnable;
        dispatchQueue.postRunnable(runnable);
    }

    public void lambda$uiRunnableGenerateCacheImpl$1() {
        this.bitmapsCache.createCache();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$uiRunnableGenerateCacheImpl$0();
            }
        });
    }

    public void lambda$uiRunnableGenerateCacheImpl$0() {
        if (this.cacheGenRunnable != null) {
            BitmapsCache.decrementTaskCounter();
            this.cacheGenRunnable = null;
        }
        this.generatingCache = false;
        chekDestroyDecoder();
        scheduleNextGetFrame();
    }

    private void chekDestroyDecoder() {
        if (canLoadFrames()) {
            return;
        }
        AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
        if (animatedFileBuffer != null) {
            animatedFileBuffer.recycle();
            this.renderingBuffer = null;
        }
        AnimatedFileBuffer animatedFileBuffer2 = this.backgroundBuffer;
        if (animatedFileBuffer2 != null) {
            animatedFileBuffer2.recycle();
            this.backgroundBuffer = null;
        }
        DispatchQueue dispatchQueue = this.decodeQueue;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.decodeQueue = null;
        }
        for (int i = 0; i < this.unusedBuffers.size(); i++) {
            ((AnimatedFileBuffer) this.unusedBuffers.get(i)).recycle();
        }
        this.unusedBuffers.clear();
        invalidateInternal();
    }

    public void invalidateInternal() {
        for (int i = 0; i < this.parents.size(); i++) {
            ((ImageReceiver) this.parents.get(i)).invalidate();
        }
    }

    public void uiRunnableImpl() {
        chekDestroyDecoder();
        if (this.stream != null && this.pendingRemoveLoading) {
            FileLoader.getInstance(this.currentAccount).removeLoadingVideo(this.stream.getDocument(), false, false);
        }
        int i = this.pendingRemoveLoadingFramesReset;
        if (i <= 0) {
            this.pendingRemoveLoading = true;
        } else {
            this.pendingRemoveLoadingFramesReset = i - 1;
        }
        if (!this.forceDecodeAfterNextFrame) {
            this.singleFrameDecoded = true;
        } else {
            this.forceDecodeAfterNextFrame = false;
        }
        this.loadFrameTask = null;
        if (this.pendingSeekToUI >= 0) {
            this.nextRenderingBuffer = this.backgroundBuffer;
            this.nextRenderingBuffer2 = null;
        } else if (!this.PRERENDER_FRAME) {
            this.nextRenderingBuffer = this.backgroundBuffer;
        } else {
            AnimatedFileBuffer animatedFileBuffer = this.nextRenderingBuffer;
            if (animatedFileBuffer == null && this.nextRenderingBuffer2 == null) {
                this.nextRenderingBuffer = this.backgroundBuffer;
            } else if (animatedFileBuffer == null) {
                this.nextRenderingBuffer = this.nextRenderingBuffer2;
                this.nextRenderingBuffer2 = this.backgroundBuffer;
            } else {
                this.nextRenderingBuffer2 = this.backgroundBuffer;
            }
        }
        this.backgroundBuffer = null;
        if (this.isRestarted) {
            this.isRestarted = false;
            this.repeatCount++;
            checkRepeat();
        }
        int i2 = this.metaData[3];
        if (i2 < this.lastTimeStamp) {
            float f = this.startTime;
            this.lastTimeStamp = f > 0.0f ? (int) (f * 1000.0f) : 0;
        }
        int i3 = i2 - this.lastTimeStamp;
        if (i3 != 0) {
            this.invalidateAfter = i3;
            if (this.limitFps && i3 < 32) {
                this.invalidateAfter = 32;
            }
        }
        if (this.pendingSeekToUI >= 0 && this.pendingSeekTo == -1) {
            this.pendingSeekToUI = -1L;
            this.invalidateAfter = 0;
        }
        this.lastTimeStamp = this.metaData[3];
        int size = this.secondParentViews.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((View) this.secondParentViews.get(i4)).invalidate();
        }
        if ((!this.isRunning && this.decodeSingleFrame) || (this.renderingBuffer == null && this.nextRenderingBuffer != null)) {
            invalidateInternal();
        }
        scheduleNextGetFrame();
    }

    public void checkRepeat() {
        int i = 0;
        int i2 = 0;
        while (i < this.parents.size()) {
            ImageReceiver imageReceiver = (ImageReceiver) this.parents.get(i);
            if (!imageReceiver.isAttachedToWindow()) {
                this.parents.remove(i);
                i--;
            }
            int i3 = imageReceiver.animatedFileDrawableRepeatMaxCount;
            if (i3 > 0 && this.repeatCount >= i3) {
                i2++;
            }
            i++;
        }
        if (this.parents.size() == i2) {
            stop();
        } else {
            start();
        }
    }

    public void loadFrameRunnableImpl() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedFileDrawable.loadFrameRunnableImpl():void");
    }

    private void adaptRenderingSize() {
        int i;
        if (this.renderingWidth == 0 && this.renderingHeight == 0) {
            int[] iArr = this.metaData;
            int i2 = iArr[0];
            if (i2 > 3000 || (i = iArr[1]) > 3000) {
                this.renderingWidth = i2 / 4;
                this.renderingHeight = iArr[1] / 4;
            } else if (i2 > 2200 || i > 2200) {
                this.renderingWidth = i2 / 2;
                this.renderingHeight = i / 2;
            }
        }
    }

    private void updateScaleFactor() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        if (!this.isWebmSticker && (i = this.renderingHeight) > 0 && (i2 = this.renderingWidth) > 0 && (i3 = (iArr = this.metaData)[0]) > 0 && (i4 = iArr[1]) > 0) {
            float fMax = Math.max(i2 / i3, i / i4);
            this.scaleFactor = fMax;
            if (fMax <= 0.0f || fMax > 0.7d) {
                this.scaleFactor = 1.0f;
                return;
            }
            return;
        }
        this.scaleFactor = 1.0f;
    }

    public void uiStartTaskImpl() {
        View view;
        int size = this.secondParentViews.size();
        for (int i = 0; i < size; i++) {
            ((View) this.secondParentViews.get(i)).invalidate();
        }
        if ((this.secondParentViews.isEmpty() || this.invalidateParentViewWithSecond) && (view = this.parentView) != null) {
            view.invalidate();
        }
    }

    public AnimatedFileDrawable(File file, boolean z, long j, int i, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j2, int i2, boolean z2, BitmapsCache.CacheOptions cacheOptions) {
        this(file, z, j, i, document, imageLocation, obj, j2, i2, z2, 0, 0, cacheOptions);
    }

    public AnimatedFileDrawable(File file, boolean z, long j, int i, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j2, int i2, boolean z2, int i3, int i4, BitmapsCache.CacheOptions cacheOptions) {
        this(file, z, j, i, document, imageLocation, obj, j2, i2, z2, i3, i4, cacheOptions, document != null ? 1 : 0, true);
    }

    public AnimatedFileDrawable(File file, boolean z, long j, int i, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j2, int i2, boolean z2, int i3, int i4, BitmapsCache.CacheOptions cacheOptions, int i5, boolean z3) {
        ?? r8;
        boolean z4;
        int[] iArr;
        ?? r12;
        int i6;
        this.invalidateAfter = 50;
        int[] iArr2 = new int[7];
        this.metaData = iArr2;
        this.unusedBuffers = new ArrayList();
        this.pendingSeekTo = -1L;
        this.pendingSeekToUI = -1L;
        this.sync = new Object();
        this.actualDrawRect = new RectF();
        this.roundRadius = new int[4];
        this.shaderMatrix = new Matrix[3];
        this.roundPath = new Path[3];
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.scaleFactor = 1.0f;
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.secondParentViews = new ArrayList();
        this.parents = new ArrayList();
        this.invalidatePath = true;
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableNoFrameImpl();
            }
        };
        this.uiRunnableGenerateCache = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableGenerateCacheImpl();
            }
        };
        this.uiRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRunnableImpl();
            }
        };
        this.decoderTryCount = 0;
        this.MAX_TRIES = 15;
        this.loadFrameRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadFrameRunnableImpl();
            }
        };
        this.mStartTask = new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiStartTaskImpl();
            }
        };
        this.mUiThreadChoreographerCallback = new Choreographer60FpsContent.FrameCallback() {
            @Override
            public final void doFrame(long j3) {
                this.f$0.onChoreographerFrame(j3);
            }
        };
        this.path = file;
        this.PRERENDER_FRAME = SharedConfig.deviceIsAboveAverage();
        this.streamFileSize = j;
        this.streamLoadingPriority = i;
        this.currentAccount = i2;
        this.renderingHeight = i4;
        this.renderingWidth = i3;
        this.loop = z3;
        boolean z5 = cacheOptions != null && i3 > 0 && i4 > 0;
        this.precache = z5;
        this.document = document;
        getPaint().setFlags(3);
        if (j == 0 || (document == null && imageLocation == null)) {
            r8 = 1;
        } else {
            r8 = 1;
            this.stream = new AnimatedFileDrawableStream(document, imageLocation, obj, i2, z2, i, i5);
        }
        BitmapsCache bitmapsCache = null;
        if (!z || z5) {
            z4 = z5;
            iArr = iArr2;
            r12 = 0;
            i6 = 15;
        } else {
            r12 = 0;
            z4 = z5;
            iArr = iArr2;
            i6 = 15;
            this.mDecoder = AnimatedFileNative.createDecoderFrom(file.getAbsolutePath(), iArr2, i2, j, this.stream, z2);
            this.ptrFail = this.mDecoder == null && (!this.isWebmSticker || this.decoderTryCount > 15);
            if (this.mDecoder != null && (iArr[0] > 3840 || iArr[r8] > 3840)) {
                this.mDecoder.recycle();
                this.mDecoder = null;
            }
            adaptRenderingSize();
            updateScaleFactor();
            this.decoderCreated = r8;
        }
        if (z4) {
            this.mDecoder = AnimatedFileNative.createDecoderFrom(file.getAbsolutePath(), iArr, i2, j, this.stream, z2);
            this.ptrFail = this.mDecoder == null && (!this.isWebmSticker || this.decoderTryCount > i6);
            if (this.mDecoder != null && (iArr[r12] > 3840 || iArr[r8] > 3840)) {
                this.mDecoder.recycle();
                this.mDecoder = null;
            } else {
                bitmapsCache = new BitmapsCache(file, this, cacheOptions, this.renderingWidth, this.renderingHeight, (this.limitFps ? 1 : 0) ^ r8);
            }
        }
        this.bitmapsCache = bitmapsCache;
        if (j2 != 0) {
            seekTo(j2, r12);
        }
    }

    public void setIsWebmSticker(boolean z) {
        this.isWebmSticker = z;
        if (z) {
            this.PRERENDER_FRAME = false;
            this.useSharedQueue = true;
        }
    }

    public void setLimitFps(boolean z) {
        this.limitFps = z;
        if (z) {
            this.PRERENDER_FRAME = false;
        }
    }

    public Bitmap getFrameAtTime(long j) {
        return getFrameAtTime(j, false);
    }

    public Bitmap getFrameAtTime(long j, boolean z) {
        int videoFrame;
        if (this.decoderCreated && this.mDecoder != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = this.stream;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(false);
                this.stream.reset();
            }
            if (!z) {
                this.mDecoder.seekToMs(j, z);
            }
            int[] iArr = this.metaData;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            if (z) {
                videoFrame = this.mDecoder.getFrameAtTime(j, bitmapCreateBitmap);
            } else {
                videoFrame = this.mDecoder.getVideoFrame(bitmapCreateBitmap, true, 0.0f, 0.0f, true);
            }
            if (videoFrame != 0) {
                return bitmapCreateBitmap;
            }
            bitmapCreateBitmap.recycle();
        }
        return null;
    }

    public void setParentView(View view) {
        if (this.parentView != null) {
            return;
        }
        this.parentView = view;
    }

    public void addParent(ImageReceiver imageReceiver) {
        if (imageReceiver != null && !this.parents.contains(imageReceiver)) {
            this.parents.add(imageReceiver);
            if (this.isRunning) {
                scheduleNextGetFrame();
            }
        }
        checkCacheCancel();
    }

    public void removeParent(ImageReceiver imageReceiver) {
        this.parents.remove(imageReceiver);
        if (this.parents.isEmpty()) {
            this.repeatCount = 0;
        }
        checkCacheCancel();
    }

    public void checkCacheCancel() {
        Runnable runnable;
        if (this.bitmapsCache == null) {
            return;
        }
        boolean zIsEmpty = this.parents.isEmpty();
        if (zIsEmpty && this.cancelCache == null) {
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkCacheCancel$2();
                }
            };
            this.cancelCache = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        } else {
            if (zIsEmpty || (runnable = this.cancelCache) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.cancelCache = null;
        }
    }

    public void lambda$checkCacheCancel$2() {
        BitmapsCache bitmapsCache = this.bitmapsCache;
        if (bitmapsCache != null) {
            bitmapsCache.cancelCreate();
        }
    }

    public void setInvalidateParentViewWithSecond(boolean z) {
        this.invalidateParentViewWithSecond = z;
    }

    public void addSecondParentView(View view) {
        if (view == null || this.secondParentViews.contains(view)) {
            return;
        }
        this.secondParentViews.add(view);
    }

    public void removeSecondParentView(View view) {
        this.secondParentViews.remove(view);
        if (this.secondParentViews.isEmpty()) {
            if (this.recycleWithSecond) {
                recycle();
                return;
            }
            int[] iArr = this.roundRadiusBackup;
            if (iArr != null) {
                setRoundRadius(iArr);
            }
        }
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.decodeSingleFrame = z;
        if (z) {
            scheduleNextGetFrame();
        }
    }

    public void seekTo(long j, boolean z) {
        seekTo(j, z, false);
    }

    public void seekTo(long j, boolean z, boolean z2) {
        AnimatedFileDrawableStream animatedFileDrawableStream;
        synchronized (this.sync) {
            try {
                this.pendingSeekTo = j;
                this.pendingSeekToUI = j;
                this.scheduledForSeek = false;
                if (this.mDecoder != null) {
                    this.mDecoder.prepareToSeek();
                }
                if (this.decoderCreated && (animatedFileDrawableStream = this.stream) != null) {
                    animatedFileDrawableStream.cancel(z);
                    this.pendingRemoveLoading = z;
                    this.pendingRemoveLoadingFramesReset = z ? 0 : 10;
                }
                if (z2 && this.decodeSingleFrame) {
                    this.singleFrameDecoded = false;
                    if (this.loadFrameTask == null) {
                        scheduleNextGetFrame(false, true);
                    } else {
                        this.forceDecodeAfterNextFrame = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void seekToSync(long j) {
        if (this.mDecoder == null) {
            return;
        }
        this.mDecoder.seekToMs(j, true);
    }

    public void recycle() {
        if (!this.secondParentViews.isEmpty()) {
            this.recycleWithSecond = true;
            return;
        }
        this.isRunning = false;
        this.isRecycled = true;
        checkChoreographer();
        if (this.cacheGenRunnable != null) {
            BitmapsCache.decrementTaskCounter();
            RLottieDrawable.lottieCacheGenerateQueue.cancelRunnable(this.cacheGenRunnable);
            this.cacheGenRunnable = null;
        }
        if (this.loadFrameTask == null) {
            if (this.mDecoder != null) {
                this.mDecoder.recycle();
                this.mDecoder = null;
            }
            ArrayList arrayList = new ArrayList();
            AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
            if (animatedFileBuffer != null) {
                arrayList.add(animatedFileBuffer.bitmap);
            }
            AnimatedFileBuffer animatedFileBuffer2 = this.nextRenderingBuffer;
            if (animatedFileBuffer2 != null) {
                arrayList.add(animatedFileBuffer2.bitmap);
            }
            AnimatedFileBuffer animatedFileBuffer3 = this.nextRenderingBuffer2;
            if (animatedFileBuffer3 != null) {
                arrayList.add(animatedFileBuffer3.bitmap);
            }
            AnimatedFileBuffer animatedFileBuffer4 = this.backgroundBuffer;
            if (animatedFileBuffer4 != null) {
                arrayList.add(animatedFileBuffer4.bitmap);
            }
            Iterator it = this.unusedBuffers.iterator();
            while (it.hasNext()) {
                AnimatedFileBuffer animatedFileBuffer5 = (AnimatedFileBuffer) it.next();
                if (animatedFileBuffer5 != null) {
                    arrayList.add(animatedFileBuffer5.bitmap);
                }
            }
            this.unusedBuffers.clear();
            this.renderingBuffer = null;
            this.nextRenderingBuffer = null;
            this.nextRenderingBuffer2 = null;
            this.backgroundBuffer = null;
            DispatchQueue dispatchQueue = this.decodeQueue;
            if (dispatchQueue != null) {
                dispatchQueue.recycle();
                this.decodeQueue = null;
            }
            getPaint().setShader(null);
            AndroidUtilities.recycleBitmaps(arrayList);
        } else {
            this.destroyWhenDone = true;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.stream;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
            this.stream = null;
        }
        invalidateInternal();
    }

    public void resetStream(boolean z) {
        AnimatedFileDrawableStream animatedFileDrawableStream = this.stream;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(true);
        }
        if (this.mDecoder != null) {
            if (z) {
                this.mDecoder.stopDecoder();
            } else {
                this.mDecoder.prepareToSeek();
            }
        }
    }

    public void setUseSharedQueue(boolean z) {
        if (this.isWebmSticker) {
            return;
        }
        this.useSharedQueue = z;
    }

    protected void finalize() throws Throwable {
        try {
            this.secondParentViews.clear();
            recycle();
        } finally {
            super.finalize();
        }
    }

    @Override
    public void start() {
        if (this.isRunning || this.parents.isEmpty()) {
            return;
        }
        this.isRunning = true;
        this.isPaused = false;
        scheduleNextGetFrame();
        AndroidUtilities.runOnUIThread(this.mStartTask);
        checkChoreographer();
    }

    public float getCurrentProgress() {
        if (this.metaData[4] == 0) {
            return 0.0f;
        }
        if (this.pendingSeekToUI >= 0) {
            return this.pendingSeekToUI / this.metaData[4];
        }
        int[] iArr = this.metaData;
        return iArr[3] / iArr[4];
    }

    public int getCurrentProgressMs() {
        int i;
        if (this.pendingSeekToUI >= 0) {
            return (int) this.pendingSeekToUI;
        }
        AnimatedFileBuffer animatedFileBuffer = this.nextRenderingBuffer;
        if (animatedFileBuffer != null && (i = animatedFileBuffer.time) != 0) {
            return i;
        }
        AnimatedFileBuffer animatedFileBuffer2 = this.renderingBuffer;
        if (animatedFileBuffer2 != null) {
            return animatedFileBuffer2.time;
        }
        return 0;
    }

    public int getProgressMs() {
        return this.metaData[3];
    }

    public int getDurationMs() {
        return this.metaData[4];
    }

    private void scheduleNextGetFrame() {
        scheduleNextGetFrame(true, false);
    }

    private void scheduleNextGetFrame(boolean z, boolean z2) {
        Runnable runnable;
        Runnable runnable2;
        if (this.loadFrameTask == null || z2) {
            if (((!this.PRERENDER_FRAME || (this.nextRenderingBuffer2 != null && (this.scheduledForSeek || this.pendingSeekToUI < 0))) && this.nextRenderingBuffer != null) || !canLoadFrames() || this.destroyWhenDone) {
                return;
            }
            if ((!this.isRunning && (!this.decodeSingleFrame || this.singleFrameDecoded)) || this.parents.isEmpty() || this.generatingCache) {
                return;
            }
            if (this.useSharedQueue) {
                if (this.limitFps) {
                    Runnable runnable3 = this.loadFrameRunnable;
                    this.loadFrameTask = runnable3;
                    DispatchQueuePoolBackground.execute(runnable3);
                } else {
                    if (z2 && (runnable2 = this.loadFrameTask) != null) {
                        executor.remove(runnable2);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor;
                    Runnable runnable4 = this.loadFrameRunnable;
                    this.loadFrameTask = runnable4;
                    scheduledThreadPoolExecutor.execute(runnable4);
                }
            } else {
                if (this.decodeQueue == null) {
                    this.decodeQueue = new DispatchQueue("decodeQueue" + this);
                }
                if (z2 && (runnable = this.loadFrameTask) != null) {
                    this.decodeQueue.cancelRunnable(runnable);
                }
                DispatchQueue dispatchQueue = this.decodeQueue;
                Runnable runnable5 = this.loadFrameRunnable;
                this.loadFrameTask = runnable5;
                dispatchQueue.postRunnable(runnable5, 0L);
            }
            this.scheduledForSeek = true;
        }
    }

    public boolean isLoadingStream() {
        AnimatedFileDrawableStream animatedFileDrawableStream = this.stream;
        return animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad();
    }

    @Override
    public void stop() {
        this.isRunning = false;
        checkChoreographer();
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public int getIntrinsicHeight() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        if (i == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return (int) (i * this.scaleFactor);
    }

    @Override
    public int getIntrinsicWidth() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        if (i == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return (int) (i * this.scaleFactor);
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyTransformation = true;
    }

    @Override
    public void draw(Canvas canvas) {
        drawInternal(canvas, false, System.currentTimeMillis(), 0);
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.dstRectBackground;
        if (rectFArr[i2] == null) {
            rectFArr[i2] = new RectF();
            this.backgroundPaint[i2] = new Paint();
            this.backgroundPaint[i2].setFilterBitmap(true);
        }
        this.backgroundPaint[i2].setAlpha(i);
        this.backgroundPaint[i2].setColorFilter(colorFilter);
        this.dstRectBackground[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, true, 0L, i2);
    }

    public void drawInternal(Canvas canvas, boolean z, long j, int i) {
        float fWidth;
        if (!canLoadFrames() || this.destroyWhenDone) {
            return;
        }
        long jCurrentTimeMillis = j == 0 ? System.currentTimeMillis() : j;
        RectF rectF = z ? this.dstRectBackground[i] : this.dstRect;
        Paint paint = z ? this.backgroundPaint[i] : getPaint();
        if (!z) {
            updateCurrentFrame(jCurrentTimeMillis, false);
        }
        if (this.renderingBuffer == null) {
            return;
        }
        boolean zHasRoundRadius = hasRoundRadius();
        if (!z) {
            Xfermode xfermode = (!zHasRoundRadius && this.renderingBuffer.opaque && paint.getAlpha() == 255) ? SRC_XFERMODE : null;
            if (paint.getXfermode() != xfermode) {
                paint.setXfermode(xfermode);
            }
        }
        float f = this.scaleX;
        float fHeight = this.scaleY;
        if (z) {
            AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
            int i2 = animatedFileBuffer.width;
            int i3 = animatedFileBuffer.height;
            int i4 = this.metaData[2];
            if (i4 == 90 || i4 == 270) {
                i2 = i3;
                i3 = i2;
            }
            fWidth = rectF.width() / i2;
            fHeight = rectF.height() / i3;
        } else if (this.applyTransformation) {
            AnimatedFileBuffer animatedFileBuffer2 = this.renderingBuffer;
            int i5 = animatedFileBuffer2.width;
            int i6 = animatedFileBuffer2.height;
            int i7 = this.metaData[2];
            if (i7 == 90 || i7 == 270) {
                i5 = i6;
                i6 = i5;
            }
            rectF.set(getBounds());
            fWidth = rectF.width() / i5;
            this.scaleX = fWidth;
            fHeight = rectF.height() / i6;
            this.scaleY = fHeight;
            this.applyTransformation = false;
        } else {
            fWidth = f;
        }
        if (zHasRoundRadius) {
            int i8 = z ? i + 1 : 0;
            BitmapShader shader = this.renderingBuffer.getShader(i8);
            paint.setShader(shader);
            Matrix[] matrixArr = this.shaderMatrix;
            Matrix matrix = matrixArr[i8];
            if (matrix == null) {
                matrix = new Matrix();
                matrixArr[i8] = matrix;
            }
            matrix.reset();
            matrix.setTranslate(rectF.left, rectF.top);
            int i9 = this.metaData[2];
            if (i9 == 90) {
                matrix.preRotate(90.0f);
                matrix.preTranslate(0.0f, -rectF.width());
            } else if (i9 == 180) {
                matrix.preRotate(180.0f);
                matrix.preTranslate(-rectF.width(), -rectF.height());
            } else if (i9 == 270) {
                matrix.preRotate(270.0f);
                matrix.preTranslate(-rectF.height(), 0.0f);
            }
            matrix.preScale(fWidth, fHeight);
            shader.setLocalMatrix(matrix);
            Path[] pathArr = this.roundPath;
            Path path = pathArr[i8];
            if (path == null) {
                path = new Path();
                pathArr[i8] = path;
            }
            if (this.invalidatePath || z) {
                if (!z) {
                    this.invalidatePath = false;
                }
                int i10 = 0;
                while (true) {
                    int[] iArr = this.roundRadius;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    float[] fArr = radii;
                    int i11 = i10 * 2;
                    float f2 = iArr[i10];
                    fArr[i11] = f2;
                    fArr[i11 + 1] = f2;
                    i10++;
                }
                path.rewind();
                path.addRoundRect(z ? rectF : this.actualDrawRect, radii, Path.Direction.CW);
            }
            if (!isRoundRadiusSame()) {
                canvas.drawPath(path, paint);
                return;
            }
            if (!z) {
                rectF = this.actualDrawRect;
            }
            float f3 = this.roundRadius[0];
            canvas.drawRoundRect(rectF, f3, f3, paint);
            return;
        }
        drawBitmap(rectF, paint, canvas, fWidth, fHeight);
    }

    private void drawBitmap(RectF rectF, Paint paint, Canvas canvas, float f, float f2) {
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        int i = this.metaData[2];
        if (i == 90) {
            canvas.rotate(90.0f);
            canvas.translate(0.0f, -rectF.width());
        } else if (i == 180) {
            canvas.rotate(180.0f);
            canvas.translate(-rectF.width(), -rectF.height());
        } else if (i == 270) {
            canvas.rotate(270.0f);
            canvas.translate(-rectF.height(), 0.0f);
        }
        canvas.scale(f, f2);
        canvas.drawBitmap(this.renderingBuffer.bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    public long getLastFrameTimestamp() {
        return this.lastTimeStamp;
    }

    @Override
    public int getMinimumHeight() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? AndroidUtilities.dp(100.0f) : i;
    }

    @Override
    public int getMinimumWidth() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? AndroidUtilities.dp(100.0f) : i;
    }

    public Bitmap getBackgroundBitmap() {
        AnimatedFileBuffer animatedFileBuffer = this.backgroundBuffer;
        if (animatedFileBuffer != null) {
            return animatedFileBuffer.bitmap;
        }
        return null;
    }

    public Bitmap getAnimatedBitmap() {
        AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
        if (animatedFileBuffer != null) {
            return animatedFileBuffer.bitmap;
        }
        AnimatedFileBuffer animatedFileBuffer2 = this.nextRenderingBuffer;
        if (animatedFileBuffer2 != null) {
            return animatedFileBuffer2.bitmap;
        }
        AnimatedFileBuffer animatedFileBuffer3 = this.nextRenderingBuffer2;
        if (animatedFileBuffer3 != null) {
            return animatedFileBuffer3.bitmap;
        }
        return null;
    }

    public void replaceAnimatedBitmap(Bitmap bitmap) {
        AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
        if (animatedFileBuffer != null) {
            this.unusedBuffers.add(animatedFileBuffer);
        }
        AnimatedFileBuffer animatedFileBuffer2 = this.nextRenderingBuffer;
        if (animatedFileBuffer2 != null) {
            this.unusedBuffers.add(animatedFileBuffer2);
        }
        AnimatedFileBuffer animatedFileBuffer3 = this.nextRenderingBuffer2;
        if (animatedFileBuffer3 != null) {
            this.unusedBuffers.add(animatedFileBuffer3);
        }
        this.renderingBuffer = AnimatedFileBuffer.of(bitmap);
        this.nextRenderingBuffer = null;
        this.nextRenderingBuffer2 = null;
    }

    public void setActualDrawRect(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.actualDrawRect;
        if (rectF.left == f && rectF.top == f2 && rectF.right == f6 && rectF.bottom == f5) {
            return;
        }
        rectF.set(f, f2, f6, f5);
        this.invalidatePath = true;
    }

    public void setRoundRadius(int[] iArr) {
        if (!this.secondParentViews.isEmpty()) {
            if (this.roundRadiusBackup == null) {
                this.roundRadiusBackup = new int[4];
            }
            int[] iArr2 = this.roundRadius;
            int[] iArr3 = this.roundRadiusBackup;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.invalidatePath && iArr[i] != this.roundRadius[i]) {
                this.invalidatePath = true;
            }
            this.roundRadius[i] = iArr[i];
        }
    }

    private boolean hasRoundRadius() {
        for (int i : this.roundRadius) {
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isRoundRadiusSame() {
        int i;
        int[] iArr = this.roundRadius;
        int i2 = iArr[0];
        int i3 = iArr[1];
        return i2 == i3 && i3 == (i = iArr[2]) && i == iArr[3];
    }

    public boolean hasBitmap() {
        return canLoadFrames() && !(this.renderingBuffer == null && this.nextRenderingBuffer == null);
    }

    public int getOrientation() {
        return this.metaData[2];
    }

    public AnimatedFileDrawable makeCopy() {
        AnimatedFileDrawable animatedFileDrawable;
        AnimatedFileDrawableStream animatedFileDrawableStream = this.stream;
        if (animatedFileDrawableStream != null) {
            File file = this.path;
            long j = this.streamFileSize;
            int i = this.streamLoadingPriority;
            TLRPC.Document document = animatedFileDrawableStream.getDocument();
            ImageLocation location = this.stream.getLocation();
            Object parentObject = this.stream.getParentObject();
            long j2 = this.pendingSeekToUI;
            int i2 = this.currentAccount;
            AnimatedFileDrawableStream animatedFileDrawableStream2 = this.stream;
            animatedFileDrawable = new AnimatedFileDrawable(file, false, j, i, document, location, parentObject, j2, i2, animatedFileDrawableStream2 != null && animatedFileDrawableStream2.isPreview(), null);
        } else {
            animatedFileDrawable = new AnimatedFileDrawable(this.path, false, this.streamFileSize, this.streamLoadingPriority, this.document, null, null, this.pendingSeekToUI, this.currentAccount, false, null);
        }
        AnimatedFileDrawable animatedFileDrawable2 = animatedFileDrawable;
        int[] iArr = animatedFileDrawable2.metaData;
        int[] iArr2 = this.metaData;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        return animatedFileDrawable2;
    }

    public void setStartEndTime(long j, long j2) {
        this.startTime = j / 1000.0f;
        this.endTime = j2 / 1000.0f;
        if (j < 0 || getCurrentProgressMs() >= j) {
            return;
        }
        seekTo(j, true);
    }

    public long getStartTime() {
        return (long) (this.startTime * 1000.0f);
    }

    public boolean isRecycled() {
        return this.isRecycled || this.decoderTryCount >= 15;
    }

    public boolean decoderFailed() {
        return this.decoderCreated && this.ptrFail;
    }

    public Bitmap getNextFrame(boolean z) {
        if (this.mDecoder == null) {
            AnimatedFileBuffer animatedFileBuffer = this.backgroundBuffer;
            if (animatedFileBuffer != null) {
                return animatedFileBuffer.bitmap;
            }
            return null;
        }
        if (this.backgroundBuffer == null) {
            if (!this.unusedBuffers.isEmpty()) {
                this.backgroundBuffer = (AnimatedFileBuffer) this.unusedBuffers.remove(0);
            } else {
                float f = this.metaData[0];
                float f2 = this.scaleFactor;
                this.backgroundBuffer = AnimatedFileBuffer.of((int) (f * f2), (int) (r0[1] * f2));
            }
        }
        this.mDecoder.getVideoFrame(this.backgroundBuffer.bitmap, false, this.startTime, this.endTime, z);
        return this.backgroundBuffer.bitmap;
    }

    public void skipNextFrame(boolean z) {
        if (this.mDecoder == null) {
            return;
        }
        this.mDecoder.getVideoFrame(null, false, this.startTime, this.endTime, z);
    }

    public ArrayList getParents() {
        return this.parents;
    }

    @Override
    public void prepareForGenerateCache() {
        this.cacheGenerateDecoder = AnimatedFileNative.createDecoderFrom(this.path.getAbsolutePath(), this.metaData, this.currentAccount, this.streamFileSize, this.stream, false);
    }

    @Override
    public void releaseForGenerateCache() {
        AnimatedFileNative animatedFileNative = this.cacheGenerateDecoder;
        if (animatedFileNative != null) {
            animatedFileNative.recycle();
            this.cacheGenerateDecoder = null;
        }
    }

    @Override
    public int getNextFrame(Bitmap bitmap) {
        int i;
        if (this.cacheGenerateDecoder == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        if (this.generatingCacheBitmap == null) {
            int[] iArr = this.metaData;
            this.generatingCacheBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.cacheGenerateDecoder.getVideoFrame(this.generatingCacheBitmap, false, this.startTime, this.endTime, this.loop);
        long j = this.cacheGenerateTimestamp;
        if (j != 0 && ((i = this.metaData[3]) == 0 || j > i)) {
            return 0;
        }
        int i2 = this.lastMetadata;
        int i3 = this.metaData[3];
        if (i2 == i3) {
            int i4 = this.tryCount + 1;
            this.tryCount = i4;
            if (i4 > 5) {
                return 0;
            }
        }
        this.lastMetadata = i3;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.renderingWidth / this.generatingCacheBitmap.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.generatingCacheBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.cacheGenerateTimestamp = this.metaData[3];
        return 1;
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = bitmap == null ? Bitmap.createBitmap(this.renderingWidth, this.renderingHeight, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        AnimatedFileNative animatedFileNativeCreateDecoderFrom = AnimatedFileNative.createDecoderFrom(this.path.getAbsolutePath(), this.metaData, this.currentAccount, this.streamFileSize, this.stream, false);
        if (animatedFileNativeCreateDecoderFrom == null) {
            return bitmapCreateBitmap;
        }
        if (this.generatingCacheBitmap == null) {
            this.generatingCacheBitmap = Bitmap.createBitmap(Math.max(1, this.metaData[0]), Math.max(1, this.metaData[1]), Bitmap.Config.ARGB_8888);
        }
        animatedFileNativeCreateDecoderFrom.getVideoFrame(this.generatingCacheBitmap, false, this.startTime, this.endTime, true);
        animatedFileNativeCreateDecoderFrom.recycle();
        bitmapCreateBitmap.eraseColor(0);
        canvas.save();
        float width = this.renderingWidth / this.generatingCacheBitmap.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.generatingCacheBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return bitmapCreateBitmap;
    }

    private boolean canLoadFrames() {
        return this.precache ? this.bitmapsCache != null : (this.mDecoder == null && this.decoderCreated) ? false : true;
    }

    public void updateCurrentFrame(long j, boolean z) {
        checkChoreographerAfterDrawCall();
        updateCurrentFrameInternal(j, z);
    }

    private void updateCurrentFrameInternal(long j, boolean z) {
        boolean z2 = this.swapBuffersAllowedByChoreographer || (!this.isRunning && this.decodeSingleFrame);
        if (this.isRunning) {
            AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
            if (animatedFileBuffer == null && this.nextRenderingBuffer == null) {
                scheduleNextGetFrame();
                return;
            }
            if (this.nextRenderingBuffer != null) {
                if (animatedFileBuffer == null || (z2 && !this.skipFrameUpdate && this.pendingSeekToUI < 0)) {
                    swapBuffers(j);
                    scheduleNextGetFrame();
                    return;
                }
                return;
            }
            return;
        }
        if (this.isRunning || !this.decodeSingleFrame || !z2 || this.nextRenderingBuffer == null) {
            return;
        }
        swapBuffers(j);
        scheduleNextGetFrame();
    }

    private void swapBuffers(long j) {
        AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
        if (animatedFileBuffer != null) {
            this.unusedBuffers.add(animatedFileBuffer);
        }
        this.renderingBuffer = this.nextRenderingBuffer;
        this.nextRenderingBuffer = this.nextRenderingBuffer2;
        this.nextRenderingBuffer2 = null;
        this.lastFrameTime = j;
        this.swapBuffersAllowedByChoreographer = false;
    }

    public int getFps() {
        return this.metaData[5];
    }

    public int estimateSizeInCache() {
        return Math.max(getIntrinsicWidth() * getIntrinsicHeight(), this.renderingWidth * this.renderingHeight) * 12;
    }

    private void checkChoreographerAfterFrameCall() {
        int i = this.ticksWithoutDraw + 1;
        this.ticksWithoutDraw = i;
        if (i > 10) {
            this.isPaused = true;
        }
        checkChoreographerInternal();
    }

    private void checkChoreographerAfterDrawCall() {
        this.ticksWithoutDraw = 0;
        if (this.isPaused) {
            this.isPaused = false;
            checkChoreographer();
        }
    }

    public void onChoreographerFrame(long j) {
        checkChoreographerAfterFrameCall();
        if (this.isChoreographerRegistered) {
            this.swapBuffersAllowedByChoreographer = true;
            invalidateInternal();
        }
    }

    private void checkChoreographer() {
        AndroidUtilities.executeOnUIThread(new AnimatedFileDrawable$$ExternalSyntheticLambda0(this));
    }

    public void checkChoreographerInternal() {
        int i;
        if (this.isRunning && !this.isPaused) {
            if (this.isChoreographerRegistered || (i = this.metaData[5]) <= 0) {
                return;
            }
            activeChoreographersCount++;
            this.isChoreographerRegistered = true;
            this.ticksWithoutDraw = 0;
            Choreographer60FpsContent.getInstance().addFrameCallback(this.mUiThreadChoreographerCallback, i);
            return;
        }
        if (this.isChoreographerRegistered) {
            activeChoreographersCount--;
            this.isChoreographerRegistered = false;
            this.ticksWithoutDraw = 0;
            Choreographer60FpsContent.getInstance().removeFrameCallback(this.mUiThreadChoreographerCallback);
        }
    }
}
