package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
public final class x90 extends uk0 {
    public boolean f32526e3;
    public boolean f32527f3;
    public int f32528g3;
    public int f32529h3;
    public final y90 f32530i3;

    public x90(y90 y90Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f32530i3 = y90Var;
        setOnScrollListener(new ag.u(this, 24));
        i(new w90(this));
    }

    @Override
    public final void l0(int i10) {
        y90 y90Var = this.f32530i3;
        y90Var.invalidate();
        y90Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        y90 y90Var = this.f32530i3;
        zf.x0 x0Var = y90Var.f32783f;
        zf.c1 c1Var = y90Var.e;
        if (!y90Var.f32782c.f47884t ? this.f32527f3 || c1Var == null || c1Var.e == null || !c1Var.f55481f || motionEvent.getY() >= c1Var.e.getBottom() : this.f32527f3 || c1Var == null || c1Var.e == null || !c1Var.f55481f || motionEvent.getY() <= c1Var.e.getTop()) {
            if (!this.f32526e3 && org.telegram.ui.kt.p().q(motionEvent, y90Var.f32781b, null, this.f31008n2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((x0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && x0Var.N()) {
                if (x0Var.f55678n0 == null) {
                    mw mwVar = new mw(x0Var, x0Var.f55669f, x0Var.f55677n, x0Var.f55682r, 1);
                    x0Var.f55678n0 = mwVar;
                    mwVar.a();
                }
                x0Var.f55678n0.b();
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
        y90 y90Var = this.f32530i3;
        boolean g10 = y90Var.g();
        s4.a0 currentLayoutManager = y90Var.getCurrentLayoutManager();
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
                i15 = this.f32529h3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (y90Var.H) {
            y90Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            y90Var.G = false;
            y90Var.H = false;
        } else if (N0 != -1 && i16 == this.f32528g3 && i17 - this.f32529h3 != 0) {
            y90Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            y90Var.G = false;
        }
        this.f32529h3 = i17;
        this.f32528g3 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        y90 y90Var = this.f32530i3;
        zf.c1 c1Var = y90Var.e;
        if (c1Var != null) {
            c1Var.d = Integer.valueOf(size);
            org.telegram.ui.bo0 bo0Var = c1Var.e;
            if (bo0Var != null) {
                bo0Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.i0.L(126.0f), org.telegram.messenger.i0.f16172q.y * 0.22f);
        y90Var.f32787w = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y90 y90Var = this.f32530i3;
        zf.c1 c1Var = y90Var.e;
        if (y90Var.f32782c.f47884t) {
            if (!this.f32527f3 && c1Var != null && c1Var.e != null && c1Var.f55481f && motionEvent.getY() > c1Var.e.getTop()) {
                return false;
            }
        } else if (!this.f32527f3 && c1Var != null && c1Var.e != null && c1Var.f55481f && motionEvent.getY() < c1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f32530i3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        y90 y90Var = this.f32530i3;
        y90Var.invalidate();
        y90Var.b();
    }
}
