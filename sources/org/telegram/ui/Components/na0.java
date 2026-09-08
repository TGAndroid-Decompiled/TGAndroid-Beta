package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class na0 extends ll0 {
    public boolean X2;
    public boolean Y2;
    public int Z2;
    public int f28748a3;
    public final oa0 f28749b3;

    public na0(oa0 oa0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f28749b3 = oa0Var;
        setOnScrollListener(new ah.e0(this, 29));
        i(new ma0(this));
    }

    @Override
    public final void k0(int i10, int i11) {
        oa0 oa0Var = this.f28749b3;
        oa0Var.invalidate();
        oa0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        oa0 oa0Var = this.f28749b3;
        hg.k1 k1Var = oa0Var.f29048f;
        hg.q1 q1Var = oa0Var.f29047e;
        if (!oa0Var.f29046c.f45759t ? this.Y2 || q1Var == null || q1Var.f11248e == null || !q1Var.f11249f || motionEvent.getY() >= q1Var.f11248e.getBottom() : this.Y2 || q1Var == null || q1Var.f11248e == null || !q1Var.f11249f || motionEvent.getY() <= q1Var.f11248e.getTop()) {
            if (!this.X2 && org.telegram.ui.st.q().r(motionEvent, oa0Var.f29045b, null, this.f28251p2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((k1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && k1Var.N()) {
                if (k1Var.f11170n0 == null) {
                    hg.g1 g1Var = new hg.g1(k1Var, k1Var.f11161f, k1Var.f11169n, k1Var.f11174r, 0);
                    k1Var.f11170n0 = g1Var;
                    g1Var.a();
                }
                k1Var.f11170n0.b();
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
        oa0 oa0Var = this.f28749b3;
        boolean g10 = oa0Var.g();
        s4.c0 currentLayoutManager = oa0Var.getCurrentLayoutManager();
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
                i15 = this.f28748a3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (oa0Var.H) {
            oa0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            oa0Var.G = false;
            oa0Var.H = false;
        } else if (N0 != -1 && i16 == this.Z2 && i17 - this.f28748a3 != 0) {
            oa0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            oa0Var.G = false;
        }
        this.f28748a3 = i17;
        this.Z2 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        oa0 oa0Var = this.f28749b3;
        hg.q1 q1Var = oa0Var.f29047e;
        if (q1Var != null) {
            q1Var.d = Integer.valueOf(size);
            di.eb ebVar = q1Var.f11248e;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        oa0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oa0 oa0Var = this.f28749b3;
        hg.q1 q1Var = oa0Var.f29047e;
        if (oa0Var.f29046c.f45759t) {
            if (!this.Y2 && q1Var != null && q1Var.f11248e != null && q1Var.f11249f && motionEvent.getY() > q1Var.f11248e.getTop()) {
                return false;
            }
        } else if (!this.Y2 && q1Var != null && q1Var.f11248e != null && q1Var.f11249f && motionEvent.getY() < q1Var.f11248e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f28749b3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        oa0 oa0Var = this.f28749b3;
        oa0Var.invalidate();
        oa0Var.b();
    }
}
