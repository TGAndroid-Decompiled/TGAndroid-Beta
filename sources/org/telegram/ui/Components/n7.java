package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class n7 extends FrameLayout {
    public final RectF f37467a;
    public boolean f37468b;
    public int f37469c;
    public int d;
    public final y7 f37470e;

    public n7(y7 y7Var, Context context) {
        super(context);
        this.f37470e = y7Var;
        this.f37467a = new RectF();
        this.f37468b = false;
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
        y7 y7Var = this.f37470e;
        k7 k7Var = y7Var.f41908s1;
        o7 o7Var = y7Var.n1;
        boolean z10 = y7Var.f41901o2;
        if (y7Var.f41907r2.size() <= 1) {
            y7Var.f29715s0.setBounds(0, (getMeasuredHeight() - y7Var.f41920y1.getMeasuredHeight()) - y7Var.f29716t0, getMeasuredWidth(), getMeasuredHeight());
            y7Var.f29715s0.draw(canvas);
            if (z10) {
                o7Var.setVisibility(8);
            }
        } else if (k7Var.getVisibility() == 0) {
            int L = org.telegram.messenger.g0.L(13.0f);
            int translationY = (int) (k7Var.getTranslationY() + ((y7Var.f41913u2 - y7Var.f29716t0) - L));
            if (z10) {
                translationY = (translationY - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(10.0f);
            }
            int L2 = org.telegram.messenger.g0.L(20.0f) + translationY;
            int L3 = org.telegram.messenger.g0.L(15.0f) + getMeasuredHeight();
            int i7 = y7Var.f29716t0;
            int i10 = L3 + i7;
            if (!z10 && i7 + translationY < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                float L4 = org.telegram.messenger.g0.L(4.0f) + L;
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - translationY) - y7Var.f29716t0) / L4);
                int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L4) * f10);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i10 += currentActionBarHeight;
                f11 = 1.0f - f10;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            int i11 = (int) ((1.0f - f10) * org.telegram.messenger.g0.f23605m);
            int i12 = translationY + i11;
            int i13 = L2 + i11;
            y7Var.f29715s0.setBounds(0, i12, getMeasuredWidth(), i10);
            y7Var.f29715s0.draw(canvas);
            RectF rectF = this.f37467a;
            if (!z10 && f11 != 1.0f) {
                f12 = 20.0f;
                org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, y7Var.J0));
                f13 = 4.0f;
                rectF.set(y7Var.f29717u0, y7Var.f29716t0 + i12, getMeasuredWidth() - y7Var.f29717u0, org.telegram.messenger.g0.L(24.0f) + y7Var.f29716t0 + i12);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.messenger.g0.L(12.0f) * f11, org.telegram.ui.ActionBar.j6.f29140t0);
            } else {
                f12 = 20.0f;
                f13 = 4.0f;
            }
            if (!z10 && f11 != 0.0f) {
                int L5 = org.telegram.messenger.g0.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i13, (getMeasuredWidth() + L5) / 2, org.telegram.messenger.g0.L(f13) + i13);
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, y7Var.J0);
                int alpha = Color.alpha(w02);
                org.telegram.ui.ActionBar.j6.f29140t0.setColor(w02);
                org.telegram.ui.ActionBar.j6.f29140t0.setAlpha((int) (alpha * 1.0f * f11));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.f29140t0);
            }
            if (z10) {
                o7Var.setVisibility(0);
                int i14 = (i12 - org.telegram.messenger.g0.f23605m) - y7Var.f29716t0;
                float max = Math.max(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, y7Var.L2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(f12) + i14) - o7Var.getTop());
                o7Var.setTranslationY(max);
                y7Var.f41900o1.setTranslationY(max);
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        y7 y7Var = this.f37470e;
        y7.I0(y7Var);
        y7Var.Z0();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int L;
        int paddingBottom;
        int i13;
        y7 y7Var = this.f37470e;
        f7 f7Var = y7Var.f41920y1;
        f7 f7Var2 = y7Var.f41888c2;
        k7 k7Var = y7Var.f41908s1;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        if (size != this.f37469c || size2 != this.d) {
            if (f7Var2.getTag() != null) {
                y7Var.W0(false, false);
            }
            this.d = size2;
            this.f37469c = size;
        }
        this.f37468b = true;
        if (!y7Var.f41904q1 && !y7Var.d) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        f7Var.setVisibility(i11);
        y7Var.f41902p1.setVisibility(f7Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) k7Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m;
        ((FrameLayout.LayoutParams) y7Var.f41900o1.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m;
        ((FrameLayout.LayoutParams) f7Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int i14 = 52;
        if (!y7Var.O0() && !y7Var.f41911t2) {
            i12 = 52;
        } else {
            i12 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(179 + i12);
        if (y7Var.f41907r2.size() > 1) {
            L2 += (org.telegram.messenger.g0.L(56.0f) * y7Var.f41907r2.size()) + y7Var.f29716t0;
        }
        if (!y7Var.f41906r1 && !y7Var.d) {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = org.telegram.messenger.g0.L(8.0f) + (paddingTop - L2);
            if (!y7Var.O0() && !y7Var.f41911t2) {
                i13 = 52;
            } else {
                i13 = 0;
            }
            if (L > paddingTop - org.telegram.messenger.g0.L(i13 + 329)) {
                if (y7Var.O0() || y7Var.f41911t2) {
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
        if (y7Var.f41903p2) {
            L = 0;
        }
        if (k7Var.getPaddingTop() != L) {
            if (y7Var.f41906r1 && y7Var.d) {
                paddingBottom = 0;
            } else {
                paddingBottom = k7Var.getPaddingBottom();
            }
            k7Var.setPadding(0, L, 0, paddingBottom);
        }
        this.f37468b = false;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        getMeasuredHeight();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37470e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37468b) {
            return;
        }
        super.requestLayout();
    }
}
