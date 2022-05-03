package org.telegram.ui.Components.Crop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.BubbleActivity;

public class CropAreaView extends View {
    private Control activeControl;
    private Animator animator;
    private Paint bitmapPaint;
    private float bottomPadding;
    private Bitmap circleBitmap;
    private Paint dimPaint;
    private Paint eraserPaint;
    private Paint framePaint;
    private Animator gridAnimator;
    private float gridProgress;
    private Paint handlePaint;
    private boolean inBubbleMode;
    private boolean isDragging;
    private long lastUpdateTime;
    private Paint linePaint;
    private AreaViewListener listener;
    private float lockAspectRatio;
    private GridType previousGridType;
    private int previousX;
    private int previousY;
    private Paint shadowPaint;
    private RectF topLeftCorner = new RectF();
    private RectF topRightCorner = new RectF();
    private RectF bottomLeftCorner = new RectF();
    private RectF bottomRightCorner = new RectF();
    private RectF topEdge = new RectF();
    private RectF leftEdge = new RectF();
    private RectF bottomEdge = new RectF();
    private RectF rightEdge = new RectF();
    private RectF actualRect = new RectF();
    private RectF tempRect = new RectF();
    private float frameAlpha = 1.0f;
    private AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
    private boolean freeform = true;
    private RectF targetRect = new RectF();
    private boolean frameVisible = true;
    private boolean dimVisibile = true;
    private float sidePadding = AndroidUtilities.dp(16.0f);
    private float minWidth = AndroidUtilities.dp(32.0f);
    private GridType gridType = GridType.NONE;

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

