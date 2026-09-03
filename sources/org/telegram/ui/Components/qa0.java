package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qa0 extends sl0 {
    public boolean U2;
    public boolean V2;
    public int W2;
    public int X2;
    public final ra0 Y2;

    public qa0(ra0 ra0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = ra0Var;
        setOnScrollListener(new fg.e2(this, 29));
        i(new pa0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        ra0 ra0Var = this.Y2;
        ra0Var.invalidate();
        ra0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        ra0 ra0Var = this.Y2;
        uf.u0 u0Var = ra0Var.f30710f;
        uf.z0 z0Var = ra0Var.f30709e;
        if (!ra0Var.f30708c.f5821t ? this.V2 || z0Var == null || z0Var.f48822e == null || !z0Var.f48823f || motionEvent.getY() >= z0Var.f48822e.getBottom() : this.V2 || z0Var == null || z0Var.f48822e == null || !z0Var.f48823f || motionEvent.getY() <= z0Var.f48822e.getTop()) {
            if (!this.U2 && org.telegram.ui.qt.q().r(motionEvent, ra0Var.f30707b, null, this.f31106m2)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (((u0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && u0Var.N()) {
                if (u0Var.f48742k0 == null) {
                    bx bxVar = new bx(u0Var, u0Var.f48736f, u0Var.f48744n, u0Var.f48749r, 1);
                    u0Var.f48742k0 = bxVar;
                    bxVar.a();
                }
                u0Var.f48742k0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z4) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int N0;
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        ra0 ra0Var = this.Y2;
        boolean g10 = ra0Var.g();
        f2.j0 currentLayoutManager = ra0Var.getCurrentLayoutManager();
        if (g10) {
            N0 = currentLayoutManager.L0();
        } else {
            N0 = currentLayoutManager.N0();
        }
        View m9 = currentLayoutManager.m(N0);
        if (m9 != null) {
            int top = m9.getTop();
            if (g10) {
                i15 = 0;
            } else {
                i15 = this.X2 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        if (ra0Var.E) {
            ra0Var.D = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            ra0Var.D = false;
            ra0Var.E = false;
        } else if (N0 != -1 && i16 == this.W2 && i17 - this.X2 != 0) {
            ra0Var.D = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            ra0Var.D = false;
        }
        this.X2 = i17;
        this.W2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ra0 ra0Var = this.Y2;
        uf.z0 z0Var = ra0Var.f30709e;
        if (z0Var != null) {
            z0Var.d = Integer.valueOf(size);
            org.telegram.ui.nw0 nw0Var = z0Var.f48822e;
            if (nw0Var != null) {
                nw0Var.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ra0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ra0 ra0Var = this.Y2;
        uf.z0 z0Var = ra0Var.f30709e;
        if (ra0Var.f30708c.f5821t) {
            if (!this.V2 && z0Var != null && z0Var.f48822e != null && z0Var.f48823f && motionEvent.getY() > z0Var.f48822e.getTop()) {
                return false;
            }
        } else if (!this.V2 && z0Var != null && z0Var.f48822e != null && z0Var.f48823f && motionEvent.getY() < z0Var.f48822e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2.D) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ra0 ra0Var = this.Y2;
        ra0Var.invalidate();
        ra0Var.b();
    }
}
