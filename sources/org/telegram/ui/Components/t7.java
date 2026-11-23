package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class t7 extends FrameLayout {
    public final RectF f39836a;
    public boolean f39837b;
    public int f39838c;
    public int d;
    public final e8 f39839e;

    public t7(e8 e8Var, Context context) {
        super(context);
        this.f39839e = e8Var;
        this.f39836a = new RectF();
        this.f39837b = false;
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
        e8 e8Var = this.f39839e;
        q7 q7Var = e8Var.f34614s1;
        u7 u7Var = e8Var.n1;
        boolean z10 = e8Var.f34607o2;
        if (e8Var.f34613r2.size() <= 1) {
            e8Var.f30259s0.setBounds(0, (getMeasuredHeight() - e8Var.f34626y1.getMeasuredHeight()) - e8Var.f30260t0, getMeasuredWidth(), getMeasuredHeight());
            e8Var.f30259s0.draw(canvas);
            if (z10) {
                u7Var.setVisibility(8);
            }
        } else if (q7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(13.0f);
            int translationY = (int) (q7Var.getTranslationY() + ((e8Var.f34619u2 - e8Var.f30260t0) - L));
            if (z10) {
                translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
            }
            int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
            int i7 = e8Var.f30260t0;
            int i10 = L3 + i7;
            if (!z10 && i7 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - e8Var.f30260t0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i10 += currentActionBarHeight;
                f11 = 1.0f - f10;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.f24220m);
            int i12 = translationY + i11;
            int i13 = L2 + i11;
            e8Var.f30259s0.setBounds(0, i12, getMeasuredWidth(), i10);
            e8Var.f30259s0.draw(canvas);
            RectF rectF = this.f39836a;
            if (!z10 && f11 != 1.0f) {
                f12 = 20.0f;
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, e8Var.J0));
                f13 = 4.0f;
                rectF.set(e8Var.f30261u0, e8Var.f30260t0 + i12, getMeasuredWidth() - e8Var.f30261u0, org.telegram.messenger.g0.L(24.0f) + e8Var.f30260t0 + i12);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.n6.f29742t0);
            } else {
                f12 = 20.0f;
                f13 = 4.0f;
            }
            if (!z10 && f11 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, e8Var.J0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.n6.f29742t0.setColor(w02);
                org.telegram.ui.ActionBar.n6.f29742t0.setAlpha((int) (alpha * 1.0f * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
            }
            if (z10) {
                u7Var.setVisibility(0);
                int i14 = (i12 - org.telegram.messenger.g0.f24220m) - e8Var.f30260t0;
                float max = Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, e8Var.L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + i14) - u7Var.getTop());
                u7Var.setTranslationY(max);
                e8Var.f34606o1.setTranslationY(max);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        e8 e8Var = this.f39839e;
        e8.J0(e8Var);
        e8Var.a1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int L;
        int paddingBottom;
        int i13;
        e8 e8Var = this.f39839e;
        l7 l7Var = e8Var.f34626y1;
        l7 l7Var2 = e8Var.f34594c2;
        q7 q7Var = e8Var.f34614s1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.f39838c || size2 != this.d) {
            if (l7Var2.getTag() != null) {
                e8Var.X0(false, false);
            }
            this.d = size2;
            this.f39838c = size;
        }
        this.f39837b = true;
        if (!e8Var.f34610q1 && !e8Var.d) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        l7Var.setVisibility(i11);
        e8Var.f34608p1.setVisibility(l7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) q7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m;
        ((FrameLayout.LayoutParams) e8Var.f34606o1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m;
        ((FrameLayout.LayoutParams) l7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i14 = 52;
        if (!e8Var.P0() && !e8Var.f34617t2) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(179 + i12);
        if (e8Var.f34613r2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * e8Var.f34613r2.size()) + e8Var.f30260t0;
        }
        if (!e8Var.f34612r1 && !e8Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (!e8Var.P0() && !e8Var.f34617t2) {
                i13 = 52;
            } else {
                i13 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.g0.L(i13 + 329)) {
                if (e8Var.P0() || e8Var.f34617t2) {
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
        if (e8Var.f34609p2) {
            L = 0;
        }
        if (q7Var.getPaddingTop() != L) {
            if (e8Var.f34612r1 && e8Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = q7Var.getPaddingBottom();
            }
            q7Var.setPadding(0, L, 0, paddingBottom);
        }
        this.f39837b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f39839e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f39837b) {
            return;
        }
        super.requestLayout();
    }
}