    public CropAreaView(Context context) {
        super(context);
        this.inBubbleMode = context instanceof BubbleActivity;
        Paint paint = new Paint();
        this.dimPaint = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        this.shadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.shadowPaint.setColor(436207616);
        this.shadowPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        this.linePaint = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.linePaint.setColor(-1);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
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

    public void setFrameVisibility(boolean z, boolean z2) {
        this.frameVisible = z;
        float f = 1.0f;
        if (z) {
            if (z2) {
                f = 0.0f;
            }
            this.frameAlpha = f;
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

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (this.freeform) {
            int dp = AndroidUtilities.dp(2.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            int dp3 = AndroidUtilities.dp(3.0f);
            RectF rectF = this.actualRect;
            float f = rectF.left;
            int i13 = ((int) f) - dp;
            float f2 = rectF.top;
            int i14 = ((int) f2) - dp;
            int i15 = dp * 2;
            int i16 = ((int) (rectF.right - f)) + i15;
            int i17 = ((int) (rectF.bottom - f2)) + i15;
            if (this.dimVisibile) {
                float f3 = i14 + dp;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f3, this.dimPaint);
                float f4 = (i14 + i17) - dp;
                canvas.drawRect(0.0f, f3, i13 + dp, f4, this.dimPaint);
                canvas.drawRect((i13 + i16) - dp, f3, getWidth(), f4, this.dimPaint);
                canvas.drawRect(0.0f, f4, getWidth(), getHeight(), this.dimPaint);
            }
            if (this.frameVisible) {
                int i18 = dp3 - dp;
                int i19 = dp3 * 2;
                int i20 = i16 - i19;
                int i21 = i17 - i19;
                GridType gridType = this.gridType;
                if (gridType == GridType.NONE && this.gridProgress > 0.0f) {
                    gridType = this.previousGridType;
                }
                this.shadowPaint.setAlpha((int) (this.gridProgress * 26.0f * this.frameAlpha));
                this.linePaint.setAlpha((int) (this.gridProgress * 178.0f * this.frameAlpha));
                this.framePaint.setAlpha((int) (this.frameAlpha * 178.0f));
                this.handlePaint.setAlpha((int) (this.frameAlpha * 255.0f));
                int i22 = 0;
                while (true) {
                    int i23 = 3;
                    if (i22 >= 3) {
                        break;
                    }
                    if (gridType == GridType.MINOR) {
                        int i24 = 1;
                        while (i24 < 4) {
                            if (i22 == 2 && i24 == i23) {
                                i10 = dp;
                                i12 = dp2;
                                i11 = i17;
                                i9 = i16;
                            } else {
                                int i25 = i13 + dp3;
                                int i26 = i20 / 3;
                                float f5 = i25 + ((i26 / 3) * i24) + (i26 * i22);
                                i12 = dp2;
                                int i27 = i14 + dp3;
                                i11 = i17;
                                float f6 = i27;
                                i10 = dp;
                                float f7 = i27 + i21;
                                i9 = i16;
                                canvas.drawLine(f5, f6, f5, f7, this.shadowPaint);
                                canvas.drawLine(f5, f6, f5, f7, this.linePaint);
                                int i28 = i21 / 3;
                                int i29 = i27 + ((i28 / 3) * i24) + (i28 * i22);
                                float f8 = i25;
                                float f9 = i29;
                                float f10 = i25 + i20;
                                canvas.drawLine(f8, f9, f10, f9, this.shadowPaint);
                                canvas.drawLine(f8, f9, f10, f9, this.linePaint);
                            }
                            i24++;
                            dp2 = i12;
                            i17 = i11;
                            dp = i10;
                            i16 = i9;
                            i23 = 3;
                        }
                        i6 = dp;
                        i8 = dp2;
                        i7 = i17;
                        i5 = i16;
                    } else {
                        i6 = dp;
                        i8 = dp2;
                        i7 = i17;
                        i5 = i16;
                        if (gridType == GridType.MAJOR && i22 > 0) {
                            int i30 = i13 + dp3;
                            float f11 = ((i20 / 3) * i22) + i30;
                            int i31 = i14 + dp3;
                            float f12 = i31;
                            float f13 = i31 + i21;
                            canvas.drawLine(f11, f12, f11, f13, this.shadowPaint);
                            canvas.drawLine(f11, f12, f11, f13, this.linePaint);
                            float f14 = i30;
                            float f15 = i31 + ((i21 / 3) * i22);
                            float f16 = i30 + i20;
                            canvas.drawLine(f14, f15, f16, f15, this.shadowPaint);
                            canvas.drawLine(f14, f15, f16, f15, this.linePaint);
                        }
                    }
                    i22++;
                    dp2 = i8;
                    i17 = i7;
                    dp = i6;
                    i16 = i5;
                }
                int i32 = dp;
                int i33 = dp2;
                int i34 = i17;
                float f17 = i13 + i18;
                float f18 = i14 + i18;
                int i35 = i13 + i16;
                float f19 = i35 - i18;
                canvas.drawRect(f17, f18, f19, i2 + i32, this.framePaint);
                int i36 = i14 + i34;
                float f20 = i36 - i18;
                canvas.drawRect(f17, f18, i + i32, f20, this.framePaint);
                canvas.drawRect(f17, i4 - i32, f19, f20, this.framePaint);
                canvas.drawRect(i3 - i32, f18, f19, f20, this.framePaint);
                float f21 = i13;
                float f22 = i14;
                float f23 = i13 + i33;
                float f24 = i14 + dp3;
                canvas.drawRect(f21, f22, f23, f24, this.handlePaint);
                float f25 = i13 + dp3;
                float f26 = i14 + i33;
                canvas.drawRect(f21, f22, f25, f26, this.handlePaint);
                float f27 = i35 - i33;
                float f28 = i35;
                canvas.drawRect(f27, f22, f28, f24, this.handlePaint);
                float f29 = i35 - dp3;
                canvas.drawRect(f29, f22, f28, f26, this.handlePaint);
                float f30 = i36 - dp3;
                float f31 = i36;
                canvas.drawRect(f21, f30, f23, f31, this.handlePaint);
                float f32 = i36 - i33;
                canvas.drawRect(f21, f32, f25, f31, this.handlePaint);
                canvas.drawRect(f27, f30, f28, f31, this.handlePaint);
                canvas.drawRect(f29, f32, f28, f31, this.handlePaint);
            } else {
                return;
            }
        } else {
            float measuredWidth = getMeasuredWidth() - (this.sidePadding * 2.0f);
            float measuredHeight = ((getMeasuredHeight() - this.bottomPadding) - ((Build.VERSION.SDK_INT < 21 || this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight)) - (this.sidePadding * 2.0f);
            int min = (int) Math.min(measuredWidth, measuredHeight);
            Bitmap bitmap = this.circleBitmap;
            if (bitmap == null || bitmap.getWidth() != min) {
                Bitmap bitmap2 = this.circleBitmap;
                boolean z = bitmap2 != null;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.circleBitmap = null;
                }
                try {
                    this.circleBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.circleBitmap);
                    float f33 = min;
                    canvas2.drawRect(0.0f, 0.0f, f33, f33, this.dimPaint);
                    canvas2.drawCircle(min / 2, min / 2, min / 2, this.eraserPaint);
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
                float f34 = this.sidePadding;
                float f35 = min;
                float f36 = ((measuredWidth - f35) / 2.0f) + f34;
                float f37 = f34 + ((measuredHeight - f35) / 2.0f) + ((Build.VERSION.SDK_INT < 21 || this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight);
                float f38 = f36 + f35;
                float f39 = f35 + f37;
                float f40 = (int) f37;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f40, this.dimPaint);
                float f41 = (int) f36;
                float f42 = (int) f39;
                canvas.drawRect(0.0f, f40, f41, f42, this.dimPaint);
                canvas.drawRect((int) f38, f40, getWidth(), f42, this.dimPaint);
                canvas.drawRect(0.0f, f42, getWidth(), getHeight(), this.dimPaint);
                canvas.drawBitmap(this.circleBitmap, f41, f40, this.bitmapPaint);
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
        if (gridType2 != gridType) {
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
            f2 = measuredWidth3 - f10;
            f4 = f9 - f10;
            f3 = measuredWidth3 + f10;
            f5 = f9 + f10;
        } else {
            if (f - measuredWidth <= 1.0E-4d) {
                float f11 = f8 * f;
                if (f11 <= measuredWidth2) {
                    float f12 = f11 / 2.0f;
                    f2 = measuredWidth3 - f12;
                    float f13 = f8 / 2.0f;
                    f4 = f9 - f13;
                    f3 = measuredWidth3 + f12;
                    f5 = f9 + f13;
                }
            }
            float f14 = measuredWidth2 / 2.0f;
            f2 = measuredWidth3 - f14;
            float f15 = (measuredWidth2 / f) / 2.0f;
            f4 = f9 - f15;
            f3 = measuredWidth3 + f14;
            f5 = f9 + f15;
        }
        rectF.set(f2, f4, f3, f5);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        boolean z = false;
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
            if (Math.abs(f4) > Math.abs(f5)) {
                z = true;
            }
            switch (AnonymousClass3.$SwitchMap$org$telegram$ui$Components$Crop$CropAreaView$Control[this.activeControl.ordinal()]) {
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
                        if (!z) {
                            constrainRectByHeight(rectF8, f6);
                            break;
                        } else {
                            constrainRectByWidth(rectF8, f6);
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

    static class AnonymousClass3 {
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
}
