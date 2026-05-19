package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
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

public class AnimatedFileDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    private final int MAX_TRIES;
    private boolean PRERENDER_FRAME;
    private final boolean USE_BITMAP_SHADER;
    private RectF actualDrawRect;
    private boolean applyTransformation;
    private Bitmap backgroundBitmap;
    private int backgroundBitmapTime;
    private final Paint[] backgroundPaint;
    private final BitmapShader[] backgroundShader;
    BitmapsCache bitmapsCache;
    Runnable cacheGenRunnable;
    long cacheGenerateNativePtr;
    long cacheGenerateTimestamp;
    BitmapsCache.Metadata cacheMetadata;
    private Runnable cancelCache;
    private int currentAccount;
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
    public boolean ignoreNoParent;
    private int invalidateAfter;
    private boolean invalidateParentViewWithSecond;
    private boolean invalidatePath;
    private boolean isChoreographerRegistered;
    private boolean isPaused;
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
    private boolean loop;
    private final Choreographer60FpsContent.FrameCallback mChoreographerCallback;
    private final Runnable mStartTask;
    private final int[] metaData;
    public volatile long nativePtr;
    private Bitmap nextRenderingBitmap;
    private Bitmap nextRenderingBitmap2;
    private int nextRenderingBitmapTime;
    private int nextRenderingBitmapTime2;
    private final BitmapShader[] nextRenderingShader;
    private final BitmapShader[] nextRenderingShader2;
    private View parentView;
    private final ArrayList parents;
    private File path;
    private boolean pendingRemoveLoading;
    private int pendingRemoveLoadingFramesReset;
    private volatile long pendingSeekTo;
    private volatile long pendingSeekToUI;
    private boolean precache;
    private boolean ptrFail;
    private boolean recycleWithSecond;
    private Bitmap renderingBitmap;
    private int renderingBitmapTime;
    private int renderingHeight;
    private final BitmapShader[] renderingShader;
    private int renderingWidth;
    public int repeatCount;
    private Path[] roundPath;
    private final Path[] roundPathBackground;
    private int[] roundRadius;
    private int[] roundRadiusBackup;
    private float scaleFactor;
    private float scaleX;
    private float scaleY;
    private boolean scheduledForSeek;
    private final ArrayList secondParentViews;
    private Matrix[] shaderMatrix;
    private final Matrix[] shaderMatrixBackground;
    private boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    private float startTime;
    private AnimatedFileDrawableStream stream;
    private long streamFileSize;
    private int streamLoadingPriority;
    private final Object sync;
    private int ticksWithoutDraw;
    int tryCount;
    private Runnable uiRunnable;
    private Runnable uiRunnableGenerateCache;
    private Runnable uiRunnableNoFrame;
    ArrayList unusedBitmaps;
    private boolean useSharedQueue;
    private static float[] radii = new float[8];
    private static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());

    public static native long createDecoder(String str, int[] iArr, int i, long j, Object obj, boolean z);

    public static native void destroyDecoder(long j);

    public static native int getFrameAtTime(long j, long j2, Bitmap bitmap, int[] iArr);

    public static native int getVideoFrame(long j, Bitmap bitmap, int[] iArr, boolean z, float f, float f2, boolean z2);

    public static native void getVideoInfo(int i, String str, int[] iArr, long j);

    public static native void prepareToSeek(long j);

    public static native void seekToMs(long j, long j2, int[] iArr, boolean z);

    public static native void stopDecoder(long j);

    @Override
    public int getOpacity() {
        return -2;
    }

    static int access$1210(AnimatedFileDrawable animatedFileDrawable) {
        int i = animatedFileDrawable.pendingRemoveLoadingFramesReset;
        animatedFileDrawable.pendingRemoveLoadingFramesReset = i - 1;
        return i;
    }

    static int access$3608(AnimatedFileDrawable animatedFileDrawable) {
        int i = animatedFileDrawable.decoderTryCount;
        animatedFileDrawable.decoderTryCount = i + 1;
        return i;
    }

    public static void access$5100(AnimatedFileDrawable animatedFileDrawable) {
        animatedFileDrawable.checkChoreographer();
    }

    public void onChoreographerFrame(long j) {
        if (!this.isRunning || this.isPaused) {
            checkChoreographer();
            return;
        }
        int i = this.ticksWithoutDraw + 1;
        this.ticksWithoutDraw = i;
        if (i > 10) {
            this.isPaused = true;
            checkChoreographer();
        } else if (updateCurrentFrame(System.currentTimeMillis(), false)) {
            invalidateInternal();
        }
    }

    public void checkChoreographer() {
        int fps;
        if (this.isRunning && !this.isPaused) {
            if (this.isChoreographerRegistered || (fps = getFps()) <= 0) {
                return;
            }
            this.isChoreographerRegistered = true;
            Choreographer60FpsContent.getInstance().addFrameCallback(this.mChoreographerCallback, Math.min(fps, 60));
            return;
        }
        if (this.isChoreographerRegistered) {
            this.isChoreographerRegistered = false;
            Choreographer60FpsContent.getInstance().removeFrameCallback(this.mChoreographerCallback);
        }
    }

    class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override
        public void run() {
            if (AnimatedFileDrawable.this.isRecycled || AnimatedFileDrawable.this.destroyWhenDone) {
                return;
            }
            AnimatedFileDrawable animatedFileDrawable = AnimatedFileDrawable.this;
            if (animatedFileDrawable.generatingCache || animatedFileDrawable.cacheGenRunnable != null) {
                return;
            }
            animatedFileDrawable.startTime = System.currentTimeMillis();
            if (RLottieDrawable.lottieCacheGenerateQueue == null) {
                RLottieDrawable.createCacheGenQueue();
            }
            AnimatedFileDrawable animatedFileDrawable2 = AnimatedFileDrawable.this;
            animatedFileDrawable2.generatingCache = true;
            animatedFileDrawable2.loadFrameTask = null;
            BitmapsCache.incrementTaskCounter();
            DispatchQueue dispatchQueue = RLottieDrawable.lottieCacheGenerateQueue;
            AnimatedFileDrawable animatedFileDrawable3 = AnimatedFileDrawable.this;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$run$1();
                }
            };
            animatedFileDrawable3.cacheGenRunnable = runnable;
            dispatchQueue.postRunnable(runnable);
        }

        public void lambda$run$1() {
            AnimatedFileDrawable.this.bitmapsCache.createCache();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$run$0();
                }
            });
        }

        public void lambda$run$0() {
            if (AnimatedFileDrawable.this.cacheGenRunnable != null) {
                BitmapsCache.decrementTaskCounter();
                AnimatedFileDrawable.this.cacheGenRunnable = null;
            }
            AnimatedFileDrawable animatedFileDrawable = AnimatedFileDrawable.this;
            animatedFileDrawable.generatingCache = false;
            animatedFileDrawable.chekDestroyDecoder();
            AnimatedFileDrawable.this.scheduleNextGetFrame();
        }
    }

    public void chekDestroyDecoder() {
        if (this.loadFrameRunnable == null && this.destroyWhenDone && this.nativePtr != 0 && !this.generatingCache) {
            destroyDecoder(this.nativePtr);
            this.nativePtr = 0L;
        }
        if (canLoadFrames()) {
            return;
        }
        Bitmap bitmap = this.renderingBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.renderingBitmap = null;
        }
        Bitmap bitmap2 = this.backgroundBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.backgroundBitmap = null;
        }
        DispatchQueue dispatchQueue = this.decodeQueue;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.decodeQueue = null;
        }
        for (int i = 0; i < this.unusedBitmaps.size(); i++) {
            ((Bitmap) this.unusedBitmaps.get(i)).recycle();
        }
        this.unusedBitmaps.clear();
        invalidateInternal();
    }

    public void invalidateInternal() {
        for (int i = 0; i < this.parents.size(); i++) {
            ((ImageReceiver) this.parents.get(i)).invalidate();
        }
    }

    public void checkRepeat() {
        if (this.ignoreNoParent) {
            start();
            return;
        }
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

    class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedFileDrawable.AnonymousClass4.run():void");
        }
    }

    public void adaptRenderingSize() {
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

    public void updateScaleFactor() {
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

    public void lambda$new$0() {
        View view;
        if (!this.secondParentViews.isEmpty()) {
            int size = this.secondParentViews.size();
            for (int i = 0; i < size; i++) {
                ((View) this.secondParentViews.get(i)).invalidate();
            }
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
        long j3;
        this.USE_BITMAP_SHADER = Build.VERSION.SDK_INT < 29;
        this.PRERENDER_FRAME = true;
        this.invalidateAfter = 50;
        int[] iArr = new int[6];
        this.metaData = iArr;
        this.pendingSeekTo = -1L;
        this.pendingSeekToUI = -1L;
        this.sync = new Object();
        this.actualDrawRect = new RectF();
        this.renderingShader = new BitmapShader[3];
        this.nextRenderingShader = new BitmapShader[3];
        this.nextRenderingShader2 = new BitmapShader[3];
        this.backgroundShader = new BitmapShader[3];
        this.unusedBitmaps = new ArrayList();
        this.roundRadius = new int[4];
        this.shaderMatrix = new Matrix[3];
        this.roundPath = new Path[3];
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.dstRect = new RectF();
        this.scaleFactor = 1.0f;
        this.dstRectBackground = new RectF[2];
        this.backgroundPaint = new Paint[2];
        this.shaderMatrixBackground = new Matrix[2];
        this.roundPathBackground = new Path[2];
        this.secondParentViews = new ArrayList();
        this.parents = new ArrayList();
        this.invalidatePath = true;
        this.mChoreographerCallback = new Choreographer60FpsContent.FrameCallback() {
            @Override
            public final void doFrame(long j4) {
                this.f$0.onChoreographerFrame(j4);
            }
        };
        this.uiRunnableNoFrame = new Runnable() {
            @Override
            public void run() {
                AnimatedFileDrawable.this.chekDestroyDecoder();
                AnimatedFileDrawable.this.loadFrameTask = null;
                if (AnimatedFileDrawable.this.pendingSeekToUI >= 0 && AnimatedFileDrawable.this.pendingSeekTo == -1) {
                    AnimatedFileDrawable.this.pendingSeekToUI = -1L;
                    AnimatedFileDrawable.this.invalidateAfter = 0;
                }
                AnimatedFileDrawable.this.scheduleNextGetFrame();
            }
        };
        this.uiRunnableGenerateCache = new AnonymousClass2();
        this.uiRunnable = new Runnable() {
            @Override
            public void run() {
                AnimatedFileDrawable.this.chekDestroyDecoder();
                if (AnimatedFileDrawable.this.stream != null && AnimatedFileDrawable.this.pendingRemoveLoading) {
                    FileLoader.getInstance(AnimatedFileDrawable.this.currentAccount).removeLoadingVideo(AnimatedFileDrawable.this.stream.getDocument(), false, false);
                }
                if (AnimatedFileDrawable.this.pendingRemoveLoadingFramesReset <= 0) {
                    AnimatedFileDrawable.this.pendingRemoveLoading = true;
                } else {
                    AnimatedFileDrawable.access$1210(AnimatedFileDrawable.this);
                }
                if (!AnimatedFileDrawable.this.forceDecodeAfterNextFrame) {
                    AnimatedFileDrawable.this.singleFrameDecoded = true;
                } else {
                    AnimatedFileDrawable.this.forceDecodeAfterNextFrame = false;
                }
                AnimatedFileDrawable.this.loadFrameTask = null;
                if (AnimatedFileDrawable.this.pendingSeekToUI < 0) {
                    if (AnimatedFileDrawable.this.PRERENDER_FRAME) {
                        if (AnimatedFileDrawable.this.nextRenderingBitmap != null || AnimatedFileDrawable.this.nextRenderingBitmap2 != null) {
                            if (AnimatedFileDrawable.this.nextRenderingBitmap == null) {
                                AnimatedFileDrawable animatedFileDrawable = AnimatedFileDrawable.this;
                                animatedFileDrawable.nextRenderingBitmap = animatedFileDrawable.nextRenderingBitmap2;
                                AnimatedFileDrawable animatedFileDrawable2 = AnimatedFileDrawable.this;
                                animatedFileDrawable2.nextRenderingBitmapTime = animatedFileDrawable2.nextRenderingBitmapTime2;
                                AnimatedFileDrawable animatedFileDrawable3 = AnimatedFileDrawable.this;
                                animatedFileDrawable3.nextRenderingBitmap2 = animatedFileDrawable3.backgroundBitmap;
                                AnimatedFileDrawable animatedFileDrawable4 = AnimatedFileDrawable.this;
                                animatedFileDrawable4.nextRenderingBitmapTime2 = animatedFileDrawable4.backgroundBitmapTime;
                                for (int i6 = 0; i6 < AnimatedFileDrawable.this.backgroundShader.length; i6++) {
                                    AnimatedFileDrawable.this.nextRenderingShader[i6] = AnimatedFileDrawable.this.nextRenderingShader2[i6];
                                    AnimatedFileDrawable.this.nextRenderingShader2[i6] = AnimatedFileDrawable.this.backgroundShader[i6];
                                }
                            } else {
                                AnimatedFileDrawable animatedFileDrawable5 = AnimatedFileDrawable.this;
                                animatedFileDrawable5.nextRenderingBitmap2 = animatedFileDrawable5.backgroundBitmap;
                                AnimatedFileDrawable animatedFileDrawable6 = AnimatedFileDrawable.this;
                                animatedFileDrawable6.nextRenderingBitmapTime2 = animatedFileDrawable6.backgroundBitmapTime;
                                for (int i7 = 0; i7 < AnimatedFileDrawable.this.backgroundShader.length; i7++) {
                                    AnimatedFileDrawable.this.nextRenderingShader2[i7] = AnimatedFileDrawable.this.backgroundShader[i7];
                                }
                            }
                        } else {
                            AnimatedFileDrawable animatedFileDrawable7 = AnimatedFileDrawable.this;
                            animatedFileDrawable7.nextRenderingBitmap = animatedFileDrawable7.backgroundBitmap;
                            AnimatedFileDrawable animatedFileDrawable8 = AnimatedFileDrawable.this;
                            animatedFileDrawable8.nextRenderingBitmapTime = animatedFileDrawable8.backgroundBitmapTime;
                            for (int i8 = 0; i8 < AnimatedFileDrawable.this.backgroundShader.length; i8++) {
                                AnimatedFileDrawable.this.nextRenderingShader[i8] = AnimatedFileDrawable.this.backgroundShader[i8];
                            }
                        }
                    } else {
                        AnimatedFileDrawable animatedFileDrawable9 = AnimatedFileDrawable.this;
                        animatedFileDrawable9.nextRenderingBitmap = animatedFileDrawable9.backgroundBitmap;
                        AnimatedFileDrawable animatedFileDrawable10 = AnimatedFileDrawable.this;
                        animatedFileDrawable10.nextRenderingBitmapTime = animatedFileDrawable10.backgroundBitmapTime;
                        for (int i9 = 0; i9 < AnimatedFileDrawable.this.backgroundShader.length; i9++) {
                            AnimatedFileDrawable.this.nextRenderingShader[i9] = AnimatedFileDrawable.this.backgroundShader[i9];
                        }
                    }
                } else {
                    AnimatedFileDrawable animatedFileDrawable11 = AnimatedFileDrawable.this;
                    animatedFileDrawable11.nextRenderingBitmap = animatedFileDrawable11.backgroundBitmap;
                    AnimatedFileDrawable animatedFileDrawable12 = AnimatedFileDrawable.this;
                    animatedFileDrawable12.nextRenderingBitmapTime = animatedFileDrawable12.backgroundBitmapTime;
                    AnimatedFileDrawable.this.nextRenderingBitmap2 = null;
                    AnimatedFileDrawable.this.nextRenderingBitmapTime2 = 0;
                    for (int i10 = 0; i10 < AnimatedFileDrawable.this.backgroundShader.length; i10++) {
                        AnimatedFileDrawable.this.nextRenderingShader[i10] = AnimatedFileDrawable.this.backgroundShader[i10];
                        AnimatedFileDrawable.this.nextRenderingShader2[i10] = null;
                    }
                }
                AnimatedFileDrawable.this.backgroundBitmap = null;
                for (int i11 = 0; i11 < AnimatedFileDrawable.this.backgroundShader.length; i11++) {
                    AnimatedFileDrawable.this.backgroundShader[i11] = null;
                }
                if (AnimatedFileDrawable.this.isRestarted) {
                    AnimatedFileDrawable.this.isRestarted = false;
                    AnimatedFileDrawable animatedFileDrawable13 = AnimatedFileDrawable.this;
                    animatedFileDrawable13.repeatCount++;
                    animatedFileDrawable13.checkRepeat();
                }
                if (AnimatedFileDrawable.this.metaData[3] < AnimatedFileDrawable.this.lastTimeStamp) {
                    AnimatedFileDrawable animatedFileDrawable14 = AnimatedFileDrawable.this;
                    animatedFileDrawable14.lastTimeStamp = animatedFileDrawable14.startTime > 0.0f ? (int) (AnimatedFileDrawable.this.startTime * 1000.0f) : 0;
                }
                if (AnimatedFileDrawable.this.metaData[3] - AnimatedFileDrawable.this.lastTimeStamp != 0) {
                    AnimatedFileDrawable animatedFileDrawable15 = AnimatedFileDrawable.this;
                    animatedFileDrawable15.invalidateAfter = animatedFileDrawable15.metaData[3] - AnimatedFileDrawable.this.lastTimeStamp;
                    if (AnimatedFileDrawable.this.limitFps && AnimatedFileDrawable.this.invalidateAfter < 32) {
                        AnimatedFileDrawable.this.invalidateAfter = 32;
                    }
                }
                if (AnimatedFileDrawable.this.pendingSeekToUI >= 0 && AnimatedFileDrawable.this.pendingSeekTo == -1) {
                    AnimatedFileDrawable.this.pendingSeekToUI = -1L;
                    AnimatedFileDrawable.this.invalidateAfter = 0;
                }
                AnimatedFileDrawable animatedFileDrawable16 = AnimatedFileDrawable.this;
                animatedFileDrawable16.lastTimeStamp = animatedFileDrawable16.metaData[3];
                if (!AnimatedFileDrawable.this.secondParentViews.isEmpty()) {
                    int size = AnimatedFileDrawable.this.secondParentViews.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((View) AnimatedFileDrawable.this.secondParentViews.get(i12)).invalidate();
                    }
                }
                if (!AnimatedFileDrawable.this.isRunning && AnimatedFileDrawable.this.decodeSingleFrame) {
                    AnimatedFileDrawable.this.invalidateInternal();
                }
                AnimatedFileDrawable.this.scheduleNextGetFrame();
            }
        };
        this.decoderTryCount = 0;
        this.MAX_TRIES = 15;
        this.loadFrameRunnable = new AnonymousClass4();
        this.mStartTask = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
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
        this.precache = cacheOptions != null && i3 > 0 && i4 > 0;
        this.document = document;
        getPaint().setFlags(3);
        if (j == 0 || (document == null && imageLocation == null)) {
            j3 = 0;
        } else {
            j3 = 0;
            this.stream = new AnimatedFileDrawableStream(document, imageLocation, obj, i2, z2, i, i5);
        }
        if (z && !this.precache) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), iArr, this.currentAccount, this.streamFileSize, this.stream, z2);
            this.ptrFail = this.nativePtr == j3 && (!this.isWebmSticker || this.decoderTryCount > 15);
            if (this.nativePtr != j3 && (iArr[0] > 3840 || iArr[1] > 3840)) {
                destroyDecoder(this.nativePtr);
                this.nativePtr = j3;
            }
            adaptRenderingSize();
            updateScaleFactor();
            this.decoderCreated = true;
            checkChoreographer();
        }
        if (this.precache) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), iArr, this.currentAccount, this.streamFileSize, this.stream, z2);
            this.ptrFail = this.nativePtr == j3 && (!this.isWebmSticker || this.decoderTryCount > 15);
            if (this.nativePtr != j3 && (iArr[0] > 3840 || iArr[1] > 3840)) {
                destroyDecoder(this.nativePtr);
                this.nativePtr = j3;
            } else {
                this.bitmapsCache = new BitmapsCache(file, this, cacheOptions, this.renderingWidth, this.renderingHeight, !this.limitFps);
            }
        }
        if (j2 != j3) {
            seekTo(j2, false);
        }
    }

    public void setIsWebmSticker(boolean z) {
        this.isWebmSticker = z;
        if (z) {
            this.PRERENDER_FRAME = false;
            this.useSharedQueue = true;
        }
    }

    public Bitmap getFrameAtTime(long j) {
        return getFrameAtTime(j, false);
    }

    public Bitmap getFrameAtTime(long j, boolean z) {
        int videoFrame;
        if (!this.decoderCreated || this.nativePtr == 0) {
            return null;
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = this.stream;
        if (animatedFileDrawableStream != null) {
            animatedFileDrawableStream.cancel(false);
            this.stream.reset();
        }
        if (!z) {
            seekToMs(this.nativePtr, j, this.metaData, z);
        }
        int[] iArr = this.metaData;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (z) {
            videoFrame = getFrameAtTime(this.nativePtr, j, bitmapCreateBitmap, this.metaData);
        } else {
            videoFrame = getVideoFrame(this.nativePtr, bitmapCreateBitmap, this.metaData, true, 0.0f, 0.0f, true);
        }
        if (videoFrame != 0) {
            return bitmapCreateBitmap;
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
        if (this.parents.size() == 0) {
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
                    this.f$0.lambda$checkCacheCancel$1();
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

    public void lambda$checkCacheCancel$1() {
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
                if (this.nativePtr != 0) {
                    prepareToSeek(this.nativePtr);
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
        if (this.nativePtr == 0) {
            return;
        }
        seekToMs(this.nativePtr, j, this.metaData, true);
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
            if (this.nativePtr != 0) {
                destroyDecoder(this.nativePtr);
                this.nativePtr = 0L;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.renderingBitmap);
            arrayList.add(this.nextRenderingBitmap);
            arrayList.add(this.nextRenderingBitmap2);
            arrayList.add(this.backgroundBitmap);
            arrayList.addAll(this.unusedBitmaps);
            this.unusedBitmaps.clear();
            this.renderingBitmap = null;
            this.nextRenderingBitmap = null;
            this.nextRenderingBitmap2 = null;
            this.backgroundBitmap = null;
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
        if (this.nativePtr != 0) {
            if (z) {
                stopDecoder(this.nativePtr);
            } else {
                prepareToSeek(this.nativePtr);
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
        if (this.isRunning) {
            return;
        }
        if (this.parents.size() != 0 || this.ignoreNoParent) {
            this.isRunning = true;
            scheduleNextGetFrame();
            AndroidUtilities.runOnUIThread(this.mStartTask);
            checkChoreographer();
        }
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
        if (this.pendingSeekToUI >= 0) {
            return (int) this.pendingSeekToUI;
        }
        int i = this.nextRenderingBitmapTime;
        return i != 0 ? i : this.renderingBitmapTime;
    }

    public int getProgressMs() {
        return this.metaData[3];
    }

    public int getDurationMs() {
        return this.metaData[4];
    }

    public void scheduleNextGetFrame() {
        scheduleNextGetFrame(true, false);
    }

    private void scheduleNextGetFrame(boolean z, boolean z2) {
        Runnable runnable;
        Runnable runnable2;
        if (this.loadFrameTask == null || z2) {
            if (((!this.PRERENDER_FRAME || (this.nextRenderingBitmap2 != null && (this.scheduledForSeek || this.pendingSeekToUI < 0))) && this.nextRenderingBitmap != null) || !canLoadFrames() || this.destroyWhenDone) {
                return;
            }
            if (!this.isRunning) {
                boolean z3 = this.decodeSingleFrame;
                if (!z3) {
                    return;
                }
                if (z3 && this.singleFrameDecoded) {
                    return;
                }
            }
            if ((this.parents.size() != 0 || this.ignoreNoParent) && !this.generatingCache) {
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

    public void drawInternal(android.graphics.Canvas r17, boolean r18, long r19, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.AnimatedFileDrawable.drawInternal(android.graphics.Canvas, boolean, long, int):void");
    }

    private void drawBitmap(RectF rectF, Paint paint, Canvas canvas, float f, float f2) {
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
        canvas.drawBitmap(this.renderingBitmap, 0.0f, 0.0f, paint);
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
        return this.backgroundBitmap;
    }

    public Bitmap getAnimatedBitmap() {
        Bitmap bitmap = this.renderingBitmap;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = this.nextRenderingBitmap;
        if (bitmap2 != null) {
            return bitmap2;
        }
        Bitmap bitmap3 = this.nextRenderingBitmap2;
        if (bitmap3 != null) {
            return bitmap3;
        }
        return null;
    }

    public void replaceAnimatedBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.renderingBitmap;
        if (bitmap2 != null) {
            this.unusedBitmaps.add(bitmap2);
        }
        Bitmap bitmap3 = this.nextRenderingBitmap;
        if (bitmap3 != null) {
            this.unusedBitmaps.add(bitmap3);
        }
        Bitmap bitmap4 = this.nextRenderingBitmap2;
        if (bitmap4 != null) {
            this.unusedBitmaps.add(bitmap4);
        }
        this.renderingBitmap = bitmap;
        this.nextRenderingBitmap = null;
        this.nextRenderingBitmap2 = null;
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

    public boolean hasRoundRadius() {
        int i = 0;
        while (true) {
            int[] iArr = this.roundRadius;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != 0) {
                return true;
            }
            i++;
        }
    }

    public boolean hasBitmap() {
        return canLoadFrames() && !(this.renderingBitmap == null && this.nextRenderingBitmap == null);
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
            File file2 = this.path;
            long j3 = this.streamFileSize;
            int i3 = this.streamLoadingPriority;
            TLRPC.Document document2 = this.document;
            long j4 = this.pendingSeekToUI;
            int i4 = this.currentAccount;
            AnimatedFileDrawableStream animatedFileDrawableStream3 = this.stream;
            animatedFileDrawable = new AnimatedFileDrawable(file2, false, j3, i3, document2, null, null, j4, i4, animatedFileDrawableStream3 != null && animatedFileDrawableStream3.isPreview(), null);
        }
        AnimatedFileDrawable animatedFileDrawable2 = animatedFileDrawable;
        int[] iArr = animatedFileDrawable2.metaData;
        int[] iArr2 = this.metaData;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        return animatedFileDrawable2;
    }

    public static void getVideoInfo(String str, int[] iArr, long j) {
        getVideoInfo(Build.VERSION.SDK_INT, str, iArr, j);
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
        if (this.nativePtr == 0) {
            return this.backgroundBitmap;
        }
        if (this.backgroundBitmap == null) {
            if (!this.unusedBitmaps.isEmpty()) {
                this.backgroundBitmap = (Bitmap) this.unusedBitmaps.remove(0);
            } else {
                float f = this.metaData[0];
                float f2 = this.scaleFactor;
                this.backgroundBitmap = Bitmap.createBitmap((int) (f * f2), (int) (r0[1] * f2), Bitmap.Config.ARGB_8888);
            }
        }
        getVideoFrame(this.nativePtr, this.backgroundBitmap, this.metaData, false, this.startTime, this.endTime, z);
        return this.backgroundBitmap;
    }

    public void skipNextFrame(boolean z) {
        if (this.nativePtr == 0) {
            return;
        }
        getVideoFrame(this.nativePtr, null, this.metaData, false, this.startTime, this.endTime, z);
    }

    public void setLimitFps(boolean z) {
        this.limitFps = z;
        if (z) {
            this.PRERENDER_FRAME = false;
        }
    }

    public ArrayList getParents() {
        return this.parents;
    }

    @Override
    public void prepareForGenerateCache() {
        this.cacheGenerateNativePtr = createDecoder(this.path.getAbsolutePath(), this.metaData, this.currentAccount, this.streamFileSize, this.stream, false);
    }

    @Override
    public void releaseForGenerateCache() {
        long j = this.cacheGenerateNativePtr;
        if (j != 0) {
            destroyDecoder(j);
        }
    }

    @Override
    public int getNextFrame(Bitmap bitmap) {
        int i;
        if (this.cacheGenerateNativePtr == 0) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        if (this.generatingCacheBitmap == null) {
            int[] iArr = this.metaData;
            this.generatingCacheBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        getVideoFrame(this.cacheGenerateNativePtr, this.generatingCacheBitmap, this.metaData, false, this.startTime, this.endTime, this.loop);
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
        long jCreateDecoder = createDecoder(this.path.getAbsolutePath(), this.metaData, this.currentAccount, this.streamFileSize, this.stream, false);
        if (jCreateDecoder == 0) {
            return bitmapCreateBitmap;
        }
        if (this.generatingCacheBitmap == null) {
            this.generatingCacheBitmap = Bitmap.createBitmap(Math.max(1, this.metaData[0]), Math.max(1, this.metaData[1]), Bitmap.Config.ARGB_8888);
        }
        getVideoFrame(jCreateDecoder, this.generatingCacheBitmap, this.metaData, false, this.startTime, this.endTime, true);
        destroyDecoder(jCreateDecoder);
        bitmapCreateBitmap.eraseColor(0);
        canvas.save();
        float width = this.renderingWidth / this.generatingCacheBitmap.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.generatingCacheBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public boolean canLoadFrames() {
        return this.precache ? this.bitmapsCache != null : (this.nativePtr == 0 && this.decoderCreated) ? false : true;
    }

    public boolean updateCurrentFrame(long j, boolean z) {
        if (this.isRunning) {
            Bitmap bitmap = this.renderingBitmap;
            if (bitmap == null && this.nextRenderingBitmap == null) {
                scheduleNextGetFrame();
                return false;
            }
            if (this.nextRenderingBitmap != null && (bitmap == null || (Math.abs(j - this.lastFrameTime) >= this.invalidateAfter - 6 && !this.skipFrameUpdate && this.pendingSeekToUI < 0))) {
                this.unusedBitmaps.add(this.renderingBitmap);
                this.renderingBitmap = this.nextRenderingBitmap;
                this.renderingBitmapTime = this.nextRenderingBitmapTime;
                for (int i = 0; i < this.backgroundShader.length; i++) {
                    BitmapShader[] bitmapShaderArr = this.renderingShader;
                    BitmapShader[] bitmapShaderArr2 = this.nextRenderingShader;
                    bitmapShaderArr[i] = bitmapShaderArr2[i];
                    BitmapShader[] bitmapShaderArr3 = this.nextRenderingShader2;
                    bitmapShaderArr2[i] = bitmapShaderArr3[i];
                    bitmapShaderArr3[i] = null;
                }
                this.nextRenderingBitmap = this.nextRenderingBitmap2;
                this.nextRenderingBitmapTime = this.nextRenderingBitmapTime2;
                this.nextRenderingBitmap2 = null;
                this.nextRenderingBitmapTime2 = 0;
                this.lastFrameTime = j;
                scheduleNextGetFrame();
                return true;
            }
        } else if (!this.isRunning && this.decodeSingleFrame && Math.abs(j - this.lastFrameTime) >= this.invalidateAfter - 6 && this.nextRenderingBitmap != null) {
            this.unusedBitmaps.add(this.renderingBitmap);
            this.renderingBitmap = this.nextRenderingBitmap;
            this.renderingBitmapTime = this.nextRenderingBitmapTime;
            for (int i2 = 0; i2 < this.backgroundShader.length; i2++) {
                BitmapShader[] bitmapShaderArr4 = this.renderingShader;
                BitmapShader[] bitmapShaderArr5 = this.nextRenderingShader;
                bitmapShaderArr4[i2] = bitmapShaderArr5[i2];
                BitmapShader[] bitmapShaderArr6 = this.nextRenderingShader2;
                bitmapShaderArr5[i2] = bitmapShaderArr6[i2];
                bitmapShaderArr6[i2] = null;
            }
            this.nextRenderingBitmap = this.nextRenderingBitmap2;
            this.nextRenderingBitmapTime = this.nextRenderingBitmapTime2;
            this.nextRenderingBitmap2 = null;
            this.nextRenderingBitmapTime2 = 0;
            this.lastFrameTime = j;
            scheduleNextGetFrame();
            return true;
        }
        return false;
    }

    public int getFps() {
        return this.metaData[5];
    }

    public int getRenderingWidth() {
        return this.renderingWidth;
    }

    public int getRenderingHeight() {
        return this.renderingHeight;
    }
}
