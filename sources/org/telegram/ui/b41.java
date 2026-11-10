package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
public final class b41 extends org.telegram.ui.Components.v61 {
    public boolean V;
    public final e51 W;

    public b41(e51 e51Var, Activity activity) {
        super(activity, null);
        this.W = e51Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            e51 e51Var = this.W;
            if (e51Var.f45152j0 != null) {
                View currentView = getCurrentView();
                zd zdVar = e51Var.f45152j0;
                if (currentView == zdVar) {
                    boolean G = zdVar.G(motionEvent.getX() - e51Var.f45152j0.getX(), motionEvent.getY() - e51Var.f45152j0.getY());
                    zdVar.Q0 = G;
                    if (G && zdVar.f52411a1.f50705b.canScrollHorizontally(-1)) {
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
        e51 e51Var = this.W;
        e51Var.p0(e51Var.f45150h0.getCurrentPosition(), true);
        e51Var.q0(false, 0.0f);
    }

    @Override
    public final void w(boolean z9) {
        e51 e51Var = this.W;
        float positionAnimated = e51Var.f45150h0.getPositionAnimated();
        e51Var.q0(!z9, positionAnimated);
        if (!z9) {
            e51Var.p0(Math.round(positionAnimated), true);
        }
    }
}
