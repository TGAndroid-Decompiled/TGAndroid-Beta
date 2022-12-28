package org.telegram.p009ui.Components.Crop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Keep;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.BubbleActivity;

public class CropAreaView extends ViewGroup {
    private Control activeControl;
    private RectF actualRect;
    private Animator animator;
    private Paint bitmapPaint;
    private RectF bottomEdge;
    private RectF bottomLeftCorner;
    private float bottomPadding;
    private RectF bottomRightCorner;
    private Bitmap circleBitmap;
    private Paint dimPaint;
    private boolean dimVisibile;
    private Paint eraserPaint;
    private float frameAlpha;
    private Paint framePaint;
    private boolean frameVisible;
    private boolean freeform;
    private Animator gridAnimator;
    private float gridProgress;
    private GridType gridType;
    private Paint handlePaint;
    private boolean inBubbleMode;
    private AccelerateDecelerateInterpolator interpolator;
    private boolean isDragging;
    private long lastUpdateTime;
    public float left;
    private RectF leftEdge;
    private Paint linePaint;
    private AreaViewListener listener;
    private float lockAspectRatio;
    private float minWidth;
    private GridType previousGridType;
    private int previousX;
    private int previousY;
    private RectF rightEdge;
    public float rotate;
    public float scale;
    private Paint shadowPaint;
    private float sidePadding;
    public int size;
    private String subtitle;
    private StaticLayout subtitleLayout;
    TextPaint subtitlePaint;
    private RectF targetRect;
    private RectF tempRect;
    public float top;
    private RectF topEdge;
    private RectF topLeftCorner;
    private RectF topRightCorner;
    public float f1049tx;
    public float f1050ty;

    interface AreaViewListener {
        void onAreaChange();

        void onAreaChangeBegan();

        void onAreaChangeEnded();
    }

    private enum Control {
        NONE,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        LEFT,
        BOTTOM,
        RIGHT
    }

