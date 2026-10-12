package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sb0 extends wm0 {
    public boolean V2;
    public boolean W2;
    public int X2;
    public int Y2;
    public final tb0 Z2;

    public sb0(tb0 tb0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.Z2 = tb0Var;
        setOnScrollListener(new ai.r(this, 28));
        i(new rb0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        tb0 tb0Var = this.Z2;
        tb0Var.invalidate();
        tb0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        tb0 tb0Var = this.Z2;
        gg.j1 j1Var = tb0Var.f30842f;
        gg.p1 p1Var = tb0Var.f30841e;
        if (!tb0Var.f30840c.f47882t ? this.W2 || p1Var == null || p1Var.f10765e == null || !p1Var.f10766f || motionEvent.getY() >= p1Var.f10765e.getBottom() : this.W2 || p1Var == null || p1Var.f10765e == null || !p1Var.f10766f || motionEvent.getY() <= p1Var.f10765e.getTop()) {
            if (!this.V2 && org.telegram.ui.ut.q().r(motionEvent, tb0Var.f30839b, null, this.f32467n2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.f10680n0 == null) {
                    gg.f1 f1Var = new gg.f1(j1Var, j1Var.f10671f, j1Var.f10679n, j1Var.f10684r, 0);
                    j1Var.f10680n0 = f1Var;
                    f1Var.a();
                }
                j1Var.f10680n0.b();
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
        tb0 tb0Var = this.Z2;
        boolean g10 = tb0Var.g();
        s4.d0 currentLayoutManager = tb0Var.getCurrentLayoutManager();
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
        if (tb0Var.H) {
            tb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            tb0Var.G = false;
            tb0Var.H = false;
        } else if (N0 != -1 && i16 == this.X2 && i17 - this.Y2 != 0) {
            tb0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            tb0Var.G = false;
        }
        this.Y2 = i17;
        this.X2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        tb0 tb0Var = this.Z2;
        gg.p1 p1Var = tb0Var.f30841e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            ci.bb bbVar = p1Var.f10765e;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        tb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tb0 tb0Var = this.Z2;
        gg.p1 p1Var = tb0Var.f30841e;
        if (tb0Var.f30840c.f47882t) {
            if (!this.W2 && p1Var != null && p1Var.f10765e != null && p1Var.f10766f && motionEvent.getY() > p1Var.f10765e.getTop()) {
                return false;
            }
        } else if (!this.W2 && p1Var != null && p1Var.f10765e != null && p1Var.f10766f && motionEvent.getY() < p1Var.f10765e.getBottom()) {
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
        tb0 tb0Var = this.Z2;
        tb0Var.invalidate();
        tb0Var.b();
    }
}
