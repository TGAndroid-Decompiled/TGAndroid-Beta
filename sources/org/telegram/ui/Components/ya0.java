package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ya0 extends wl0 {
    public boolean X2;
    public boolean Y2;
    public int Z2;
    public int f30572a3;
    public final za0 f30573b3;

    public ya0(za0 za0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f30573b3 = za0Var;
        setOnScrollListener(new ai.r(this, 28));
        i(new xa0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        za0 za0Var = this.f30573b3;
        za0Var.invalidate();
        za0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        za0 za0Var = this.f30573b3;
        gg.k1 k1Var = za0Var.f30816f;
        gg.q1 q1Var = za0Var.e;
        if (!za0Var.f30815c.f42939t ? this.Y2 || q1Var == null || q1Var.e == null || !q1Var.f9884f || motionEvent.getY() >= q1Var.e.getBottom() : this.Y2 || q1Var == null || q1Var.e == null || !q1Var.f9884f || motionEvent.getY() <= q1Var.e.getTop()) {
            if (!this.X2 && org.telegram.ui.nt.q().r(motionEvent, za0Var.f30814b, null, this.f30094p2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((k1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && k1Var.N()) {
                if (k1Var.f9811n0 == null) {
                    gg.g1 g1Var = new gg.g1(k1Var, k1Var.f9802f, k1Var.f9810n, k1Var.f9815r, 0);
                    k1Var.f9811n0 = g1Var;
                    g1Var.a();
                }
                k1Var.f9811n0.b();
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
        za0 za0Var = this.f30573b3;
        boolean g10 = za0Var.g();
        s4.c0 currentLayoutManager = za0Var.getCurrentLayoutManager();
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
                i15 = this.f30572a3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (za0Var.H) {
            za0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            za0Var.G = false;
            za0Var.H = false;
        } else if (N0 != -1 && i16 == this.Z2 && i17 - this.f30572a3 != 0) {
            za0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            za0Var.G = false;
        }
        this.f30572a3 = i17;
        this.Z2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        za0 za0Var = this.f30573b3;
        gg.q1 q1Var = za0Var.e;
        if (q1Var != null) {
            q1Var.d = Integer.valueOf(size);
            ci.bb bbVar = q1Var.e;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        za0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        za0 za0Var = this.f30573b3;
        gg.q1 q1Var = za0Var.e;
        if (za0Var.f30815c.f42939t) {
            if (!this.Y2 && q1Var != null && q1Var.e != null && q1Var.f9884f && motionEvent.getY() > q1Var.e.getTop()) {
                return false;
            }
        } else if (!this.Y2 && q1Var != null && q1Var.e != null && q1Var.f9884f && motionEvent.getY() < q1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f30573b3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        za0 za0Var = this.f30573b3;
        za0Var.invalidate();
        za0Var.b();
    }
}
