package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public class d61 extends FrameLayout {
    public ValueAnimator f25419a;
    public float f25420b;
    public boolean f25421c;
    public Boolean d;
    public final f61 e;

    public d61(f61 f61Var, Context context) {
        super(context);
        this.e = f61Var;
        this.f25421c = false;
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
        f61 f61Var = this.e;
        Drawable drawable = f61Var.f26090n1;
        RectF rectF = f61Var.f26096t1;
        int L = org.telegram.messenger.i0.L(6.0f) + (f61Var.f26097u1 - f61Var.f21615s0);
        int L2 = (f61Var.f26097u1 - f61Var.f21615s0) - org.telegram.messenger.i0.L(13.0f);
        int L3 = org.telegram.messenger.i0.L(50.0f) + getMeasuredHeight();
        int i13 = f61Var.f21615s0;
        int i14 = org.telegram.messenger.i0.f16166m;
        int i15 = L2 + i14;
        int i16 = L + i14;
        int i17 = (L3 + i13) - i14;
        float translationY = getTranslationY() + i13 + i15;
        int i18 = org.telegram.messenger.i0.f16166m;
        if (translationY < i18 * 2) {
            int min = (int) Math.min(i18, ((i10 - i15) - f61Var.f21615s0) - getTranslationY());
            i15 -= min;
            i17 += min;
            f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.f16166m);
        } else {
            f7 = 1.0f;
        }
        float translationY2 = getTranslationY() + f61Var.f21615s0 + i15;
        float f10 = org.telegram.messenger.i0.f16166m;
        boolean z12 = false;
        if (translationY2 < f10) {
            i12 = (int) Math.min(f10, ((i11 - i15) - f61Var.f21615s0) - getTranslationY());
        } else {
            i12 = 0;
        }
        drawable.setBounds(0, i15, getMeasuredWidth(), i17);
        drawable.draw(canvas);
        if (!f61Var.J1) {
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f21218t0.setColor(f61Var.f26099w1);
                rectF.set(f61Var.f21616t0, f61Var.f21615s0 + i15, getMeasuredWidth() - f61Var.f21616t0, org.telegram.messenger.i0.L(24.0f) + f61Var.f21615s0 + i15);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.f21218t0);
            }
            int L4 = org.telegram.messenger.i0.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i16, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.i0.L(4.0f) + i16);
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, f61Var.f26102z1, false));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21218t0);
        }
        if (i12 > 0) {
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(f61Var.f26099w1);
        }
        if (i12 > org.telegram.messenger.i0.f16166m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, f61Var.I0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, f61Var.I0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.i0.r3(f61Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            f61 f61Var = this.e;
            if (y3 < f61Var.f26097u1) {
                f61Var.dismiss();
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
        this.f25421c = true;
        f61 f61Var = this.e;
        ag.b1 b1Var = f61Var.f26088k1;
        int i12 = f61Var.f21616t0;
        setPadding(i12, org.telegram.messenger.i0.f16166m, i12, 0);
        this.f25421c = false;
        int paddingTop = size - getPaddingTop();
        if (f61Var.d) {
            L = org.telegram.messenger.i0.L(8.0f);
            f61Var.u0(false);
            int i13 = f61Var.f26097u1;
            if (i13 != 0) {
                float f7 = i13;
                this.f25420b = f7;
                setTranslationY(f7);
                ValueAnimator valueAnimator = this.f25419a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.f25419a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f25420b, 0.0f);
                this.f25419a = ofFloat;
                ofFloat.addUpdateListener(new w51(1, this));
                this.f25419a.setDuration(250L);
                this.f25419a.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                this.f25419a.addListener(new q11(this, 6));
                this.f25419a.start();
            } else if (this.f25419a != null) {
                setTranslationY(this.f25420b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + org.telegram.messenger.i0.L(8.0f);
            f61Var.f21611q0 = true;
        }
        if (b1Var.getPaddingTop() != L) {
            this.f25421c = true;
            b1Var.setPadding(0, L, 0, 0);
            this.f25421c = false;
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
        if (this.f25421c) {
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
