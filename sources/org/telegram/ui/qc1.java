package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class qc1 implements org.telegram.ui.Components.ro0, org.telegram.ui.Components.j20 {
    public final od1 f36861a;

    public qc1(od1 od1Var) {
        this.f36861a = od1Var;
    }

    @Override
    public void X(float f7, boolean z10) {
        od1 od1Var = this.f36861a;
        od1Var.l1 = f7;
        od1Var.k1();
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
        Scroller scroller = this.f36861a.f36159c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        od1 od1Var = this.f36861a;
        Scroller scroller = od1Var.f36159c;
        if (scroller != null) {
            scroller.abortAnimation();
            od1Var.f36159c.fling((int) od1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) od1Var.W1, 0, Integer.MAX_VALUE);
            od1Var.f36214x0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        od1 od1Var = this.f36861a;
        Scroller scroller = od1Var.f36159c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        od1Var.X1 = Utilities.clamp(od1Var.X1 + f7, od1Var.W1, 0.0f);
        od1Var.V0();
        od1Var.f36214x0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void B() {
    }

    @Override
    public void b1() {
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }
}
