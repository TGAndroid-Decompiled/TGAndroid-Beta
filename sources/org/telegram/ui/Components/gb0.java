package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gb0 extends lm0 {
    public boolean Y2;
    public boolean Z2;
    public int f26615a3;
    public int f26616b3;
    public final hb0 f26617c3;

    public gb0(hb0 hb0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f26617c3 = hb0Var;
        setOnScrollListener(new iv(this, 3));
        i(new fb0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        hb0 hb0Var = this.f26617c3;
        hb0Var.invalidate();
        hb0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        hb0 hb0Var = this.f26617c3;
        hg.j1 j1Var = hb0Var.f26995f;
        hg.p1 p1Var = hb0Var.e;
        if (!hb0Var.f26994c.f46335t ? this.Z2 || p1Var == null || p1Var.e == null || !p1Var.f12038f || motionEvent.getY() >= p1Var.e.getBottom() : this.Z2 || p1Var == null || p1Var.e == null || !p1Var.f12038f || motionEvent.getY() <= p1Var.e.getTop()) {
            if (!this.Y2 && org.telegram.ui.ht.o().p(motionEvent, hb0Var.f26993b, null, this.f28396n2)) {
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
        hb0 hb0Var = this.f26617c3;
        boolean g10 = hb0Var.g();
        s4.b0 currentLayoutManager = hb0Var.getCurrentLayoutManager();
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
                i15 = this.f26616b3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (hb0Var.H) {
            hb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            hb0Var.G = false;
            hb0Var.H = false;
        } else if (N0 != -1 && i16 == this.f26615a3 && i17 - this.f26616b3 != 0) {
            hb0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            hb0Var.G = false;
        }
        this.f26616b3 = i17;
        this.f26615a3 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        hb0 hb0Var = this.f26617c3;
        hg.p1 p1Var = hb0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            ai.jc jcVar = p1Var.e;
            if (jcVar != null) {
                jcVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        hb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hb0 hb0Var = this.f26617c3;
        hg.p1 p1Var = hb0Var.e;
        if (hb0Var.f26994c.f46335t) {
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
        if (this.f26617c3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        hb0 hb0Var = this.f26617c3;
        hb0Var.invalidate();
        hb0Var.b();
    }
}
