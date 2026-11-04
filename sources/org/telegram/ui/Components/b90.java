package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class b90 extends tj0 {
    public boolean f32120f3;
    public boolean f32121g3;
    public int f32122h3;
    public int i3;
    public final c90 f32123j3;

    public b90(c90 c90Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f32123j3 = c90Var;
        setOnScrollListener(new ji(this, 11));
        i(new a90(this));
    }

    @Override
    public final void l0(int i3) {
        c90 c90Var = this.f32123j3;
        c90Var.invalidate();
        c90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        c90 c90Var = this.f32123j3;
        kg.e1 e1Var = c90Var.f32614f;
        kg.k1 k1Var = c90Var.f32613e;
        if (!c90Var.f32612c.f55514t ? this.f32121g3 || k1Var == null || k1Var.f17076e == null || !k1Var.f17077f || motionEvent.getY() >= k1Var.f17076e.getBottom() : this.f32121g3 || k1Var == null || k1Var.f17076e == null || !k1Var.f17077f || motionEvent.getY() <= k1Var.f17076e.getTop()) {
            if (!this.f32120f3 && org.telegram.ui.is.p().q(motionEvent, c90Var.f32611b, null, this.f38460o2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((e1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && e1Var.N()) {
                if (e1Var.f17007o0 == null) {
                    kg.a1 a1Var = new kg.a1(e1Var, e1Var.f16997f, e1Var.f17005n, e1Var.f17010r, 0);
                    e1Var.f17007o0 = a1Var;
                    a1Var.a();
                }
                e1Var.f17007o0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int N0;
        int i13;
        int i14;
        int i15 = i11 - i3;
        int i16 = i12 - i10;
        c90 c90Var = this.f32123j3;
        boolean g7 = c90Var.g();
        u4.b0 currentLayoutManager = c90Var.getCurrentLayoutManager();
        if (g7) {
            N0 = currentLayoutManager.L0();
        } else {
            N0 = currentLayoutManager.N0();
        }
        View m10 = currentLayoutManager.m(N0);
        if (m10 != null) {
            int top = m10.getTop();
            if (g7) {
                i14 = 0;
            } else {
                i14 = this.i3 - i16;
            }
            i13 = top - i14;
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        if (c90Var.I) {
            c90Var.H = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i3, i10, i11, i12);
            c90Var.H = false;
            c90Var.I = false;
        } else if (N0 != -1 && i15 == this.f32122h3 && i16 - this.i3 != 0) {
            c90Var.H = true;
            currentLayoutManager.i1(N0, i13, false);
            super.onLayout(false, i3, i10, i11, i12);
            c90Var.H = false;
        }
        this.i3 = i16;
        this.f32122h3 = i15;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        c90 c90Var = this.f32123j3;
        kg.k1 k1Var = c90Var.f32613e;
        if (k1Var != null) {
            k1Var.d = Integer.valueOf(size);
            ai.x2 x2Var = k1Var.f17076e;
            if (x2Var != null) {
                x2Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f22608q.y * 0.22f);
        c90Var.f32618w = min;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c90 c90Var = this.f32123j3;
        kg.k1 k1Var = c90Var.f32613e;
        if (c90Var.f32612c.f55514t) {
            if (!this.f32121g3 && k1Var != null && k1Var.f17076e != null && k1Var.f17077f && motionEvent.getY() > k1Var.f17076e.getTop()) {
                return false;
            }
        } else if (!this.f32121g3 && k1Var != null && k1Var.f17076e != null && k1Var.f17077f && motionEvent.getY() < k1Var.f17076e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f32123j3.H) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        c90 c90Var = this.f32123j3;
        c90Var.invalidate();
        c90Var.b();
    }
}
