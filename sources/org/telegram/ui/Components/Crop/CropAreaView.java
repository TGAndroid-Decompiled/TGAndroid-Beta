package org.telegram.ui.Components.Crop;

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
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.BubbleActivity;

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
    private float overrideDimAlpha;
    private float overrideFrameAlpha;
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
    private float topPadding;
    private RectF topRightCorner;
    public float tx;
    public float ty;

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
        this.overrideDimAlpha = -1.0f;
        this.frameAlpha = 1.0f;
        this.overrideFrameAlpha = -1.0f;
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.freeform = true;
        this.targetRect = new RectF();
        this.rotate = 0.0f;
        this.scale = 1.0f;
        this.tx = 0.0f;
        this.ty = 0.0f;
        this.inBubbleMode = context instanceof BubbleActivity;
        this.frameVisible = true;
        this.dimVisibile = true;
        this.sidePadding = AndroidUtilities.dp(16.0f);
        this.minWidth = AndroidUtilities.dp(32.0f);
        this.gridType = GridType.NONE;
        Paint paint = new Paint();
        this.dimPaint = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        this.shadowPaint = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.shadowPaint.setColor(436207616);
        this.shadowPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        this.linePaint = paint3;
        paint3.setStyle(style);
        this.linePaint.setColor(-1);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint4 = new Paint();
        this.handlePaint = paint4;
        paint4.setStyle(style);
        this.handlePaint.setColor(-1);
        Paint paint5 = new Paint();
        this.framePaint = paint5;
        paint5.setStyle(style);
        this.framePaint.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        this.eraserPaint = paint6;
        paint6.setColor(0);
        this.eraserPaint.setStyle(style);
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
                this.subtitlePaint.setTextSize(AndroidUtilities.dp(13.0f));
                this.subtitlePaint.setTextAlign(Paint.Align.CENTER);
            }
            this.subtitleLayout = new StaticLayout(this.subtitle, this.subtitlePaint, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return;
        }
        this.subtitleLayout = null;
    }

    public void setIsVideo(boolean z) {
        this.minWidth = AndroidUtilities.dp(z ? 64.0f : 32.0f);
    }

    public boolean isDragging() {
        return this.isDragging;
    }

    public void setDimVisibility(boolean z) {
        this.dimVisibile = z;
    }

    public void setDimAlpha(float f) {
        this.overrideDimAlpha = f;
    }

    public void setFrameAlpha(float f) {
        this.overrideFrameAlpha = f;
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

    public void setTopPadding(float f) {
        this.topPadding = f;
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
            f = 1.0f;
            this.lockAspectRatio = 1.0f;
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
        this.tx = f3;
        this.ty = f4;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        if (this.freeform) {
            int dp = AndroidUtilities.dp(2.0f / this.scale);
            int dp2 = AndroidUtilities.dp(16.0f / this.scale);
            int dp3 = AndroidUtilities.dp(3.0f / this.scale);
            RectF rectF = this.actualRect;
            float f2 = rectF.left;
            int i3 = ((int) f2) - dp;
            float f3 = rectF.top;
            int i4 = ((int) f3) - dp;
            int i5 = dp * 2;
            int i6 = ((int) (rectF.right - f2)) + i5;
            int i7 = i5 + ((int) (rectF.bottom - f3));
            canvas.save();
            canvas.translate(this.tx, this.ty);
            float f4 = this.scale;
            float f5 = (i6 / 2) + i3;
            float f6 = (i7 / 2) + i4;
            canvas.scale(f4, f4, f5, f6);
            canvas.rotate(this.rotate, f5, f6);
            if (this.dimVisibile) {
                int i8 = (-getWidth()) * 4;
                int i9 = (-getHeight()) * 4;
                int width = getWidth() * 4;
                int height = getHeight() * 4;
                float f7 = this.overrideDimAlpha;
                if (f7 >= 0.0f) {
                    this.dimPaint.setAlpha((int) (f7 * 255.0f));
                } else {
                    this.dimPaint.setAlpha((int) (255.0f - (this.frameAlpha * 127.0f)));
                }
                float f8 = i8;
                float f9 = width;
                i = i4;
                i2 = i3;
                canvas.drawRect(f8, i9, f9, 0.0f, this.dimPaint);
                canvas.drawRect(f8, 0.0f, 0.0f, getHeight(), this.dimPaint);
                canvas.drawRect(getWidth(), 0.0f, f9, getHeight(), this.dimPaint);
                canvas.drawRect(f8, getHeight(), f9, height, this.dimPaint);
                float f10 = i + dp;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f10, this.dimPaint);
                float f11 = (i + i7) - dp;
                canvas.drawRect(0.0f, f10, i2 + dp, f11, this.dimPaint);
                canvas.drawRect((i2 + i6) - dp, f10, getWidth(), f11, this.dimPaint);
                canvas.drawRect(0.0f, f11, getWidth(), getHeight(), this.dimPaint);
            } else {
                i = i4;
                i2 = i3;
            }
            if (!this.frameVisible) {
                return;
            }
            int i10 = dp3 - dp;
            int i11 = dp3 * 2;
            int i12 = i6 - i11;
            int i13 = i7 - i11;
            GridType gridType = this.gridType;
            if (gridType == GridType.NONE) {
                f = 0.0f;
                if (this.gridProgress > 0.0f) {
                    gridType = this.previousGridType;
                }
            } else {
                f = 0.0f;
            }
            GridType gridType2 = gridType;
            float f12 = this.overrideFrameAlpha;
            if (f12 >= f) {
                this.shadowPaint.setAlpha((int) (this.gridProgress * 26.0f * f12));
                this.linePaint.setAlpha((int) (this.gridProgress * 178.0f * this.overrideFrameAlpha));
                this.framePaint.setAlpha((int) (this.overrideFrameAlpha * 178.0f));
                this.handlePaint.setAlpha((int) (this.overrideFrameAlpha * 255.0f));
            } else {
                this.shadowPaint.setAlpha((int) (this.gridProgress * 26.0f * this.frameAlpha));
                this.linePaint.setAlpha((int) (this.gridProgress * 178.0f * this.frameAlpha));
                this.framePaint.setAlpha((int) (this.frameAlpha * 178.0f));
                this.handlePaint.setAlpha((int) (this.frameAlpha * 255.0f));
            }
            float f13 = i2 + i10;
            float f14 = i + i10;
            int i14 = i2 + i6;
            float f15 = i14 - i10;
            canvas.drawRect(f13, f14, f15, r1 + dp, this.framePaint);
            int i15 = i7 + i;
            float f16 = i15 - i10;
            canvas.drawRect(f13, f14, r5 + dp, f16, this.framePaint);
            canvas.drawRect(f13, r10 - dp, f15, f16, this.framePaint);
            canvas.drawRect(r8 - dp, f14, f15, f16, this.framePaint);
            int i16 = 0;
            while (true) {
                int i17 = 3;
                if (i16 >= 3) {
                    break;
                }
                if (gridType2 == GridType.MINOR) {
                    int i18 = 1;
                    while (i18 < 4) {
                        if (i16 != 2 || i18 != i17) {
                            int i19 = i2 + dp3;
                            int i20 = i12 / 3;
                            float f17 = ((i20 / 3) * i18) + i19 + (i20 * i16);
                            int i21 = i + dp3;
                            float f18 = i21;
                            float f19 = i21 + i13;
                            canvas.drawLine(f17, f18, f17, f19, this.shadowPaint);
                            canvas.drawLine(f17, f18, f17, f19, this.linePaint);
                            int i22 = i13 / 3;
                            float f20 = i19;
                            float f21 = i21 + ((i22 / 3) * i18) + (i22 * i16);
                            float f22 = i19 + i12;
                            canvas.drawLine(f20, f21, f22, f21, this.shadowPaint);
                            canvas.drawLine(f20, f21, f22, f21, this.linePaint);
                        }
                        i18++;
                        i17 = 3;
                    }
                } else if (gridType2 == GridType.MAJOR && i16 > 0) {
                    int i23 = i2 + dp3;
                    float f23 = ((i12 / 3) * i16) + i23;
                    int i24 = i + dp3;
                    float f24 = i24;
                    float f25 = i24 + i13;
                    canvas.drawLine(f23, f24, f23, f25, this.shadowPaint);
                    canvas.drawLine(f23, f24, f23, f25, this.linePaint);
                    int i25 = i24 + ((i13 / 3) * i16);
                    float f26 = i23;
                    float f27 = i25;
                    float f28 = i23 + i12;
                    canvas.drawLine(f26, f27, f28, f27, this.shadowPaint);
                    canvas.drawLine(f26, f27, f28, f27, this.linePaint);
                }
                i16++;
            }
            float f29 = i2;
            float f30 = i;
            float f31 = i2 + dp2;
            float f32 = i + dp3;
            canvas.drawRect(f29, f30, f31, f32, this.handlePaint);
            float f33 = i2 + dp3;
            float f34 = i + dp2;
            canvas.drawRect(f29, f30, f33, f34, this.handlePaint);
            float f35 = i14 - dp2;
            float f36 = i14;
            canvas.drawRect(f35, f30, f36, f32, this.handlePaint);
            float f37 = i14 - dp3;
            canvas.drawRect(f37, f30, f36, f34, this.handlePaint);
            float f38 = i15 - dp3;
            float f39 = i15;
            canvas.drawRect(f29, f38, f31, f39, this.handlePaint);
            float f40 = i15 - dp2;
            canvas.drawRect(f29, f40, f33, f39, this.handlePaint);
            canvas.drawRect(f35, f38, f36, f39, this.handlePaint);
            canvas.drawRect(f37, f40, f36, f39, this.handlePaint);
            canvas.restore();
        } else {
            float measuredWidth = getMeasuredWidth() - (this.sidePadding * 2.0f);
            float measuredHeight = (((getMeasuredHeight() - this.bottomPadding) - (!this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0)) - this.topPadding) - (this.sidePadding * 2.0f);
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
                    int i26 = this.size;
                    this.circleBitmap = Bitmap.createBitmap(i26, i26, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.circleBitmap);
                    float f41 = this.size;
                    canvas2.drawRect(0.0f, 0.0f, f41, f41, this.dimPaint);
                    int i27 = this.size;
                    canvas2.drawCircle(i27 / 2, i27 / 2, i27 / 2, this.eraserPaint);
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
                float f42 = this.sidePadding;
                float f43 = this.size;
                this.left = ((measuredWidth - f43) / 2.0f) + f42;
                float f44 = f42 + ((measuredHeight - f43) / 2.0f) + (!this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0);
                this.top = f44;
                float f45 = f44 + f43;
                canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.top, this.dimPaint);
                float f46 = (int) f45;
                canvas.drawRect(0.0f, (int) this.top, (int) this.left, f46, this.dimPaint);
                canvas.drawRect((int) (r1 + f43), (int) this.top, getWidth(), f46, this.dimPaint);
                canvas.drawRect(0.0f, f46, getWidth(), getHeight(), this.dimPaint);
                canvas.drawBitmap(this.circleBitmap, (int) this.left, (int) this.top, this.bitmapPaint);
                if (getMeasuredHeight() > getMeasuredWidth() && this.subtitleLayout != null) {
                    canvas.save();
                    canvas.translate(getMeasuredWidth() / 2.0f, f45 + AndroidUtilities.dp(16.0f));
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
            float f47 = this.frameAlpha + (((float) j) / 180.0f);
            this.frameAlpha = f47;
            if (f47 > 1.0f) {
                this.frameAlpha = 1.0f;
            }
            invalidate();
        }
    }

    public void updateTouchAreas() {
        int dp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.topLeftCorner;
        RectF rectF2 = this.actualRect;
        float f = rectF2.left;
        float f2 = dp;
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
        float f10 = rectF10.left + f2;
        float f11 = rectF10.top;
        rectF9.set(f10, f11 - f2, rectF10.right - f2, f11 + f2);
        RectF rectF11 = this.leftEdge;
        RectF rectF12 = this.actualRect;
        float f12 = rectF12.left;
        rectF11.set(f12 - f2, rectF12.top + f2, f12 + f2, rectF12.bottom - f2);
        RectF rectF13 = this.rightEdge;
        RectF rectF14 = this.actualRect;
        float f13 = rectF14.right;
        rectF13.set(f13 - f2, rectF14.top + f2, f13 + f2, rectF14.bottom - f2);
        RectF rectF15 = this.bottomEdge;
        RectF rectF16 = this.actualRect;
        float f14 = rectF16.left + f2;
        float f15 = rectF16.bottom;
        rectF15.set(f14, f15 - f2, rectF16.right - f2, f15 + f2);
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

    private void setGridProgress(float f) {
        this.gridProgress = f;
        invalidate();
    }

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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "cropLeft", rectF.left);
            ofFloat.setInterpolator(this.interpolator);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "cropTop", rectF.top);
            ofFloat2.setInterpolator(this.interpolator);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "cropRight", rectF.right);
            ofFloat3.setInterpolator(this.interpolator);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "cropBottom", rectF.bottom);
            ofFloat4.setInterpolator(this.interpolator);
            animator.setInterpolator(this.interpolator);
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, animator);
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

    private void setCropLeft(float f) {
        this.actualRect.left = f;
        invalidate();
    }

    public float getCropLeft() {
        return this.actualRect.left;
    }

    private void setCropTop(float f) {
        this.actualRect.top = f;
        invalidate();
    }

    public float getCropTop() {
        return this.actualRect.top;
    }

    private void setCropRight(float f) {
        this.actualRect.right = f;
        invalidate();
    }

    public float getCropRight() {
        return this.actualRect.right;
    }

    private void setCropBottom(float f) {
        this.actualRect.bottom = f;
        invalidate();
    }

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
        float f6 = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
        float measuredHeight = ((getMeasuredHeight() - this.bottomPadding) - this.topPadding) - f6;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float min = Math.min(getMeasuredWidth(), measuredHeight) - (this.sidePadding * 2.0f);
        float measuredWidth2 = getMeasuredWidth();
        float f7 = this.sidePadding * 2.0f;
        float f8 = measuredWidth2 - f7;
        float f9 = measuredHeight - f7;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f10 = f6 + this.topPadding + (measuredHeight / 2.0f);
        if (Math.abs(1.0f - f) < 1.0E-4d) {
            float f11 = min / 2.0f;
            f5 = measuredWidth3 - f11;
            f4 = f10 - f11;
            f2 = measuredWidth3 + f11;
            f3 = f10 + f11;
        } else {
            if (f - measuredWidth <= 1.0E-4d) {
                float f12 = f9 * f;
                if (f12 <= f8) {
                    float f13 = f12 / 2.0f;
                    f5 = measuredWidth3 - f13;
                    float f14 = f9 / 2.0f;
                    float f15 = f10 - f14;
                    f2 = measuredWidth3 + f13;
                    f3 = f10 + f14;
                    f4 = f15;
                }
            }
            float f16 = f8 / 2.0f;
            float f17 = measuredWidth3 - f16;
            float f18 = (f8 / f) / 2.0f;
            float f19 = f10 - f18;
            f2 = measuredWidth3 + f16;
            f3 = f10 + f18;
            f4 = f19;
            f5 = f17;
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
        float f = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
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
        }
        if (actionMasked == 1 || actionMasked == 3) {
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
        }
        if (actionMasked != 2 || this.activeControl == Control.NONE) {
            return false;
        }
        this.tempRect.set(this.actualRect);
        float f4 = x - this.previousX;
        float f5 = y - this.previousY;
        this.previousX = x;
        this.previousY = y;
        boolean z = Math.abs(f4) > Math.abs(f5);
        switch (this.activeControl.ordinal()) {
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
                rectF11.bottom += f5;
                float f9 = this.lockAspectRatio;
                if (f9 > 0.0f) {
                    constrainRectByHeight(rectF11, f9);
                    break;
                }
                break;
            case 8:
                RectF rectF12 = this.tempRect;
                rectF12.right += f4;
                float f10 = this.lockAspectRatio;
                if (f10 > 0.0f) {
                    constrainRectByWidth(rectF12, f10);
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
        float f14 = f + this.topPadding;
        float f15 = this.sidePadding;
        float f16 = f14 + f15;
        float f17 = this.bottomPadding + f15;
        RectF rectF15 = this.tempRect;
        if (rectF15.top < f16) {
            float f18 = this.lockAspectRatio;
            if (f18 > 0.0f) {
                rectF15.right = rectF15.left + ((rectF15.bottom - f16) * f18);
            }
            rectF15.top = f16;
        } else if (rectF15.bottom > getHeight() - f17) {
            this.tempRect.bottom = getHeight() - f17;
            if (this.lockAspectRatio > 0.0f) {
                RectF rectF16 = this.tempRect;
                rectF16.right = rectF16.left + (rectF16.height() * this.lockAspectRatio);
            }
        }
        float width3 = this.tempRect.width();
        float f19 = this.minWidth;
        if (width3 < f19) {
            RectF rectF17 = this.tempRect;
            rectF17.right = rectF17.left + f19;
        }
        float height3 = this.tempRect.height();
        float f20 = this.minWidth;
        if (height3 < f20) {
            RectF rectF18 = this.tempRect;
            rectF18.bottom = rectF18.top + f20;
        }
        float f21 = this.lockAspectRatio;
        if (f21 > 0.0f) {
            if (f21 < 1.0f) {
                float width4 = this.tempRect.width();
                float f22 = this.minWidth;
                if (width4 <= f22) {
                    RectF rectF19 = this.tempRect;
                    rectF19.right = rectF19.left + f22;
                    rectF19.bottom = rectF19.top + (rectF19.width() / this.lockAspectRatio);
                }
            } else {
                float height4 = this.tempRect.height();
                float f23 = this.minWidth;
                if (height4 <= f23) {
                    RectF rectF20 = this.tempRect;
                    rectF20.bottom = rectF20.top + f23;
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
