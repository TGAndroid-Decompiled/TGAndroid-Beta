package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class qb1 implements org.telegram.ui.Components.on0, org.telegram.ui.Components.t10 {
    public final oc1 f41753a;

    public qb1(oc1 oc1Var) {
        this.f41753a = oc1Var;
    }

    @Override
    public void Q(float f10, boolean z10) {
        oc1 oc1Var = this.f41753a;
        oc1Var.f41081h1 = f10;
        oc1Var.k1();
    }

    @Override
    public int c0() {
        return 0;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f41753a.f41063c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        oc1 oc1Var = this.f41753a;
        Scroller scroller = oc1Var.f41063c;
        if (scroller != null) {
            scroller.abortAnimation();
            oc1Var.f41063c.fling((int) oc1Var.T1, 0, Math.round(-f10), Math.round(f11), 0, (int) oc1Var.S1, 0, Integer.MAX_VALUE);
            oc1Var.f41105t0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        oc1 oc1Var = this.f41753a;
        Scroller scroller = oc1Var.f41063c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        oc1Var.T1 = Utilities.clamp(oc1Var.T1 + f10, oc1Var.S1, 0.0f);
        oc1Var.V0();
        oc1Var.f41105t0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void b1() {
    }

    @Override
    public void n() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }
}
