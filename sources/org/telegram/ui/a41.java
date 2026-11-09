package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class a41 extends org.telegram.ui.Components.w61 {
    public boolean V;
    public final d51 W;

    public a41(d51 d51Var, Activity activity) {
        super(activity, null);
        this.W = d51Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            d51 d51Var = this.W;
            if (d51Var.f44839j0 != null) {
                View currentView = getCurrentView();
                zd zdVar = d51Var.f44839j0;
                if (currentView == zdVar) {
                    boolean G = zdVar.G(motionEvent.getX() - d51Var.f44839j0.getX(), motionEvent.getY() - d51Var.f44839j0.getY());
                    zdVar.Q0 = G;
                    if (G && zdVar.f52504a1.f50655b.canScrollHorizontally(-1)) {
                        z9 = true;
                        this.V = z9;
                    }
                }
            }
            z9 = false;
            this.V = z9;
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
        d51 d51Var = this.W;
        d51Var.p0(d51Var.f44837h0.getCurrentPosition(), true);
        d51Var.q0(false, 0.0f);
    }

    @Override
    public final void w(boolean z9) {
        d51 d51Var = this.W;
        float positionAnimated = d51Var.f44837h0.getPositionAnimated();
        d51Var.q0(!z9, positionAnimated);
        if (!z9) {
            d51Var.p0(Math.round(positionAnimated), true);
        }
    }
}
