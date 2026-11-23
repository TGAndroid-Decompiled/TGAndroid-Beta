package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class u7 extends FrameLayout {
    public final RectF f40263a;
    public boolean f40264b;
    public int f40265c;
    public int d;
    public final f8 f40266e;

    public u7(f8 f8Var, Context context) {
        super(context);
        this.f40266e = f8Var;
        this.f40263a = new RectF();
        this.f40264b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new bi.i1(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        f8 f8Var = this.f40266e;
        r7 r7Var = f8Var.f35108s1;
        v7 v7Var = f8Var.n1;
        boolean z10 = f8Var.f35101o2;
        if (f8Var.f35107r2.size() <= 1) {
            f8Var.f30175s0.setBounds(0, (getMeasuredHeight() - f8Var.f35120y1.getMeasuredHeight()) - f8Var.f30176t0, getMeasuredWidth(), getMeasuredHeight());
            f8Var.f30175s0.draw(canvas);
            if (z10) {
                v7Var.setVisibility(8);
            }
        } else if (r7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(13.0f);
            int translationY = (int) (r7Var.getTranslationY() + ((f8Var.f35113u2 - f8Var.f30176t0) - L));
            if (z10) {
                translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
            }
            int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
            int i7 = f8Var.f30176t0;
            int i10 = L3 + i7;
            if (!z10 && i7 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - f8Var.f30176t0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i10 += currentActionBarHeight;
                f11 = 1.0f - f10;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.f24004m);
            int i12 = translationY + i11;
            int i13 = L2 + i11;
            f8Var.f30175s0.setBounds(0, i12, getMeasuredWidth(), i10);
            f8Var.f30175s0.draw(canvas);
            RectF rectF = this.f40263a;
            if (!z10 && f11 != 1.0f) {
                f12 = 20.0f;
                org.telegram.ui.ActionBar.m6.f29638t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, f8Var.J0));
                f13 = 4.0f;
                rectF.set(f8Var.f30177u0, f8Var.f30176t0 + i12, getMeasuredWidth() - f8Var.f30177u0, org.telegram.messenger.g0.L(24.0f) + f8Var.f30176t0 + i12);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.m6.f29638t0);
            } else {
                f12 = 20.0f;
                f13 = 4.0f;
            }
            if (!z10 && f11 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, f8Var.J0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.m6.f29638t0.setColor(w02);
                org.telegram.ui.ActionBar.m6.f29638t0.setAlpha((int) (alpha * 1.0f * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f29638t0);
            }
            if (z10) {
                v7Var.setVisibility(0);
                int i14 = (i12 - org.telegram.messenger.g0.f24004m) - f8Var.f30176t0;
                float max = Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, f8Var.L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + i14) - v7Var.getTop());
                v7Var.setTranslationY(max);
                f8Var.f35100o1.setTranslationY(max);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        f8 f8Var = this.f40266e;
        f8.J0(f8Var);
        f8Var.a1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int L;
        int paddingBottom;
        int i13;
        f8 f8Var = this.f40266e;
        m7 m7Var = f8Var.f35120y1;
        m7 m7Var2 = f8Var.f35088c2;
        r7 r7Var = f8Var.f35108s1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.f40265c || size2 != this.d) {
            if (m7Var2.getTag() != null) {
                f8Var.X0(false, false);
            }
            this.d = size2;
            this.f40265c = size;
        }
        this.f40264b = true;
        if (!f8Var.f35104q1 && !f8Var.d) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        m7Var.setVisibility(i11);
        f8Var.f35102p1.setVisibility(m7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) r7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m;
        ((FrameLayout.LayoutParams) f8Var.f35100o1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m;
        ((FrameLayout.LayoutParams) m7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i14 = 52;
        if (!f8Var.P0() && !f8Var.f35111t2) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(179 + i12);
        if (f8Var.f35107r2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * f8Var.f35107r2.size()) + f8Var.f30176t0;
        }
        if (!f8Var.f35106r1 && !f8Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (!f8Var.P0() && !f8Var.f35111t2) {
                i13 = 52;
            } else {
                i13 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.g0.L(i13 + 329)) {
                if (f8Var.P0() || f8Var.f35111t2) {
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
        if (f8Var.f35103p2) {
            L = 0;
        }
        if (r7Var.getPaddingTop() != L) {
            if (f8Var.f35106r1 && f8Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = r7Var.getPaddingBottom();
            }
            r7Var.setPadding(0, L, 0, paddingBottom);
        }
        this.f40264b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40266e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f40264b) {
            return;
        }
        super.requestLayout();
    }
}
