package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class a41 extends org.telegram.ui.Components.j71 {
    public boolean W;
    public final c51 f45496a0;

    public a41(c51 c51Var, Activity activity) {
        super(activity, null);
        this.f45496a0 = c51Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            c51 c51Var = this.f45496a0;
            if (c51Var.f46443k0 != null) {
                View currentView = getCurrentView();
                xd xdVar = c51Var.f46443k0;
                if (currentView == xdVar) {
                    boolean G = xdVar.G(motionEvent.getX() - c51Var.f46443k0.getX(), motionEvent.getY() - c51Var.f46443k0.getY());
                    xdVar.R0 = G;
                    if (G && xdVar.f53830b1.f52303b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.W = z10;
                    }
                }
            }
            z10 = false;
            this.W = z10;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.W = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.W = false;
            }
            throw th2;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.W && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.W && x(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void q() {
        c51 c51Var = this.f45496a0;
        c51Var.p0(c51Var.f46441i0.getCurrentPosition(), true);
        c51Var.q0(false, 0.0f);
    }

    @Override
    public final void s(boolean z10) {
        c51 c51Var = this.f45496a0;
        float positionAnimated = c51Var.f46441i0.getPositionAnimated();
        c51Var.q0(!z10, positionAnimated);
        if (!z10) {
            c51Var.p0(Math.round(positionAnimated), true);
        }
    }
}
