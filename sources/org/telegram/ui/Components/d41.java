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
public final class d41 extends hv0 {
    public final e41 A0;
    public final Paint f27651s0;
    public boolean f27652t0;
    public boolean f27653u0;
    public boolean f27654v0;
    public ValueAnimator f27655w0;
    public float f27656x0;
    public final float[] f27657y0;
    public boolean f27658z0;

    public d41(e41 e41Var, Context context) {
        super(context, null);
        int i10;
        int i11;
        this.A0 = e41Var;
        this.f27651s0 = new Paint(1);
        this.f27652t0 = false;
        this.f27653u0 = false;
        this.f27654v0 = false;
        this.f27656x0 = 0.0f;
        this.f27657y0 = new float[8];
        setWillNotDraw(false);
        i10 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingLeft;
        i11 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        setDelegate(new c41(this));
    }

    public final float Z() {
        e41 e41Var = this.A0;
        return Math.min(1.0f, Math.max(0.0f, e41Var.f27926f / (e41Var.f27923b * 2.0f)));
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
        float f9;
        float f10;
        e41 e41Var = this.A0;
        s41 s41Var = e41Var.f27925e;
        int i12 = e41Var.f27923b;
        GradientDrawable gradientDrawable = e41Var.f27924c;
        float Z = Z();
        boolean z13 = false;
        if (Z == 0.0f && !e41Var.isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27654v0 != z10) {
            ValueAnimator valueAnimator = this.f27655w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f27654v0 = z10;
            ValueAnimator valueAnimator2 = this.f27655w0;
            if (valueAnimator2 == null) {
                float f11 = this.f27656x0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f27655w0 = ofFloat;
                ofFloat.addUpdateListener(new d70(this, 29));
                this.f27655w0.setDuration(200L);
            } else {
                float f12 = this.f27656x0;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                valueAnimator2.setFloatValues(f12, f9);
            }
            this.f27655w0.start();
        }
        if (this.f27656x0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f27658z0 != z11) {
            this.f27658z0 = z11;
            if (AndroidUtilities.computePerceivedBrightness(e41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(e41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23329s8), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(e41Var.getWindow(), z12);
        }
        if (this.f27656x0 > 0.0f) {
            int themedColor2 = e41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5);
            Paint paint = this.f27651s0;
            paint.setColor(themedColor2);
            int max = (int) Math.max(0.0f, s41Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i12) + ((1.0f - Z()) * i12) + e41Var.f27926f + AndroidUtilities.dp(24.0f));
            i10 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingLeft;
            int measuredWidth = getMeasuredWidth();
            i11 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingLeft;
            float f13 = max;
            canvas2 = canvas;
            canvas2.drawRect(i10, AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.f27656x0), measuredWidth - i11, f13, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (s41Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i12);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i13 = (int) ((1.0f - Z) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.k(e41Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii), (int) (Color.alpha(themedColor) * Z)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.x3.C(10.0f, e41Var.f27926f, i13), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + e41Var.f27926f + i13 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.A0.f27925e.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new fq0(this, 25), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        int i11;
        Drawable drawable2;
        int i12;
        int i13;
        e41 e41Var = this.A0;
        GradientDrawable gradientDrawable = e41Var.f27924c;
        e41.m(e41Var);
        super.onDraw(canvas);
        float Z = Z();
        int i14 = e41Var.f27923b;
        int i15 = (int) ((1.0f - Z) * i14);
        int i16 = AndroidUtilities.statusBarHeight - i14;
        canvas.save();
        canvas.translate(0.0f, e41Var.f27925e.getTranslationY() + i16);
        drawable = ((org.telegram.ui.ActionBar.f3) e41Var).shadowDrawable;
        int i17 = e41Var.f27926f;
        i10 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingTop;
        int i18 = (i17 - i10) + i15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i16 < 0) {
            i11 = -i16;
        } else {
            i11 = 0;
        }
        drawable.setBounds(0, i18, measuredWidth, measuredHeight + i11);
        drawable2 = ((org.telegram.ui.ActionBar.f3) e41Var).shadowDrawable;
        drawable2.draw(canvas);
        if (Z > 0.0f && Z < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * Z;
            gradientDrawable.setColor(e41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
            float[] fArr = this.f27657y0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i12 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingLeft;
            int width = getWidth();
            i13 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i12, e41Var.f27926f + i15, width - i13, AndroidUtilities.dp(24.0f) + e41Var.f27926f + i15);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            e41 e41Var = this.A0;
            if (e41Var.f27926f != 0 && motionEvent.getY() < e41Var.f27926f) {
                e41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        e41 e41Var = this.A0;
        s41 s41Var = e41Var.f27925e;
        int i16 = AndroidUtilities.statusBarHeight;
        int R = R();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i16) + R) * 0.2f);
        this.f27653u0 = true;
        if (R > AndroidUtilities.dp(20.0f)) {
            s41Var.a(true);
            e41Var.setAllowNestedScroll(false);
            this.f27652t0 = true;
        } else {
            s41Var.a(false);
            e41Var.setAllowNestedScroll(true);
            this.f27652t0 = false;
        }
        s41Var.setContentViewPaddingTop(size);
        if (getPaddingTop() != i16) {
            i14 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.f3) e41Var).backgroundPaddingLeft;
            setPadding(i14, i16, i15, 0);
        }
        this.f27653u0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f27653u0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f9) {
        this.A0.f27925e.setTranslationY(f9);
        invalidate();
    }
}
