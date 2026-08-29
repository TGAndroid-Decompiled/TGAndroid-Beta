package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ja0 extends jl0 {
    public boolean T2;
    public boolean U2;
    public int V2;
    public int W2;
    public final ka0 X2;

    public ja0(ka0 ka0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.X2 = ka0Var;
        setOnScrollListener(new h00(this, 1));
        i(new ia0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        ka0 ka0Var = this.X2;
        ka0Var.invalidate();
        ka0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        ka0 ka0Var = this.X2;
        rf.v0 v0Var = ka0Var.f29999f;
        rf.a1 a1Var = ka0Var.f29998e;
        if (!ka0Var.f29997c.f6367t ? this.U2 || a1Var == null || a1Var.f47173e == null || !a1Var.f47174f || motionEvent.getY() >= a1Var.f47173e.getBottom() : this.U2 || a1Var == null || a1Var.f47173e == null || !a1Var.f47174f || motionEvent.getY() <= a1Var.f47173e.getTop()) {
            if (!this.T2 && org.telegram.ui.ht.q().r(motionEvent, ka0Var.f29996b, null, this.f29709l2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((v0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && v0Var.N()) {
                if (v0Var.f47374j0 == null) {
                    vw vwVar = new vw(v0Var, v0Var.f47369f, v0Var.f47377n, v0Var.f47382r, 1);
                    v0Var.f47374j0 = vwVar;
                    vwVar.a();
                }
                v0Var.f47374j0.b();
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
        ka0 ka0Var = this.X2;
        boolean g10 = ka0Var.g();
        f2.j0 currentLayoutManager = ka0Var.getCurrentLayoutManager();
        if (g10) {
            N0 = currentLayoutManager.L0();
        } else {
            N0 = currentLayoutManager.N0();
        }
        View m10 = currentLayoutManager.m(N0);
        if (m10 != null) {
            int top = m10.getTop();
            if (g10) {
                i15 = 0;
            } else {
                i15 = this.W2 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (ka0Var.D) {
            ka0Var.C = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            ka0Var.C = false;
            ka0Var.D = false;
        } else if (N0 != -1 && i16 == this.V2 && i17 - this.W2 != 0) {
            ka0Var.C = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            ka0Var.C = false;
        }
        this.W2 = i17;
        this.V2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ka0 ka0Var = this.X2;
        rf.a1 a1Var = ka0Var.f29998e;
        if (a1Var != null) {
            a1Var.d = Integer.valueOf(size);
            org.telegram.ui.op0 op0Var = a1Var.f47173e;
            if (op0Var != null) {
                op0Var.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ka0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ka0 ka0Var = this.X2;
        rf.a1 a1Var = ka0Var.f29998e;
        if (ka0Var.f29997c.f6367t) {
            if (!this.U2 && a1Var != null && a1Var.f47173e != null && a1Var.f47174f && motionEvent.getY() > a1Var.f47173e.getTop()) {
                return false;
            }
        } else if (!this.U2 && a1Var != null && a1Var.f47173e != null && a1Var.f47174f && motionEvent.getY() < a1Var.f47173e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.X2.C) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        ka0 ka0Var = this.X2;
        ka0Var.invalidate();
        ka0Var.b();
    }
}
