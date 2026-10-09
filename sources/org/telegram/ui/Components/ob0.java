package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ob0 extends qm0 {
    public boolean V2;
    public boolean W2;
    public int X2;
    public int Y2;
    public final pb0 Z2;

    public ob0(pb0 pb0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.Z2 = pb0Var;
        setOnScrollListener(new ai.r(this, 28));
        i(new nb0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        pb0 pb0Var = this.Z2;
        pb0Var.invalidate();
        pb0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        pb0 pb0Var = this.Z2;
        gg.j1 j1Var = pb0Var.f29830f;
        gg.p1 p1Var = pb0Var.f29829e;
        if (!pb0Var.f29828c.f47649t ? this.W2 || p1Var == null || p1Var.f10767e == null || !p1Var.f10768f || motionEvent.getY() >= p1Var.f10767e.getBottom() : this.W2 || p1Var == null || p1Var.f10767e == null || !p1Var.f10768f || motionEvent.getY() <= p1Var.f10767e.getTop()) {
            if (!this.V2 && org.telegram.ui.rt.q().r(motionEvent, pb0Var.f29827b, null, this.f30216n2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.f10682n0 == null) {
                    gg.f1 f1Var = new gg.f1(j1Var, j1Var.f10673f, j1Var.f10681n, j1Var.f10686r, 0);
                    j1Var.f10682n0 = f1Var;
                    f1Var.a();
                }
                j1Var.f10682n0.b();
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
        pb0 pb0Var = this.Z2;
        boolean g10 = pb0Var.g();
        s4.d0 currentLayoutManager = pb0Var.getCurrentLayoutManager();
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
        if (pb0Var.H) {
            pb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            pb0Var.G = false;
            pb0Var.H = false;
        } else if (N0 != -1 && i16 == this.X2 && i17 - this.Y2 != 0) {
            pb0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            pb0Var.G = false;
        }
        this.Y2 = i17;
        this.X2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        pb0 pb0Var = this.Z2;
        gg.p1 p1Var = pb0Var.f29829e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            ci.bb bbVar = p1Var.f10767e;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        pb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pb0 pb0Var = this.Z2;
        gg.p1 p1Var = pb0Var.f29829e;
        if (pb0Var.f29828c.f47649t) {
            if (!this.W2 && p1Var != null && p1Var.f10767e != null && p1Var.f10768f && motionEvent.getY() > p1Var.f10767e.getTop()) {
                return false;
            }
        } else if (!this.W2 && p1Var != null && p1Var.f10767e != null && p1Var.f10768f && motionEvent.getY() < p1Var.f10767e.getBottom()) {
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
        pb0 pb0Var = this.Z2;
        pb0Var.invalidate();
        pb0Var.b();
    }
}