    public enum GridType {
        NONE,
        MINOR,
        MAJOR
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public CropAreaView(Context context) {
        super(context);
        this.topLeftCorner = new RectF();
        this.topRightCorner = new RectF();
        this.bottomLeftCorner = new RectF();
        this.bottomRightCorner = new RectF();
        this.topEdge = new RectF();
        this.leftEdge = new RectF();
        this.bottomEdge = new RectF();
        this.rightEdge = new RectF();
        this.actualRect = new RectF();
        this.tempRect = new RectF();
        this.frameAlpha = 1.0f;
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.freeform = true;
        this.targetRect = new RectF();
        this.rotate = 0.0f;
        this.scale = 1.0f;
        this.f1049tx = 0.0f;
        this.f1050ty = 0.0f;
        this.inBubbleMode = context instanceof BubbleActivity;
        this.frameVisible = true;
        this.dimVisibile = true;
        this.sidePadding = AndroidUtilities.m36dp(16.0f);
        this.minWidth = AndroidUtilities.m36dp(32.0f);
        this.gridType = GridType.NONE;
        Paint paint = new Paint();
        this.dimPaint = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        this.shadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.shadowPaint.setColor(436207616);
        this.shadowPaint.setStrokeWidth(AndroidUtilities.m36dp(2.0f));
        Paint paint3 = new Paint();
        this.linePaint = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.linePaint.setColor(-1);
        this.linePaint.setStrokeWidth(AndroidUtilities.m36dp(1.0f));
        Paint paint4 = new Paint();
        this.handlePaint = paint4;
        paint4.setStyle(Paint.Style.FILL);
        this.handlePaint.setColor(-1);
        Paint paint5 = new Paint();
        this.framePaint = paint5;
        paint5.setStyle(Paint.Style.FILL);
        this.framePaint.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        this.eraserPaint = paint6;
        paint6.setColor(0);
        this.eraserPaint.setStyle(Paint.Style.FILL);
        this.eraserPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        this.bitmapPaint = paint7;
        paint7.setColor(-1);
        setWillNotDraw(false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updateSubtitle();
    }

    private void updateSubtitle() {
        if (this.subtitle != null) {
            if (this.subtitlePaint == null) {
                TextPaint textPaint = new TextPaint();
                this.subtitlePaint = textPaint;
                textPaint.setColor(ColorUtils.setAlphaComponent(-1, 120));
                this.subtitlePaint.setTextSize(AndroidUtilities.m36dp(13.0f));
                this.subtitlePaint.setTextAlign(Paint.Align.CENTER);
            }
            this.subtitleLayout = new StaticLayout(this.subtitle, this.subtitlePaint, getMeasuredWidth() - AndroidUtilities.m36dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.subtitleLayout = null;
    }

    public void setIsVideo(boolean z) {
        this.minWidth = AndroidUtilities.m36dp(z ? 64.0f : 32.0f);
    }

    public boolean isDragging() {
        return this.isDragging;
    }

    public void setDimVisibility(boolean z) {
        this.dimVisibile = z;
    }

    public void setFrameVisibility(boolean z, boolean z2) {
        this.frameVisible = z;
        if (z) {
            this.frameAlpha = z2 ? 0.0f : 1.0f;
            this.lastUpdateTime = SystemClock.elapsedRealtime();
            invalidate();
            return;
        }
        this.frameAlpha = 1.0f;
    }

    public void setBottomPadding(float f) {
        this.bottomPadding = f;
    }

    public Interpolator getInterpolator() {
        return this.interpolator;
    }

    public void setListener(AreaViewListener areaViewListener) {
        this.listener = areaViewListener;
    }

    public void setBitmap(int i, int i2, boolean z, boolean z2) {
        this.freeform = z2;
        float f = z ? i2 / i : i / i2;
        if (!z2) {
            this.lockAspectRatio = 1.0f;
            f = 1.0f;
        }
        setActualRect(f);
    }

    public void setFreeform(boolean z) {
        this.freeform = z;
    }

    public void setActualRect(float f) {
        calculateRect(this.actualRect, f);
        updateTouchAreas();
        invalidate();
    }

    public void setActualRect(RectF rectF) {
        this.actualRect.set(rectF);
        updateTouchAreas();
        invalidate();
    }

    public void setRotationScaleTranslation(float f, float f2, float f3, float f4) {
        this.rotate = f;
        this.scale = f2;
        this.f1049tx = f3;
        this.f1050ty = f4;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.freeform) {
            int m36dp = AndroidUtilities.m36dp(2.0f / this.scale);
            int m36dp2 = AndroidUtilities.m36dp(16.0f / this.scale);
            int m36dp3 = AndroidUtilities.m36dp(3.0f / this.scale);
            RectF rectF = this.actualRect;
            float f2 = rectF.left;
            int i7 = ((int) f2) - m36dp;
            float f3 = rectF.top;
            int i8 = ((int) f3) - m36dp;
            int i9 = m36dp * 2;
            int i10 = ((int) (rectF.right - f2)) + i9;
            int i11 = i9 + ((int) (rectF.bottom - f3));
            canvas.save();
            canvas.translate(this.f1049tx, this.f1050ty);
            float f4 = this.scale;
            float f5 = (i10 / 2) + i7;
            float f6 = (i11 / 2) + i8;
            canvas.scale(f4, f4, f5, f6);
            canvas.rotate(this.rotate, f5, f6);
            if (this.dimVisibile) {
                int width = getWidth() * 4;
                this.dimPaint.setAlpha((int) (255.0f - (this.frameAlpha * 127.0f)));
                float f7 = (-getWidth()) * 4;
                float f8 = width;
                i = i8;
                i2 = i7;
                canvas.drawRect(f7, (-getHeight()) * 4, f8, 0.0f, this.dimPaint);
                canvas.drawRect(f7, 0.0f, 0.0f, getHeight(), this.dimPaint);
                canvas.drawRect(getWidth(), 0.0f, f8, getHeight(), this.dimPaint);
                canvas.drawRect(f7, getHeight(), f8, getHeight() * 4, this.dimPaint);
                float f9 = i + m36dp;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f9, this.dimPaint);
                float f10 = (i + i11) - m36dp;
                canvas.drawRect(0.0f, f9, i2 + m36dp, f10, this.dimPaint);
                canvas.drawRect((i2 + i10) - m36dp, f9, getWidth(), f10, this.dimPaint);
                canvas.drawRect(0.0f, f10, getWidth(), getHeight(), this.dimPaint);
            } else {
                i = i8;
                i2 = i7;
            }
            if (!this.frameVisible) {
                return;
            }
            int i12 = m36dp3 - m36dp;
            int i13 = m36dp3 * 2;
            int i14 = i10 - i13;
            int i15 = i11 - i13;
            GridType gridType = this.gridType;
            if (gridType == GridType.NONE && this.gridProgress > 0.0f) {
                gridType = this.previousGridType;
            }
            GridType gridType2 = gridType;
            this.shadowPaint.setAlpha((int) (this.gridProgress * 26.0f * this.frameAlpha));
            this.linePaint.setAlpha((int) (this.gridProgress * 178.0f * this.frameAlpha));
            this.framePaint.setAlpha((int) (this.frameAlpha * 178.0f));
            this.handlePaint.setAlpha((int) (this.frameAlpha * 255.0f));
            float f11 = i2 + i12;
            float f12 = i + i12;
            int i16 = i2 + i10;
            float f13 = i16 - i12;
            canvas.drawRect(f11, f12, f13, i4 + m36dp, this.framePaint);
            int i17 = i11 + i;
            float f14 = i17 - i12;
            canvas.drawRect(f11, f12, i3 + m36dp, f14, this.framePaint);
            canvas.drawRect(f11, i6 - m36dp, f13, f14, this.framePaint);
            canvas.drawRect(i5 - m36dp, f12, f13, f14, this.framePaint);
            int i18 = 0;
            while (true) {
                int i19 = 3;
                if (i18 >= 3) {
                    break;
                }
                if (gridType2 == GridType.MINOR) {
                    int i20 = 1;
                    while (i20 < 4) {
                        if (i18 != 2 || i20 != i19) {
                            int i21 = i2 + m36dp3;
                            int i22 = i14 / 3;
                            float f15 = ((i22 / 3) * i20) + i21 + (i22 * i18);
                            int i23 = i + m36dp3;
                            float f16 = i23;
                            float f17 = i23 + i15;
                            canvas.drawLine(f15, f16, f15, f17, this.shadowPaint);
                            canvas.drawLine(f15, f16, f15, f17, this.linePaint);
                            int i24 = i15 / 3;
                            float f18 = i21;
                            float f19 = i23 + ((i24 / 3) * i20) + (i24 * i18);
                            float f20 = i21 + i14;
                            canvas.drawLine(f18, f19, f20, f19, this.shadowPaint);
                            canvas.drawLine(f18, f19, f20, f19, this.linePaint);
                        }
                        i20++;
                        i19 = 3;
                    }
                } else if (gridType2 == GridType.MAJOR && i18 > 0) {
                    int i25 = i2 + m36dp3;
                    float f21 = ((i14 / 3) * i18) + i25;
                    int i26 = i + m36dp3;
                    float f22 = i26;
                    float f23 = i26 + i15;
                    canvas.drawLine(f21, f22, f21, f23, this.shadowPaint);
                    canvas.drawLine(f21, f22, f21, f23, this.linePaint);
                    float f24 = i25;
                    float f25 = i26 + ((i15 / 3) * i18);
                    float f26 = i25 + i14;
                    canvas.drawLine(f24, f25, f26, f25, this.shadowPaint);
                    canvas.drawLine(f24, f25, f26, f25, this.linePaint);
                }
                i18++;
            }
            float f27 = i2;
            float f28 = i;
            float f29 = i2 + m36dp2;
            float f30 = i + m36dp3;
            canvas.drawRect(f27, f28, f29, f30, this.handlePaint);
            float f31 = i2 + m36dp3;
            float f32 = i + m36dp2;
            canvas.drawRect(f27, f28, f31, f32, this.handlePaint);
            float f33 = i16 - m36dp2;
            float f34 = i16;
            canvas.drawRect(f33, f28, f34, f30, this.handlePaint);
            float f35 = i16 - m36dp3;
            canvas.drawRect(f35, f28, f34, f32, this.handlePaint);
            float f36 = i17 - m36dp3;
            float f37 = i17;
            canvas.drawRect(f27, f36, f29, f37, this.handlePaint);
            float f38 = i17 - m36dp2;
            canvas.drawRect(f27, f38, f31, f37, this.handlePaint);
            canvas.drawRect(f33, f36, f34, f37, this.handlePaint);
            canvas.drawRect(f35, f38, f34, f37, this.handlePaint);
            canvas.restore();
        } else {
            float measuredWidth = getMeasuredWidth() - (this.sidePadding * 2.0f);
            float measuredHeight = ((getMeasuredHeight() - this.bottomPadding) - ((Build.VERSION.SDK_INT < 21 || this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight)) - (this.sidePadding * 2.0f);
            this.size = (int) Math.min(measuredWidth, measuredHeight);
            Bitmap bitmap = this.circleBitmap;
            if (bitmap == null || bitmap.getWidth() != this.size) {
                Bitmap bitmap2 = this.circleBitmap;
                boolean z = bitmap2 != null;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.circleBitmap = null;
                }
                try {
                    int i27 = this.size;
                    this.circleBitmap = Bitmap.createBitmap(i27, i27, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.circleBitmap);
                    int i28 = this.size;
                    canvas2.drawRect(0.0f, 0.0f, i28, i28, this.dimPaint);
                    int i29 = this.size;
                    canvas2.drawCircle(i29 / 2, i29 / 2, i29 / 2, this.eraserPaint);
                    canvas2.setBitmap(null);
                    if (!z) {
                        this.frameAlpha = 0.0f;
                        this.lastUpdateTime = SystemClock.elapsedRealtime();
                    }
                } catch (Throwable unused) {
                }
            }
            if (this.circleBitmap != null) {
                this.bitmapPaint.setAlpha((int) (this.frameAlpha * 255.0f));
                this.dimPaint.setAlpha((int) (this.frameAlpha * 127.0f));
                float f39 = this.sidePadding;
                int i30 = this.size;
                this.left = ((measuredWidth - i30) / 2.0f) + f39;
                float f40 = f39 + ((measuredHeight - i30) / 2.0f) + ((Build.VERSION.SDK_INT < 21 || this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight);
                this.top = f40;
                float f41 = f40 + i30;
                canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.top, this.dimPaint);
                float f42 = (int) f41;
                canvas.drawRect(0.0f, (int) this.top, (int) this.left, f42, this.dimPaint);
                canvas.drawRect((int) (f + i30), (int) this.top, getWidth(), f42, this.dimPaint);
                canvas.drawRect(0.0f, f42, getWidth(), getHeight(), this.dimPaint);
                canvas.drawBitmap(this.circleBitmap, (int) this.left, (int) this.top, this.bitmapPaint);
                if (getMeasuredHeight() > getMeasuredWidth() && this.subtitleLayout != null) {
                    canvas.save();
                    canvas.translate(getMeasuredWidth() / 2.0f, f41 + AndroidUtilities.m36dp(16.0f));
                    this.subtitleLayout.draw(canvas);
                    canvas.restore();
                }
            }
        }
        if (this.frameAlpha < 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = elapsedRealtime;
            float f43 = this.frameAlpha + (((float) j) / 180.0f);
            this.frameAlpha = f43;
            if (f43 > 1.0f) {
                this.frameAlpha = 1.0f;
            }
            invalidate();
        }
    }

    public void updateTouchAreas() {
        int m36dp = AndroidUtilities.m36dp(16.0f);
        RectF rectF = this.topLeftCorner;
        RectF rectF2 = this.actualRect;
        float f = rectF2.left;
        float f2 = m36dp;
        float f3 = rectF2.top;
        rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
        RectF rectF3 = this.topRightCorner;
        RectF rectF4 = this.actualRect;
        float f4 = rectF4.right;
        float f5 = rectF4.top;
        rectF3.set(f4 - f2, f5 - f2, f4 + f2, f5 + f2);
        RectF rectF5 = this.bottomLeftCorner;
        RectF rectF6 = this.actualRect;
        float f6 = rectF6.left;
        float f7 = rectF6.bottom;
        rectF5.set(f6 - f2, f7 - f2, f6 + f2, f7 + f2);
        RectF rectF7 = this.bottomRightCorner;
        RectF rectF8 = this.actualRect;
        float f8 = rectF8.right;
        float f9 = rectF8.bottom;
        rectF7.set(f8 - f2, f9 - f2, f8 + f2, f9 + f2);
        RectF rectF9 = this.topEdge;
        RectF rectF10 = this.actualRect;
        float f10 = rectF10.top;
        rectF9.set(rectF10.left + f2, f10 - f2, rectF10.right - f2, f10 + f2);
        RectF rectF11 = this.leftEdge;
        RectF rectF12 = this.actualRect;
        float f11 = rectF12.left;
        rectF11.set(f11 - f2, rectF12.top + f2, f11 + f2, rectF12.bottom - f2);
        RectF rectF13 = this.rightEdge;
        RectF rectF14 = this.actualRect;
        float f12 = rectF14.right;
        rectF13.set(f12 - f2, rectF14.top + f2, f12 + f2, rectF14.bottom - f2);
        RectF rectF15 = this.bottomEdge;
        RectF rectF16 = this.actualRect;
        float f13 = rectF16.bottom;
        rectF15.set(rectF16.left + f2, f13 - f2, rectF16.right - f2, f13 + f2);
    }

    public float getLockAspectRatio() {
        return this.lockAspectRatio;
    }

    public void setLockedAspectRatio(float f) {
        this.lockAspectRatio = f;
    }

    public void setGridType(GridType gridType, boolean z) {
        Animator animator = this.gridAnimator;
        if (animator != null && (!z || this.gridType != gridType)) {
            animator.cancel();
            this.gridAnimator = null;
        }
        GridType gridType2 = this.gridType;
        if (gridType2 == gridType) {
            return;
        }
        this.previousGridType = gridType2;
        this.gridType = gridType;
        GridType gridType3 = GridType.NONE;
        float f = gridType == gridType3 ? 0.0f : 1.0f;
        if (!z) {
            this.gridProgress = f;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.gridProgress, f);
        this.gridAnimator = ofFloat;
        ofFloat.setDuration(200L);
        this.gridAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator2) {
                CropAreaView.this.gridAnimator = null;
            }
        });
        if (gridType == gridType3) {
            this.gridAnimator.setStartDelay(200L);
        }
        this.gridAnimator.start();
    }

    @Keep
    private void setGridProgress(float f) {
        this.gridProgress = f;
        invalidate();
    }

    @Keep
    private float getGridProgress() {
        return this.gridProgress;
    }

    public float getAspectRatio() {
        RectF rectF = this.actualRect;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public void fill(final RectF rectF, Animator animator, boolean z) {
        if (z) {
            Animator animator2 = this.animator;
            if (animator2 != null) {
                animator2.cancel();
                this.animator = null;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.animator = animatorSet;
            animatorSet.setDuration(300L);
            float[] fArr = {rectF.left};
            r0[0].setInterpolator(this.interpolator);
            float[] fArr2 = {rectF.top};
            r0[1].setInterpolator(this.interpolator);
            float[] fArr3 = {rectF.right};
            r0[2].setInterpolator(this.interpolator);
            float[] fArr4 = {rectF.bottom};
            r0[3].setInterpolator(this.interpolator);
            Animator[] animatorArr = {ObjectAnimator.ofFloat(this, "cropLeft", fArr), ObjectAnimator.ofFloat(this, "cropTop", fArr2), ObjectAnimator.ofFloat(this, "cropRight", fArr3), ObjectAnimator.ofFloat(this, "cropBottom", fArr4), animator};
            animatorArr[4].setInterpolator(this.interpolator);
            animatorSet.playTogether(animatorArr);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator3) {
                    CropAreaView.this.setActualRect(rectF);
                    CropAreaView.this.animator = null;
                }
            });
            animatorSet.start();
            return;
        }
        setActualRect(rectF);
    }

    public void resetAnimator() {
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
            this.animator = null;
        }
    }

    @Keep
    private void setCropLeft(float f) {
        this.actualRect.left = f;
        invalidate();
    }

    @Keep
    public float getCropLeft() {
        return this.actualRect.left;
    }

    @Keep
    private void setCropTop(float f) {
        this.actualRect.top = f;
        invalidate();
    }

    @Keep
    public float getCropTop() {
        return this.actualRect.top;
    }

    @Keep
    private void setCropRight(float f) {
        this.actualRect.right = f;
        invalidate();
    }

    @Keep
    public float getCropRight() {
        return this.actualRect.right;
    }

    @Keep
    private void setCropBottom(float f) {
        this.actualRect.bottom = f;
        invalidate();
    }

    @Keep
    public float getCropBottom() {
        return this.actualRect.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.actualRect;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.actualRect;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropWidth() {
        RectF rectF = this.actualRect;
        return rectF.right - rectF.left;
    }

    public float getCropHeight() {
        RectF rectF = this.actualRect;
        return rectF.bottom - rectF.top;
    }

    public RectF getTargetRectToFill() {
        return getTargetRectToFill(getAspectRatio());
    }

    public RectF getTargetRectToFill(float f) {
        calculateRect(this.targetRect, f);
        return this.targetRect;
    }

    public void calculateRect(RectF rectF, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = (Build.VERSION.SDK_INT < 21 || this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight;
        float measuredHeight = (getMeasuredHeight() - this.bottomPadding) - f6;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - (this.sidePadding * 2.0f);
        float f7 = this.sidePadding;
        float measuredWidth2 = getMeasuredWidth() - (f7 * 2.0f);
        float f8 = measuredHeight - (f7 * 2.0f);
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f9 = f6 + (measuredHeight / 2.0f);
        if (Math.abs(1.0f - f) < 1.0E-4d) {
            float f10 = min / 2.0f;
            f5 = measuredWidth3 - f10;
            f4 = f9 - f10;
            f2 = measuredWidth3 + f10;
            f3 = f9 + f10;
        } else {
            if (f - measuredWidth <= 1.0E-4d) {
                float f11 = f8 * f;
                if (f11 <= measuredWidth2) {
                    float f12 = f11 / 2.0f;
                    f5 = measuredWidth3 - f12;
                    float f13 = f8 / 2.0f;
                    float f14 = f9 - f13;
                    f2 = measuredWidth3 + f12;
                    f3 = f9 + f13;
                    f4 = f14;
                }
            }
            float f15 = measuredWidth2 / 2.0f;
            float f16 = measuredWidth3 - f15;
            float f17 = (measuredWidth2 / f) / 2.0f;
            float f18 = f9 - f17;
            f2 = measuredWidth3 + f15;
            f3 = f9 + f17;
            f4 = f18;
            f5 = f16;
        }
        rectF.set(f5, f4, f2, f3);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.isDragging) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void updateStatusShow(boolean z) {
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        } catch (Exception unused) {
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f = (Build.VERSION.SDK_INT < 21 || this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (this.freeform) {
                float f2 = x;
                float f3 = y;
                if (this.topLeftCorner.contains(f2, f3)) {
                    this.activeControl = Control.TOP_LEFT;
                } else if (this.topRightCorner.contains(f2, f3)) {
                    this.activeControl = Control.TOP_RIGHT;
                } else if (this.bottomLeftCorner.contains(f2, f3)) {
                    this.activeControl = Control.BOTTOM_LEFT;
                } else if (this.bottomRightCorner.contains(f2, f3)) {
                    this.activeControl = Control.BOTTOM_RIGHT;
                } else if (this.leftEdge.contains(f2, f3)) {
                    this.activeControl = Control.LEFT;
                } else if (this.topEdge.contains(f2, f3)) {
                    this.activeControl = Control.TOP;
                } else if (this.rightEdge.contains(f2, f3)) {
                    this.activeControl = Control.RIGHT;
                } else if (this.bottomEdge.contains(f2, f3)) {
                    this.activeControl = Control.BOTTOM;
                } else {
                    this.activeControl = Control.NONE;
                    return false;
                }
                this.previousX = x;
                this.previousY = y;
                setGridType(GridType.MAJOR, false);
                this.isDragging = true;
                updateStatusShow(true);
                AreaViewListener areaViewListener = this.listener;
                if (areaViewListener != null) {
                    areaViewListener.onAreaChangeBegan();
                }
                return true;
            }
            this.activeControl = Control.NONE;
            return false;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.isDragging = false;
            updateStatusShow(false);
            Control control = this.activeControl;
            Control control2 = Control.NONE;
            if (control == control2) {
                return false;
            }
            this.activeControl = control2;
            AreaViewListener areaViewListener2 = this.listener;
            if (areaViewListener2 != null) {
                areaViewListener2.onAreaChangeEnded();
            }
            return true;
        } else if (actionMasked != 2 || this.activeControl == Control.NONE) {
            return false;
        } else {
            this.tempRect.set(this.actualRect);
            float f4 = x - this.previousX;
            float f5 = y - this.previousY;
            this.previousX = x;
            this.previousY = y;
            boolean z = Math.abs(f4) > Math.abs(f5);
            switch (C21703.$SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[this.activeControl.ordinal()]) {
                case 1:
                    RectF rectF = this.tempRect;
                    rectF.left += f4;
                    rectF.top += f5;
                    if (this.lockAspectRatio > 0.0f) {
                        float width = rectF.width();
                        float height = this.tempRect.height();
                        if (z) {
                            constrainRectByWidth(this.tempRect, this.lockAspectRatio);
                        } else {
                            constrainRectByHeight(this.tempRect, this.lockAspectRatio);
                        }
                        RectF rectF2 = this.tempRect;
                        rectF2.left -= rectF2.width() - width;
                        RectF rectF3 = this.tempRect;
                        rectF3.top -= rectF3.width() - height;
                        break;
                    }
                    break;
                case 2:
                    RectF rectF4 = this.tempRect;
                    rectF4.right += f4;
                    rectF4.top += f5;
                    if (this.lockAspectRatio > 0.0f) {
                        float height2 = rectF4.height();
                        if (z) {
                            constrainRectByWidth(this.tempRect, this.lockAspectRatio);
                        } else {
                            constrainRectByHeight(this.tempRect, this.lockAspectRatio);
                        }
                        RectF rectF5 = this.tempRect;
                        rectF5.top -= rectF5.width() - height2;
                        break;
                    }
                    break;
                case 3:
                    RectF rectF6 = this.tempRect;
                    rectF6.left += f4;
                    rectF6.bottom += f5;
                    if (this.lockAspectRatio > 0.0f) {
                        float width2 = rectF6.width();
                        if (z) {
                            constrainRectByWidth(this.tempRect, this.lockAspectRatio);
                        } else {
                            constrainRectByHeight(this.tempRect, this.lockAspectRatio);
                        }
                        RectF rectF7 = this.tempRect;
                        rectF7.left -= rectF7.width() - width2;
                        break;
                    }
                    break;
                case 4:
                    RectF rectF8 = this.tempRect;
                    rectF8.right += f4;
                    rectF8.bottom += f5;
                    float f6 = this.lockAspectRatio;
                    if (f6 > 0.0f) {
                        if (z) {
                            constrainRectByWidth(rectF8, f6);
                            break;
                        } else {
                            constrainRectByHeight(rectF8, f6);
                            break;
                        }
                    }
                    break;
                case 5:
                    RectF rectF9 = this.tempRect;
                    rectF9.top += f5;
                    float f7 = this.lockAspectRatio;
                    if (f7 > 0.0f) {
                        constrainRectByHeight(rectF9, f7);
                        break;
                    }
                    break;
                case 6:
                    RectF rectF10 = this.tempRect;
                    rectF10.left += f4;
                    float f8 = this.lockAspectRatio;
                    if (f8 > 0.0f) {
                        constrainRectByWidth(rectF10, f8);
                        break;
                    }
                    break;
                case 7:
                    RectF rectF11 = this.tempRect;
                    rectF11.right += f4;
                    float f9 = this.lockAspectRatio;
                    if (f9 > 0.0f) {
                        constrainRectByWidth(rectF11, f9);
                        break;
                    }
                    break;
                case 8:
                    RectF rectF12 = this.tempRect;
                    rectF12.bottom += f5;
                    float f10 = this.lockAspectRatio;
                    if (f10 > 0.0f) {
                        constrainRectByHeight(rectF12, f10);
                        break;
                    }
                    break;
            }
            RectF rectF13 = this.tempRect;
            float f11 = rectF13.left;
            float f12 = this.sidePadding;
            if (f11 < f12) {
                float f13 = this.lockAspectRatio;
                if (f13 > 0.0f) {
                    rectF13.bottom = rectF13.top + ((rectF13.right - f12) / f13);
                }
                rectF13.left = f12;
            } else if (rectF13.right > getWidth() - this.sidePadding) {
                this.tempRect.right = getWidth() - this.sidePadding;
                if (this.lockAspectRatio > 0.0f) {
                    RectF rectF14 = this.tempRect;
                    rectF14.bottom = rectF14.top + (rectF14.width() / this.lockAspectRatio);
                }
            }
            float f14 = this.sidePadding;
            float f15 = f + f14;
            float f16 = this.bottomPadding + f14;
            RectF rectF15 = this.tempRect;
            if (rectF15.top < f15) {
                float f17 = this.lockAspectRatio;
                if (f17 > 0.0f) {
                    rectF15.right = rectF15.left + ((rectF15.bottom - f15) * f17);
                }
                rectF15.top = f15;
            } else if (rectF15.bottom > getHeight() - f16) {
                this.tempRect.bottom = getHeight() - f16;
                if (this.lockAspectRatio > 0.0f) {
                    RectF rectF16 = this.tempRect;
                    rectF16.right = rectF16.left + (rectF16.height() * this.lockAspectRatio);
                }
            }
            float width3 = this.tempRect.width();
            float f18 = this.minWidth;
            if (width3 < f18) {
                RectF rectF17 = this.tempRect;
                rectF17.right = rectF17.left + f18;
            }
            float height3 = this.tempRect.height();
            float f19 = this.minWidth;
            if (height3 < f19) {
                RectF rectF18 = this.tempRect;
                rectF18.bottom = rectF18.top + f19;
            }
            float f20 = this.lockAspectRatio;
            if (f20 > 0.0f) {
                if (f20 < 1.0f) {
                    float width4 = this.tempRect.width();
                    float f21 = this.minWidth;
                    if (width4 <= f21) {
                        RectF rectF19 = this.tempRect;
                        rectF19.right = rectF19.left + f21;
                        rectF19.bottom = rectF19.top + (rectF19.width() / this.lockAspectRatio);
                    }
                } else {
                    float height4 = this.tempRect.height();
                    float f22 = this.minWidth;
                    if (height4 <= f22) {
                        RectF rectF20 = this.tempRect;
                        rectF20.bottom = rectF20.top + f22;
                        rectF20.right = rectF20.left + (rectF20.height() * this.lockAspectRatio);
                    }
                }
            }
            setActualRect(this.tempRect);
            AreaViewListener areaViewListener3 = this.listener;
            if (areaViewListener3 != null) {
                areaViewListener3.onAreaChange();
            }
            return true;
        }
    }

    static class C21703 {
        static final int[] $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control;

        static {
            int[] iArr = new int[Control.values().length];
            $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control = iArr;
            try {
                iArr[Control.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[Control.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[Control.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[Control.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[Control.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[Control.LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[Control.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[Control.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private void constrainRectByWidth(RectF rectF, float f) {
        float width = rectF.width();
        rectF.right = rectF.left + width;
        rectF.bottom = rectF.top + (width / f);
    }

    private void constrainRectByHeight(RectF rectF, float f) {
        float height = rectF.height();
        rectF.right = rectF.left + (f * height);
        rectF.bottom = rectF.top + height;
    }

    public void getCropRect(RectF rectF) {
        rectF.set(this.actualRect);
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
        if (getMeasuredWidth() > 0) {
            updateSubtitle();
        }
    }
}
