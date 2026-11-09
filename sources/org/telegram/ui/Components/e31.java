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
public final class e31 extends tt0 {
    public final Paint f33277f0;
    public boolean f33278g0;
    public boolean f33279h0;
    public boolean f33280i0;
    public ValueAnimator f33281j0;
    public float f33282k0;
    public final float[] f33283l0;
    public boolean m0;
    public final f31 f33284n0;

    public e31(f31 f31Var, Context context) {
        super(context, null);
        this.f33284n0 = f31Var;
        this.f33277f0 = new Paint(1);
        this.f33278g0 = false;
        this.f33279h0 = false;
        this.f33280i0 = false;
        this.f33282k0 = 0.0f;
        this.f33283l0 = new float[8];
        setWillNotDraw(false);
        int i7 = f31Var.f28654t0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new d31(this));
    }

    public final float X() {
        f31 f31Var = this.f33284n0;
        return Math.min(1.0f, Math.max(0.0f, f31Var.l1 / (f31Var.f33572i1 * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        boolean z10;
        Canvas canvas2;
        int w02;
        int max;
        boolean z11;
        float f10;
        float f11;
        f31 f31Var = this.f33284n0;
        u31 u31Var = f31Var.f33574k1;
        int i7 = f31Var.f33572i1;
        GradientDrawable gradientDrawable = f31Var.f33573j1;
        float X = X();
        boolean z12 = false;
        if (X == 0.0f && !f31Var.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f33280i0 != z9) {
            ValueAnimator valueAnimator = this.f33281j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33280i0 = z9;
            ValueAnimator valueAnimator2 = this.f33281j0;
            if (valueAnimator2 == null) {
                float f12 = this.f33282k0;
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f33281j0 = ofFloat;
                ofFloat.addUpdateListener(new d60(this, 27));
                this.f33281j0.setDuration(200L);
            } else {
                float f13 = this.f33282k0;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f33281j0.start();
        }
        if (this.f33282k0 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.m0 != z10) {
            this.m0 = z10;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, f31Var.I0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, f31Var.I0), 855638016)) > 0.721f) {
                z12 = true;
            }
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(f31Var.getWindow(), z11);
        }
        if (this.f33282k0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, f31Var.I0);
            Paint paint = this.f33277f0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, u31Var.getTranslationY() + (org.telegram.messenger.g0.f22557m - i7) + ((1.0f - X()) * i7) + f31Var.l1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(f31Var.f28654t0, org.telegram.messenger.g0.W1(this.f33282k0, max, -org.telegram.messenger.g0.f22557m), getMeasuredWidth() - f31Var.f28654t0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (u31Var.getTranslationY() + org.telegram.messenger.g0.f22557m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, f31Var.I0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.k5.C(10.0f, f31Var.l1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + f31Var.l1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f33284n0.f33574k1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.i3(new kr0(this, 24), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        f31 f31Var = this.f33284n0;
        GradientDrawable gradientDrawable = f31Var.f33573j1;
        u31 u31Var = f31Var.f33574k1;
        if (u31Var.c()) {
            f31Var.l1 = u31Var.getContentTopOffset();
            f31Var.f28624b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = f31Var.f33572i1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.g0.f22557m - i10;
        canvas.save();
        canvas.translate(0.0f, u31Var.getTranslationY() + i12);
        Drawable drawable = f31Var.f28651r0;
        int i13 = (f31Var.l1 - f31Var.f28653s0) + i11;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i12 < 0) {
            i7 = -i12;
        } else {
            i7 = 0;
        }
        drawable.setBounds(0, i13, measuredWidth, measuredHeight + i7);
        f31Var.f28651r0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, f31Var.I0));
            float[] fArr = this.f33283l0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(f31Var.f28654t0, f31Var.l1 + i11, getWidth() - f31Var.f28654t0, org.telegram.messenger.g0.L(24.0f) + f31Var.l1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f31 f31Var = this.f33284n0;
            if (f31Var.l1 != 0 && motionEvent.getY() < f31Var.l1) {
                f31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.f22557m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i13) + Q) * 0.2f);
        this.f33279h0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        f31 f31Var = this.f33284n0;
        if (Q > L) {
            f31Var.f33574k1.a(true);
            f31Var.f28649q0 = false;
            this.f33278g0 = true;
        } else {
            f31Var.f33574k1.a(false);
            f31Var.f28649q0 = true;
            this.f33278g0 = false;
        }
        f31Var.f33574k1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i13) {
            int i14 = f31Var.f28654t0;
            setPadding(i14, i13, i14, 0);
        }
        this.f33279h0 = false;
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33284n0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f33279h0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f33284n0.f33574k1.setTranslationY(f10);
        invalidate();
    }
}
