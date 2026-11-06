package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class q7 extends FrameLayout {
    public final RectF f37174a;
    public boolean f37175b;
    public int f37176c;
    public int d;
    public final b8 f37177e;

    public q7(b8 b8Var, Context context) {
        super(context);
        this.f37177e = b8Var;
        this.f37174a = new RectF();
        this.f37175b = false;
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
        int i7;
        float f12;
        float f13;
        b8 b8Var = this.f37177e;
        n7 n7Var = b8Var.f32079o1;
        r7 r7Var = b8Var.f32071j1;
        boolean z9 = b8Var.f32074k2;
        if (b8Var.f32078n2.size() <= 1) {
            b8Var.f28643r0.setBounds(0, (getMeasuredHeight() - b8Var.f32091u1.getMeasuredHeight()) - b8Var.f28645s0, getMeasuredWidth(), getMeasuredHeight());
            b8Var.f28643r0.draw(canvas);
            if (z9) {
                r7Var.setVisibility(8);
            }
        } else if (n7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(13.0f);
            int translationY = (int) (n7Var.getTranslationY() + ((b8Var.f32084q2 - b8Var.f28645s0) - L));
            if (z9) {
                translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
            }
            int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
            int i10 = b8Var.f28645s0;
            int i11 = L3 + i10;
            if (!z9 && i10 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - b8Var.f28645s0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i11 += currentActionBarHeight;
                f11 = 1.0f - f10;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            int i12 = (int) ((1.0f - f10) * org.telegram.messenger.g0.f22538m);
            int i13 = L2 + i12;
            b8Var.f28643r0.setBounds(0, translationY + i12, getMeasuredWidth(), i11);
            b8Var.f28643r0.draw(canvas);
            RectF rectF = this.f37174a;
            if (!z9 && f11 != 1.0f) {
                f12 = 10.0f;
                org.telegram.ui.ActionBar.k6.f28140t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, b8Var.I0));
                f13 = 4.0f;
                rectF.set(b8Var.f28646t0, b8Var.f28645s0 + i7, getMeasuredWidth() - b8Var.f28646t0, org.telegram.messenger.g0.L(24.0f) + b8Var.f28645s0 + i7);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.k6.f28140t0);
            } else {
                f12 = 10.0f;
                f13 = 4.0f;
            }
            if (!z9 && f11 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, b8Var.I0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.k6.f28140t0.setColor(w02);
                org.telegram.ui.ActionBar.k6.f28140t0.setAlpha((int) (alpha * 1.0f * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28140t0);
            }
            if (z9) {
                r7Var.setVisibility(0);
                r7Var.setTranslationY(Math.max(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, b8Var.H2, org.telegram.messenger.g0.L(6.0f), (i7 - b8Var.f28645s0) - org.telegram.messenger.g0.L(f12)) - r7Var.getTop()));
                b8Var.f32073k1.setTranslationY(Math.max(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, b8Var.H2, org.telegram.messenger.g0.L(6.0f), (i7 - b8Var.f28645s0) - org.telegram.messenger.g0.L(f12)) - r7Var.getTop()));
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
        b8 b8Var = this.f37177e;
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
        b8 b8Var = this.f37177e;
        i7 i7Var = b8Var.f32091u1;
        i7 i7Var2 = b8Var.Y1;
        n7 n7Var = b8Var.f32079o1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.f37176c || size2 != this.d) {
            if (i7Var2.getTag() != null) {
                b8Var.W0(false, false);
            }
            this.d = size2;
            this.f37176c = size;
        }
        this.f37175b = true;
        if (!b8Var.f32076m1 && !b8Var.d) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        i7Var.setVisibility(i11);
        b8Var.l1.setVisibility(i7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) n7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22538m;
        ((FrameLayout.LayoutParams) b8Var.f32073k1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22538m;
        ((FrameLayout.LayoutParams) i7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i14 = 52;
        if (!b8Var.O0() && !b8Var.f32082p2) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(179 + i12);
        if (b8Var.f32078n2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * b8Var.f32078n2.size()) + b8Var.f28645s0;
        }
        if (!b8Var.n1 && !b8Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (!b8Var.O0() && !b8Var.f32082p2) {
                i13 = 52;
            } else {
                i13 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.g0.L(i13 + 329)) {
                if (b8Var.O0() || b8Var.f32082p2) {
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
        if (b8Var.f32075l2) {
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
        this.f37175b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37177e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37175b) {
            return;
        }
        super.requestLayout();
    }
}
