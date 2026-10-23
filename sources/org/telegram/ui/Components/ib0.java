package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ib0 extends mm0 {
    public boolean Y2;
    public boolean Z2;
    public int f27275a3;
    public int f27276b3;
    public final jb0 f27277c3;

    public ib0(jb0 jb0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f27277c3 = jb0Var;
        setOnScrollListener(new kv(this, 3));
        i(new hb0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        jb0 jb0Var = this.f27277c3;
        jb0Var.invalidate();
        jb0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        jb0 jb0Var = this.f27277c3;
        hg.j1 j1Var = jb0Var.f27655f;
        hg.p1 p1Var = jb0Var.e;
        if (!jb0Var.f27654c.f46336t ? this.Z2 || p1Var == null || p1Var.e == null || !p1Var.f12038f || motionEvent.getY() >= p1Var.e.getBottom() : this.Z2 || p1Var == null || p1Var.e == null || !p1Var.f12038f || motionEvent.getY() <= p1Var.e.getTop()) {
            if (!this.Y2 && org.telegram.ui.ht.o().p(motionEvent, jb0Var.f27653b, null, this.f28705n2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.f11962n0 == null) {
                    hg.f1 f1Var = new hg.f1(j1Var, j1Var.f11953f, j1Var.f11961n, j1Var.f11966r, 0);
                    j1Var.f11962n0 = f1Var;
                    f1Var.a();
                }
                j1Var.f11962n0.b();
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
        jb0 jb0Var = this.f27277c3;
        boolean g10 = jb0Var.g();
        s4.b0 currentLayoutManager = jb0Var.getCurrentLayoutManager();
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
                i15 = this.f27276b3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (jb0Var.H) {
            jb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            jb0Var.G = false;
            jb0Var.H = false;
        } else if (N0 != -1 && i16 == this.f27275a3 && i17 - this.f27276b3 != 0) {
            jb0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            jb0Var.G = false;
        }
        this.f27276b3 = i17;
        this.f27275a3 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        jb0 jb0Var = this.f27277c3;
        hg.p1 p1Var = jb0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            ai.jc jcVar = p1Var.e;
            if (jcVar != null) {
                jcVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        jb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jb0 jb0Var = this.f27277c3;
        hg.p1 p1Var = jb0Var.e;
        if (jb0Var.f27654c.f46336t) {
            if (!this.Z2 && p1Var != null && p1Var.e != null && p1Var.f12038f && motionEvent.getY() > p1Var.e.getTop()) {
                return false;
            }
        } else if (!this.Z2 && p1Var != null && p1Var.e != null && p1Var.f12038f && motionEvent.getY() < p1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f27277c3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        jb0 jb0Var = this.f27277c3;
        jb0Var.invalidate();
        jb0Var.b();
    }
}
