package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class q51 extends org.telegram.ui.Components.x71 {
    public boolean V;
    public final s61 W;

    public q51(s61 s61Var, Activity activity) {
        super(activity, null);
        this.W = s61Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s61 s61Var = this.W;
            if (s61Var.f41249j0 != null) {
                View currentView = getCurrentView();
                le leVar = s61Var.f41249j0;
                if (currentView == leVar) {
                    boolean G = leVar.G(motionEvent.getX() - s61Var.f41249j0.getX(), motionEvent.getY() - s61Var.f41249j0.getY());
                    leVar.Q0 = G;
                    if (G && leVar.f39201a1.f37796b.canScrollHorizontally(-1)) {
                        z10 = true;
                        this.V = z10;
                    }
                }
            }
            z10 = false;
            this.V = z10;
        }
        try {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return dispatchTouchEvent;
            }
            this.V = false;
            return dispatchTouchEvent;
        } catch (Throwable th2) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.V = false;
            }
            throw th2;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.V && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.V && B(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void u() {
        s61 s61Var = this.W;
        s61Var.p0(s61Var.f41247h0.getCurrentPosition(), true);
        s61Var.q0(false, 0.0f);
    }

    @Override
    public final void w(boolean z10) {
        s61 s61Var = this.W;
        float positionAnimated = s61Var.f41247h0.getPositionAnimated();
        s61Var.q0(!z10, positionAnimated);
        if (!z10) {
            s61Var.p0(Math.round(positionAnimated), true);
        }
    }
}
