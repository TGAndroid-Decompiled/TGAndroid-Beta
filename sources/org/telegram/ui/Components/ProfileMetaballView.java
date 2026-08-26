package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ProfileActivity;

public class ProfileMetaballView extends View {
    public static final DispatchQueue profileBlurQueue = new DispatchQueue("profileBlurQueue");
    private final PointF a1;
    private final PointF a2;
    private int alpha;
    private float backwardFromAlpha;
    private float backwardFromR;
    private int backwardFromRadius;
    private float backwardFromY;
    private float backwardProgress;
    private int bgColor;
    private BitmapShader bitmapShader;
    private RenderNode blurNode;
    private int blurRadius;
    private final Runnable blurTask;
    private final PointF c1;
    private final PointF c2;
    private final Paint circlePaint;
    private final Path clipPath;
    private final Paint connectorPaint;
    private BlurBitmapHolder currentFrame;
    private int currentFrameBlurRadius;
    private final Object drawLock;
    private final Paint gradientPaint;
    private final LinearGradient gradientShader;
    private final PointF h1;
    private final PointF h2;
    private final PointF h3;
    private final PointF h4;
    private final ProfileActivity.AvatarImageView imageView;
    private float inset;
    private int installedRadius;
    public boolean isBackward;
    private volatile boolean isBluring;
    private final Object lock;
    private final Matrix matrix;
    private boolean needsNewFrame;
    private BlurBitmapHolder nextFrame;
    private BlurBitmapHolder originalFrame;
    private final PointF p1;
    private final PointF p2;
    private final PointF p3;
    private final PointF p4;
    private final PointF p5;
    private final Path path;
    private int prevOrgKey;
    private int radius;
    private final float renderNodeSize;
    private final float renderNodeTop;
    private final Paint shaderPaint;
    private final View storyView;
    private boolean usingRenderNode;
    private final View view;

