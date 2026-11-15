package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class i90 extends uj0 {
    public boolean f35510f3;
    public boolean f35511g3;
    public int f35512h3;
    public int f35513i3;
    public final j90 j3;

    public i90(j90 j90Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.j3 = j90Var;
        setOnScrollListener(new ri(this, 11));
        i(new h90(this));
    }

    @Override
    public final void l0(int i7) {
        j90 j90Var = this.j3;
        j90Var.invalidate();
        j90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        j90 j90Var = this.j3;
        jg.h1 h1Var = j90Var.f35923f;
        jg.n1 n1Var = j90Var.f35922e;
        if (!j90Var.f35921c.f58494t ? this.f35511g3 || n1Var == null || n1Var.f17215e == null || !n1Var.f17216f || motionEvent.getY() >= n1Var.f17215e.getBottom() : this.f35511g3 || n1Var == null || n1Var.f17215e == null || !n1Var.f17216f || motionEvent.getY() <= n1Var.f17215e.getTop()) {
            if (!this.f35510f3 && org.telegram.ui.ns.p().q(motionEvent, j90Var.f35920b, null, this.f40069o2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((h1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && h1Var.N()) {
                if (h1Var.f17134o0 == null) {
                    jg.d1 d1Var = new jg.d1(h1Var, h1Var.f17124f, h1Var.f17132n, h1Var.f17137r, 0);
                    h1Var.f17134o0 = d1Var;
                    d1Var.a();
                }
                h1Var.f17134o0.b();
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
        j90 j90Var = this.j3;
        boolean g10 = j90Var.g();
        v4.b0 currentLayoutManager = j90Var.getCurrentLayoutManager();
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
                i14 = this.f35513i3 - i16;
            }
            i13 = top - i14;
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        if (j90Var.I) {
            j90Var.H = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            j90Var.H = false;
            j90Var.I = false;
        } else if (N0 != -1 && i15 == this.f35512h3 && i16 - this.f35513i3 != 0) {
            j90Var.H = true;
            currentLayoutManager.i1(N0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            j90Var.H = false;
        }
        this.f35513i3 = i16;
        this.f35512h3 = i15;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        j90 j90Var = this.j3;
        jg.n1 n1Var = j90Var.f35922e;
        if (n1Var != null) {
            n1Var.d = Integer.valueOf(size);
            bi.o2 o2Var = n1Var.f17215e;
            if (o2Var != null) {
                o2Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f23611q.y * 0.22f);
        j90Var.f35927w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j90 j90Var = this.j3;
        jg.n1 n1Var = j90Var.f35922e;
        if (j90Var.f35921c.f58494t) {
            if (!this.f35511g3 && n1Var != null && n1Var.f17215e != null && n1Var.f17216f && motionEvent.getY() > n1Var.f17215e.getTop()) {
                return false;
            }
        } else if (!this.f35511g3 && n1Var != null && n1Var.f17215e != null && n1Var.f17216f && motionEvent.getY() < n1Var.f17215e.getBottom()) {
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
        j90 j90Var = this.j3;
        j90Var.invalidate();
        j90Var.b();
    }
}
