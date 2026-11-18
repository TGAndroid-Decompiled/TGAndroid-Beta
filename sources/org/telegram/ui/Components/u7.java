package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class u7 extends FrameLayout {
    public final RectF f40233a;
    public boolean f40234b;
    public int f40235c;
    public int d;
    public final g8 f40236e;

    public u7(g8 g8Var, Context context) {
        super(context);
        this.f40236e = g8Var;
        this.f40233a = new RectF();
        this.f40234b = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new bi.e1(this, 6));
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
        g8 g8Var = this.f40236e;
        r7 r7Var = g8Var.f35408s1;
        v7 v7Var = g8Var.n1;
        boolean z10 = g8Var.f35401o2;
        if (g8Var.f35407r2.size() <= 1) {
            g8Var.f30225s0.setBounds(0, (getMeasuredHeight() - g8Var.f35420y1.getMeasuredHeight()) - g8Var.f30226t0, getMeasuredWidth(), getMeasuredHeight());
            g8Var.f30225s0.draw(canvas);
            if (z10) {
                v7Var.setVisibility(8);
            }
        } else if (r7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(13.0f);
            int translationY = (int) (r7Var.getTranslationY() + ((g8Var.f35413u2 - g8Var.f30226t0) - L));
            if (z10) {
                translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
            }
            int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
            int i7 = g8Var.f30226t0;
            int i10 = L3 + i7;
            if (!z10 && i7 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - g8Var.f30226t0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i10 += currentActionBarHeight;
                f11 = 1.0f - f10;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.f24115m);
            int i12 = translationY + i11;
            int i13 = L2 + i11;
            g8Var.f30225s0.setBounds(0, i12, getMeasuredWidth(), i10);
            g8Var.f30225s0.draw(canvas);
            RectF rectF = this.f40233a;
            if (!z10 && f11 != 1.0f) {
                f12 = 20.0f;
                org.telegram.ui.ActionBar.n6.f29687t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, g8Var.J0));
                f13 = 4.0f;
                rectF.set(g8Var.f30227u0, g8Var.f30226t0 + i12, getMeasuredWidth() - g8Var.f30227u0, org.telegram.messenger.g0.L(24.0f) + g8Var.f30226t0 + i12);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.n6.f29687t0);
            } else {
                f12 = 20.0f;
                f13 = 4.0f;
            }
            if (!z10 && f11 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, g8Var.J0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.n6.f29687t0.setColor(w02);
                org.telegram.ui.ActionBar.n6.f29687t0.setAlpha((int) (alpha * 1.0f * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29687t0);
            }
            if (z10) {
                v7Var.setVisibility(0);
                int i14 = (i12 - org.telegram.messenger.g0.f24115m) - g8Var.f30226t0;
                float max = Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, g8Var.L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + i14) - v7Var.getTop());
                v7Var.setTranslationY(max);
                g8Var.f35400o1.setTranslationY(max);
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
        g8 g8Var = this.f40236e;
        g8.J0(g8Var);
        g8Var.a1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int L;
        int paddingBottom;
        int i13;
        g8 g8Var = this.f40236e;
        m7 m7Var = g8Var.f35420y1;
        m7 m7Var2 = g8Var.f35388c2;
        r7 r7Var = g8Var.f35408s1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.f40235c || size2 != this.d) {
            if (m7Var2.getTag() != null) {
                g8Var.X0(false, false);
            }
            this.d = size2;
            this.f40235c = size;
        }
        this.f40234b = true;
        if (!g8Var.f35404q1 && !g8Var.d) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        m7Var.setVisibility(i11);
        g8Var.f35402p1.setVisibility(m7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) r7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24115m;
        ((FrameLayout.LayoutParams) g8Var.f35400o1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24115m;
        ((FrameLayout.LayoutParams) m7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i14 = 52;
        if (!g8Var.P0() && !g8Var.f35411t2) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(179 + i12);
        if (g8Var.f35407r2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * g8Var.f35407r2.size()) + g8Var.f30226t0;
        }
        if (!g8Var.f35406r1 && !g8Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (!g8Var.P0() && !g8Var.f35411t2) {
                i13 = 52;
            } else {
                i13 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.g0.L(i13 + 329)) {
                if (g8Var.P0() || g8Var.f35411t2) {
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
        if (g8Var.f35403p2) {
            L = 0;
        }
        if (r7Var.getPaddingTop() != L) {
            if (g8Var.f35406r1 && g8Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = r7Var.getPaddingBottom();
            }
            r7Var.setPadding(0, L, 0, paddingBottom);
        }
        this.f40234b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40236e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f40234b) {
            return;
        }
        super.requestLayout();
    }
}
