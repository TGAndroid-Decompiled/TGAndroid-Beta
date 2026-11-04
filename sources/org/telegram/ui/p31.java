package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class p31 extends org.telegram.ui.Components.n61 {
    public boolean W;
    public final r41 f48453a0;

    public p31(r41 r41Var, Activity activity) {
        super(activity, null);
        this.f48453a0 = r41Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r41 r41Var = this.f48453a0;
            if (r41Var.f49078k0 != null) {
                View currentView = getCurrentView();
                xd xdVar = r41Var.f49078k0;
                if (currentView == xdVar) {
                    boolean G = xdVar.G(motionEvent.getX() - r41Var.f49078k0.getX(), motionEvent.getY() - r41Var.f49078k0.getY());
                    xdVar.R0 = G;
                    if (G && xdVar.f51915b1.f49776b.canScrollHorizontally(-1)) {
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
        if (!this.W && A(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        r41 r41Var = this.f48453a0;
        r41Var.p0(r41Var.f49076i0.getCurrentPosition(), true);
        r41Var.q0(false, 0.0f);
    }

    @Override
    public final void u(boolean z10) {
        r41 r41Var = this.f48453a0;
        float positionAnimated = r41Var.f49076i0.getPositionAnimated();
        r41Var.q0(!z10, positionAnimated);
        if (!z10) {
            r41Var.p0(Math.round(positionAnimated), true);
        }
    }
}
