package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
public final class a71 implements org.telegram.ui.Components.lm0, org.telegram.ui.Components.y00 {
    public final x71 f43596a;

    public a71(x71 x71Var) {
        this.f43596a = x71Var;
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public void l(boolean z9, float f10) {
        x71 x71Var = this.f43596a;
        x71Var.f51599m1 = f10;
        x71Var.p1();
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.f43596a.f51569c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x71 x71Var = this.f43596a;
        Scroller scroller = x71Var.f51569c;
        if (scroller != null) {
            scroller.abortAnimation();
            x71Var.f51569c.fling((int) x71Var.Y1, 0, Math.round(-f10), Math.round(f11), 0, (int) x71Var.X1, 0, Integer.MAX_VALUE);
            x71Var.f51627y0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x71 x71Var = this.f43596a;
        Scroller scroller = x71Var.f51569c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        x71Var.Y1 = Utilities.i(x71Var.Y1 + f10, x71Var.X1, 0.0f);
        x71Var.a1();
        x71Var.f51627y0.invalidate();
        return true;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public void D() {
    }

    @Override
    public void d1() {
    }
}
