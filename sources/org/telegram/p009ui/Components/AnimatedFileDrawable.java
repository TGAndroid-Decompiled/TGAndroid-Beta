package org.telegram.p009ui.Components;

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
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.p009ui.Components.AnimatedFileDrawable;
import org.telegram.tgnet.TLRPC$Document;

public class AnimatedFileDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    private RectF actualDrawRect;
    private boolean applyTransformation;
    private Bitmap backgroundBitmap;
    private int backgroundBitmapTime;
    private Paint[] backgroundPaint;
    private BitmapShader[] backgroundShader;
    BitmapsCache bitmapsCache;
    Runnable cacheGenRunnable;
    long cacheGenerateNativePtr;
    long cacheGenerateTimestamp;
    BitmapsCache.Metadata cacheMetadata;
    private Runnable cancelCache;
    private int currentAccount;
    private DispatchQueue decodeQueue;
    private boolean decodeSingleFrame;
    private boolean decoderCreated;
    private boolean destroyWhenDone;
    private final TLRPC$Document document;
    private final RectF dstRect;
    private RectF[] dstRectBackground;
    private float endTime;
    private boolean forceDecodeAfterNextFrame;
    boolean generatingCache;
    Bitmap generatingCacheBitmap;
    public boolean ignoreNoParent;
    private int invalidateAfter;
    private boolean invalidateParentViewWithSecond;
    private boolean invalidatePath;
    private volatile boolean isRecycled;
    private boolean isRestarted;
    private volatile boolean isRunning;
    public boolean isWebmSticker;
    private long lastFrameDecodeTime;
    private long lastFrameTime;
    int lastMetadata;
    private int lastTimeStamp;
    private boolean limitFps;
    private Runnable loadFrameRunnable;
    private Runnable loadFrameTask;
    private final Runnable mStartTask;
    private final int[] metaData;
    public volatile long nativePtr;
    private Bitmap nextRenderingBitmap;
    private int nextRenderingBitmapTime;
    private BitmapShader[] nextRenderingShader;
    private View parentView;
    private ArrayList<ImageReceiver> parents;
    private File path;
    private boolean pendingRemoveLoading;
    private int pendingRemoveLoadingFramesReset;
    private volatile long pendingSeekTo;
    private volatile long pendingSeekToUI;
    private boolean precache;
    private boolean recycleWithSecond;
    private Bitmap renderingBitmap;
    private int renderingBitmapTime;
    private int renderingHeight;
    private BitmapShader[] renderingShader;
    private int renderingWidth;
    public int repeatCount;
    private Path[] roundPath;
    private int[] roundRadius;
    private int[] roundRadiusBackup;
    private float scaleFactor;
    private float scaleX;
    private float scaleY;
    private ArrayList<View> secondParentViews;
    private Matrix[] shaderMatrix;
    private boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    private float startTime;
    private AnimatedFileDrawableStream stream;
    private long streamFileSize;
    private final Object sync;
    int tryCount;
    private Runnable uiRunnable;
    private Runnable uiRunnableGenerateCache;
    private Runnable uiRunnableNoFrame;
    private boolean useSharedQueue;
    private static float[] radii = new float[8];
    private static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());

    public static native long createDecoder(String str, int[] iArr, int i, long j, Object obj, boolean z);

    public static native void destroyDecoder(long j);

    private static native int getFrameAtTime(long j, long j2, Bitmap bitmap, int[] iArr, int i);

    public static native int getVideoFrame(long j, Bitmap bitmap, int[] iArr, int i, boolean z, float f, float f2);

    private static native void getVideoInfo(int i, String str, int[] iArr);

    private static native void prepareToSeek(long j);

    public static native void seekToMs(long j, long j2, boolean z);

    private static native void stopDecoder(long j);

    @Override
    public int getOpacity() {
        return -2;
    }

    static int access$1010(AnimatedFileDrawable animatedFileDrawable) {
        int i = animatedFileDrawable.pendingRemoveLoadingFramesReset;
        animatedFileDrawable.pendingRemoveLoadingFramesReset = i - 1;
        return i;
    }

    public class RunnableC17012 implements Runnable {
        RunnableC17012() {
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
            animatedFileDrawable.startTime = (float) System.currentTimeMillis();
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
                    AnimatedFileDrawable.RunnableC17012.this.lambda$run$1();
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
                    AnimatedFileDrawable.RunnableC17012.this.lambda$run$0();
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
            animatedFileDrawable.scheduleNextGetFrame();
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
        invalidateInternal();
    }

    public void invalidateInternal() {
        for (int i = 0; i < this.parents.size(); i++) {
            this.parents.get(i).invalidate();
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
            ImageReceiver imageReceiver = this.parents.get(i);
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

    public void updateScaleFactor() {
        int i;
        int i2;
        if (!this.isWebmSticker && (i = this.renderingHeight) > 0 && (i2 = this.renderingWidth) > 0) {
            int[] iArr = this.metaData;
            if (iArr[0] > 0 && iArr[1] > 0) {
                float max = Math.max(i2 / iArr[0], i / iArr[1]);
                this.scaleFactor = max;
                if (max <= 0.0f || max > 0.7d) {
                    this.scaleFactor = 1.0f;
                    return;
                }
                return;
            }
        }
        this.scaleFactor = 1.0f;
    }

    public void lambda$new$0() {
        View view;
        if (!this.secondParentViews.isEmpty()) {
            int size = this.secondParentViews.size();
            for (int i = 0; i < size; i++) {
                this.secondParentViews.get(i).invalidate();
            }
        }
        if ((this.secondParentViews.isEmpty() || this.invalidateParentViewWithSecond) && (view = this.parentView) != null) {
            view.invalidate();
        }
    }

    public AnimatedFileDrawable(File file, boolean z, long j, TLRPC$Document tLRPC$Document, ImageLocation imageLocation, Object obj, long j2, int i, boolean z2, BitmapsCache.CacheOptions cacheOptions) {
        this(file, z, j, tLRPC$Document, imageLocation, obj, j2, i, z2, 0, 0, cacheOptions);
    }

    public AnimatedFileDrawable(java.io.File r18, boolean r19, long r20, org.telegram.tgnet.TLRPC$Document r22, org.telegram.messenger.ImageLocation r23, java.lang.Object r24, long r25, int r27, boolean r28, int r29, int r30, org.telegram.messenger.utils.BitmapsCache.CacheOptions r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AnimatedFileDrawable.<init>(java.io.File, boolean, long, org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ImageLocation, java.lang.Object, long, int, boolean, int, int, org.telegram.messenger.utils.BitmapsCache$CacheOptions):void");
    }

    public void setIsWebmSticker(boolean z) {
        this.isWebmSticker = z;
        if (z) {
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
            seekToMs(this.nativePtr, j, z);
        }
        if (this.backgroundBitmap == null) {
            int[] iArr = this.metaData;
            float f = this.scaleFactor;
            this.backgroundBitmap = Bitmap.createBitmap((int) (iArr[0] * f), (int) (iArr[1] * f), Bitmap.Config.ARGB_8888);
        }
        if (z) {
            long j2 = this.nativePtr;
            Bitmap bitmap = this.backgroundBitmap;
            videoFrame = getFrameAtTime(j2, j, bitmap, this.metaData, bitmap.getRowBytes());
        } else {
            long j3 = this.nativePtr;
            Bitmap bitmap2 = this.backgroundBitmap;
            videoFrame = getVideoFrame(j3, bitmap2, this.metaData, bitmap2.getRowBytes(), true, 0.0f, 0.0f);
        }
        if (videoFrame != 0) {
            return this.backgroundBitmap;
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
        boolean isEmpty = this.parents.isEmpty();
        if (isEmpty && this.cancelCache == null) {
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    AnimatedFileDrawable.this.lambda$checkCacheCancel$1();
                }
            };
            this.cancelCache = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        } else if (isEmpty || (runnable = this.cancelCache) == null) {
        } else {
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
            this.pendingSeekTo = j;
            this.pendingSeekToUI = j;
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
                    scheduleNextGetFrame();
                } else {
                    this.forceDecodeAfterNextFrame = true;
                }
            }
        }
    }

    public void recycle() {
        if (!this.secondParentViews.isEmpty()) {
            this.recycleWithSecond = true;
            return;
        }
        this.isRunning = false;
        this.isRecycled = true;
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
            if (this.renderingBitmap != null) {
                this.renderingBitmap = null;
            }
            if (this.nextRenderingBitmap != null) {
                this.nextRenderingBitmap = null;
            }
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
        }
    }

    public float getCurrentProgress() {
        if (this.metaData[4] == 0) {
            return 0.0f;
        }
        if (this.pendingSeekToUI >= 0) {
            return ((float) this.pendingSeekToUI) / this.metaData[4];
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

    public int getDurationMs() {
        return this.metaData[4];
    }

    public void scheduleNextGetFrame() {
        if (this.loadFrameTask == null && this.nextRenderingBitmap == null && canLoadFrames() && !this.destroyWhenDone) {
            if (!this.isRunning) {
                boolean z = this.decodeSingleFrame;
                if (!z) {
                    return;
                }
                if (z && this.singleFrameDecoded) {
                    return;
                }
            }
            if ((this.parents.size() != 0 || this.ignoreNoParent) && !this.generatingCache) {
                long j = 0;
                if (this.lastFrameDecodeTime != 0) {
                    int i = this.invalidateAfter;
                    j = Math.min(i, Math.max(0L, i - (System.currentTimeMillis() - this.lastFrameDecodeTime)));
                }
                if (this.useSharedQueue) {
                    if (this.limitFps) {
                        Runnable runnable = this.loadFrameRunnable;
                        this.loadFrameTask = runnable;
                        DispatchQueuePoolBackground.execute(runnable);
                        return;
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor;
                    Runnable runnable2 = this.loadFrameRunnable;
                    this.loadFrameTask = runnable2;
                    scheduledThreadPoolExecutor.schedule(runnable2, j, TimeUnit.MILLISECONDS);
                    return;
                }
                if (this.decodeQueue == null) {
                    this.decodeQueue = new DispatchQueue("decodeQueue" + this);
                }
                DispatchQueue dispatchQueue = this.decodeQueue;
                Runnable runnable3 = this.loadFrameRunnable;
                this.loadFrameTask = runnable3;
                dispatchQueue.postRunnable(runnable3, j);
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
            i = (iArr[2] == 90 || iArr[2] == 270) ? iArr[0] : iArr[1];
        }
        if (i == 0) {
            return AndroidUtilities.m35dp(100.0f);
        }
        return (int) (i * this.scaleFactor);
    }

    @Override
    public int getIntrinsicWidth() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            i = (iArr[2] == 90 || iArr[2] == 270) ? iArr[1] : iArr[0];
        }
        if (i == 0) {
            return AndroidUtilities.m35dp(100.0f);
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

    public void drawInternal(android.graphics.Canvas r19, boolean r20, long r21, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.AnimatedFileDrawable.drawInternal(android.graphics.Canvas, boolean, long, int):void");
    }

    public long getLastFrameTimestamp() {
        return this.lastTimeStamp;
    }

    @Override
    public int getMinimumHeight() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            i = (iArr[2] == 90 || iArr[2] == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? AndroidUtilities.m35dp(100.0f) : i;
    }

    @Override
    public int getMinimumWidth() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            i = (iArr[2] == 90 || iArr[2] == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? AndroidUtilities.m35dp(100.0f) : i;
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
        return null;
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
            TLRPC$Document document = animatedFileDrawableStream.getDocument();
            ImageLocation location = this.stream.getLocation();
            Object parentObject = this.stream.getParentObject();
            long j2 = this.pendingSeekToUI;
            int i = this.currentAccount;
            AnimatedFileDrawableStream animatedFileDrawableStream2 = this.stream;
            animatedFileDrawable = new AnimatedFileDrawable(file, false, j, document, location, parentObject, j2, i, animatedFileDrawableStream2 != null && animatedFileDrawableStream2.isPreview(), null);
        } else {
            File file2 = this.path;
            long j3 = this.streamFileSize;
            TLRPC$Document tLRPC$Document = this.document;
            long j4 = this.pendingSeekToUI;
            int i2 = this.currentAccount;
            AnimatedFileDrawableStream animatedFileDrawableStream3 = this.stream;
            animatedFileDrawable = new AnimatedFileDrawable(file2, false, j3, tLRPC$Document, null, null, j4, i2, animatedFileDrawableStream3 != null && animatedFileDrawableStream3.isPreview(), null);
        }
        AnimatedFileDrawable animatedFileDrawable2 = animatedFileDrawable;
        int[] iArr = animatedFileDrawable2.metaData;
        int[] iArr2 = this.metaData;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        return animatedFileDrawable2;
    }

    public static void getVideoInfo(String str, int[] iArr) {
        getVideoInfo(Build.VERSION.SDK_INT, str, iArr);
    }

    public void setStartEndTime(long j, long j2) {
        this.startTime = ((float) j) / 1000.0f;
        this.endTime = ((float) j2) / 1000.0f;
        if (getCurrentProgressMs() < j) {
            seekTo(j, true);
        }
    }

    public long getStartTime() {
        return this.startTime * 1000.0f;
    }

    public boolean isRecycled() {
        return this.isRecycled;
    }

    public Bitmap getNextFrame() {
        if (this.nativePtr == 0) {
            return this.backgroundBitmap;
        }
        if (this.backgroundBitmap == null) {
            int[] iArr = this.metaData;
            float f = this.scaleFactor;
            this.backgroundBitmap = Bitmap.createBitmap((int) (iArr[0] * f), (int) (iArr[1] * f), Bitmap.Config.ARGB_8888);
        }
        long j = this.nativePtr;
        Bitmap bitmap = this.backgroundBitmap;
        getVideoFrame(j, bitmap, this.metaData, bitmap.getRowBytes(), false, this.startTime, this.endTime);
        return this.backgroundBitmap;
    }

    public void setLimitFps(boolean z) {
        this.limitFps = z;
    }

    public ArrayList<ImageReceiver> getParents() {
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
        if (this.cacheGenerateNativePtr == 0) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        if (this.generatingCacheBitmap == null) {
            int[] iArr = this.metaData;
            this.generatingCacheBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        long j = this.cacheGenerateNativePtr;
        Bitmap bitmap2 = this.generatingCacheBitmap;
        getVideoFrame(j, bitmap2, this.metaData, bitmap2.getRowBytes(), false, this.startTime, this.endTime);
        long j2 = this.cacheGenerateTimestamp;
        if (j2 != 0) {
            int[] iArr2 = this.metaData;
            if (iArr2[3] == 0 || j2 > iArr2[3]) {
                return 0;
            }
        }
        int i = this.lastMetadata;
        int[] iArr3 = this.metaData;
        if (i == iArr3[3]) {
            int i2 = this.tryCount + 1;
            this.tryCount = i2;
            if (i2 > 5) {
                return 0;
            }
        }
        this.lastMetadata = iArr3[3];
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.renderingWidth / this.generatingCacheBitmap.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.generatingCacheBitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.cacheGenerateTimestamp = this.metaData[3];
        return 1;
    }

    public boolean canLoadFrames() {
        return this.precache ? this.bitmapsCache != null : (this.nativePtr == 0 && this.decoderCreated) ? false : true;
    }

    public void updateCurrentFrame(long j, boolean z) {
        Bitmap bitmap;
        if (this.isRunning) {
            Bitmap bitmap2 = this.renderingBitmap;
            if (bitmap2 == null && this.nextRenderingBitmap == null) {
                scheduleNextGetFrame();
            } else if (this.nextRenderingBitmap != null && (bitmap2 == null || (Math.abs(j - this.lastFrameTime) >= this.invalidateAfter && !this.skipFrameUpdate))) {
                this.backgroundBitmap = this.renderingBitmap;
                this.renderingBitmap = this.nextRenderingBitmap;
                this.renderingBitmapTime = this.nextRenderingBitmapTime;
                int i = 0;
                while (true) {
                    BitmapShader[] bitmapShaderArr = this.backgroundShader;
                    if (i < bitmapShaderArr.length) {
                        BitmapShader[] bitmapShaderArr2 = this.renderingShader;
                        bitmapShaderArr[i] = bitmapShaderArr2[i];
                        BitmapShader[] bitmapShaderArr3 = this.nextRenderingShader;
                        bitmapShaderArr2[i] = bitmapShaderArr3[i];
                        bitmapShaderArr3[i] = null;
                        i++;
                    } else {
                        this.nextRenderingBitmap = null;
                        this.nextRenderingBitmapTime = 0;
                        this.lastFrameTime = j;
                        scheduleNextGetFrame();
                        return;
                    }
                }
            } else {
                invalidateInternal();
            }
        } else if (this.isRunning || !this.decodeSingleFrame || Math.abs(j - this.lastFrameTime) < this.invalidateAfter || (bitmap = this.nextRenderingBitmap) == null) {
        } else {
            this.backgroundBitmap = this.renderingBitmap;
            this.renderingBitmap = bitmap;
            this.renderingBitmapTime = this.nextRenderingBitmapTime;
            int i2 = 0;
            while (true) {
                BitmapShader[] bitmapShaderArr4 = this.backgroundShader;
                if (i2 < bitmapShaderArr4.length) {
                    BitmapShader[] bitmapShaderArr5 = this.renderingShader;
                    bitmapShaderArr4[i2] = bitmapShaderArr5[i2];
                    BitmapShader[] bitmapShaderArr6 = this.nextRenderingShader;
                    bitmapShaderArr5[i2] = bitmapShaderArr6[i2];
                    bitmapShaderArr6[i2] = null;
                    i2++;
                } else {
                    this.nextRenderingBitmap = null;
                    this.nextRenderingBitmapTime = 0;
                    this.lastFrameTime = j;
                    scheduleNextGetFrame();
                    return;
                }
            }
        }
    }
}
