package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fb0 extends mm0 {
    public boolean f28140f3;
    public boolean f28141g3;
    public int f28142h3;
    public int f28143i3;
    public final gb0 f28144j3;

    public fb0(gb0 gb0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f28144j3 = gb0Var;
        setOnScrollListener(new ml(this, 7));
        i(new eb0(this));
    }

    @Override
    public final void l0(int i10) {
        gb0 gb0Var = this.f28144j3;
        gb0Var.invalidate();
        gb0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        gb0 gb0Var = this.f28144j3;
        ig.j1 j1Var = gb0Var.f28522f;
        ig.p1 p1Var = gb0Var.e;
        if (!gb0Var.f28521c.f47713t ? this.f28141g3 || p1Var == null || p1Var.e == null || !p1Var.f14204f || motionEvent.getY() >= p1Var.e.getBottom() : this.f28141g3 || p1Var == null || p1Var.e == null || !p1Var.f14204f || motionEvent.getY() <= p1Var.e.getTop()) {
            if (!this.f28140f3 && org.telegram.ui.ft.o().p(motionEvent, gb0Var.f28520b, null, this.f30646n2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.f14125n0 == null) {
                    ig.f1 f1Var = new ig.f1(j1Var, j1Var.f14116f, j1Var.f14124n, j1Var.f14129r, 0);
                    j1Var.f14125n0 = f1Var;
                    f1Var.a();
                }
                j1Var.f14125n0.b();
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
        gb0 gb0Var = this.f28144j3;
        boolean g7 = gb0Var.g();
        s4.c0 currentLayoutManager = gb0Var.getCurrentLayoutManager();
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
                i15 = this.f28143i3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (gb0Var.H) {
            gb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            gb0Var.G = false;
            gb0Var.H = false;
        } else if (N0 != -1 && i16 == this.f28142h3 && i17 - this.f28143i3 != 0) {
            gb0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            gb0Var.G = false;
        }
        this.f28143i3 = i17;
        this.f28142h3 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        gb0 gb0Var = this.f28144j3;
        ig.p1 p1Var = gb0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            bi.cc ccVar = p1Var.e;
            if (ccVar != null) {
                ccVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        gb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gb0 gb0Var = this.f28144j3;
        ig.p1 p1Var = gb0Var.e;
        if (gb0Var.f28521c.f47713t) {
            if (!this.f28141g3 && p1Var != null && p1Var.e != null && p1Var.f14204f && motionEvent.getY() > p1Var.e.getTop()) {
                return false;
            }
        } else if (!this.f28141g3 && p1Var != null && p1Var.e != null && p1Var.f14204f && motionEvent.getY() < p1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f28144j3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        gb0 gb0Var = this.f28144j3;
        gb0Var.invalidate();
        gb0Var.b();
    }
}
