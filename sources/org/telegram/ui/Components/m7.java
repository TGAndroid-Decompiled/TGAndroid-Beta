package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class m7 extends FrameLayout {
    public final RectF f28396a;
    public boolean f28397b;
    public int f28398c;
    public int d;
    public final w7 e;

    public m7(w7 w7Var, Context context) {
        super(context);
        this.e = w7Var;
        this.f28396a = new RectF();
        this.f28397b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new k7(this, 0));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        float f11;
        float f12;
        w7 w7Var = this.e;
        j7 j7Var = w7Var.f32110o1;
        kg.g1 g1Var = w7Var.f32101j1;
        boolean z10 = w7Var.f32104k2;
        if (w7Var.f32109n2.size() <= 1) {
            w7Var.f21613r0.setBounds(0, (getMeasuredHeight() - w7Var.f32122u1.getMeasuredHeight()) - w7Var.f21615s0, getMeasuredWidth(), getMeasuredHeight());
            w7Var.f21613r0.draw(canvas);
            if (z10) {
                g1Var.setVisibility(8);
            }
        } else if (j7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.i0.L(13.0f);
            int translationY = (int) (j7Var.getTranslationY() + ((w7Var.f32115q2 - w7Var.f21615s0) - L));
            if (z10) {
                translationY = (translationY - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) + org.telegram.messenger.i0.L(10.0f);
            }
            int L2 = org.telegram.messenger.i0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight();
            int i11 = w7Var.f21615s0;
            int i12 = L3 + i11;
            if (!z10 && i11 + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.i0.L(4.0f) + L;
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - w7Var.f21615s0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L4) * f7);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i12 += currentActionBarHeight;
                f10 = 1.0f - f7;
            } else {
                f7 = 0.0f;
                f10 = 1.0f;
            }
            int i13 = (int) ((1.0f - f7) * org.telegram.messenger.i0.f16166m);
            int i14 = L2 + i13;
            w7Var.f21613r0.setBounds(0, translationY + i13, getMeasuredWidth(), i12);
            w7Var.f21613r0.draw(canvas);
            RectF rectF = this.f28396a;
            if (!z10 && f10 != 1.0f) {
                f11 = 10.0f;
                org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, w7Var.I0));
                f12 = 4.0f;
                rectF.set(w7Var.f21616t0, w7Var.f21615s0 + i10, getMeasuredWidth() - w7Var.f21616t0, org.telegram.messenger.i0.L(24.0f) + w7Var.f21615s0 + i10);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f10, org.telegram.messenger.i0.L(12.0f) * f10, org.telegram.ui.ActionBar.t6.f21218t0);
            } else {
                f11 = 10.0f;
                f12 = 4.0f;
            }
            if (!z10 && f10 != 0.0f) {
                int L5 = org.telegram.messenger.i0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i14, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.i0.L(f12) + i14);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, w7Var.I0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.t6.f21218t0.setColor(w02);
                org.telegram.ui.ActionBar.t6.f21218t0.setAlpha((int) (alpha * 1.0f * f10));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21218t0);
            }
            if (z10) {
                g1Var.setVisibility(0);
                g1Var.setTranslationY(Math.max(0.0f, c3.i0.z(1.0f, w7Var.H2, org.telegram.messenger.i0.L(6.0f), (i10 - w7Var.f21615s0) - org.telegram.messenger.i0.L(f11)) - g1Var.getTop()));
                w7Var.f32103k1.setTranslationY(Math.max(0.0f, c3.i0.z(1.0f, w7Var.H2, org.telegram.messenger.i0.L(6.0f), (i10 - w7Var.f21615s0) - org.telegram.messenger.i0.L(f11)) - g1Var.getTop()));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        w7 w7Var = this.e;
        w7.I0(w7Var);
        w7Var.Z0();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int L;
        int paddingBottom;
        int i14;
        w7 w7Var = this.e;
        e7 e7Var = w7Var.f32122u1;
        e7 e7Var2 = w7Var.Y1;
        j7 j7Var = w7Var.f32110o1;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        if (size != this.f28398c || size2 != this.d) {
            if (e7Var2.getTag() != null) {
                w7Var.W0(false, false);
            }
            this.d = size2;
            this.f28398c = size;
        }
        this.f28397b = true;
        if (!w7Var.f32106m1 && !w7Var.d) {
            i12 = 0;
        } else {
            i12 = 4;
        }
        e7Var.setVisibility(i12);
        w7Var.l1.setVisibility(e7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) j7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m;
        ((FrameLayout.LayoutParams) w7Var.f32103k1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m;
        ((FrameLayout.LayoutParams) e7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i15 = 52;
        if (!w7Var.O0() && !w7Var.f32113p2) {
            i13 = 52;
        } else {
            i13 = 0;
        }
        int L2 = org.telegram.messenger.i0.L(179 + i13);
        if (w7Var.f32109n2.size() > 1) {
            L2 += (org.telegram.messenger.i0.L(56.0f) * w7Var.f32109n2.size()) + w7Var.f21615s0;
        }
        if (!w7Var.f32108n1 && !w7Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.i0.L(8.0f) + (paddingTop - L2);
            if (!w7Var.O0() && !w7Var.f32113p2) {
                i14 = 52;
            } else {
                i14 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.i0.L(i14 + 329)) {
                if (w7Var.O0() || w7Var.f32113p2) {
                    i15 = 0;
                }
                L = paddingTop - org.telegram.messenger.i0.L(i15 + 329);
            }
            if (L < 0) {
                L = 0;
            }
        } else {
            L = org.telegram.messenger.i0.L(8.0f);
        }
        if (w7Var.f32105l2) {
            L = 0;
        }
        if (j7Var.getPaddingTop() != L) {
            if (w7Var.f32108n1 && w7Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = j7Var.getPaddingBottom();
            }
            j7Var.setPadding(0, L, 0, paddingBottom);
        }
        this.f28397b = false;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
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
        if (this.f28397b) {
            return;
        }
        super.requestLayout();
    }
}
