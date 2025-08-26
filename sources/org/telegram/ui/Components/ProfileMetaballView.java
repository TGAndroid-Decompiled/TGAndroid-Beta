package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ProfileActivity;

public class ProfileMetaballView extends View {
    public static final DispatchQueue profileBlurQueue = new DispatchQueue("profileBlurQueue");
    private final Point a1;
    private final Point a2;
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
    private final Point c1;
    private final Point c2;
    private final Paint circlePaint;
    private final Path clipPath;
    private final Paint connectorPaint;
    private BlurBitmapHolder currentFrame;
    private int currentFrameBlurRadius;
    private final Object drawLock;
    private final Paint gradientPaint;
    private final LinearGradient gradientShader;
    private final Point h1;
    private final Point h2;
    private final Point h3;
    private final Point h4;
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
    private final Point p1;
    private final Point p2;
    private final Point p3;
    private final Point p4;
    private final Point p5;
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
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
        this.p4 = new Point();
        this.p5 = new Point();
        this.h1 = new Point();
        this.h2 = new Point();
        this.h3 = new Point();
        this.h4 = new Point();
        this.c1 = new Point();
        this.c2 = new Point();
        this.a1 = new Point();
        this.a2 = new Point();
        this.isBluring = false;
        this.bgColor = -16777216;
        this.prevOrgKey = -1;
        this.blurRadius = 4;
        this.currentFrameBlurRadius = -1;
        this.blurTask = new Runnable() {
            @Override
            public final void run() {
                ProfileMetaballView.this.doBlur();
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
        avatarImageView.listenInvalidate(new Runnable() {
            @Override
            public final void run() {
                ProfileMetaballView.this.updateContent();
            }
        });
    }

    public void setFrameBackgroundColor(int i) {
        this.bgColor = i;
    }

    public void updateContent() {
        this.needsNewFrame = true;
        postInvalidateOnAnimation();
    }

    public void doBlur() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ProfileMetaballView.doBlur():void");
    }

    private void scheduleNextBlurTask() {
        BlurBitmapHolder blurBitmapHolder;
        if (this.isBluring && (blurBitmapHolder = this.originalFrame) != null && blurBitmapHolder.hasContent && (blurBitmapHolder.isBusy || this.prevOrgKey != blurBitmapHolder.key || this.currentFrameBlurRadius != this.blurRadius)) {
            profileBlurQueue.postRunnable(this.blurTask);
        } else {
            this.isBluring = false;
        }
    }

