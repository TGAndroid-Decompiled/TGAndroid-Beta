package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class o7 extends FrameLayout {
    public final RectF f36771a;
    public boolean f36772b;
    public int f36773c;
    public int d;
    public final z7 f36774e;

    public o7(z7 z7Var, Context context) {
        super(context);
        this.f36774e = z7Var;
        this.f36771a = new RectF();
        this.f36772b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new ai.h1(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        int i3;
        float f12;
        float f13;
        z7 z7Var = this.f36774e;
        l7 l7Var = z7Var.f40958p1;
        p7 p7Var = z7Var.k1;
        boolean z10 = z7Var.f40952l2;
        if (z7Var.f40957o2.size() <= 1) {
            z7Var.f28616s0.setBounds(0, (getMeasuredHeight() - z7Var.f40970v1.getMeasuredHeight()) - z7Var.f28617t0, getMeasuredWidth(), getMeasuredHeight());
            z7Var.f28616s0.draw(canvas);
            if (z10) {
                p7Var.setVisibility(8);
            }
        } else if (l7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(13.0f);
            int translationY = (int) (l7Var.getTranslationY() + ((z7Var.f40963r2 - z7Var.f28617t0) - L));
            if (z10) {
                translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
            }
            int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
            int i10 = z7Var.f28617t0;
            int i11 = L3 + i10;
            if (!z10 && i10 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - z7Var.f28617t0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i11 += currentActionBarHeight;
                f11 = 1.0f - f10;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            int i12 = (int) ((1.0f - f10) * org.telegram.messenger.g0.f22602m);
            int i13 = L2 + i12;
            z7Var.f28616s0.setBounds(0, translationY + i12, getMeasuredWidth(), i11);
            z7Var.f28616s0.draw(canvas);
            RectF rectF = this.f36771a;
            if (!z10 && f11 != 1.0f) {
                f12 = 10.0f;
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, z7Var.J0));
                f13 = 4.0f;
                rectF.set(z7Var.f28618u0, z7Var.f28617t0 + i3, getMeasuredWidth() - z7Var.f28618u0, org.telegram.messenger.g0.L(24.0f) + z7Var.f28617t0 + i3);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.k6.f28171t0);
            } else {
                f12 = 10.0f;
                f13 = 4.0f;
            }
            if (!z10 && f11 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, z7Var.J0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.k6.f28171t0.setColor(w02);
                org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) (alpha * 1.0f * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
            }
            if (z10) {
                p7Var.setVisibility(0);
                p7Var.setTranslationY(Math.max(0.0f, com.google.android.recaptcha.internal.a.y(1.0f, z7Var.I2, org.telegram.messenger.g0.L(6.0f), (i3 - z7Var.f28617t0) - org.telegram.messenger.g0.L(f12)) - p7Var.getTop()));
                z7Var.f40951l1.setTranslationY(Math.max(0.0f, com.google.android.recaptcha.internal.a.y(1.0f, z7Var.I2, org.telegram.messenger.g0.L(6.0f), (i3 - z7Var.f28617t0) - org.telegram.messenger.g0.L(f12)) - p7Var.getTop()));
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        z7 z7Var = this.f36774e;
        z7.I0(z7Var);
        z7Var.Z0();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int L;
        int paddingBottom;
        int i13;
        z7 z7Var = this.f36774e;
        g7 g7Var = z7Var.f40970v1;
        g7 g7Var2 = z7Var.Z1;
        l7 l7Var = z7Var.f40958p1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i3);
        if (size != this.f36773c || size2 != this.d) {
            if (g7Var2.getTag() != null) {
                z7Var.W0(false, false);
            }
            this.d = size2;
            this.f36773c = size;
        }
        this.f36772b = true;
        if (!z7Var.f40954n1 && !z7Var.d) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        g7Var.setVisibility(i11);
        z7Var.m1.setVisibility(g7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) l7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
        ((FrameLayout.LayoutParams) z7Var.f40951l1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
        ((FrameLayout.LayoutParams) g7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i14 = 52;
        if (!z7Var.O0() && !z7Var.f40961q2) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(179 + i12);
        if (z7Var.f40957o2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * z7Var.f40957o2.size()) + z7Var.f28617t0;
        }
        if (!z7Var.f40956o1 && !z7Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (!z7Var.O0() && !z7Var.f40961q2) {
                i13 = 52;
            } else {
                i13 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.g0.L(i13 + 329)) {
                if (z7Var.O0() || z7Var.f40961q2) {
                    i14 = 0;
                }
                L = paddingTop - org.telegram.messenger.g0.L(i14 + 329);
            }
            if (L < 0) {
                L = 0;
            }
        } else {
            L = org.telegram.messenger.g0.L(8.0f);
        }
        if (z7Var.f40953m2) {
            L = 0;
        }
        if (l7Var.getPaddingTop() != L) {
            if (z7Var.f40956o1 && z7Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = l7Var.getPaddingBottom();
            }
            l7Var.setPadding(0, L, 0, paddingBottom);
        }
        this.f36772b = false;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f36774e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f36772b) {
            return;
        }
        super.requestLayout();
    }
}
