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
public final class u31 extends cu0 {
    public final Paint f40261g0;
    public boolean f40262h0;
    public boolean f40263i0;
    public boolean f40264j0;
    public ValueAnimator f40265k0;
    public float f40266l0;
    public final float[] m0;
    public boolean f40267n0;
    public final v31 f40268o0;

    public u31(v31 v31Var, Context context) {
        super(context, null);
        this.f40268o0 = v31Var;
        this.f40261g0 = new Paint(1);
        this.f40262h0 = false;
        this.f40263i0 = false;
        this.f40264j0 = false;
        this.f40266l0 = 0.0f;
        this.m0 = new float[8];
        setWillNotDraw(false);
        int i7 = v31Var.f30261u0;
        setPadding(i7, 0, i7, 0);
        setDelegate(new t31(this));
    }

    public final float X() {
        v31 v31Var = this.f40268o0;
        return Math.min(1.0f, Math.max(0.0f, v31Var.f40556p1 / (v31Var.f40554m1 * 2.0f)));
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
        v31 v31Var = this.f40268o0;
        j41 j41Var = v31Var.f40555o1;
        int i7 = v31Var.f40554m1;
        GradientDrawable gradientDrawable = v31Var.n1;
        float X = X();
        boolean z13 = false;
        if (X == 0.0f && !v31Var.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f40264j0 != z10) {
            ValueAnimator valueAnimator = this.f40265k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f40264j0 = z10;
            ValueAnimator valueAnimator2 = this.f40265k0;
            if (valueAnimator2 == null) {
                float f12 = this.f40266l0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f40265k0 = ofFloat;
                ofFloat.addUpdateListener(new e60(this, 29));
                this.f40265k0.setDuration(200L);
            } else {
                float f13 = this.f40266l0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f40265k0.start();
        }
        if (this.f40266l0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40267n0 != z11) {
            this.f40267n0 = z11;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, v31Var.J0)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731s8, v31Var.J0), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.g0.r3(v31Var.getWindow(), z12);
        }
        if (this.f40266l0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, v31Var.J0);
            Paint paint = this.f40261g0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, j41Var.getTranslationY() + (org.telegram.messenger.g0.f24220m - i7) + ((1.0f - X()) * i7) + v31Var.f40556p1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(v31Var.f30261u0, org.telegram.messenger.g0.W1(this.f40266l0, max, -org.telegram.messenger.g0.f24220m), getMeasuredWidth() - v31Var.f30261u0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (j41Var.getTranslationY() + org.telegram.messenger.g0.f24220m) - i7);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, v31Var.J0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.f3.C(10.0f, v31Var.f40556p1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + v31Var.f40556p1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f40268o0.f40555o1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.h3(new bp0(this, 26), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        v31 v31Var = this.f40268o0;
        GradientDrawable gradientDrawable = v31Var.n1;
        j41 j41Var = v31Var.f40555o1;
        if (j41Var.c()) {
            v31Var.f40556p1 = j41Var.getContentTopOffset();
            v31Var.f30226b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = v31Var.f40554m1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.g0.f24220m - i10;
        canvas.save();
        canvas.translate(0.0f, j41Var.getTranslationY() + i12);
        Drawable drawable = v31Var.f30259s0;
        int i13 = (v31Var.f40556p1 - v31Var.f30260t0) + i11;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i12 < 0) {
            i7 = -i12;
        } else {
            i7 = 0;
        }
        drawable.setBounds(0, i13, measuredWidth, measuredHeight + i7);
        v31Var.f30259s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, v31Var.J0));
            float[] fArr = this.m0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(v31Var.f30261u0, v31Var.f40556p1 + i11, getWidth() - v31Var.f30261u0, org.telegram.messenger.g0.L(24.0f) + v31Var.f40556p1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            v31 v31Var = this.f40268o0;
            if (v31Var.f40556p1 != 0 && motionEvent.getY() < v31Var.f40556p1) {
                v31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.f24220m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i13) + Q) * 0.2f);
        this.f40263i0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        v31 v31Var = this.f40268o0;
        if (Q > L) {
            v31Var.f40555o1.a(true);
            v31Var.f30257r0 = false;
            this.f40262h0 = true;
        } else {
            v31Var.f40555o1.a(false);
            v31Var.f30257r0 = true;
            this.f40262h0 = false;
        }
        v31Var.f40555o1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i13) {
            int i14 = v31Var.f30261u0;
            setPadding(i14, i13, i14, 0);
        }
        this.f40263i0 = false;
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40268o0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f40263i0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f40268o0.f40555o1.setTranslationY(f10);
        invalidate();
    }
}
