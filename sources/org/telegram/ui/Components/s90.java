package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class s90 extends ck0 {
    public boolean f39529f3;
    public boolean f39530g3;
    public int f39531h3;
    public int f39532i3;
    public final t90 j3;

    public s90(t90 t90Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.j3 = t90Var;
        setOnScrollListener(new oa(this, 12));
        i(new r90(this));
    }

    @Override
    public final void l0(int i7) {
        t90 t90Var = this.j3;
        t90Var.invalidate();
        t90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        t90 t90Var = this.j3;
        jg.h1 h1Var = t90Var.f39949f;
        jg.n1 n1Var = t90Var.f39948e;
        if (!t90Var.f39947c.f59080t ? this.f39530g3 || n1Var == null || n1Var.f17598e == null || !n1Var.f17599f || motionEvent.getY() >= n1Var.f17598e.getBottom() : this.f39530g3 || n1Var == null || n1Var.f17598e == null || !n1Var.f17599f || motionEvent.getY() <= n1Var.f17598e.getTop()) {
            if (!this.f39529f3 && org.telegram.ui.ns.p().q(motionEvent, t90Var.f39946b, null, this.f34074o2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((h1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && h1Var.N()) {
                if (h1Var.f17517o0 == null) {
                    jg.d1 d1Var = new jg.d1(h1Var, h1Var.f17507f, h1Var.f17515n, h1Var.f17520r, 0);
                    h1Var.f17517o0 = d1Var;
                    d1Var.a();
                }
                h1Var.f17517o0.b();
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
        t90 t90Var = this.j3;
        boolean g10 = t90Var.g();
        v4.c0 currentLayoutManager = t90Var.getCurrentLayoutManager();
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
                i14 = this.f39532i3 - i16;
            }
            i13 = top - i14;
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        if (t90Var.I) {
            t90Var.H = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            t90Var.H = false;
            t90Var.I = false;
        } else if (N0 != -1 && i15 == this.f39531h3 && i16 - this.f39532i3 != 0) {
            t90Var.H = true;
            currentLayoutManager.i1(N0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            t90Var.H = false;
        }
        this.f39532i3 = i16;
        this.f39531h3 = i15;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        t90 t90Var = this.j3;
        jg.n1 n1Var = t90Var.f39948e;
        if (n1Var != null) {
            n1Var.d = Integer.valueOf(size);
            bi.i3 i3Var = n1Var.f17598e;
            if (i3Var != null) {
                i3Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f24118q.y * 0.22f);
        t90Var.f39953w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t90 t90Var = this.j3;
        jg.n1 n1Var = t90Var.f39948e;
        if (t90Var.f39947c.f59080t) {
            if (!this.f39530g3 && n1Var != null && n1Var.f17598e != null && n1Var.f17599f && motionEvent.getY() > n1Var.f17598e.getTop()) {
                return false;
            }
        } else if (!this.f39530g3 && n1Var != null && n1Var.f17598e != null && n1Var.f17599f && motionEvent.getY() < n1Var.f17598e.getBottom()) {
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
        t90 t90Var = this.j3;
        t90Var.invalidate();
        t90Var.b();
    }
}
