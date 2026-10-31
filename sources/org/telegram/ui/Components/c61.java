package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class c61 extends FrameLayout {
    public ValueAnimator f25010a;
    public float f25011b;
    public boolean f25012c;
    public Boolean d;
    public final e61 e;

    public c61(e61 e61Var, Context context) {
        super(context);
        this.e = e61Var;
        this.f25012c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        canvas.save();
        e61 e61Var = this.e;
        Drawable drawable = e61Var.f25721n1;
        RectF rectF = e61Var.f25727t1;
        int L = org.telegram.messenger.i0.L(6.0f) + (e61Var.f25728u1 - e61Var.f21614s0);
        int L2 = (e61Var.f25728u1 - e61Var.f21614s0) - org.telegram.messenger.i0.L(13.0f);
        int L3 = org.telegram.messenger.i0.L(50.0f) + getMeasuredHeight();
        int i13 = e61Var.f21614s0;
        int i14 = org.telegram.messenger.i0.f16020m;
        int i15 = L2 + i14;
        int i16 = L + i14;
        int i17 = (L3 + i13) - i14;
        float translationY = getTranslationY() + i13 + i15;
        int i18 = org.telegram.messenger.i0.f16020m;
        if (translationY < i18 * 2) {
            int min = (int) Math.min(i18, ((i10 - i15) - e61Var.f21614s0) - getTranslationY());
            i15 -= min;
            i17 += min;
            f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.f16020m);
        } else {
            f7 = 1.0f;
        }
        float translationY2 = getTranslationY() + e61Var.f21614s0 + i15;
        float f10 = org.telegram.messenger.i0.f16020m;
        boolean z12 = false;
        if (translationY2 < f10) {
            i12 = (int) Math.min(f10, ((i11 - i15) - e61Var.f21614s0) - getTranslationY());
        } else {
            i12 = 0;
        }
        drawable.setBounds(0, i15, getMeasuredWidth(), i17);
        drawable.draw(canvas);
        if (!e61Var.J1) {
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f21217t0.setColor(e61Var.f25730w1);
                rectF.set(e61Var.f21615t0, e61Var.f21614s0 + i15, getMeasuredWidth() - e61Var.f21615t0, org.telegram.messenger.i0.L(24.0f) + e61Var.f21614s0 + i15);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.f21217t0);
            }
            int L4 = org.telegram.messenger.i0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i16, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.i0.L(4.0f) + i16);
            org.telegram.ui.ActionBar.t6.f21217t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, e61Var.f25733z1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21217t0);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.t6.f21217t0.setColor(e61Var.f25730w1);
        }
        if (i12 > org.telegram.messenger.i0.f16020m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, e61Var.I0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, e61Var.I0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.i0.r3(e61Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            e61 e61Var = this.e;
            if (y3 < e61Var.f25728u1) {
                e61Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.e.Q0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L;
        int size = View.MeasureSpec.getSize(i11);
        this.f25012c = true;
        e61 e61Var = this.e;
        ag.b1 b1Var = e61Var.f25719k1;
        int i12 = e61Var.f21615t0;
        setPadding(i12, org.telegram.messenger.i0.f16020m, i12, 0);
        this.f25012c = false;
        int paddingTop = size - getPaddingTop();
        if (e61Var.d) {
            L = org.telegram.messenger.i0.L(8.0f);
            e61Var.u0(false);
            int i13 = e61Var.f25728u1;
            if (i13 != 0) {
                float f7 = i13;
                this.f25011b = f7;
                setTranslationY(f7);
                ValueAnimator valueAnimator = this.f25010a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f25010a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f25011b, 0.0f);
                this.f25010a = ofFloat;
                ofFloat.addUpdateListener(new v51(1, this));
                this.f25010a.setDuration(250L);
                this.f25010a.setInterpolator(org.telegram.ui.ActionBar.m1.f20561w);
                this.f25010a.addListener(new p11(this, 6));
                this.f25010a.start();
            } else if (this.f25010a != null) {
                setTranslationY(this.f25011b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.i0.L(8.0f);
            e61Var.f21610q0 = true;
        }
        if (b1Var.getPaddingTop() != L) {
            this.f25012c = true;
            b1Var.setPadding(0, L, 0, 0);
            this.f25012c = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f25012c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
