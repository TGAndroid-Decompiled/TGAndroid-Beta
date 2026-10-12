package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nb0 extends mm0 {
    public boolean V2;
    public boolean W2;
    public int X2;
    public int Y2;
    public final ob0 Z2;

    public nb0(ob0 ob0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.Z2 = ob0Var;
        setOnScrollListener(new ah.d0(this, 29));
        i(new mb0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        ob0 ob0Var = this.Z2;
        ob0Var.invalidate();
        ob0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        ob0 ob0Var = this.Z2;
        hg.j1 j1Var = ob0Var.f27929f;
        hg.p1 p1Var = ob0Var.e;
        if (!ob0Var.f27928c.f44831t ? this.W2 || p1Var == null || p1Var.e == null || !p1Var.f10705f || motionEvent.getY() >= p1Var.e.getBottom() : this.W2 || p1Var == null || p1Var.e == null || !p1Var.f10705f || motionEvent.getY() <= p1Var.e.getTop()) {
            if (!this.V2 && org.telegram.ui.xt.q().r(motionEvent, ob0Var.f27927b, null, this.f27439n2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.f10626n0 == null) {
                    hg.f1 f1Var = new hg.f1(j1Var, j1Var.f10617f, j1Var.f10625n, j1Var.f10630r, 0);
                    j1Var.f10626n0 = f1Var;
                    f1Var.a();
                }
                j1Var.f10626n0.b();
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
        ob0 ob0Var = this.Z2;
        boolean g10 = ob0Var.g();
        s4.b0 currentLayoutManager = ob0Var.getCurrentLayoutManager();
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
                i15 = this.Y2 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (ob0Var.H) {
            ob0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            ob0Var.G = false;
            ob0Var.H = false;
        } else if (N0 != -1 && i16 == this.X2 && i17 - this.Y2 != 0) {
            ob0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            ob0Var.G = false;
        }
        this.Y2 = i17;
        this.X2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ob0 ob0Var = this.Z2;
        hg.p1 p1Var = ob0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            di.ab abVar = p1Var.e;
            if (abVar != null) {
                abVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ob0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ob0 ob0Var = this.Z2;
        hg.p1 p1Var = ob0Var.e;
        if (ob0Var.f27928c.f44831t) {
            if (!this.W2 && p1Var != null && p1Var.e != null && p1Var.f10705f && motionEvent.getY() > p1Var.e.getTop()) {
                return false;
            }
        } else if (!this.W2 && p1Var != null && p1Var.e != null && p1Var.f10705f && motionEvent.getY() < p1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.Z2.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ob0 ob0Var = this.Z2;
        ob0Var.invalidate();
        ob0Var.b();
    }
}
