package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a61 extends vw0 {
    public final Paint f26417l0;
    public boolean m0;
    public boolean f26418n0;
    public boolean f26419o0;
    public ValueAnimator f26420p0;
    public float f26421q0;
    public final float[] f26422r0;
    public boolean f26423s0;
    public final b61 f26424t0;

    public a61(b61 b61Var, Context context) {
        super(context, null);
        int i10;
        int i11;
        this.f26424t0 = b61Var;
        this.f26417l0 = new Paint(1);
        this.m0 = false;
        this.f26418n0 = false;
        this.f26419o0 = false;
        this.f26421q0 = 0.0f;
        this.f26422r0 = new float[8];
        setWillNotDraw(false);
        i10 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingLeft;
        i11 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        setDelegate(new z51(this));
    }

    public final float X() {
        b61 b61Var = this.f26424t0;
        return Math.min(1.0f, Math.max(0.0f, b61Var.e / (b61Var.f26764b * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        int themedColor;
        int i10;
        int i11;
        boolean z12;
        float f7;
        float f10;
        b61 b61Var = this.f26424t0;
        p61 p61Var = b61Var.d;
        int i12 = b61Var.f26764b;
        GradientDrawable gradientDrawable = b61Var.f26765c;
        float X = X();
        boolean z13 = false;
        if (X == 0.0f && !b61Var.isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26419o0 != z10) {
            ValueAnimator valueAnimator = this.f26420p0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26419o0 = z10;
            ValueAnimator valueAnimator2 = this.f26420p0;
            if (valueAnimator2 == null) {
                float f11 = this.f26421q0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f26420p0 = ofFloat;
                ofFloat.addUpdateListener(new e80(this, 29));
                this.f26420p0.setDuration(200L);
            } else {
                float f12 = this.f26421q0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                valueAnimator2.setFloatValues(f12, f7);
            }
            this.f26420p0.start();
        }
        if (this.f26421q0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26423s0 != z11) {
            this.f26423s0 = z11;
            if (AndroidUtilities.computePerceivedBrightness(b61Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(b61Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23634s8), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(b61Var.getWindow(), z12);
        }
        if (this.f26421q0 > 0.0f) {
            int themedColor2 = b61Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5);
            Paint paint = this.f26417l0;
            paint.setColor(themedColor2);
            int max = (int) Math.max(0.0f, p61Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i12) + ((1.0f - X()) * i12) + b61Var.e + AndroidUtilities.dp(24.0f));
            i10 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingLeft;
            int measuredWidth = getMeasuredWidth();
            i11 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingLeft;
            float f13 = max;
            canvas2 = canvas;
            canvas2.drawRect(i10, AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.f26421q0), measuredWidth - i11, f13, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (p61Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i12);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i13 = (int) ((1.0f - X) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.o(b61Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ii), (int) (Color.alpha(themedColor) * X)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.t.D(10.0f, b61Var.e, i13), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + b61Var.e + i13 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f26424t0.d.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new s51(this, 1), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        int i11;
        Drawable drawable2;
        int i12;
        int i13;
        b61 b61Var = this.f26424t0;
        GradientDrawable gradientDrawable = b61Var.f26765c;
        b61.m(b61Var);
        super.onDraw(canvas);
        float X = X();
        int i14 = b61Var.f26764b;
        int i15 = (int) ((1.0f - X) * i14);
        int i16 = AndroidUtilities.statusBarHeight - i14;
        canvas.save();
        canvas.translate(0.0f, b61Var.d.getTranslationY() + i16);
        drawable = ((org.telegram.ui.ActionBar.k3) b61Var).shadowDrawable;
        int i17 = b61Var.e;
        i10 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingTop;
        int i18 = (i17 - i10) + i15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i16 < 0) {
            i11 = -i16;
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i18, measuredWidth, measuredHeight + i11);
        drawable2 = ((org.telegram.ui.ActionBar.k3) b61Var).shadowDrawable;
        drawable2.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * X;
            gradientDrawable.setColor(b61Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5));
            float[] fArr = this.f26422r0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i12 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingLeft;
            int width = getWidth();
            i13 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i12, b61Var.e + i15, width - i13, AndroidUtilities.dp(24.0f) + b61Var.e + i15);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            b61 b61Var = this.f26424t0;
            if (b61Var.e != 0 && motionEvent.getY() < b61Var.e) {
                b61Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        b61 b61Var = this.f26424t0;
        p61 p61Var = b61Var.d;
        int i16 = AndroidUtilities.statusBarHeight;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i16) + Q) * 0.2f);
        this.f26418n0 = true;
        if (Q > AndroidUtilities.dp(20.0f)) {
            p61Var.a(true);
            b61Var.setAllowNestedScroll(false);
            this.m0 = true;
        } else {
            p61Var.a(false);
            b61Var.setAllowNestedScroll(true);
            this.m0 = false;
        }
        p61Var.setContentViewPaddingTop(size);
        if (getPaddingTop() != i16) {
            i14 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.k3) b61Var).backgroundPaddingLeft;
            setPadding(i14, i16, i15, 0);
        }
        this.f26418n0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26424t0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f26418n0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f26424t0.d.setTranslationY(f7);
        invalidate();
    }
}
