package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class rk0 extends w10 {
    public View f32192a;
    public final f2.a0 f32193b;

    public rk0(f2.a0 a0Var) {
        this.f32193b = a0Var;
    }

    @Override
    public final boolean a() {
        if (((wk0) this.f32193b.f5310b).U0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        wk0 wk0Var = (wk0) this.f32193b.f5310b;
        if (view != null) {
            if (wk0Var.R0 != null || wk0Var.S0 != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                wk0Var.h1(view, x10, y10, true);
                int i9 = wk0Var.K1;
                if (wk0Var.N1 && i9 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    mk0 mk0Var = wk0Var.R0;
                    if (mk0Var != null) {
                        mk0Var.a(i9, view);
                    } else {
                        nk0 nk0Var = wk0Var.S0;
                        if (nk0Var != null) {
                            nk0Var.c(x10 - view.getX(), y10 - view.getY(), i9, view);
                        }
                    }
                }
                qk0 qk0Var = new qk0(this, view, i9, x10, y10);
                wk0Var.O1 = qk0Var;
                AndroidUtilities.runOnUIThread(qk0Var, ViewConfiguration.getPressedStateDuration());
                ag.d dVar = wk0Var.f34239a1;
                if (dVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    wk0Var.f34239a1 = null;
                    wk0Var.J1 = null;
                    wk0Var.L1 = false;
                    wk0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        nk0 nk0Var;
        wk0 wk0Var = (wk0) this.f32193b.f5310b;
        View view = this.f32192a;
        if (view != null && (nk0Var = wk0Var.S0) != null && nk0Var.f1(view)) {
            wk0Var.S0.g0(this.f32192a, motionEvent.getX(), motionEvent.getY());
            this.f32192a = null;
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
        int i9;
        wk0 wk0Var = (wk0) this.f32193b.f5310b;
        View view = wk0Var.J1;
        if (view != null && (i9 = wk0Var.K1) != -1) {
            ok0 ok0Var = wk0Var.T0;
            if (ok0Var != null || wk0Var.U0 != null) {
                if (ok0Var != null) {
                    if (ok0Var.a(i9, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (wk0Var.U0.mo5c(motionEvent.getX() - wk0Var.J1.getX(), motionEvent.getY() - wk0Var.J1.getY(), i9, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    wk0Var.V0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        nk0 nk0Var;
        View view = this.f32192a;
        if (view != null && (nk0Var = ((wk0) this.f32193b.f5310b).S0) != null && nk0Var.f1(view)) {
            b(motionEvent, this.f32192a);
            this.f32192a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        wk0 wk0Var = (wk0) this.f32193b.f5310b;
        View view = wk0Var.J1;
        if (view != null) {
            nk0 nk0Var = wk0Var.S0;
            if (nk0Var != null && nk0Var.f1(view)) {
                this.f32192a = wk0Var.J1;
                return false;
            }
            b(motionEvent, wk0Var.J1);
        }
        return false;
    }
}
