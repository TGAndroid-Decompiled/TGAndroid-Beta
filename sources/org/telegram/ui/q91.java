package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class q91 extends org.telegram.ui.Components.h91 {
    public boolean V;
    public final ta1 W;

    public q91(ta1 ta1Var, Activity activity) {
        super(activity, null);
        this.W = ta1Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ta1 ta1Var = this.W;
            if (ta1Var.f40816j0 != null) {
                View currentView = getCurrentView();
                me meVar = ta1Var.f40816j0;
                if (currentView == meVar) {
                    boolean G = meVar.G(motionEvent.getX() - ta1Var.f40816j0.getX(), motionEvent.getY() - ta1Var.f40816j0.getY());
                    meVar.Q0 = G;
                    if (G && meVar.f38580a1.f37389b.canScrollHorizontally(-1)) {
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
        ta1 ta1Var = this.W;
        ta1Var.k0(ta1Var.f40814h0.getCurrentPosition(), true);
        ta1Var.l0(0.0f, false);
    }

    @Override
    public final void w(boolean z10) {
        ta1 ta1Var = this.W;
        float positionAnimated = ta1Var.f40814h0.getPositionAnimated();
        ta1Var.l0(positionAnimated, !z10);
        if (!z10) {
            ta1Var.k0(Math.round(positionAnimated), true);
        }
    }
}
