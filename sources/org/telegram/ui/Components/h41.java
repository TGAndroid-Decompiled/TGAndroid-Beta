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
public final class h41 extends vu0 {
    public final Paint f26670f0;
    public boolean f26671g0;
    public boolean f26672h0;
    public boolean f26673i0;
    public ValueAnimator f26674j0;
    public float f26675k0;
    public final float[] f26676l0;
    public boolean m0;
    public final i41 f26677n0;

    public h41(i41 i41Var, Context context) {
        super(context, null);
        this.f26677n0 = i41Var;
        this.f26670f0 = new Paint(1);
        this.f26671g0 = false;
        this.f26672h0 = false;
        this.f26673i0 = false;
        this.f26675k0 = 0.0f;
        this.f26676l0 = new float[8];
        setWillNotDraw(false);
        int i10 = i41Var.f21616t0;
        setPadding(i10, 0, i10, 0);
        setDelegate(new g41(this));
    }

    public final float X() {
        i41 i41Var = this.f26677n0;
        return Math.min(1.0f, Math.max(0.0f, i41Var.l1 / (i41Var.f27000i1 * 2.0f)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        int w02;
        int max;
        boolean z12;
        float f7;
        float f10;
        i41 i41Var = this.f26677n0;
        x41 x41Var = i41Var.f27002k1;
        int i10 = i41Var.f27000i1;
        GradientDrawable gradientDrawable = i41Var.f27001j1;
        float X = X();
        boolean z13 = false;
        if (X == 0.0f && !i41Var.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26673i0 != z10) {
            ValueAnimator valueAnimator = this.f26674j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26673i0 = z10;
            ValueAnimator valueAnimator2 = this.f26674j0;
            if (valueAnimator2 == null) {
                float f11 = this.f26675k0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f26674j0 = ofFloat;
                ofFloat.addUpdateListener(new r60(this, 29));
                this.f26674j0.setDuration(200L);
            } else {
                float f12 = this.f26675k0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                valueAnimator2.setFloatValues(f12, f7);
            }
            this.f26674j0.start();
        }
        if (this.f26675k0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.m0 != z11) {
            this.m0 = z11;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, i41Var.I0)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, i41Var.I0), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.i0.r3(i41Var.getWindow(), z12);
        }
        if (this.f26675k0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, i41Var.I0);
            Paint paint = this.f26670f0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, x41Var.getTranslationY() + (org.telegram.messenger.i0.f16166m - i10) + ((1.0f - X()) * i10) + i41Var.l1 + org.telegram.messenger.i0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(i41Var.f21616t0, org.telegram.messenger.i0.W1(this.f26675k0, max, -org.telegram.messenger.i0.f16166m), getMeasuredWidth() - i41Var.f21616t0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (x41Var.getTranslationY() + org.telegram.messenger.i0.f16166m) - i10);
        int L = org.telegram.messenger.i0.L(36.0f);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        int i11 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(2.0f));
        gradientDrawable.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, i41Var.I0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.m5.C(10.0f, i41Var.l1, i11), (getWidth() + L) / 2, org.telegram.messenger.i0.L(10.0f) + i41Var.l1 + i11 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f26677n0.f27002k1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.i0.h3(new vo0(this, 28), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        i41 i41Var = this.f26677n0;
        GradientDrawable gradientDrawable = i41Var.f27001j1;
        x41 x41Var = i41Var.f27002k1;
        if (x41Var.c()) {
            i41Var.l1 = x41Var.getContentTopOffset();
            i41Var.f21587b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i11 = i41Var.f27000i1;
        int i12 = (int) ((1.0f - X) * i11);
        int i13 = org.telegram.messenger.i0.f16166m - i11;
        canvas.save();
        canvas.translate(0.0f, x41Var.getTranslationY() + i13);
        Drawable drawable = i41Var.f21613r0;
        int i14 = (i41Var.l1 - i41Var.f21615s0) + i12;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i13 < 0) {
            i10 = -i13;
        } else {
            i10 = 0;
        }
        drawable.setBounds(0, i14, measuredWidth, measuredHeight + i10);
        i41Var.f21613r0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.i0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, i41Var.I0));
            float[] fArr = this.f26676l0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(i41Var.f21616t0, i41Var.l1 + i12, getWidth() - i41Var.f21616t0, org.telegram.messenger.i0.L(24.0f) + i41Var.l1 + i12);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            i41 i41Var = this.f26677n0;
            if (i41Var.l1 != 0 && motionEvent.getY() < i41Var.l1) {
                i41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = org.telegram.messenger.i0.f16166m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i14) + Q) * 0.2f);
        this.f26672h0 = true;
        int L = org.telegram.messenger.i0.L(20.0f);
        i41 i41Var = this.f26677n0;
        if (Q > L) {
            i41Var.f27002k1.a(true);
            i41Var.f21611q0 = false;
            this.f26671g0 = true;
        } else {
            i41Var.f27002k1.a(false);
            i41Var.f21611q0 = true;
            this.f26671g0 = false;
        }
        i41Var.f27002k1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i14) {
            int i15 = i41Var.f21616t0;
            setPadding(i15, i14, i15, 0);
        }
        this.f26672h0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26677n0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f26672h0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f26677n0.f27002k1.setTranslationY(f7);
        invalidate();
    }
}