    private void captureNextFrame() {
        int dp = AndroidUtilities.dp(36.0f);
        float f = dp;
        int height = (int) ((this.imageView.getHeight() * f) / this.imageView.getWidth());
        if (height < dp) {
            return;
        }
        BlurBitmapHolder blurBitmapHolder = this.originalFrame;
        if (blurBitmapHolder == null || !blurBitmapHolder.canUse(dp, height)) {
            BlurBitmapHolder blurBitmapHolder2 = this.originalFrame;
            if (blurBitmapHolder2 != null) {
                blurBitmapHolder2.recycle();
            }
            this.originalFrame = new BlurBitmapHolder(dp, height);
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

    private void applyShader() {
        Bitmap bitmap = this.currentFrame.bitmap;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.bitmapShader = bitmapShader;
        this.shaderPaint.setShader(bitmapShader);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isBluring = false;
        this.alpha = 0;
        profileBlurQueue.cancelRunnable(this.blurTask);
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

    @Override
    protected void onDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ProfileMetaballView.onDraw(android.graphics.Canvas):void");
    }

    private void initRenderNode() {
        RenderEffect createBlurEffect;
        if (this.blurNode == null) {
            this.blurNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("profileMetaballBlurNode");
        }
        int i = this.installedRadius;
        int i2 = this.blurRadius;
        if (i != i2) {
            this.installedRadius = i2;
            float max = Math.max((i2 / 2.0f) - 1.0f, 0.5f);
            try {
                RenderNode renderNode = this.blurNode;
                createBlurEffect = RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP);
                renderNode.setRenderEffect(createBlurEffect);
            } catch (Exception unused) {
            }
        }
    }

    private void drawWithRenderNode() {
        RecordingCanvas beginRecording;
        ImageReceiver imageReceiver;
        boolean hasDisplayList;
        if (!this.needsNewFrame) {
            hasDisplayList = this.blurNode.hasDisplayList();
            if (hasDisplayList) {
                return;
            }
        }
        this.needsNewFrame = false;
        float dp = AndroidUtilities.dp(1.0f);
        RenderNode renderNode = this.blurNode;
        float f = this.renderNodeSize;
        renderNode.setPosition(0, 0, (int) (f / dp), (int) ((f + this.renderNodeTop) / dp));
        beginRecording = this.blurNode.beginRecording();
        float f2 = 1.0f / dp;
        beginRecording.scale(f2, f2);
        ProfileActivity.AvatarImageView avatarImageView = this.imageView;
        AnimatedEmojiDrawable animatedEmojiDrawable = avatarImageView.animatedEmojiDrawable;
        boolean z = animatedEmojiDrawable != null;
        if (z) {
            imageReceiver = animatedEmojiDrawable.getImageReceiver();
        } else {
            imageReceiver = avatarImageView.imageReceiver;
        }
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
        imageReceiver.setImageCoords(0.0f, 0.0f, f5, f5);
        int i = this.bgColor;
        if (i != -16777216) {
            beginRecording.drawColor(i);
        }
        beginRecording.save();
        beginRecording.translate(0.0f, this.renderNodeTop);
        imageReceiver.draw(beginRecording);
        beginRecording.restore();
        if (!z) {
            beginRecording.scale(1.0f, -1.5f);
            beginRecording.translate(0.0f, (-this.renderNodeTop) / 1.5f);
            imageReceiver.draw(beginRecording);
        }
        imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
        this.imageView.setRoundRadiusForExpand(this.radius);
        this.blurNode.endRecording();
    }

    public boolean shouldStick() {
        return ((float) this.view.getWidth()) * this.view.getScaleX() <= ((float) AndroidUtilities.dp(64.0f));
    }

    public void captureBackward() {
        float width = this.view.getWidth() * this.view.getScaleX() * 0.5f;
        if (width > AndroidUtilities.dp(32.0f)) {
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
        this.backwardFromR = Math.min(AndroidUtilities.dp(16.0f), width);
    }

    public void updateBackward(float f) {
        this.backwardProgress = f;
        invalidate();
    }

    private boolean createMetaballPath(float f, float f2, float f3) {
        float f4;
        float dist = dist(this.c1, this.c2);
        float f5 = (2.25f * f2) + f;
        float f6 = 0.0f;
        if (f == 0.0f || f2 == 0.0f || dist > f5) {
            return false;
        }
        if (dist <= Math.abs(f - f2)) {
            return false;
        }
        float f7 = f + f2;
        if (dist < f7) {
            float f8 = f * f;
            float f9 = dist * dist;
            float f10 = f2 * f2;
            float acos = (float) Math.acos(((f8 + f9) - f10) / ((f * 2.0f) * dist));
            f4 = (float) Math.acos(((f10 + f9) - f8) / ((f2 * 2.0f) * dist));
            f6 = acos;
        } else {
            f4 = 0.0f;
        }
        float angle = angle(this.c2, this.c1);
        float acos2 = (float) Math.acos(r4 / dist);
        float f11 = (acos2 - f6) * f3;
        float f12 = angle + f6 + f11;
        float f13 = (angle - f6) - f11;
        float f14 = ((3.1415927f - f4) - acos2) * f3;
        float f15 = ((angle + 3.1415927f) - f4) - f14;
        float f16 = (angle - 3.1415927f) + f4 + f14;
        getVector(this.c1, f12, f, this.p1);
        getVector(this.c1, f13, f, this.p2);
        getVector(this.c2, f15, f2, this.p3);
        getVector(this.c2, f16, f2, this.p4);
        float min = Math.min(20.0f * f3, dist(this.p1, this.p3) / f7) * Math.min(1.0f, (dist * 2.0f) / f7);
        float f17 = f * min;
        float f18 = f2 * min;
        getVector(this.p1, f12 - 1.5707964f, f17, this.h1);
        getVector(this.p2, f13 + 1.5707964f, f17, this.h2);
        float f19 = f15 + 1.5707964f;
        getVector(this.p3, f19, f18, this.h3);
        float f20 = f16 - 1.5707964f;
        getVector(this.p4, f20, f18, this.h4);
        this.path.rewind();
        Path path = this.path;
        Point point = this.p1;
        path.moveTo(point.x, point.y);
        Path path2 = this.path;
        Point point2 = this.h1;
        float f21 = point2.x;
        float f22 = point2.y;
        Point point3 = this.h3;
        float f23 = point3.x;
        float f24 = point3.y;
        Point point4 = this.p3;
        path2.cubicTo(f21, f22, f23, f24, point4.x, point4.y);
        float f25 = f18 * 0.55f;
        getVector(this.p3, f19, f25, this.a1);
        getVector(this.p4, f20, f25, this.a2);
        Path path3 = this.path;
        Point point5 = this.a1;
        float f26 = point5.x;
        float f27 = point5.y;
        Point point6 = this.a2;
        float f28 = point6.x;
        float f29 = point6.y;
        Point point7 = this.p4;
        path3.cubicTo(f26, f27, f28, f29, point7.x, point7.y);
        Path path4 = this.path;
        Point point8 = this.h4;
        float f30 = point8.x;
        float f31 = point8.y;
        Point point9 = this.h2;
        float f32 = point9.x;
        float f33 = point9.y;
        Point point10 = this.p2;
        path4.cubicTo(f30, f31, f32, f33, point10.x, point10.y);
        this.path.close();
        return true;
    }

    private float dist(Point point, Point point2) {
        return MathUtils.distance(point.x, point.y, point2.x, point2.y);
    }

    private float angle(Point point, Point point2) {
        return (float) Math.atan2(point.y - point2.y, point.x - point2.x);
    }

    private void getVector(Point point, float f, float f2, Point point2) {
        double d = f2;
        double d2 = f;
        point2.x = (float) (point.x + (Math.cos(d2) * d));
        point2.y = (float) (point.y + (d * Math.sin(d2)));
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

        public BlurBitmapHolder(int i, int i2) {
            this.bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.canvas = new Canvas(this.bitmap);
        }

        public void clear() {
            if (this.destroyed) {
                return;
            }
            this.hasContent = false;
            this.bitmap.eraseColor(0);
        }

        public void ready() {
            this.hasContent = true;
            this.key++;
        }

        public boolean canUse(int i, int i2) {
            return !this.destroyed && this.bitmap.getWidth() == i && this.bitmap.getHeight() == i2;
        }

        public boolean canUse(BlurBitmapHolder blurBitmapHolder) {
            return !this.destroyed && this.bitmap.getWidth() == blurBitmapHolder.bitmap.getWidth() && this.bitmap.getHeight() == blurBitmapHolder.bitmap.getHeight();
        }

        public void recycle() {
            this.destroying = true;
            if (this.isBusy) {
                return;
            }
            this.destroyed = true;
            this.bitmap.recycle();
        }

        public void lock() {
            this.isBusy = true;
        }

        public void unlock() {
            this.isBusy = false;
            if (this.destroyed || !this.destroying) {
                return;
            }
            this.destroyed = true;
            this.bitmap.recycle();
        }
    }
}
