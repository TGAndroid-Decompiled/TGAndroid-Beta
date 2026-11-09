package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class q7 extends FrameLayout {
    public final RectF f37207a;
    public boolean f37208b;
    public int f37209c;
    public int d;
    public final b8 f37210e;

    public q7(b8 b8Var, Context context) {
        super(context);
        this.f37210e = b8Var;
        this.f37207a = new RectF();
        this.f37208b = false;
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
        b8 b8Var = this.f37210e;
        n7 n7Var = b8Var.f32142o1;
        r7 r7Var = b8Var.f32134j1;
        boolean z9 = b8Var.f32137k2;
        if (b8Var.f32141n2.size() <= 1) {
            b8Var.f28651r0.setBounds(0, (getMeasuredHeight() - b8Var.f32154u1.getMeasuredHeight()) - b8Var.f28653s0, getMeasuredWidth(), getMeasuredHeight());
            b8Var.f28651r0.draw(canvas);
            if (z9) {
                r7Var.setVisibility(8);
            }
        } else if (n7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(13.0f);
            int translationY = (int) (n7Var.getTranslationY() + ((b8Var.f32147q2 - b8Var.f28653s0) - L));
            if (z9) {
                translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
            }
            int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
            int i7 = b8Var.f28653s0;
            int i10 = L3 + i7;
            if (!z9 && i7 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - b8Var.f28653s0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i10 += currentActionBarHeight;
                f11 = 1.0f - f10;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.f22557m);
            int i12 = translationY + i11;
            int i13 = L2 + i11;
            b8Var.f28651r0.setBounds(0, i12, getMeasuredWidth(), i10);
            b8Var.f28651r0.draw(canvas);
            RectF rectF = this.f37207a;
            if (!z9 && f11 != 1.0f) {
                f12 = 20.0f;
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, b8Var.I0));
                f13 = 4.0f;
                rectF.set(b8Var.f28654t0, b8Var.f28653s0 + i12, getMeasuredWidth() - b8Var.f28654t0, org.telegram.messenger.g0.L(24.0f) + b8Var.f28653s0 + i12);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.l6.f28156t0);
            } else {
                f12 = 20.0f;
                f13 = 4.0f;
            }
            if (!z9 && f11 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, b8Var.I0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.l6.f28156t0.setColor(w02);
                org.telegram.ui.ActionBar.l6.f28156t0.setAlpha((int) (alpha * 1.0f * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.f28156t0);
            }
            if (z9) {
                r7Var.setVisibility(0);
                int i14 = (i12 - org.telegram.messenger.g0.f22557m) - b8Var.f28653s0;
                float max = Math.max(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, b8Var.H2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + i14) - r7Var.getTop());
                r7Var.setTranslationY(max);
                b8Var.f32136k1.setTranslationY(max);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b8 b8Var = this.f37210e;
        b8.I0(b8Var);
        b8Var.Z0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int L;
        int paddingBottom;
        int i13;
        b8 b8Var = this.f37210e;
        i7 i7Var = b8Var.f32154u1;
        i7 i7Var2 = b8Var.Y1;
        n7 n7Var = b8Var.f32142o1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.f37209c || size2 != this.d) {
            if (i7Var2.getTag() != null) {
                b8Var.W0(false, false);
            }
            this.d = size2;
            this.f37209c = size;
        }
        this.f37208b = true;
        if (!b8Var.f32139m1 && !b8Var.d) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        i7Var.setVisibility(i11);
        b8Var.l1.setVisibility(i7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) n7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m;
        ((FrameLayout.LayoutParams) b8Var.f32136k1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m;
        ((FrameLayout.LayoutParams) i7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i14 = 52;
        if (!b8Var.O0() && !b8Var.f32145p2) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(179 + i12);
        if (b8Var.f32141n2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * b8Var.f32141n2.size()) + b8Var.f28653s0;
        }
        if (!b8Var.n1 && !b8Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (!b8Var.O0() && !b8Var.f32145p2) {
                i13 = 52;
            } else {
                i13 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.g0.L(i13 + 329)) {
                if (b8Var.O0() || b8Var.f32145p2) {
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
        if (b8Var.f32138l2) {
            L = 0;
        }
        if (n7Var.getPaddingTop() != L) {
            if (b8Var.n1 && b8Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = n7Var.getPaddingBottom();
            }
            n7Var.setPadding(0, L, 0, paddingBottom);
        }
        this.f37208b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37210e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37208b) {
            return;
        }
        super.requestLayout();
    }
}
