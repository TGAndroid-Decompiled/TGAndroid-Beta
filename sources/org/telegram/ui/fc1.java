package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class fc1 implements org.telegram.ui.Components.ko0, org.telegram.ui.Components.k20 {
    public final ed1 f36851a;

    public fc1(ed1 ed1Var) {
        this.f36851a = ed1Var;
    }

    @Override
    public void X(float f10, boolean z4) {
        ed1 ed1Var = this.f36851a;
        ed1Var.f36514i1 = f10;
        ed1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int m0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f36851a.f36493c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ed1 ed1Var = this.f36851a;
        Scroller scroller = ed1Var.f36493c;
        if (scroller != null) {
            scroller.abortAnimation();
            ed1Var.f36493c.fling((int) ed1Var.U1, 0, Math.round(-f10), Math.round(f11), 0, (int) ed1Var.T1, 0, Integer.MAX_VALUE);
            ed1Var.f36538u0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ed1 ed1Var = this.f36851a;
        Scroller scroller = ed1Var.f36493c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        ed1Var.U1 = Utilities.clamp(ed1Var.U1 + f10, ed1Var.T1, 0.0f);
        ed1Var.V0();
        ed1Var.f36538u0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void A() {
    }

    @Override
    public void X0() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }
}
