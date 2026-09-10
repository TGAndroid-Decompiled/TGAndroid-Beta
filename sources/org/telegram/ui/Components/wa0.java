package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wa0 extends vl0 {
    public boolean X2;
    public boolean Y2;
    public int Z2;
    public int f28744a3;
    public final xa0 f28745b3;

    public wa0(xa0 xa0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f28745b3 = xa0Var;
        setOnScrollListener(new bi.a2(this, 26));
        i(new va0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        xa0 xa0Var = this.f28745b3;
        xa0Var.invalidate();
        xa0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        xa0 xa0Var = this.f28745b3;
        fg.l1 l1Var = xa0Var.f28992f;
        fg.r1 r1Var = xa0Var.e;
        if (!xa0Var.f28991c.f41603t ? this.Y2 || r1Var == null || r1Var.e == null || !r1Var.f8192f || motionEvent.getY() >= r1Var.e.getBottom() : this.Y2 || r1Var == null || r1Var.e == null || !r1Var.f8192f || motionEvent.getY() <= r1Var.e.getTop()) {
            if (!this.X2 && org.telegram.ui.tt.q().r(motionEvent, xa0Var.f28990b, null, this.f27987p2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((l1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && l1Var.N()) {
                if (l1Var.f8117n0 == null) {
                    fg.h1 h1Var = new fg.h1(l1Var, l1Var.f8108f, l1Var.f8116n, l1Var.f8121r, 0);
                    l1Var.f8117n0 = h1Var;
                    h1Var.a();
                }
                l1Var.f8117n0.b();
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
        xa0 xa0Var = this.f28745b3;
        boolean g10 = xa0Var.g();
        s4.c0 currentLayoutManager = xa0Var.getCurrentLayoutManager();
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
                i15 = this.f28744a3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (xa0Var.H) {
            xa0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            xa0Var.G = false;
            xa0Var.H = false;
        } else if (N0 != -1 && i16 == this.Z2 && i17 - this.f28744a3 != 0) {
            xa0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            xa0Var.G = false;
        }
        this.f28744a3 = i17;
        this.Z2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        xa0 xa0Var = this.f28745b3;
        fg.r1 r1Var = xa0Var.e;
        if (r1Var != null) {
            r1Var.d = Integer.valueOf(size);
            bi.nc ncVar = r1Var.e;
            if (ncVar != null) {
                ncVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        xa0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xa0 xa0Var = this.f28745b3;
        fg.r1 r1Var = xa0Var.e;
        if (xa0Var.f28991c.f41603t) {
            if (!this.Y2 && r1Var != null && r1Var.e != null && r1Var.f8192f && motionEvent.getY() > r1Var.e.getTop()) {
                return false;
            }
        } else if (!this.Y2 && r1Var != null && r1Var.e != null && r1Var.f8192f && motionEvent.getY() < r1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f28745b3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        xa0 xa0Var = this.f28745b3;
        xa0Var.invalidate();
        xa0Var.b();
    }
}
