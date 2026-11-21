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
public final class v31 extends du0 {
    public final Paint f40672g0;
    public boolean f40673h0;
    public boolean f40674i0;
    public boolean f40675j0;
    public ValueAnimator f40676k0;
    public float f40677l0;
    public final float[] m0;
    public boolean f40678n0;
    public final w31 f40679o0;

    public v31(w31 w31Var, Context context) {
        super(context, null);
        this.f40679o0 = w31Var;
        this.f40672g0 = new Paint(1);
        this.f40673h0 = false;
        this.f40674i0 = false;
        this.f40675j0 = false;
        this.f40677l0 = 0.0f;
        this.m0 = new float[8];
        setWillNotDraw(false);
        int i7 = w31Var.f30208u0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new u31(this));
    }

    public final float X() {
        w31 w31Var = this.f40679o0;
        return Math.min(1.0f, Math.max(0.0f, w31Var.f41649p1 / (w31Var.f41647m1 * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        int w02;
        int max;
        boolean z12;
        float f10;
        float f11;
        w31 w31Var = this.f40679o0;
        k41 k41Var = w31Var.f41648o1;
        int i7 = w31Var.f41647m1;
        GradientDrawable gradientDrawable = w31Var.n1;
        float X = X();
        boolean z13 = false;
        if (X == 0.0f && !w31Var.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f40675j0 != z10) {
            ValueAnimator valueAnimator = this.f40676k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f40675j0 = z10;
            ValueAnimator valueAnimator2 = this.f40676k0;
            if (valueAnimator2 == null) {
                float f12 = this.f40677l0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f40676k0 = ofFloat;
                ofFloat.addUpdateListener(new h60(this, 29));
                this.f40676k0.setDuration(200L);
            } else {
                float f13 = this.f40677l0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f40676k0.start();
        }
        if (this.f40677l0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40678n0 != z11) {
            this.f40678n0 = z11;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, w31Var.J0)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29658s8, w31Var.J0), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.g0.r3(w31Var.getWindow(), z12);
        }
        if (this.f40677l0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, w31Var.J0);
            Paint paint = this.f40672g0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, k41Var.getTranslationY() + (org.telegram.messenger.g0.f24140m - i7) + ((1.0f - X()) * i7) + w31Var.f41649p1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(w31Var.f30208u0, org.telegram.messenger.g0.W1(this.f40677l0, max, -org.telegram.messenger.g0.f24140m), getMeasuredWidth() - w31Var.f30208u0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (k41Var.getTranslationY() + org.telegram.messenger.g0.f24140m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, w31Var.J0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.f3.C(10.0f, w31Var.f41649p1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + w31Var.f41649p1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f40679o0.f41648o1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.h3(new cp0(this, 26), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        w31 w31Var = this.f40679o0;
        GradientDrawable gradientDrawable = w31Var.n1;
        k41 k41Var = w31Var.f41648o1;
        if (k41Var.c()) {
            w31Var.f41649p1 = k41Var.getContentTopOffset();
            w31Var.f30173b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = w31Var.f41647m1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.g0.f24140m - i10;
        canvas.save();
        canvas.translate(0.0f, k41Var.getTranslationY() + i12);
        Drawable drawable = w31Var.f30206s0;
        int i13 = (w31Var.f41649p1 - w31Var.f30207t0) + i11;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i12 < 0) {
            i7 = -i12;
        } else {
            i7 = 0;
        }
        drawable.setBounds(0, i13, measuredWidth, measuredHeight + i7);
        w31Var.f30206s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, w31Var.J0));
            float[] fArr = this.m0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(w31Var.f30208u0, w31Var.f41649p1 + i11, getWidth() - w31Var.f30208u0, org.telegram.messenger.g0.L(24.0f) + w31Var.f41649p1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            w31 w31Var = this.f40679o0;
            if (w31Var.f41649p1 != 0 && motionEvent.getY() < w31Var.f41649p1) {
                w31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.f24140m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i13) + Q) * 0.2f);
        this.f40674i0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        w31 w31Var = this.f40679o0;
        if (Q > L) {
            w31Var.f41648o1.a(true);
            w31Var.f30204r0 = false;
            this.f40673h0 = true;
        } else {
            w31Var.f41648o1.a(false);
            w31Var.f30204r0 = true;
            this.f40673h0 = false;
        }
        w31Var.f41648o1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i13) {
            int i14 = w31Var.f30208u0;
            setPadding(i14, i13, i14, 0);
        }
        this.f40674i0 = false;
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40679o0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f40674i0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f40679o0.f41648o1.setTranslationY(f10);
        invalidate();
    }
}
