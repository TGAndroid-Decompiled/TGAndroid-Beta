package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bb0 extends zl0 {
    public boolean f22912e3;
    public boolean f22913f3;
    public int f22914g3;
    public int f22915h3;
    public final cb0 f22916i3;

    public bb0(cb0 cb0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f22916i3 = cb0Var;
        setOnScrollListener(new ai.r(this, 28));
        i(new ab0(this));
    }

    @Override
    public final void l0(int i10, int i11) {
        cb0 cb0Var = this.f22916i3;
        cb0Var.invalidate();
        cb0Var.b();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        cb0 cb0Var = this.f22916i3;
        gg.k1 k1Var = cb0Var.f23250f;
        gg.q1 q1Var = cb0Var.e;
        if (!cb0Var.f23249c.f43061t ? this.f22913f3 || q1Var == null || q1Var.e == null || !q1Var.f9896f || motionEvent.getY() >= q1Var.e.getBottom() : this.f22913f3 || q1Var == null || q1Var.e == null || !q1Var.f9896f || motionEvent.getY() <= q1Var.e.getTop()) {
            if (!this.f22912e3 && org.telegram.ui.nt.q().r(motionEvent, cb0Var.f23248b, null, this.f31015p2)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((k1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && k1Var.N()) {
                if (k1Var.f9823n0 == null) {
                    gg.g1 g1Var = new gg.g1(k1Var, k1Var.f9814f, k1Var.f9822n, k1Var.f9827r, 0);
                    k1Var.f9823n0 = g1Var;
                    g1Var.a();
                }
                k1Var.f9823n0.b();
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
        cb0 cb0Var = this.f22916i3;
        boolean g10 = cb0Var.g();
        s4.c0 currentLayoutManager = cb0Var.getCurrentLayoutManager();
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
                i15 = this.f22915h3 - i17;
            }
            i14 = top - i15;
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (cb0Var.H) {
            cb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            cb0Var.G = false;
            cb0Var.H = false;
        } else if (N0 != -1 && i16 == this.f22914g3 && i17 - this.f22915h3 != 0) {
            cb0Var.G = true;
            currentLayoutManager.i1(N0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            cb0Var.G = false;
        }
        this.f22915h3 = i17;
        this.f22914g3 = i16;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        cb0 cb0Var = this.f22916i3;
        gg.q1 q1Var = cb0Var.e;
        if (q1Var != null) {
            q1Var.d = Integer.valueOf(size);
            ci.bb bbVar = q1Var.e;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        cb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cb0 cb0Var = this.f22916i3;
        gg.q1 q1Var = cb0Var.e;
        if (cb0Var.f23249c.f43061t) {
            if (!this.f22913f3 && q1Var != null && q1Var.e != null && q1Var.f9896f && motionEvent.getY() > q1Var.e.getTop()) {
                return false;
            }
        } else if (!this.f22913f3 && q1Var != null && q1Var.e != null && q1Var.f9896f && motionEvent.getY() < q1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f22916i3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        cb0 cb0Var = this.f22916i3;
        cb0Var.invalidate();
        cb0Var.b();
    }
}