    public ProfileMetaballView(View view, ProfileActivity.AvatarImageView avatarImageView, View view2) {
        super(view.getContext());
        this.originalFrame = null;
        this.nextFrame = null;
        this.currentFrame = null;
        final int i = 0;
        final int i2 = 1;
        this.usingRenderNode = Build.VERSION.SDK_INT >= 31;
        this.installedRadius = -1;
        this.lock = new Object();
        this.drawLock = new Object();
        Paint paint = new Paint(1);
        this.circlePaint = paint;
        Paint paint2 = new Paint(1);
        this.connectorPaint = paint2;
        Paint paint3 = new Paint(1);
        this.shaderPaint = paint3;
        Paint paint4 = new Paint();
        this.gradientPaint = paint4;
        this.matrix = new Matrix();
        this.path = new Path();
        this.clipPath = new Path();
        this.p1 = new PointF();
        this.p2 = new PointF();
        this.p3 = new PointF();
        this.p4 = new PointF();
        this.p5 = new PointF();
        this.h1 = new PointF();
        this.h2 = new PointF();
        this.h3 = new PointF();
        this.h4 = new PointF();
        this.c1 = new PointF();
        this.c2 = new PointF();
        this.a1 = new PointF();
        this.a2 = new PointF();
        this.isBluring = false;
        this.bgColor = -16777216;
        this.prevOrgKey = -1;
        this.blurRadius = 4;
        this.currentFrameBlurRadius = -1;
        this.blurTask = new Runnable(this) {
            public final ProfileMetaballView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.doBlur();
                        break;
                    default:
                        this.f$0.updateContent();
                        break;
                }
            }
        };
        this.imageView = avatarImageView;
        this.view = view;
        this.storyView = view2;
        paint.setColor(-16777216);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(-16777216);
        paint2.setStyle(style);
        paint2.setStrokeWidth(6.0f);
        paint3.setColor(-16777216);
        paint3.setStyle(style);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dpf2(16.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.gradientShader = linearGradient;
        paint4.setShader(linearGradient);
        boolean z = this.usingRenderNode & SharedConfig.useNewBlur;
        this.usingRenderNode = z;
        if (z) {
            setLayerType(2, null);
        }
        this.renderNodeTop = AndroidUtilities.dp(24.0f);
        this.renderNodeSize = AndroidUtilities.dp(56.0f);
        avatarImageView.listenInvalidate(new Runnable(this) {
            public final ProfileMetaballView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.doBlur();
                        break;
                    default:
                        this.f$0.updateContent();
                        break;
                }
            }
        });
    }

    private float angle(PointF pointF, PointF pointF2) {
        return (float) Math.atan2(pointF.y - pointF2.y, pointF.x - pointF2.x);
    }

    private void applyShader() {
        Bitmap bitmap = this.currentFrame.bitmap;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.bitmapShader = bitmapShader;
        this.shaderPaint.setShader(bitmapShader);
    }

    private void captureNextFrame() {
        int iDp = AndroidUtilities.dp(36.0f);
        float f = iDp;
        int height = (int) ((this.imageView.getHeight() * f) / this.imageView.getWidth());
        if (height < iDp) {
            return;
        }
        BlurBitmapHolder blurBitmapHolder = this.originalFrame;
        if (blurBitmapHolder == null || !blurBitmapHolder.canUse(iDp, height)) {
            BlurBitmapHolder blurBitmapHolder2 = this.originalFrame;
            if (blurBitmapHolder2 != null) {
                blurBitmapHolder2.recycle();
            }
            this.originalFrame = new BlurBitmapHolder(iDp, height);
        }
        synchronized (this.drawLock) {
            try {
                BlurBitmapHolder blurBitmapHolder3 = this.originalFrame;
                if (blurBitmapHolder3.isBusy) {
                    this.needsNewFrame = true;
                    return;
                }
                blurBitmapHolder3.lock();
                this.originalFrame.clear();
                Canvas canvas = this.originalFrame.canvas;
                canvas.save();
                int i = this.bgColor;
                if (i != -16777216) {
                    canvas.drawColor(i);
                }
                canvas.scale(f / this.imageView.getWidth(), height / this.imageView.getHeight());
                this.radius = this.imageView.getRoundRadiusForExpand();
                this.imageView.setRoundRadiusForExpand(0);
                this.imageView.draw(canvas);
                this.imageView.setRoundRadiusForExpand(this.radius);
                canvas.restore();
                this.originalFrame.unlock();
                this.originalFrame.ready();
                this.needsNewFrame = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static float cos(float f) {
        return (float) Math.cos(f);
    }

    private boolean createMetaballPath(float f, float f2, float f3) {
        float fAcos;
        float fDist = dist(this.c1, this.c2);
        float f4 = (2.25f * f2) + f;
        float f5 = 0.0f;
        if (f == 0.0f || f2 == 0.0f || fDist > f4) {
            return false;
        }
        float f6 = f - f2;
        if (fDist <= Math.abs(f6)) {
            return false;
        }
        float f7 = f + f2;
        if (fDist < f7) {
            float f8 = f * f;
            float f9 = fDist * fDist;
            float f10 = f2 * f2;
            float fAcos2 = (float) Math.acos(((f8 + f9) - f10) / ((f * 2.0f) * fDist));
            fAcos = (float) Math.acos(((f10 + f9) - f8) / ((f2 * 2.0f) * fDist));
            f5 = fAcos2;
        } else {
            fAcos = 0.0f;
        }
        float fAngle = angle(this.c2, this.c1);
        float fAcos3 = (float) Math.acos(f6 / fDist);
        float f11 = (fAcos3 - f5) * f3;
        float f12 = fAngle + f5 + f11;
        float f13 = (fAngle - f5) - f11;
        float f14 = ((3.1415927f - fAcos) - fAcos3) * f3;
        float f15 = ((fAngle + 3.1415927f) - fAcos) - f14;
        float f16 = (fAngle - 3.1415927f) + fAcos + f14;
        getVector(this.c1, f12, f, this.p1);
        getVector(this.c1, f13, f, this.p2);
        getVector(this.c2, f15, f2, this.p3);
        getVector(this.c2, f16, f2, this.p4);
        float fMin = Math.min(1.0f, (fDist * 2.0f) / f7) * Math.min(20.0f * f3, dist(this.p1, this.p3) / f7);
        float f17 = f * fMin;
        float f18 = f2 * fMin;
        getVector(this.p1, f12 - 1.5707964f, f17, this.h1);
        getVector(this.p2, f13 + 1.5707964f, f17, this.h2);
        float f19 = f15 + 1.5707964f;
        getVector(this.p3, f19, f18, this.h3);
        float f20 = f16 - 1.5707964f;
        getVector(this.p4, f20, f18, this.h4);
        this.path.rewind();
        Path path = this.path;
        PointF pointF = this.p1;
        path.moveTo(pointF.x, pointF.y);
        Path path2 = this.path;
        PointF pointF2 = this.h1;
        float f21 = pointF2.x;
        float f22 = pointF2.y;
        PointF pointF3 = this.h3;
        float f23 = pointF3.x;
        float f24 = pointF3.y;
        PointF pointF4 = this.p3;
        path2.cubicTo(f21, f22, f23, f24, pointF4.x, pointF4.y);
        float f25 = f18 * 0.55f;
        getVector(this.p3, f19, f25, this.a1);
        getVector(this.p4, f20, f25, this.a2);
        Path path3 = this.path;
        PointF pointF5 = this.a1;
        float f26 = pointF5.x;
        float f27 = pointF5.y;
        PointF pointF6 = this.a2;
        float f28 = pointF6.x;
        float f29 = pointF6.y;
        PointF pointF7 = this.p4;
        path3.cubicTo(f26, f27, f28, f29, pointF7.x, pointF7.y);
        Path path4 = this.path;
        PointF pointF8 = this.h4;
        float f30 = pointF8.x;
        float f31 = pointF8.y;
        PointF pointF9 = this.h2;
        float f32 = pointF9.x;
        float f33 = pointF9.y;
        PointF pointF10 = this.p2;
        path4.cubicTo(f30, f31, f32, f33, pointF10.x, pointF10.y);
        this.path.close();
        return true;
    }

    private float dist(PointF pointF, PointF pointF2) {
        return MathUtils.distance(pointF.x, pointF.y, pointF2.x, pointF2.y);
    }

    public void doBlur() {
        BlurBitmapHolder blurBitmapHolder = this.originalFrame;
        BlurBitmapHolder blurBitmapHolder2 = this.nextFrame;
        BlurBitmapHolder blurBitmapHolder3 = this.currentFrame;
        if (blurBitmapHolder != null && !blurBitmapHolder.destroying && !blurBitmapHolder.isBusy && blurBitmapHolder.hasContent) {
            if (this.prevOrgKey == blurBitmapHolder.key && this.currentFrameBlurRadius == this.blurRadius) {
                this.isBluring = false;
                return;
            }
            synchronized (this.drawLock) {
                try {
                    blurBitmapHolder.lock();
                    this.prevOrgKey = blurBitmapHolder.key;
                    this.currentFrameBlurRadius = this.blurRadius;
                    if (blurBitmapHolder2 == null || !blurBitmapHolder2.canUse(blurBitmapHolder)) {
                        if (blurBitmapHolder2 != null) {
                            blurBitmapHolder2.recycle();
                        }
                        blurBitmapHolder2 = new BlurBitmapHolder(blurBitmapHolder);
                        this.nextFrame = blurBitmapHolder2;
                    } else {
                        blurBitmapHolder2.clear();
                    }
                    blurBitmapHolder2.canvas.drawBitmap(blurBitmapHolder.bitmap, 0.0f, 0.0f, (Paint) null);
                    blurBitmapHolder.unlock();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Bitmap bitmap = blurBitmapHolder2.bitmap;
            Utilities.stackBlurBitmap(bitmap, this.currentFrameBlurRadius);
            if (!this.isBluring) {
                return;
            }
            synchronized (this.lock) {
                if (blurBitmapHolder3 != null) {
                    try {
                        if (blurBitmapHolder3.canUse(blurBitmapHolder2)) {
                            blurBitmapHolder3.clear();
                        } else {
                            if (blurBitmapHolder3 != null) {
                                blurBitmapHolder3.recycle();
                            }
                            blurBitmapHolder3 = new BlurBitmapHolder(blurBitmapHolder2);
                            this.currentFrame = blurBitmapHolder3;
                        }
                        blurBitmapHolder3.canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        blurBitmapHolder3.ready();
                        applyShader();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (blurBitmapHolder3 != null) {
                        blurBitmapHolder3.recycle();
                    }
                    blurBitmapHolder3 = new BlurBitmapHolder(blurBitmapHolder2);
                    this.currentFrame = blurBitmapHolder3;
                    blurBitmapHolder3.canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    blurBitmapHolder3.ready();
                    applyShader();
                }
            }
            if (this.isBluring) {
                postInvalidateOnAnimation();
            }
        }
        scheduleNextBlurTask();
    }

    private void drawWithRenderNode() {
        if (this.needsNewFrame || !this.blurNode.hasDisplayList()) {
            this.needsNewFrame = false;
            float fDp = AndroidUtilities.dp(1.0f);
            RenderNode renderNode = this.blurNode;
            float f = this.renderNodeSize;
            renderNode.setPosition(0, 0, (int) (f / fDp), (int) ((f + this.renderNodeTop) / fDp));
            RecordingCanvas recordingCanvasBeginRecording = this.blurNode.beginRecording();
            float f2 = 1.0f / fDp;
            recordingCanvasBeginRecording.scale(f2, f2);
            ProfileActivity.AvatarImageView avatarImageView = this.imageView;
            AnimatedEmojiDrawable animatedEmojiDrawable = avatarImageView.animatedEmojiDrawable;
            boolean z = animatedEmojiDrawable != null;
            ImageReceiver imageReceiver = z ? animatedEmojiDrawable.getImageReceiver() : avatarImageView.imageReceiver;
            this.radius = this.imageView.getRoundRadiusForExpand();
            this.imageView.setRoundRadiusForExpand(0);
            float imageWidth = imageReceiver.getImageWidth();
            float imageHeight = imageReceiver.getImageHeight();
            float imageX = imageReceiver.getImageX();
            float imageY = imageReceiver.getImageY();
            float f3 = this.renderNodeSize;
            float f4 = (imageX * f3) / imageWidth;
            this.inset = f4;
            float f5 = f3 - (f4 * 2.0f);
            float fDp2 = AndroidUtilities.dp(100.0f);
            imageReceiver.setImageCoords(0.0f, 0.0f, fDp2, fDp2);
            int i = this.bgColor;
            if (i != -16777216) {
                recordingCanvasBeginRecording.drawColor(i);
            }
            recordingCanvasBeginRecording.save();
            recordingCanvasBeginRecording.translate(0.0f, this.renderNodeTop);
            float f6 = f5 / fDp2;
            recordingCanvasBeginRecording.scale(f6, f6);
            imageReceiver.draw(recordingCanvasBeginRecording);
            recordingCanvasBeginRecording.restore();
            if (!z) {
                recordingCanvasBeginRecording.scale(1.0f, -1.5f);
                recordingCanvasBeginRecording.translate(0.0f, (-this.renderNodeTop) / 1.5f);
                imageReceiver.draw(recordingCanvasBeginRecording);
            }
            imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
            this.imageView.setRoundRadiusForExpand(this.radius);
            this.blurNode.endRecording();
        }
    }

    private void getVector(PointF pointF, float f, float f2, PointF pointF2) {
        double d = f2;
        double d2 = f;
        pointF2.x = (float) AndroidUtilities$$ExternalSyntheticOutline1.m(d2, d, pointF.x);
        pointF2.y = (float) ((Math.sin(d2) * d) + ((double) pointF.y));
    }

    private void initRenderNode() {
        if (this.blurNode == null) {
            this.blurNode = TranslateAlert2$$ExternalSyntheticApiModelOutline0.m$1();
        }
        int i = this.installedRadius;
        int i2 = this.blurRadius;
        if (i != i2) {
            this.installedRadius = i2;
            float fMax = Math.max((i2 / 2.0f) - 1.0f, 0.5f);
            try {
                RenderNode renderNode = this.blurNode;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(fMax, fMax, Shader.TileMode.CLAMP));
            } catch (Exception unused) {
            }
        }
    }

    private static float radians(float f) {
        return (f / 180.0f) * 3.1415927f;
    }

    private void scheduleNextBlurTask() {
        BlurBitmapHolder blurBitmapHolder;
        if (!this.isBluring || (blurBitmapHolder = this.originalFrame) == null || !blurBitmapHolder.hasContent || (!blurBitmapHolder.isBusy && this.prevOrgKey == blurBitmapHolder.key && this.currentFrameBlurRadius == this.blurRadius)) {
            this.isBluring = false;
        } else {
            profileBlurQueue.postRunnable(this.blurTask);
        }
    }

    private static float sin(float f) {
        return (float) Math.sin(f);
    }

    public void updateContent() {
        this.needsNewFrame = true;
        postInvalidateOnAnimation();
    }

    public void captureBackward() {
        float scaleX = this.view.getScaleX() * this.view.getWidth() * 0.5f;
        if (scaleX > AndroidUtilities.dp(32.0f)) {
            setVisibility(8);
            return;
        }
        this.isBackward = true;
        int i = this.imageView.roundRadiusCollapse;
        if (i <= 0) {
            i = this.radius;
        }
        this.backwardFromRadius = i;
        this.backwardFromAlpha = this.alpha / 255.0f;
        this.backwardFromY = Math.min(-AndroidUtilities.dp(8.0f), this.view.getY());
        this.backwardFromR = Math.min(AndroidUtilities.dp(16.0f), scaleX);
    }

    public void destroy() {
        this.isBluring = false;
        BlurBitmapHolder blurBitmapHolder = this.originalFrame;
        if (blurBitmapHolder != null) {
            blurBitmapHolder.recycle();
            this.originalFrame = null;
        }
        BlurBitmapHolder blurBitmapHolder2 = this.nextFrame;
        if (blurBitmapHolder2 != null) {
            blurBitmapHolder2.recycle();
            this.nextFrame = null;
        }
        BlurBitmapHolder blurBitmapHolder3 = this.currentFrame;
        if (blurBitmapHolder3 != null) {
            blurBitmapHolder3.recycle();
            this.currentFrame = null;
        }
        RenderNode renderNode = this.blurNode;
        if (renderNode != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                renderNode.discardDisplayList();
            }
            this.blurNode = null;
        }
        this.alpha = 0;
        profileBlurQueue.cancelRunnable(this.blurTask);
        this.imageView.listenInvalidate(null);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isBluring = false;
        this.alpha = 0;
        profileBlurQueue.cancelRunnable(this.blurTask);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float scaleX;
        float y;
        float f;
        float f2;
        float f3;
        float f4;
        float fDp;
        int i;
        float f5;
        BlurBitmapHolder blurBitmapHolder;
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float width2 = getWidth();
        if (this.isBackward) {
            scaleX = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), this.backwardFromR, this.backwardProgress);
            y = AndroidUtilities.lerp(-AndroidUtilities.dp(24.0f), this.backwardFromY, this.backwardProgress);
            float fLerp = AndroidUtilities.lerp(1.0f, this.backwardFromAlpha, this.backwardProgress);
            this.imageView.setRoundRadiusCollapse(AndroidUtilities.lerp(this.radius, this.backwardFromRadius, Utilities.clamp01((this.backwardProgress - 0.5f) / 0.5f)));
            this.imageView.setAlpha(fLerp);
            this.view.setAlpha(fLerp);
        } else {
            scaleX = this.view.getScaleX() * this.view.getWidth() * 0.5f;
            y = this.view.getY();
        }
        float f6 = y;
        boolean z = scaleX <= ((float) AndroidUtilities.dp(40.0f));
        boolean z2 = scaleX <= ((float) AndroidUtilities.dp(32.0f));
        if (!z) {
            if (this.isBackward) {
                return;
            }
            this.imageView.setAlpha(1.0f);
            this.storyView.setAlpha(1.0f);
            this.imageView.isMetaballWorking = false;
            return;
        }
        float fMax = Math.max(0.0f, scaleX - AndroidUtilities.dp(18.0f)) / AndroidUtilities.dp(14.0f);
        float fLerp2 = AndroidUtilities.lerp(0.0f, 1.0f, fMax);
        if (z2) {
            f = 24.0f;
            if (this.isBackward) {
                f2 = 32.0f;
                f3 = 12.0f;
            } else {
                f2 = 32.0f;
                f3 = 12.0f;
                this.storyView.setAlpha(Math.max(0.0f, scaleX - AndroidUtilities.dp(24.0f)) / AndroidUtilities.dp(8.0f));
                this.imageView.setAlpha(fLerp2);
            }
            this.alpha = (int) (255.0f * fLerp2);
            this.blurRadius = ((int) ((1.0f - fMax) * 20.0f)) + 2;
        } else {
            f = 24.0f;
            f2 = 32.0f;
            f3 = 12.0f;
            this.alpha = 255;
            this.blurRadius = 1;
        }
        if (!this.isBackward) {
            if (this.usingRenderNode && Build.VERSION.SDK_INT >= 31) {
                if (canvas.isHardwareAccelerated()) {
                    initRenderNode();
                    drawWithRenderNode();
                } else {
                    this.blurNode = null;
                    this.usingRenderNode = false;
                }
            }
            if (!this.usingRenderNode) {
                boolean z3 = this.needsNewFrame || this.bitmapShader == null;
                if (this.alpha > 0 && z3) {
                    captureNextFrame();
                    if (!this.isBluring && this.originalFrame != null) {
                        this.isBluring = true;
                        DispatchQueue dispatchQueue = profileBlurQueue;
                        dispatchQueue.cancelRunnable(this.blurTask);
                        dispatchQueue.postRunnable(this.blurTask);
                    }
                }
                if (!this.isBluring && (blurBitmapHolder = this.originalFrame) != null && this.alpha > 0 && (this.currentFrameBlurRadius != this.blurRadius || this.prevOrgKey != blurBitmapHolder.key)) {
                    this.isBluring = true;
                    DispatchQueue dispatchQueue2 = profileBlurQueue;
                    dispatchQueue2.cancelRunnable(this.blurTask);
                    dispatchQueue2.postRunnable(this.blurTask);
                }
            }
        } else if (this.isBluring) {
            this.isBluring = false;
            profileBlurQueue.cancelRunnable(this.blurTask);
        }
        RenderNode renderNode = this.blurNode;
        boolean zHasDisplayList = renderNode != null;
        if (zHasDisplayList && Build.VERSION.SDK_INT >= 29) {
            zHasDisplayList = renderNode.hasDisplayList();
        }
        boolean z4 = zHasDisplayList || this.bitmapShader != null;
        float fClamp = Utilities.clamp((1.0f - (Utilities.clamp(f6 / AndroidUtilities.dp(f), 1.0f, -1.0f) / 1.3f)) / 2.0f, 0.8f, 0.0f);
        float fDp2 = z2 ? 1.0f : 1.0f - ((scaleX - AndroidUtilities.dp(f2)) / AndroidUtilities.dp(8.0f));
        float f7 = scaleX * 2.0f;
        float f8 = f6 + f7;
        float fMin = Math.min(f8 / AndroidUtilities.dp(6.0f), 1.0f);
        if (!z2) {
            fClamp = Math.min(AndroidUtilities.lerp(0.0f, 0.2f, fDp2), fClamp);
        }
        PointF pointF = this.c1;
        this.c2.x = width;
        pointF.x = width;
        float f9 = -width2;
        pointF.y = AndroidUtilities.dp(1.0f) + f9;
        this.c2.y = f6 + scaleX;
        if (this.isBackward) {
            f4 = 1.0f;
            fDp = scaleX / AndroidUtilities.dp(21.0f);
            i = this.radius;
        } else {
            ProfileActivity.AvatarImageView avatarImageView = this.imageView;
            if (avatarImageView.hasStories) {
                f4 = 1.0f;
                fDp = scaleX / AndroidUtilities.dp(21.0f);
                i = this.radius;
            } else {
                f4 = 1.0f;
                avatarImageView.setRoundRadiusCollapse(AndroidUtilities.lerp(AndroidUtilities.dp(22.0f), this.radius, Utilities.clamp01((scaleX - AndroidUtilities.dp(34.0f)) / AndroidUtilities.dp(6.0f))));
                fDp = scaleX / AndroidUtilities.dp(22.0f);
                i = this.imageView.roundRadiusCollapse;
            }
        }
        float f10 = fDp * i;
        if (createMetaballPath(width2, scaleX, fClamp)) {
            float f11 = z2 ? 1.0f : fDp2 * fDp2;
            if ((z4 || this.isBackward) && z2) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(width - scaleX, f6, width + scaleX, f8);
                this.path.addRoundRect(rectF, f10, f10, Path.Direction.CCW);
            }
            canvas.save();
            if (!z2) {
                this.clipPath.rewind();
                Path path = this.clipPath;
                float fDp3 = AndroidUtilities.dp(10.0f) * f11;
                Path.Direction direction = Path.Direction.CW;
                path.addRect(0.0f, 0.0f, width2, fDp3, direction);
                this.clipPath.addCircle(this.c1.x, 0.0f, AndroidUtilities.dp(20.0f) * f11, direction);
                float fDp4 = (AndroidUtilities.dp(f3) * f11) + scaleX;
                Path path2 = this.clipPath;
                PointF pointF2 = this.c2;
                path2.addCircle(pointF2.x, pointF2.y, fDp4, direction);
                Path path3 = this.clipPath;
                PointF pointF3 = this.c2;
                path3.addCircle(pointF3.x, (AndroidUtilities.dp(4.0f) * f11) + (pointF3.y - fDp4), AndroidUtilities.dp(8.0f) * f11, direction);
                canvas.clipPath(this.clipPath);
            }
            canvas.drawPath(this.path, this.connectorPaint);
            canvas.drawCircle(width, (Math.max(1.0f, fDp2 * 2.0f) * AndroidUtilities.dp(f4) * fMin) + f9, width2, this.circlePaint);
            canvas.restore();
            boolean z5 = this.usingRenderNode;
            float f12 = z5 ? f7 / this.renderNodeSize : 1.0f;
            float f13 = z5 ? this.inset * f12 : 0.0f;
            if (this.alpha <= 0 || !z4) {
                return;
            }
            canvas.save();
            this.clipPath.rewind();
            if (z2) {
                float fLerp3 = this.usingRenderNode ? AndroidUtilities.lerp(f13, 0.0f, fLerp2) : 0.0f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((width - scaleX) + fLerp3, f6 + fLerp3, (width + scaleX) - fLerp3, f8 - fLerp3);
                Path path4 = this.clipPath;
                Path.Direction direction2 = Path.Direction.CW;
                path4.addRoundRect(rectF2, f10, f10, direction2);
                f5 = f13;
                this.clipPath.addRect(0.0f, 0.0f, width2, f6 + AndroidUtilities.dp(16.0f), direction2);
            } else {
                f5 = f13;
                float fDp5 = (AndroidUtilities.dp(f3) * f11) + scaleX;
                Path path5 = this.clipPath;
                PointF pointF4 = this.c2;
                float f14 = pointF4.x;
                float f15 = pointF4.y;
                Path.Direction direction3 = Path.Direction.CW;
                path5.addCircle(f14, f15, fDp5, direction3);
                Path path6 = this.clipPath;
                PointF pointF5 = this.c2;
                path6.addCircle(pointF5.x, (AndroidUtilities.dp(4.0f) * f11) + (pointF5.y - fDp5), AndroidUtilities.dp(8.0f) * f11, direction3);
            }
            canvas.clipPath(this.clipPath);
            if (this.blurNode != null) {
                canvas.save();
                canvas.clipPath(this.path);
                float fDp6 = AndroidUtilities.dp(1.0f) * f12;
                canvas.translate((width - scaleX) + f5, (f5 + f6) - (this.renderNodeTop * f12));
                canvas.scale(fDp6, fDp6);
                if (Build.VERSION.SDK_INT >= 29) {
                    this.blurNode.setAlpha(fLerp2);
                    canvas.drawRenderNode(this.blurNode);
                }
                canvas.restore();
            } else {
                synchronized (this.lock) {
                    this.matrix.setScale(f7 / this.currentFrame.bitmap.getWidth(), f7 / this.currentFrame.bitmap.getHeight());
                    this.matrix.postTranslate(width - scaleX, f6);
                    this.bitmapShader.setLocalMatrix(this.matrix);
                    this.shaderPaint.setAlpha(this.alpha);
                    canvas.drawPath(this.path, this.shaderPaint);
                }
            }
            this.matrix.setTranslate(0.0f, Math.max(0.0f, (f6 - AndroidUtilities.dp(14.0f)) - ((1.0f - fDp2) * AndroidUtilities.dp(15.0f))));
            this.gradientShader.setLocalMatrix(this.matrix);
            canvas.drawPath(this.path, this.gradientPaint);
            canvas.restore();
        }
    }

    public void setFrameBackgroundColor(int i) {
        this.bgColor = i;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            this.isBluring = false;
            this.alpha = 0;
            profileBlurQueue.cancelRunnable(this.blurTask);
            this.imageView.isMetaballWorking = false;
        }
    }

    public boolean shouldStick() {
        return this.view.getScaleX() * ((float) this.view.getWidth()) <= ((float) AndroidUtilities.dp(64.0f));
    }

    public void updateBackward(float f) {
        this.backwardProgress = f;
        invalidate();
    }

    private static float cos(double d) {
        return (float) Math.cos((float) d);
    }

    private static float sin(double d) {
        return (float) Math.sin((float) d);
    }

    public static class BlurBitmapHolder {
        Bitmap bitmap;
        Canvas canvas;
        boolean destroyed;
        boolean destroying;
        boolean hasContent;
        boolean isBusy;
        int key = 0;

        public BlurBitmapHolder(BlurBitmapHolder blurBitmapHolder) {
            this.bitmap = Bitmap.createBitmap(blurBitmapHolder.bitmap.getWidth(), blurBitmapHolder.bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            this.canvas = new Canvas(this.bitmap);
        }

        public boolean canUse(int i, int i2) {
            return !this.destroyed && this.bitmap.getWidth() == i && this.bitmap.getHeight() == i2;
        }

        public void clear() {
            if (this.destroyed) {
                return;
            }
            this.hasContent = false;
            this.bitmap.eraseColor(0);
        }

        public void lock() {
            this.isBusy = true;
        }

        public void ready() {
            this.hasContent = true;
            this.key++;
        }

        public void recycle() {
            this.destroying = true;
            if (this.isBusy) {
                return;
            }
            this.destroyed = true;
            this.bitmap.recycle();
        }

        public void unlock() {
            this.isBusy = false;
            if (this.destroyed || !this.destroying) {
                return;
            }
            this.destroyed = true;
            this.bitmap.recycle();
        }

        public boolean canUse(BlurBitmapHolder blurBitmapHolder) {
            return !this.destroyed && this.bitmap.getWidth() == blurBitmapHolder.bitmap.getWidth() && this.bitmap.getHeight() == blurBitmapHolder.bitmap.getHeight();
        }

        public BlurBitmapHolder(int i, int i2) {
            this.bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.canvas = new Canvas(this.bitmap);
        }
    }
}
