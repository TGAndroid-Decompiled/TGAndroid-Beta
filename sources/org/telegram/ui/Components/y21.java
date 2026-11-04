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
public final class y21 extends qt0 {
    public final Paint f40594g0;
    public boolean f40595h0;
    public boolean f40596i0;
    public boolean f40597j0;
    public ValueAnimator f40598k0;
    public float f40599l0;
    public final float[] m0;
    public boolean f40600n0;
    public final z21 f40601o0;

    public y21(z21 z21Var, Context context) {
        super(context, null);
        this.f40601o0 = z21Var;
        this.f40594g0 = new Paint(1);
        this.f40595h0 = false;
        this.f40596i0 = false;
        this.f40597j0 = false;
        this.f40599l0 = 0.0f;
        this.m0 = new float[8];
        setWillNotDraw(false);
        int i3 = z21Var.f28618u0;
        setPadding(i3, 0, i3, 0);
        setDelegate(new x21(this));
    }

    public final float X() {
        z21 z21Var = this.f40601o0;
        return Math.min(1.0f, Math.max(0.0f, z21Var.m1 / (z21Var.f40900j1 * 2.0f)));
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
        z21 z21Var = this.f40601o0;
        n31 n31Var = z21Var.f40901l1;
        int i3 = z21Var.f40900j1;
        GradientDrawable gradientDrawable = z21Var.k1;
        float X = X();
        boolean z13 = false;
        if (X == 0.0f && !z21Var.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f40597j0 != z10) {
            ValueAnimator valueAnimator = this.f40598k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f40597j0 = z10;
            ValueAnimator valueAnimator2 = this.f40598k0;
            if (valueAnimator2 == null) {
                float f12 = this.f40599l0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f11);
                this.f40598k0 = ofFloat;
                ofFloat.addUpdateListener(new y50(this, 29));
                this.f40598k0.setDuration(200L);
            } else {
                float f13 = this.f40599l0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                valueAnimator2.setFloatValues(f13, f10);
            }
            this.f40598k0.start();
        }
        if (this.f40599l0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40600n0 != z11) {
            this.f40600n0 = z11;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, z21Var.J0)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, z21Var.J0), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.g0.s3(z21Var.getWindow(), z12);
        }
        if (this.f40599l0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, z21Var.J0);
            Paint paint = this.f40594g0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, n31Var.getTranslationY() + (org.telegram.messenger.g0.f22602m - i3) + ((1.0f - X()) * i3) + z21Var.m1 + org.telegram.messenger.g0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(z21Var.f28618u0, org.telegram.messenger.g0.W1(this.f40599l0, max, -org.telegram.messenger.g0.f22602m), getMeasuredWidth() - z21Var.f28618u0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (n31Var.getTranslationY() + org.telegram.messenger.g0.f22602m) - i3);
        int L = org.telegram.messenger.g0.L(36.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int i10 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(2.0f));
        gradientDrawable.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, z21Var.J0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.k5.C(10.0f, z21Var.m1, i10), (getWidth() + L) / 2, org.telegram.messenger.g0.L(10.0f) + z21Var.m1 + i10 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f40601o0.f40901l1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.i3(new sp0(this, 25), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        z21 z21Var = this.f40601o0;
        GradientDrawable gradientDrawable = z21Var.k1;
        n31 n31Var = z21Var.f40901l1;
        if (n31Var.c()) {
            z21Var.m1 = n31Var.getContentTopOffset();
            z21Var.f28586b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i10 = z21Var.f40900j1;
        int i11 = (int) ((1.0f - X) * i10);
        int i12 = org.telegram.messenger.g0.f22602m - i10;
        canvas.save();
        canvas.translate(0.0f, n31Var.getTranslationY() + i12);
        Drawable drawable = z21Var.f28616s0;
        int i13 = (z21Var.m1 - z21Var.f28617t0) + i11;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i12 < 0) {
            i3 = -i12;
        } else {
            i3 = 0;
        }
        drawable.setBounds(0, i13, measuredWidth, measuredHeight + i3);
        z21Var.f28616s0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.g0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, z21Var.J0));
            float[] fArr = this.m0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(z21Var.f28618u0, z21Var.m1 + i11, getWidth() - z21Var.f28618u0, org.telegram.messenger.g0.L(24.0f) + z21Var.m1 + i11);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            z21 z21Var = this.f40601o0;
            if (z21Var.m1 != 0 && motionEvent.getY() < z21Var.m1) {
                z21Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = org.telegram.messenger.g0.f22602m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i13) + Q) * 0.2f);
        this.f40596i0 = true;
        int L = org.telegram.messenger.g0.L(20.0f);
        z21 z21Var = this.f40601o0;
        if (Q > L) {
            z21Var.f40901l1.a(true);
            z21Var.f28614r0 = false;
            this.f40595h0 = true;
        } else {
            z21Var.f40901l1.a(false);
            z21Var.f28614r0 = true;
            this.f40595h0 = false;
        }
        z21Var.f40901l1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i13) {
            int i14 = z21Var.f28618u0;
            setPadding(i14, i13, i14, 0);
        }
        this.f40596i0 = false;
        super.onLayout(z10, i3, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40601o0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f40596i0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        this.f40601o0.f40901l1.setTranslationY(f10);
        invalidate();
    }
}
