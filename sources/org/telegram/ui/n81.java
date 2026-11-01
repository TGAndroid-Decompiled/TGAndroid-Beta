package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class n81 implements org.telegram.ui.Components.nn0, org.telegram.ui.Components.o10 {
    public final k91 f39772a;

    public n81(k91 k91Var) {
        this.f39772a = k91Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void k(boolean z10, float f7) {
        k91 k91Var = this.f39772a;
        k91Var.f38749m1 = f7;
        k91Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f39772a.f38719c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        k91 k91Var = this.f39772a;
        Scroller scroller = k91Var.f38719c;
        if (scroller != null) {
            scroller.abortAnimation();
            k91Var.f38719c.fling((int) k91Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) k91Var.X1, 0, Integer.MAX_VALUE);
            k91Var.f38778y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        k91 k91Var = this.f39772a;
        Scroller scroller = k91Var.f38719c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        k91Var.Y1 = Utilities.i(k91Var.Y1 + f7, k91Var.X1, 0.0f);
        k91Var.a1();
        k91Var.f38778y0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void C() {
    }

    @Override
    public void e1() {
    }
}
