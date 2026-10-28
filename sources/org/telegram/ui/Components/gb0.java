package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gb0 extends nm0 {
    public boolean f28506f3;
    public boolean f28507g3;
    public int f28508h3;
    public int f28509i3;
    public final hb0 f28510j3;

    public gb0(hb0 hb0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f28510j3 = hb0Var;
        setOnScrollListener(new ml(this, 7));
        i(new fb0(this));
    }

    @Override
    public final void l0(int i10) {
        hb0 hb0Var = this.f28510j3;
        hb0Var.invalidate();
        hb0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        hb0 hb0Var = this.f28510j3;
        ig.j1 j1Var = hb0Var.f28943f;
        ig.p1 p1Var = hb0Var.e;
        if (!hb0Var.f28942c.f47748t ? this.f28507g3 || p1Var == null || p1Var.e == null || !p1Var.f14203f || motionEvent.getY() >= p1Var.e.getBottom() : this.f28507g3 || p1Var == null || p1Var.e == null || !p1Var.f14203f || motionEvent.getY() <= p1Var.e.getTop()) {
            if (!this.f28506f3 && org.telegram.ui.ht.o().p(motionEvent, hb0Var.f28941b, null, this.f30988n2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.f14124n0 == null) {
                    ig.f1 f1Var = new ig.f1(j1Var, j1Var.f14115f, j1Var.f14123n, j1Var.f14128r, 0);
                    j1Var.f14124n0 = f1Var;
                    f1Var.a();
                }
                j1Var.f14124n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int N0;
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        hb0 hb0Var = this.f28510j3;
        boolean g7 = hb0Var.g();
        s4.c0 currentLayoutManager = hb0Var.getCurrentLayoutManager();
        if (g7) {
            N0 = currentLayoutManager.L0();
        } else {
            N0 = currentLayoutManager.N0();
        }
        View m10 = currentLayoutManager.m(N0);
        if (m10 != null) {
            int top = m10.getTop();
            if (g7) {
                i15 = 0;
            } else {
                i15 = this.f28509i3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (hb0Var.H) {
            hb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            hb0Var.G = false;
            hb0Var.H = false;
        } else if (N0 != -1 && i16 == this.f28508h3 && i17 - this.f28509i3 != 0) {
            hb0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            hb0Var.G = false;
        }
        this.f28509i3 = i17;
        this.f28508h3 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        hb0 hb0Var = this.f28510j3;
        ig.p1 p1Var = hb0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            bi.cc ccVar = p1Var.e;
            if (ccVar != null) {
                ccVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        hb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hb0 hb0Var = this.f28510j3;
        ig.p1 p1Var = hb0Var.e;
        if (hb0Var.f28942c.f47748t) {
            if (!this.f28507g3 && p1Var != null && p1Var.e != null && p1Var.f14203f && motionEvent.getY() > p1Var.e.getTop()) {
                return false;
            }
        } else if (!this.f28507g3 && p1Var != null && p1Var.e != null && p1Var.f14203f && motionEvent.getY() < p1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f28510j3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        hb0 hb0Var = this.f28510j3;
        hb0Var.invalidate();
        hb0Var.b();
    }
}
