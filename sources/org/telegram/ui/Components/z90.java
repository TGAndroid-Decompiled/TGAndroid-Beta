package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class z90 extends zk0 {
    public boolean T2;
    public boolean U2;
    public int V2;
    public int W2;
    public final aa0 X2;

    public z90(aa0 aa0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.X2 = aa0Var;
        setOnScrollListener(new xm(this, 6));
        i(new y90(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        aa0 aa0Var = this.X2;
        aa0Var.invalidate();
        aa0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        aa0 aa0Var = this.X2;
        pf.u0 u0Var = aa0Var.f26703f;
        pf.z0 z0Var = aa0Var.f26702e;
        if (!aa0Var.f26701c.f5725t ? this.U2 || z0Var == null || z0Var.f46014e == null || !z0Var.f46015f || motionEvent.getY() >= z0Var.f46014e.getBottom() : this.U2 || z0Var == null || z0Var.f46014e == null || !z0Var.f46015f || motionEvent.getY() <= z0Var.f46014e.getTop()) {
            boolean z10 = !this.T2 && org.telegram.ui.kt.q().r(motionEvent, aa0Var.f26700b, null, this.f35277l2);
            if (((u0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && u0Var.N()) {
                if (u0Var.f45933j0 == null) {
                    ow owVar = new ow(u0Var, u0Var.f45928f, u0Var.f45936n, u0Var.f45941r, 1);
                    u0Var.f45933j0 = owVar;
                    owVar.a();
                }
                u0Var.f45933j0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int top;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        aa0 aa0Var = this.X2;
        boolean zG = aa0Var.g();
        f2.k0 currentLayoutManager = aa0Var.getCurrentLayoutManager();
        int iL0 = zG ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View viewM = currentLayoutManager.m(iL0);
        if (viewM != null) {
            top = viewM.getTop() - (zG ? 0 : this.W2 - i15);
        } else {
            top = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (aa0Var.D) {
            aa0Var.C = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            aa0Var.C = false;
            aa0Var.D = false;
        } else if (iL0 != -1 && i14 == this.V2 && i15 - this.W2 != 0) {
            aa0Var.C = true;
            currentLayoutManager.i1(iL0, top, false);
            super.onLayout(false, i10, i11, i12, i13);
            aa0Var.C = false;
        }
        this.W2 = i15;
        this.V2 = i14;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        aa0 aa0Var = this.X2;
        pf.z0 z0Var = aa0Var.f26702e;
        if (z0Var != null) {
            z0Var.d = Integer.valueOf(size);
            org.telegram.ui.aj0 aj0Var = z0Var.f46014e;
            if (aj0Var != null) {
                aj0Var.requestLayout();
            }
        }
        float fMin = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        aa0Var.v = fMin;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) fMin), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        aa0 aa0Var = this.X2;
        pf.z0 z0Var = aa0Var.f26702e;
        if (aa0Var.f26701c.f5725t) {
            if (!this.U2 && z0Var != null && z0Var.f46014e != null && z0Var.f46015f && motionEvent.getY() > z0Var.f46014e.getTop()) {
                return false;
            }
        } else if (!this.U2 && z0Var != null && z0Var.f46014e != null && z0Var.f46015f && motionEvent.getY() < z0Var.f46014e.getBottom()) {
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
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        aa0 aa0Var = this.X2;
        aa0Var.invalidate();
        aa0Var.b();
    }
}
