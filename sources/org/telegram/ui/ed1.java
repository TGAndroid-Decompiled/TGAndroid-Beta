package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class ed1 implements org.telegram.ui.Components.fp0, org.telegram.ui.Components.v20 {
    public final ce1 f35265a;

    public ed1(ce1 ce1Var) {
        this.f35265a = ce1Var;
    }

    @Override
    public void X(float f7, boolean z10) {
        ce1 ce1Var = this.f35265a;
        ce1Var.l1 = f7;
        ce1Var.k1();
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f35265a.f34584c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ce1 ce1Var = this.f35265a;
        Scroller scroller = ce1Var.f34584c;
        if (scroller != null) {
            scroller.abortAnimation();
            ce1Var.f34584c.fling((int) ce1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) ce1Var.W1, 0, Integer.MAX_VALUE);
            ce1Var.f34639x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        ce1 ce1Var = this.f35265a;
        Scroller scroller = ce1Var.f34584c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        ce1Var.X1 = Utilities.clamp(ce1Var.X1 + f7, ce1Var.W1, 0.0f);
        ce1Var.V0();
        ce1Var.f34639x0.invalidate();
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
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void z() {
    }
}
