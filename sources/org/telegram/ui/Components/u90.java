package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class u90 extends ek0 {
    public boolean f40301f3;
    public boolean f40302g3;
    public int f40303h3;
    public int f40304i3;
    public final v90 j3;

    public u90(v90 v90Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.j3 = v90Var;
        setOnScrollListener(new oa(this, 12));
        i(new t90(this));
    }

    @Override
    public final void l0(int i7) {
        v90 v90Var = this.j3;
        v90Var.invalidate();
        v90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        v90 v90Var = this.j3;
        jg.h1 h1Var = v90Var.f40747f;
        jg.n1 n1Var = v90Var.f40746e;
        if (!v90Var.f40745c.f59122t ? this.f40302g3 || n1Var == null || n1Var.f17626e == null || !n1Var.f17627f || motionEvent.getY() >= n1Var.f17626e.getBottom() : this.f40302g3 || n1Var == null || n1Var.f17626e == null || !n1Var.f17627f || motionEvent.getY() <= n1Var.f17626e.getTop()) {
            if (!this.f40301f3 && org.telegram.ui.ns.p().q(motionEvent, v90Var.f40744b, null, this.f34873o2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((h1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && h1Var.N()) {
                if (h1Var.f17545o0 == null) {
                    jg.d1 d1Var = new jg.d1(h1Var, h1Var.f17535f, h1Var.f17543n, h1Var.f17548r, 0);
                    h1Var.f17545o0 = d1Var;
                    d1Var.a();
                }
                h1Var.f17545o0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int N0;
        int i13;
        int i14;
        int i15 = i11 - i7;
        int i16 = i12 - i10;
        v90 v90Var = this.j3;
        boolean g10 = v90Var.g();
        v4.c0 currentLayoutManager = v90Var.getCurrentLayoutManager();
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
                i14 = this.f40304i3 - i16;
            }
            i13 = top - i14;
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        if (v90Var.I) {
            v90Var.H = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            v90Var.H = false;
            v90Var.I = false;
        } else if (N0 != -1 && i15 == this.f40303h3 && i16 - this.f40304i3 != 0) {
            v90Var.H = true;
            currentLayoutManager.i1(N0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            v90Var.H = false;
        }
        this.f40304i3 = i16;
        this.f40303h3 = i15;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        v90 v90Var = this.j3;
        jg.n1 n1Var = v90Var.f40746e;
        if (n1Var != null) {
            n1Var.d = Integer.valueOf(size);
            bi.m3 m3Var = n1Var.f17626e;
            if (m3Var != null) {
                m3Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f24046q.y * 0.22f);
        v90Var.f40751w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v90 v90Var = this.j3;
        jg.n1 n1Var = v90Var.f40746e;
        if (v90Var.f40745c.f59122t) {
            if (!this.f40302g3 && n1Var != null && n1Var.f17626e != null && n1Var.f17627f && motionEvent.getY() > n1Var.f17626e.getTop()) {
                return false;
            }
        } else if (!this.f40302g3 && n1Var != null && n1Var.f17626e != null && n1Var.f17627f && motionEvent.getY() < n1Var.f17626e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.j3.H) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        v90 v90Var = this.j3;
        v90Var.invalidate();
        v90Var.b();
    }
}
