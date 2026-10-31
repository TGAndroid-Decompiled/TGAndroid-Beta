package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class lk0 extends r10 {
    public View f28132a;
    public final mk0 f28133b;

    public lk0(mk0 mk0Var) {
        this.f28133b = mk0Var;
    }

    @Override
    public final boolean a() {
        if (((tk0) this.f28133b.f28546b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        tk0 tk0Var = (tk0) this.f28133b.f28546b;
        if (view != null) {
            if (tk0Var.T0 != null || tk0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                tk0Var.j1(view, x10, y3, true);
                int i10 = tk0Var.M1;
                if (tk0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    gk0 gk0Var = tk0Var.T0;
                    if (gk0Var != null) {
                        gk0Var.f(i10, view);
                    } else {
                        hk0 hk0Var = tk0Var.U0;
                        if (hk0Var != null) {
                            hk0Var.b(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                kk0 kk0Var = new kk0(this, view, i10, x10, y3);
                tk0Var.Q1 = kk0Var;
                org.telegram.messenger.i0.h3(kk0Var, ViewConfiguration.getPressedStateDuration());
                lg.k kVar = tk0Var.f30603c1;
                if (kVar != null) {
                    org.telegram.messenger.i0.r(kVar);
                    tk0Var.f30603c1 = null;
                    tk0Var.L1 = null;
                    tk0Var.N1 = false;
                    tk0Var.m1(view, motionEvent);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        hk0 hk0Var;
        tk0 tk0Var = (tk0) this.f28133b.f28546b;
        View view = this.f28132a;
        if (view != null && (hk0Var = tk0Var.U0) != null && hk0Var.h1(view)) {
            tk0Var.U0.q0(this.f28132a, motionEvent.getX(), motionEvent.getY());
            this.f28132a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        int i10;
        tk0 tk0Var = (tk0) this.f28133b.f28546b;
        View view = tk0Var.L1;
        if (view != null && (i10 = tk0Var.M1) != -1) {
            ik0 ik0Var = tk0Var.V0;
            if (ik0Var != null || tk0Var.W0 != null) {
                if (ik0Var != null) {
                    if (ik0Var.f(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (tk0Var.W0.mo16b(motionEvent.getX() - tk0Var.L1.getX(), motionEvent.getY() - tk0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    tk0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        hk0 hk0Var;
        View view = this.f28132a;
        if (view != null && (hk0Var = ((tk0) this.f28133b.f28546b).U0) != null && hk0Var.h1(view)) {
            b(this.f28132a, motionEvent);
            this.f28132a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        tk0 tk0Var = (tk0) this.f28133b.f28546b;
        View view = tk0Var.L1;
        if (view != null) {
            hk0 hk0Var = tk0Var.U0;
            if (hk0Var != null && hk0Var.h1(view)) {
                this.f28132a = tk0Var.L1;
                return false;
            }
            b(tk0Var.L1, motionEvent);
        }
        return false;
    }
}
