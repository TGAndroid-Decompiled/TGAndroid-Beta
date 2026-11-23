package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class r90 extends ek0 {
    public boolean f39241f3;
    public boolean f39242g3;
    public int f39243h3;
    public int f39244i3;
    public final s90 j3;

    public r90(s90 s90Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.j3 = s90Var;
        setOnScrollListener(new na(this, 12));
        i(new q90(this));
    }

    @Override
    public final void l0(int i7) {
        s90 s90Var = this.j3;
        s90Var.invalidate();
        s90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        s90 s90Var = this.j3;
        jg.h1 h1Var = s90Var.f39538f;
        jg.n1 n1Var = s90Var.f39537e;
        if (!s90Var.f39536c.f59204t ? this.f39242g3 || n1Var == null || n1Var.f17694e == null || !n1Var.f17695f || motionEvent.getY() >= n1Var.f17694e.getBottom() : this.f39242g3 || n1Var == null || n1Var.f17694e == null || !n1Var.f17695f || motionEvent.getY() <= n1Var.f17694e.getTop()) {
            if (!this.f39241f3 && org.telegram.ui.ns.p().q(motionEvent, s90Var.f39535b, null, this.f34767o2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((h1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && h1Var.N()) {
                if (h1Var.f17613o0 == null) {
                    jg.d1 d1Var = new jg.d1(h1Var, h1Var.f17603f, h1Var.f17611n, h1Var.f17616r, 0);
                    h1Var.f17613o0 = d1Var;
                    d1Var.a();
                }
                h1Var.f17613o0.b();
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
        s90 s90Var = this.j3;
        boolean g10 = s90Var.g();
        v4.c0 currentLayoutManager = s90Var.getCurrentLayoutManager();
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
                i14 = this.f39244i3 - i16;
            }
            i13 = top - i14;
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        if (s90Var.I) {
            s90Var.H = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            s90Var.H = false;
            s90Var.I = false;
        } else if (N0 != -1 && i15 == this.f39243h3 && i16 - this.f39244i3 != 0) {
            s90Var.H = true;
            currentLayoutManager.i1(N0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            s90Var.H = false;
        }
        this.f39244i3 = i16;
        this.f39243h3 = i15;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        s90 s90Var = this.j3;
        jg.n1 n1Var = s90Var.f39537e;
        if (n1Var != null) {
            n1Var.d = Integer.valueOf(size);
            bi.o3 o3Var = n1Var.f17694e;
            if (o3Var != null) {
                o3Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.f24226q.y * 0.22f);
        s90Var.f39542w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s90 s90Var = this.j3;
        jg.n1 n1Var = s90Var.f39537e;
        if (s90Var.f39536c.f59204t) {
            if (!this.f39242g3 && n1Var != null && n1Var.f17694e != null && n1Var.f17695f && motionEvent.getY() > n1Var.f17694e.getTop()) {
                return false;
            }
        } else if (!this.f39242g3 && n1Var != null && n1Var.f17694e != null && n1Var.f17695f && motionEvent.getY() < n1Var.f17694e.getBottom()) {
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
        s90 s90Var = this.j3;
        s90Var.invalidate();
        s90Var.b();
    }
}
