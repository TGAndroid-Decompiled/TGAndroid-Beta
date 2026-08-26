package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.commonmark.internal.InlineParserImpl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DispatchQueuePoolBackground;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.utils.BitmapsCache;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.CastSync;

public final class AnimatedFileDrawable extends BitmapDrawable implements Animatable, BitmapsCache.Cacheable {
    public boolean PRERENDER_FRAME;
    public final RectF actualDrawRect;
    public boolean applyTransformation;
    public AnimatedFileBuffer backgroundBuffer;
    public final Paint[] backgroundPaint;
    public final BitmapsCache bitmapsCache;
    public AnimatedFileDrawable$$ExternalSyntheticLambda0 cacheGenRunnable;
    public AnimatedFileNative cacheGenerateDecoder;
    public long cacheGenerateTimestamp;
    public CastSync.AnonymousClass1 cacheMetadata;
    public AnimatedFileDrawable$$ExternalSyntheticLambda0 cancelCache;
    public final int currentAccount;
    public DispatchQueue decodeQueue;
    public boolean decodeSingleFrame;
    public boolean decoderCreated;
    public int decoderTryCount;
    public boolean destroyWhenDone;
    public final TLRPC.Document document;
    public final RectF dstRect;
    public final RectF[] dstRectBackground;
    public float endTime;
    public boolean forceDecodeAfterNextFrame;
    public boolean generatingCache;
    public Bitmap generatingCacheBitmap;
    public boolean invalidateParentViewWithSecond;
    public boolean invalidatePath;
    public boolean isChoreographerRegistered;
    public volatile boolean isPaused;
    public volatile boolean isRecycled;
    public boolean isRestarted;
    public volatile boolean isRunning;
    public boolean isStaticVideoDetected;
    public boolean isWebmSticker;
    public int lastMetadata;
    public int lastTimeStamp;
    public boolean limitFps;
    public final AnimatedFileDrawable$$ExternalSyntheticLambda0 loadFrameRunnable;
    public AnimatedFileDrawable$$ExternalSyntheticLambda0 loadFrameTask;
    public final boolean loop;
    public volatile AnimatedFileNative mDecoder;
    public final AnimatedFileDrawable$$ExternalSyntheticLambda0 mStartTask;
    public final RLottieDrawable$$ExternalSyntheticLambda5 mUiThreadChoreographerCallback;
    public final int[] metaData;
    public AnimatedFileBuffer nextRenderingBuffer;
    public AnimatedFileBuffer nextRenderingBuffer2;
    public View parentView;
    public final ArrayList parents;
    public final File path;
    public boolean pendingRemoveLoading;
    public int pendingRemoveLoadingFramesReset;
    public volatile long pendingSeekTo;
    public volatile long pendingSeekToUI;
    public final boolean precache;
    public boolean ptrFail;
    public boolean recycleWithSecond;
    public AnimatedFileBuffer renderingBuffer;
    public int renderingHeight;
    public int renderingWidth;
    public int repeatCount;
    public final Path[] roundPath;
    public final int[] roundRadius;
    public int[] roundRadiusBackup;
    public float scaleFactor;
    public float scaleX;
    public float scaleY;
    public boolean scheduledForSeek;
    public final ArrayList secondParentViews;
    public final Matrix[] shaderMatrix;
    public boolean singleFrameDecoded;
    public boolean skipFrameUpdate;
    public float startTime;
    public AnimatedFileDrawableStream stream;
    public final long streamFileSize;
    public final int streamLoadingPriority;
    public boolean swapBuffersAllowedByChoreographer;
    public final Object sync;
    public int ticksWithoutDraw;
    public int tryCount;
    public final AnimatedFileDrawable$$ExternalSyntheticLambda0 uiRunnable;
    public final AnimatedFileDrawable$$ExternalSyntheticLambda0 uiRunnableGenerateCache;
    public final AnimatedFileDrawable$$ExternalSyntheticLambda0 uiRunnableNoFrame;
    public final ArrayList unusedBuffers;
    public boolean useSharedQueue;
    public static final float[] radii = new float[8];
    public static final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final PorterDuffXfermode SRC_XFERMODE = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    public AnimatedFileDrawable(File file) {
        this(file, true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
    }

    public final void adaptRenderingSize() {
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

    public final void addParent(ImageReceiver imageReceiver) {
        if (!this.parents.contains(imageReceiver)) {
            this.parents.add(imageReceiver);
            if (this.isRunning) {
                scheduleNextGetFrame(false);
            }
        }
        checkCacheCancel();
    }

    public final void addSecondParentView(View view) {
        if (view != null) {
            ArrayList arrayList = this.secondParentViews;
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }
    }

    public final boolean canLoadFrames() {
        if (this.precache) {
            return this.bitmapsCache != null;
        }
        return (this.mDecoder == null && this.decoderCreated) ? false : true;
    }

    public final void checkCacheCancel() {
        AnimatedFileDrawable$$ExternalSyntheticLambda0 animatedFileDrawable$$ExternalSyntheticLambda0;
        if (this.bitmapsCache == null) {
            return;
        }
        boolean zIsEmpty = this.parents.isEmpty();
        if (zIsEmpty && this.cancelCache == null) {
            AnimatedFileDrawable$$ExternalSyntheticLambda0 animatedFileDrawable$$ExternalSyntheticLambda1 = new AnimatedFileDrawable$$ExternalSyntheticLambda0(this, 1);
            this.cancelCache = animatedFileDrawable$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(animatedFileDrawable$$ExternalSyntheticLambda1, 600L);
        } else {
            if (zIsEmpty || (animatedFileDrawable$$ExternalSyntheticLambda0 = this.cancelCache) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(animatedFileDrawable$$ExternalSyntheticLambda0);
            this.cancelCache = null;
        }
    }

    public final void checkChoreographer() {
        AndroidUtilities.executeOnUIThread(new AnimatedFileDrawable$$ExternalSyntheticLambda0(this, 0));
    }

    public final void checkChoreographerInternal() {
        int i;
        if (!this.isRunning || this.isPaused || this.isStaticVideoDetected) {
            if (this.isChoreographerRegistered) {
                this.isChoreographerRegistered = false;
                this.ticksWithoutDraw = 0;
                Choreographer60FpsContent.getInstance().removeFrameCallback(this.mUiThreadChoreographerCallback);
                return;
            }
            return;
        }
        if (this.isChoreographerRegistered || (i = this.metaData[5]) <= 0) {
            return;
        }
        this.isChoreographerRegistered = true;
        this.ticksWithoutDraw = 0;
        Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
        RLottieDrawable$$ExternalSyntheticLambda5 rLottieDrawable$$ExternalSyntheticLambda5 = this.mUiThreadChoreographerCallback;
        choreographer60FpsContent.getClass();
        Choreographer60FpsContent.checkMainThread();
        int iMax = Math.max(1, Math.min(i, 60));
        choreographer60FpsContent.removeFrameCallback(rLottieDrawable$$ExternalSyntheticLambda5);
        choreographer60FpsContent.getOrCreateGroup(iMax).callbacks.add(rLottieDrawable$$ExternalSyntheticLambda5);
    }

    public final void checkRepeat() {
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
        if (this.parents.size() != i2) {
            start();
        } else {
            this.isRunning = false;
            checkChoreographer();
        }
    }

    public final void chekDestroyDecoder() {
        if (canLoadFrames()) {
            return;
        }
        AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
        if (animatedFileBuffer != null) {
            animatedFileBuffer.bitmap.recycle();
            Arrays.fill(animatedFileBuffer.shader, (Object) null);
            this.renderingBuffer = null;
        }
        AnimatedFileBuffer animatedFileBuffer2 = this.backgroundBuffer;
        if (animatedFileBuffer2 != null) {
            animatedFileBuffer2.bitmap.recycle();
            Arrays.fill(animatedFileBuffer2.shader, (Object) null);
            this.backgroundBuffer = null;
        }
        DispatchQueue dispatchQueue = this.decodeQueue;
        if (dispatchQueue != null) {
            dispatchQueue.recycle();
            this.decodeQueue = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.unusedBuffers;
            if (i >= arrayList.size()) {
                arrayList.clear();
                invalidateInternal();
                return;
            } else {
                AnimatedFileBuffer animatedFileBuffer3 = (AnimatedFileBuffer) arrayList.get(i);
                animatedFileBuffer3.bitmap.recycle();
                Arrays.fill(animatedFileBuffer3.shader, (Object) null);
                i++;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        drawInternal(canvas, false, System.currentTimeMillis(), 0);
    }

    public final void drawInternal(Canvas canvas, boolean z, long j, int i) {
        boolean z2;
        float fWidth;
        float fHeight;
        int i2;
        float f;
        int i3;
        AnimatedFileBuffer animatedFileBuffer;
        BitmapShader[] bitmapShaderArr;
        Matrix[] matrixArr;
        Matrix matrix;
        int i4;
        Path[] pathArr;
        Path path;
        boolean z3;
        RectF rectF;
        int i5;
        int length;
        float[] fArr;
        RectF rectF2;
        int i6;
        int i7;
        int i8;
        if (!canLoadFrames() || this.destroyWhenDone) {
            return;
        }
        long jCurrentTimeMillis = j == 0 ? System.currentTimeMillis() : j;
        RectF rectF3 = z ? this.dstRectBackground[i] : this.dstRect;
        Paint paint = z ? this.backgroundPaint[i] : getPaint();
        if (!z) {
            updateCurrentFrame(jCurrentTimeMillis);
        }
        if (this.renderingBuffer == null) {
            return;
        }
        int[] iArr = this.roundRadius;
        int length2 = iArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length2) {
                z2 = false;
                break;
            } else {
                if (iArr[i9] != 0) {
                    z2 = true;
                    break;
                }
                i9++;
            }
        }
        if (!z) {
            PorterDuffXfermode porterDuffXfermode = (!z2 && this.renderingBuffer.opaque && paint.getAlpha() == 255) ? SRC_XFERMODE : null;
            if (paint.getXfermode() != porterDuffXfermode) {
                paint.setXfermode(porterDuffXfermode);
            }
        }
        float f2 = this.scaleX;
        float f3 = this.scaleY;
        int[] iArr2 = this.metaData;
        if (!z) {
            if (this.applyTransformation) {
                AnimatedFileBuffer animatedFileBuffer2 = this.renderingBuffer;
                int i10 = animatedFileBuffer2.width;
                int i11 = iArr2[2];
                int i12 = animatedFileBuffer2.height;
                if (i11 == 90 || i11 == 270) {
                    i10 = i12;
                    i12 = i10;
                }
                rectF3.set(getBounds());
                fWidth = rectF3.width() / i10;
                this.scaleX = fWidth;
                fHeight = rectF3.height() / i12;
                this.scaleY = fHeight;
                this.applyTransformation = false;
            }
            if (z2) {
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                i2 = iArr2[2];
                if (i2 == 90) {
                    canvas.rotate(90.0f);
                    f = 0.0f;
                    canvas.translate(0.0f, -rectF3.width());
                } else {
                    if (i2 == 180) {
                        canvas.rotate(180.0f);
                        canvas.translate(-rectF3.width(), -rectF3.height());
                    } else if (i2 == 270) {
                        canvas.rotate(270.0f);
                        f = 0.0f;
                        canvas.translate(-rectF3.height(), 0.0f);
                    }
                    f = 0.0f;
                }
                canvas.scale(f2, f3);
                canvas.drawBitmap(this.renderingBuffer.bitmap, f, f, paint);
                canvas.restore();
                return;
            }
            if (z) {
                i3 = i + 1;
            } else {
                i3 = 0;
            }
            animatedFileBuffer = this.renderingBuffer;
            bitmapShaderArr = animatedFileBuffer.shader;
            if (bitmapShaderArr[i3] == null) {
                Bitmap bitmap = animatedFileBuffer.bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShaderArr[i3] = new BitmapShader(bitmap, tileMode, tileMode);
            }
            BitmapShader bitmapShader = animatedFileBuffer.shader[i3];
            paint.setShader(bitmapShader);
            matrixArr = this.shaderMatrix;
            matrix = matrixArr[i3];
            if (matrix == null) {
                matrix = new Matrix();
                matrixArr[i3] = matrix;
            }
            matrix.reset();
            matrix.setTranslate(rectF3.left, rectF3.top);
            i4 = iArr2[2];
            if (i4 == 90) {
                matrix.preRotate(90.0f);
                matrix.preTranslate(0.0f, -rectF3.width());
            } else if (i4 == 180) {
                matrix.preRotate(180.0f);
                matrix.preTranslate(-rectF3.width(), -rectF3.height());
            } else if (i4 == 270) {
                matrix.preRotate(270.0f);
                matrix.preTranslate(-rectF3.height(), 0.0f);
            }
            matrix.preScale(f2, f3);
            bitmapShader.setLocalMatrix(matrix);
            pathArr = this.roundPath;
            path = pathArr[i3];
            if (path == null) {
                path = new Path();
                pathArr[i3] = path;
            }
            z3 = this.invalidatePath;
            rectF = this.actualDrawRect;
            if (z3 || z) {
                if (!z) {
                    this.invalidatePath = false;
                }
                i5 = 0;
                while (true) {
                    length = iArr.length;
                    fArr = radii;
                    if (i5 >= length) {
                        break;
                    }
                    int i13 = i5 * 2;
                    float f4 = iArr[i5];
                    fArr[i13] = f4;
                    fArr[i13 + 1] = f4;
                    i5++;
                }
                path.rewind();
                if (z) {
                    rectF2 = rectF3;
                } else {
                    rectF2 = rectF;
                }
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
            }
            i6 = iArr[0];
            i7 = iArr[1];
            if (i6 == i7 || i7 != (i8 = iArr[2]) || i8 != iArr[3]) {
                canvas.drawPath(path, paint);
            }
            if (!z) {
                rectF3 = rectF;
            }
            float f5 = i6;
            canvas.drawRoundRect(rectF3, f5, f5, paint);
            return;
        }
        AnimatedFileBuffer animatedFileBuffer3 = this.renderingBuffer;
        int i14 = animatedFileBuffer3.width;
        int i15 = iArr2[2];
        int i16 = animatedFileBuffer3.height;
        if (i15 == 90 || i15 == 270) {
            i14 = i16;
            i16 = i14;
        }
        fWidth = rectF3.width() / i14;
        fHeight = rectF3.height() / i16;
        float f6 = fWidth;
        f3 = fHeight;
        f2 = f6;
        if (z2) {
            canvas.save();
            canvas.translate(rectF3.left, rectF3.top);
            i2 = iArr2[2];
            if (i2 == 90) {
                canvas.rotate(90.0f);
                f = 0.0f;
                canvas.translate(0.0f, -rectF3.width());
            } else {
                if (i2 == 180) {
                    canvas.rotate(180.0f);
                    canvas.translate(-rectF3.width(), -rectF3.height());
                } else if (i2 == 270) {
                    canvas.rotate(270.0f);
                    f = 0.0f;
                    canvas.translate(-rectF3.height(), 0.0f);
                }
                f = 0.0f;
            }
            canvas.scale(f2, f3);
            canvas.drawBitmap(this.renderingBuffer.bitmap, f, f, paint);
            canvas.restore();
            return;
        }
        if (z) {
            i3 = i + 1;
        } else {
            i3 = 0;
        }
        animatedFileBuffer = this.renderingBuffer;
        bitmapShaderArr = animatedFileBuffer.shader;
        if (bitmapShaderArr[i3] == null) {
            Bitmap bitmap2 = animatedFileBuffer.bitmap;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            bitmapShaderArr[i3] = new BitmapShader(bitmap2, tileMode2, tileMode2);
        }
        BitmapShader bitmapShader2 = animatedFileBuffer.shader[i3];
        paint.setShader(bitmapShader2);
        matrixArr = this.shaderMatrix;
        matrix = matrixArr[i3];
        if (matrix == null) {
            matrix = new Matrix();
            matrixArr[i3] = matrix;
        }
        matrix.reset();
        matrix.setTranslate(rectF3.left, rectF3.top);
        i4 = iArr2[2];
        if (i4 == 90) {
            matrix.preRotate(90.0f);
            matrix.preTranslate(0.0f, -rectF3.width());
        } else if (i4 == 180) {
            matrix.preRotate(180.0f);
            matrix.preTranslate(-rectF3.width(), -rectF3.height());
        } else if (i4 == 270) {
            matrix.preRotate(270.0f);
            matrix.preTranslate(-rectF3.height(), 0.0f);
        }
        matrix.preScale(f2, f3);
        bitmapShader2.setLocalMatrix(matrix);
        pathArr = this.roundPath;
        path = pathArr[i3];
        if (path == null) {
            path = new Path();
            pathArr[i3] = path;
        }
        z3 = this.invalidatePath;
        rectF = this.actualDrawRect;
        if (z3) {
            if (!z) {
                this.invalidatePath = false;
            }
            i5 = 0;
            while (true) {
                length = iArr.length;
                fArr = radii;
                if (i5 >= length) {
                    break;
                    break;
                }
                int i17 = i5 * 2;
                float f7 = iArr[i5];
                fArr[i17] = f7;
                fArr[i17 + 1] = f7;
                i5++;
            }
            path.rewind();
            if (z) {
                rectF2 = rectF3;
            } else {
                rectF2 = rectF;
            }
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
        } else {
            if (!z) {
                this.invalidatePath = false;
            }
            i5 = 0;
            while (true) {
                length = iArr.length;
                fArr = radii;
                if (i5 >= length) {
                    break;
                    break;
                }
                int i18 = i5 * 2;
                float f8 = iArr[i5];
                fArr[i18] = f8;
                fArr[i18 + 1] = f8;
                i5++;
            }
            path.rewind();
            if (z) {
                rectF2 = rectF3;
            } else {
                rectF2 = rectF;
            }
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
        }
        i6 = iArr[0];
        i7 = iArr[1];
        if (i6 == i7) {
        }
        canvas.drawPath(path, paint);
    }

    public final void finalize() throws Throwable {
        try {
            this.secondParentViews.clear();
            recycle();
        } finally {
            super.finalize();
        }
    }

    public final Bitmap getAnimatedBitmap() {
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

    public final int getCurrentProgressMs() {
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

    public final Bitmap getFirstFrame() {
        int i = this.renderingWidth;
        int i2 = this.renderingHeight;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        AnimatedFileNative animatedFileNativeCreateDecoderFrom = AnimatedFileNative.createDecoderFrom(this.path.getAbsolutePath(), this.metaData, this.currentAccount, this.streamFileSize, this.stream, false);
        if (animatedFileNativeCreateDecoderFrom == null) {
            return bitmapCreateBitmap;
        }
        if (this.generatingCacheBitmap == null) {
            int[] iArr = this.metaData;
            this.generatingCacheBitmap = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), config);
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

    public final Bitmap getFrameAtTime(long j, boolean z) {
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
            if ((z ? this.mDecoder.getFrameAtTime(bitmapCreateBitmap, j) : this.mDecoder.getVideoFrame(bitmapCreateBitmap, true, 0.0f, 0.0f, true)) != 0) {
                return bitmapCreateBitmap;
            }
            bitmapCreateBitmap.recycle();
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? AndroidUtilities.dp(100.0f) : (int) (i * this.scaleFactor);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? AndroidUtilities.dp(100.0f) : (int) (i * this.scaleFactor);
    }

    @Override
    public final int getMinimumHeight() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? AndroidUtilities.dp(100.0f) : i;
    }

    @Override
    public final int getMinimumWidth() {
        int i = 0;
        if (this.decoderCreated) {
            int[] iArr = this.metaData;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? AndroidUtilities.dp(100.0f) : i;
    }

    public final Bitmap getNextFrame(boolean z) {
        if (this.mDecoder == null) {
            AnimatedFileBuffer animatedFileBuffer = this.backgroundBuffer;
            if (animatedFileBuffer != null) {
                return animatedFileBuffer.bitmap;
            }
            return null;
        }
        if (this.backgroundBuffer == null) {
            if (this.unusedBuffers.isEmpty()) {
                int[] iArr = this.metaData;
                float f = iArr[0];
                float f2 = this.scaleFactor;
                this.backgroundBuffer = new AnimatedFileBuffer(Bitmap.createBitmap((int) (f * f2), (int) (iArr[1] * f2), Bitmap.Config.ARGB_8888));
            } else {
                this.backgroundBuffer = (AnimatedFileBuffer) this.unusedBuffers.remove(0);
            }
        }
        this.mDecoder.getVideoFrame(this.backgroundBuffer.bitmap, false, this.startTime, this.endTime, z);
        return this.backgroundBuffer.bitmap;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean hasBitmap() {
        if (canLoadFrames()) {
            return (this.renderingBuffer == null && this.nextRenderingBuffer == null) ? false : true;
        }
        return false;
    }

    public final void invalidateInternal() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.parents;
            if (i >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i)).invalidate();
            i++;
        }
    }

    @Override
    public final boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyTransformation = true;
    }

    @Override
    public final void prepareForGenerateCache() {
        this.cacheGenerateDecoder = AnimatedFileNative.createDecoderFrom(this.path.getAbsolutePath(), this.metaData, this.currentAccount, this.streamFileSize, this.stream, false);
    }

    public final void recycle() {
        if (!this.secondParentViews.isEmpty()) {
            this.recycleWithSecond = true;
            return;
        }
        int i = 0;
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
            ArrayList arrayList2 = this.unusedBuffers;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                AnimatedFileBuffer animatedFileBuffer5 = (AnimatedFileBuffer) obj;
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

    @Override
    public final void releaseForGenerateCache() {
        AnimatedFileNative animatedFileNative = this.cacheGenerateDecoder;
        if (animatedFileNative != null) {
            animatedFileNative.recycle();
            this.cacheGenerateDecoder = null;
        }
    }

    public final void removeSecondParentView(View view) {
        ArrayList arrayList = this.secondParentViews;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
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

    public final void scheduleNextGetFrame(boolean z) {
        AnimatedFileDrawable$$ExternalSyntheticLambda0 animatedFileDrawable$$ExternalSyntheticLambda0;
        AnimatedFileDrawable$$ExternalSyntheticLambda0 animatedFileDrawable$$ExternalSyntheticLambda1;
        if (this.loadFrameTask == null || z) {
            if ((!this.PRERENDER_FRAME || (this.nextRenderingBuffer2 != null && (this.scheduledForSeek || this.pendingSeekToUI < 0))) && this.nextRenderingBuffer != null) {
                return;
            }
            if ((this.renderingBuffer == null || !this.isStaticVideoDetected) && canLoadFrames() && !this.destroyWhenDone) {
                if ((!this.isRunning && (!this.decodeSingleFrame || this.singleFrameDecoded)) || this.parents.isEmpty() || this.generatingCache) {
                    return;
                }
                if (!this.useSharedQueue) {
                    if (this.decodeQueue == null) {
                        this.decodeQueue = new DispatchQueue("decodeQueue" + this);
                    }
                    if (z && (animatedFileDrawable$$ExternalSyntheticLambda0 = this.loadFrameTask) != null) {
                        this.decodeQueue.cancelRunnable(animatedFileDrawable$$ExternalSyntheticLambda0);
                    }
                    DispatchQueue dispatchQueue = this.decodeQueue;
                    AnimatedFileDrawable$$ExternalSyntheticLambda0 animatedFileDrawable$$ExternalSyntheticLambda2 = this.loadFrameRunnable;
                    this.loadFrameTask = animatedFileDrawable$$ExternalSyntheticLambda2;
                    dispatchQueue.postRunnable(animatedFileDrawable$$ExternalSyntheticLambda2, 0L);
                } else if (this.limitFps) {
                    AnimatedFileDrawable$$ExternalSyntheticLambda0 animatedFileDrawable$$ExternalSyntheticLambda3 = this.loadFrameRunnable;
                    this.loadFrameTask = animatedFileDrawable$$ExternalSyntheticLambda3;
                    DispatchQueuePoolBackground.execute(animatedFileDrawable$$ExternalSyntheticLambda3);
                } else {
                    if (z && (animatedFileDrawable$$ExternalSyntheticLambda1 = this.loadFrameTask) != null) {
                        executor.remove(animatedFileDrawable$$ExternalSyntheticLambda1);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor;
                    AnimatedFileDrawable$$ExternalSyntheticLambda0 animatedFileDrawable$$ExternalSyntheticLambda4 = this.loadFrameRunnable;
                    this.loadFrameTask = animatedFileDrawable$$ExternalSyntheticLambda4;
                    scheduledThreadPoolExecutor.execute(animatedFileDrawable$$ExternalSyntheticLambda4);
                }
                this.scheduledForSeek = true;
            }
        }
    }

    public final void seekTo(long j, boolean z, boolean z2) {
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
                        scheduleNextGetFrame(true);
                    } else {
                        this.forceDecodeAfterNextFrame = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setActualDrawRect(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.actualDrawRect;
        if (rectF.left == f && rectF.top == f2 && rectF.right == f6 && rectF.bottom == f5) {
            return;
        }
        rectF.set(f, f2, f6, f5);
        this.invalidatePath = true;
    }

    public final void setLimitFps(boolean z) {
        this.limitFps = z;
        if (z) {
            this.PRERENDER_FRAME = false;
        }
    }

    public final void setRoundRadius(int[] iArr) {
        boolean zIsEmpty = this.secondParentViews.isEmpty();
        int[] iArr2 = this.roundRadius;
        if (!zIsEmpty) {
            if (this.roundRadiusBackup == null) {
                this.roundRadiusBackup = new int[4];
            }
            int[] iArr3 = this.roundRadiusBackup;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.invalidatePath && iArr[i] != iArr2[i]) {
                this.invalidatePath = true;
            }
            iArr2[i] = iArr[i];
        }
    }

    public final void setStartEndTime(long j, long j2) {
        this.startTime = j / 1000.0f;
        this.endTime = j2 / 1000.0f;
        if (j < 0 || getCurrentProgressMs() >= j) {
            return;
        }
        seekTo(j, true, false);
    }

    @Override
    public final void start() {
        if (this.isRunning || this.parents.isEmpty()) {
            return;
        }
        this.isRunning = true;
        this.isPaused = false;
        scheduleNextGetFrame(false);
        AndroidUtilities.runOnUIThread(this.mStartTask);
        checkChoreographer();
    }

    @Override
    public final void stop() {
        this.isRunning = false;
        checkChoreographer();
    }

    public final void updateCurrentFrame(long j) {
        this.ticksWithoutDraw = 0;
        if (this.isPaused) {
            this.isPaused = false;
            checkChoreographer();
        }
        boolean z = this.swapBuffersAllowedByChoreographer || (!this.isRunning && this.decodeSingleFrame);
        if (!this.isRunning) {
            if (this.isRunning || !this.decodeSingleFrame || !z || this.nextRenderingBuffer == null) {
                return;
            }
            AnimatedFileBuffer animatedFileBuffer = this.renderingBuffer;
            if (animatedFileBuffer != null) {
                this.unusedBuffers.add(animatedFileBuffer);
            }
            this.renderingBuffer = this.nextRenderingBuffer;
            this.nextRenderingBuffer = this.nextRenderingBuffer2;
            this.nextRenderingBuffer2 = null;
            this.swapBuffersAllowedByChoreographer = false;
            scheduleNextGetFrame(false);
            return;
        }
        AnimatedFileBuffer animatedFileBuffer2 = this.renderingBuffer;
        if (animatedFileBuffer2 == null && this.nextRenderingBuffer == null) {
            scheduleNextGetFrame(false);
            return;
        }
        if (this.nextRenderingBuffer != null) {
            if (animatedFileBuffer2 == null || (z && !this.skipFrameUpdate && this.pendingSeekToUI < 0)) {
                AnimatedFileBuffer animatedFileBuffer3 = this.renderingBuffer;
                if (animatedFileBuffer3 != null) {
                    this.unusedBuffers.add(animatedFileBuffer3);
                }
                this.renderingBuffer = this.nextRenderingBuffer;
                this.nextRenderingBuffer = this.nextRenderingBuffer2;
                this.nextRenderingBuffer2 = null;
                this.swapBuffersAllowedByChoreographer = false;
                scheduleNextGetFrame(false);
            }
        }
    }

    public final void updateScaleFactor() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        if (this.isWebmSticker || (i = this.renderingHeight) <= 0 || (i2 = this.renderingWidth) <= 0 || (i3 = (iArr = this.metaData)[0]) <= 0 || (i4 = iArr[1]) <= 0) {
            this.scaleFactor = 1.0f;
            return;
        }
        float fMax = Math.max(i2 / i3, i / i4);
        this.scaleFactor = fMax;
        if (fMax <= 0.0f || fMax > 0.7d) {
            this.scaleFactor = 1.0f;
        }
    }

    public AnimatedFileDrawable(File file, boolean z, long j, int i, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j2, int i2, boolean z2) {
        this(file, z, j, i, document, imageLocation, obj, j2, i2, z2, 0, 0, null, document != null ? 1 : 0, true);
    }

    public AnimatedFileDrawable(File file, boolean z, long j, int i, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j2, int i2, boolean z2, int i3, int i4, InlineParserImpl.DelimiterData delimiterData, int i5, boolean z3) {
        char c;
        char c2;
        boolean z4;
        int[] iArr = new int[8];
        this.metaData = iArr;
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
        this.uiRunnableNoFrame = new AnimatedFileDrawable$$ExternalSyntheticLambda0(this, 2);
        this.uiRunnableGenerateCache = new AnimatedFileDrawable$$ExternalSyntheticLambda0(this, 3);
        this.uiRunnable = new AnimatedFileDrawable$$ExternalSyntheticLambda0(this, 4);
        this.decoderTryCount = 0;
        this.loadFrameRunnable = new AnimatedFileDrawable$$ExternalSyntheticLambda0(this, 5);
        this.mStartTask = new AnimatedFileDrawable$$ExternalSyntheticLambda0(this, 6);
        this.mUiThreadChoreographerCallback = new RLottieDrawable$$ExternalSyntheticLambda5(this, 1);
        this.path = file;
        this.PRERENDER_FRAME = SharedConfig.deviceIsAboveAverage();
        this.streamFileSize = j;
        this.streamLoadingPriority = i;
        this.currentAccount = i2;
        this.renderingHeight = i4;
        this.renderingWidth = i3;
        this.loop = z3;
        boolean z5 = delimiterData != null && i3 > 0 && i4 > 0;
        this.precache = z5;
        this.document = document;
        getPaint().setFlags(3);
        if (j == 0 || (document == null && imageLocation == null)) {
            c = 0;
        } else {
            c = 0;
            this.stream = new AnimatedFileDrawableStream(document, imageLocation, obj, i2, z2, i, i5);
        }
        BitmapsCache bitmapsCache = null;
        if (!z || z5) {
            c2 = 1;
        } else {
            c2 = 1;
            this.mDecoder = AnimatedFileNative.createDecoderFrom(file.getAbsolutePath(), iArr, i2, j, this.stream, z2);
            this.ptrFail = this.mDecoder == null && (!this.isWebmSticker || this.decoderTryCount > 15);
            if (this.mDecoder != null && (iArr[c] > 3840 || iArr[1] > 3840)) {
                this.mDecoder.recycle();
                this.mDecoder = null;
            }
            adaptRenderingSize();
            updateScaleFactor();
            this.decoderCreated = true;
        }
        if (z5) {
            this.mDecoder = AnimatedFileNative.createDecoderFrom(file.getAbsolutePath(), iArr, i2, j, this.stream, z2);
            this.ptrFail = this.mDecoder == null && (!this.isWebmSticker || this.decoderTryCount > 15);
            if (this.mDecoder != null && (iArr[c] > 3840 || iArr[c2] > 3840)) {
                this.mDecoder.recycle();
                this.mDecoder = null;
                z4 = false;
            } else {
                z4 = false;
                bitmapsCache = new BitmapsCache(file, this, delimiterData, this.renderingWidth, this.renderingHeight, !this.limitFps, 0);
            }
        } else {
            z4 = false;
        }
        this.bitmapsCache = bitmapsCache;
        if (j2 != 0) {
            seekTo(j2, z4, z4);
        }
    }

    @Override
    public final int getNextFrame(Bitmap bitmap) {
        int i;
        if (this.cacheGenerateDecoder == null) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.generatingCacheBitmap;
        int[] iArr = this.metaData;
        if (bitmap2 == null) {
            this.generatingCacheBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        this.cacheGenerateDecoder.getVideoFrame(this.generatingCacheBitmap, false, this.startTime, this.endTime, this.loop);
        long j = this.cacheGenerateTimestamp;
        if (j != 0 && ((i = iArr[3]) == 0 || j > i)) {
            return 0;
        }
        int i2 = this.lastMetadata;
        int i3 = iArr[3];
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
        this.cacheGenerateTimestamp = iArr[3];
        return 1;
    }
}
