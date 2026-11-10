package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class p7 extends FrameLayout {
    public final RectF f36806a;
    public boolean f36807b;
    public int f36808c;
    public int d;
    public final a8 f36809e;

    public p7(a8 a8Var, Context context) {
        super(context);
        this.f36809e = a8Var;
        this.f36806a = new RectF();
        this.f36807b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new ch.v(this, 5));
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
        float f12;
        float f13;
        a8 a8Var = this.f36809e;
        m7 m7Var = a8Var.f31754r1;
        q7 q7Var = a8Var.f31745m1;
        boolean z9 = a8Var.f31747n2;
        if (a8Var.f31753q2.size() <= 1) {
            a8Var.f28702r0.setBounds(0, (getMeasuredHeight() - a8Var.f31766x1.getMeasuredHeight()) - a8Var.f28704s0, getMeasuredWidth(), getMeasuredHeight());
            a8Var.f28702r0.draw(canvas);
            if (z9) {
                q7Var.setVisibility(8);
            }
        } else if (m7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(13.0f);
            int translationY = (int) (m7Var.getTranslationY() + ((a8Var.f31759t2 - a8Var.f28704s0) - L));
            if (z9) {
                translationY = (translationY - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
            }
            int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
            int i7 = a8Var.f28704s0;
            int i10 = L3 + i7;
            if (!z9 && i7 + translationY < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - translationY) - a8Var.f28704s0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L4) * f10);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i10 += currentActionBarHeight;
                f11 = 1.0f - f10;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.f22561m);
            int i12 = translationY + i11;
            int i13 = L2 + i11;
            a8Var.f28702r0.setBounds(0, i12, getMeasuredWidth(), i10);
            a8Var.f28702r0.draw(canvas);
            RectF rectF = this.f36806a;
            if (!z9 && f11 != 1.0f) {
                f12 = 20.0f;
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, a8Var.I0));
                f13 = 4.0f;
                rectF.set(a8Var.f28705t0, a8Var.f28704s0 + i12, getMeasuredWidth() - a8Var.f28705t0, org.telegram.messenger.g0.L(24.0f) + a8Var.f28704s0 + i12);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.m6.f28181t0);
            } else {
                f12 = 20.0f;
                f13 = 4.0f;
            }
            if (!z9 && f11 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, a8Var.I0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.m6.f28181t0.setColor(w02);
                org.telegram.ui.ActionBar.m6.f28181t0.setAlpha((int) (alpha * 1.0f * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f28181t0);
            }
            if (z9) {
                q7Var.setVisibility(0);
                int i14 = (i12 - org.telegram.messenger.g0.f22561m) - a8Var.f28704s0;
                float max = Math.max(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, a8Var.K2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + i14) - q7Var.getTop());
                q7Var.setTranslationY(max);
                a8Var.n1.setTranslationY(max);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a8 a8Var = this.f36809e;
        a8.I0(a8Var);
        a8Var.Z0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int L;
        int paddingBottom;
        int i13;
        a8 a8Var = this.f36809e;
        h7 h7Var = a8Var.f31766x1;
        h7 h7Var2 = a8Var.f31735b2;
        m7 m7Var = a8Var.f31754r1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.f36808c || size2 != this.d) {
            if (h7Var2.getTag() != null) {
                a8Var.W0(false, false);
            }
            this.d = size2;
            this.f36808c = size;
        }
        this.f36807b = true;
        if (!a8Var.f31750p1 && !a8Var.d) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        h7Var.setVisibility(i11);
        a8Var.f31748o1.setVisibility(h7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) m7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m;
        ((FrameLayout.LayoutParams) a8Var.n1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m;
        ((FrameLayout.LayoutParams) h7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i14 = 52;
        if (!a8Var.O0() && !a8Var.f31757s2) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(179 + i12);
        if (a8Var.f31753q2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * a8Var.f31753q2.size()) + a8Var.f28704s0;
        }
        if (!a8Var.f31752q1 && !a8Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (!a8Var.O0() && !a8Var.f31757s2) {
                i13 = 52;
            } else {
                i13 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.g0.L(i13 + 329)) {
                if (a8Var.O0() || a8Var.f31757s2) {
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
        if (a8Var.f31749o2) {
            L = 0;
        }
        if (m7Var.getPaddingTop() != L) {
            if (a8Var.f31752q1 && a8Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = m7Var.getPaddingBottom();
            }
            m7Var.setPadding(0, L, 0, paddingBottom);
        }
        this.f36807b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f36809e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f36807b) {
            return;
        }
        super.requestLayout();
    }
}
