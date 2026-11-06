package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class f90 extends pj0 {
    public boolean f33542e3;
    public boolean f33543f3;
    public int f33544g3;
    public int f33545h3;
    public final g90 f33546i3;

    public f90(g90 g90Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f33546i3 = g90Var;
        setOnScrollListener(new ui(this, 9));
        i(new e90(this));
    }

    @Override
    public final void l0(int i7) {
        g90 g90Var = this.f33546i3;
        g90Var.invalidate();
        g90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        g90 g90Var = this.f33546i3;
        jg.i1 i1Var = g90Var.f33915f;
        jg.o1 o1Var = g90Var.f33914e;
        if (!g90Var.f33913c.f56901t ? this.f33543f3 || o1Var == null || o1Var.f16874e == null || !o1Var.f16875f || motionEvent.getY() >= o1Var.f16874e.getBottom() : this.f33543f3 || o1Var == null || o1Var.f16874e == null || !o1Var.f16875f || motionEvent.getY() <= o1Var.f16874e.getTop()) {
            if (!this.f33542e3 && org.telegram.ui.ks.p().q(motionEvent, g90Var.f33912b, null, this.f37060n2)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (((i1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && i1Var.N()) {
                if (i1Var.f16787n0 == null) {
                    jg.e1 e1Var = new jg.e1(i1Var, i1Var.f16778f, i1Var.f16786n, i1Var.f16791r, 0);
                    i1Var.f16787n0 = e1Var;
                    e1Var.a();
                }
                i1Var.f16787n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z9) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int N0;
        int i13;
        int i14;
        int i15 = i11 - i7;
        int i16 = i12 - i10;
        g90 g90Var = this.f33546i3;
        boolean g10 = g90Var.g();
        v4.b0 currentLayoutManager = g90Var.getCurrentLayoutManager();
        if (g10) {
            N0 = currentLayoutManager.L0();
        } else {
            N0 = currentLayoutManager.N0();
        }
        View m10 = currentLayoutManager.m(N0);
        if (m10 != null) {
            int top = m10.getTop();
            if (g10) {
                i14 = 0;
            } else {
                i14 = this.f33545h3 - i16;
            }
            i13 = top - i14;
        } else {
            i13 = 0;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        if (g90Var.H) {
            g90Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            g90Var.G = false;
            g90Var.H = false;
        } else if (N0 != -1 && i15 == this.f33544g3 && i16 - this.f33545h3 != 0) {
            g90Var.G = true;
            currentLayoutManager.i1(N0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            g90Var.G = false;
        }
        this.f33545h3 = i16;
        this.f33544g3 = i15;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        g90 g90Var = this.f33546i3;
        jg.o1 o1Var = g90Var.f33914e;
        if (o1Var != null) {
            o1Var.d = Integer.valueOf(size);
            bi.ec ecVar = o1Var.f16874e;
            if (ecVar != null) {
                ecVar.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f22537q.y * 0.22f);
        g90Var.f33919w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g90 g90Var = this.f33546i3;
        jg.o1 o1Var = g90Var.f33914e;
        if (g90Var.f33913c.f56901t) {
            if (!this.f33543f3 && o1Var != null && o1Var.f16874e != null && o1Var.f16875f && motionEvent.getY() > o1Var.f16874e.getTop()) {
                return false;
            }
        } else if (!this.f33543f3 && o1Var != null && o1Var.f16874e != null && o1Var.f16875f && motionEvent.getY() < o1Var.f16874e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f33546i3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        g90 g90Var = this.f33546i3;
        g90Var.invalidate();
        g90Var.b();
    }
}
