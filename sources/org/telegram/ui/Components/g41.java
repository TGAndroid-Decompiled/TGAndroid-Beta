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
public final class g41 extends uu0 {
    public final Paint f26250f0;
    public boolean f26251g0;
    public boolean f26252h0;
    public boolean f26253i0;
    public ValueAnimator f26254j0;
    public float f26255k0;
    public final float[] f26256l0;
    public boolean m0;
    public final h41 f26257n0;

    public g41(h41 h41Var, Context context) {
        super(context, null);
        this.f26257n0 = h41Var;
        this.f26250f0 = new Paint(1);
        this.f26251g0 = false;
        this.f26252h0 = false;
        this.f26253i0 = false;
        this.f26255k0 = 0.0f;
        this.f26256l0 = new float[8];
        setWillNotDraw(false);
        int i10 = h41Var.f21615t0;
        setPadding(i10, 0, i10, 0);
        setDelegate(new f41(this));
    }

    public final float X() {
        h41 h41Var = this.f26257n0;
        return Math.min(1.0f, Math.max(0.0f, h41Var.l1 / (h41Var.f26621i1 * 2.0f)));
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
        h41 h41Var = this.f26257n0;
        w41 w41Var = h41Var.f26623k1;
        int i10 = h41Var.f26621i1;
        GradientDrawable gradientDrawable = h41Var.f26622j1;
        float X = X();
        boolean z13 = false;
        if (X == 0.0f && !h41Var.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26253i0 != z10) {
            ValueAnimator valueAnimator = this.f26254j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f26253i0 = z10;
            ValueAnimator valueAnimator2 = this.f26254j0;
            if (valueAnimator2 == null) {
                float f11 = this.f26255k0;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                this.f26254j0 = ofFloat;
                ofFloat.addUpdateListener(new r60(this, 29));
                this.f26254j0.setDuration(200L);
            } else {
                float f12 = this.f26255k0;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                valueAnimator2.setFloatValues(f12, f7);
            }
            this.f26254j0.start();
        }
        if (this.f26255k0 > 0.5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.m0 != z11) {
            this.m0 = z11;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, h41Var.I0)) > 0.721f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, h41Var.I0), 855638016)) > 0.721f) {
                z13 = true;
            }
            if (!z11) {
                z12 = z13;
            }
            org.telegram.messenger.i0.r3(h41Var.getWindow(), z12);
        }
        if (this.f26255k0 > 0.0f) {
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, h41Var.I0);
            Paint paint = this.f26250f0;
            paint.setColor(w03);
            float max2 = (int) Math.max(0.0f, w41Var.getTranslationY() + (org.telegram.messenger.i0.f16020m - i10) + ((1.0f - X()) * i10) + h41Var.l1 + org.telegram.messenger.i0.L(24.0f));
            canvas2 = canvas;
            canvas2.drawRect(h41Var.f21615t0, org.telegram.messenger.i0.W1(this.f26255k0, max, -org.telegram.messenger.i0.f16020m), getMeasuredWidth() - h41Var.f21615t0, max2, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (w41Var.getTranslationY() + org.telegram.messenger.i0.f16020m) - i10);
        int L = org.telegram.messenger.i0.L(36.0f);
        int L2 = org.telegram.messenger.i0.L(4.0f);
        int i11 = (int) ((1.0f - X) * L2 * 2.0f);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(2.0f));
        gradientDrawable.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, h41Var.I0), (int) (Color.alpha(w02) * X)));
        gradientDrawable.setBounds((getWidth() - L) / 2, org.telegram.messenger.m5.C(10.0f, h41Var.l1, i11), (getWidth() + L) / 2, org.telegram.messenger.i0.L(10.0f) + h41Var.l1 + i11 + L2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override
    public final float getTranslationY() {
        return this.f26257n0.f26623k1.getTranslationY();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.i0.h3(new uo0(this, 28), 200L);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        h41 h41Var = this.f26257n0;
        GradientDrawable gradientDrawable = h41Var.f26622j1;
        w41 w41Var = h41Var.f26623k1;
        if (w41Var.c()) {
            h41Var.l1 = w41Var.getContentTopOffset();
            h41Var.f21586b.invalidate();
        }
        super.onDraw(canvas);
        float X = X();
        int i11 = h41Var.f26621i1;
        int i12 = (int) ((1.0f - X) * i11);
        int i13 = org.telegram.messenger.i0.f16020m - i11;
        canvas.save();
        canvas.translate(0.0f, w41Var.getTranslationY() + i13);
        Drawable drawable = h41Var.f21612r0;
        int i14 = (h41Var.l1 - h41Var.f21614s0) + i12;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (i13 < 0) {
            i10 = -i13;
        } else {
            i10 = 0;
        }
        drawable.setBounds(0, i14, measuredWidth, measuredHeight + i10);
        h41Var.f21612r0.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float L = org.telegram.messenger.i0.L(12.0f) * X;
            gradientDrawable.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, h41Var.I0));
            float[] fArr = this.f26256l0;
            fArr[3] = L;
            fArr[2] = L;
            fArr[1] = L;
            fArr[0] = L;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setBounds(h41Var.f21615t0, h41Var.l1 + i12, getWidth() - h41Var.f21615t0, org.telegram.messenger.i0.L(24.0f) + h41Var.l1 + i12);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            h41 h41Var = this.f26257n0;
            if (h41Var.l1 != 0 && motionEvent.getY() < h41Var.l1) {
                h41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = org.telegram.messenger.i0.f16020m;
        int Q = Q();
        int size = (int) (((View.MeasureSpec.getSize(getMeasuredHeight()) - i14) + Q) * 0.2f);
        this.f26252h0 = true;
        int L = org.telegram.messenger.i0.L(20.0f);
        h41 h41Var = this.f26257n0;
        if (Q > L) {
            h41Var.f26623k1.a(true);
            h41Var.f21610q0 = false;
            this.f26251g0 = true;
        } else {
            h41Var.f26623k1.a(false);
            h41Var.f21610q0 = true;
            this.f26251g0 = false;
        }
        h41Var.f26623k1.setContentViewPaddingTop(size);
        if (getPaddingTop() != i14) {
            int i15 = h41Var.f21615t0;
            setPadding(i15, i14, i15, 0);
        }
        this.f26252h0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f26257n0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (!this.f26252h0) {
            super.requestLayout();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        this.f26257n0.f26623k1.setTranslationY(f7);
        invalidate();
    }
}
