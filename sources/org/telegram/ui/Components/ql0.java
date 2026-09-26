package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class ql0 extends m20 {
    public View f27700a;
    public final rl0 f27701b;

    public ql0(rl0 rl0Var) {
        this.f27701b = rl0Var;
    }

    @Override
    public final boolean a() {
        if (((wl0) this.f27701b.f27998b).Y0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        wl0 wl0Var = (wl0) this.f27701b.f27998b;
        if (view != null) {
            if (wl0Var.V0 != null || wl0Var.W0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                wl0Var.h1(view, x10, y3, true);
                int i10 = wl0Var.O1;
                if (wl0Var.R1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    kl0 kl0Var = wl0Var.V0;
                    if (kl0Var != null) {
                        kl0Var.d(i10, view);
                    } else {
                        ll0 ll0Var = wl0Var.W0;
                        if (ll0Var != null) {
                            ll0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                pl0 pl0Var = new pl0(this, view, i10, x10, y3);
                wl0Var.S1 = pl0Var;
                AndroidUtilities.runOnUIThread(pl0Var, ViewConfiguration.getPressedStateDuration());
                ol0 ol0Var = wl0Var.f30092e1;
                if (ol0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ol0Var);
                    wl0Var.f30092e1 = null;
                    wl0Var.N1 = null;
                    wl0Var.P1 = false;
                    wl0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ll0 ll0Var;
        wl0 wl0Var = (wl0) this.f27701b.f27998b;
        View view = this.f27700a;
        if (view != null && (ll0Var = wl0Var.W0) != null && ll0Var.d1(view)) {
            wl0Var.W0.r0(this.f27700a, motionEvent.getX(), motionEvent.getY());
            this.f27700a = null;
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
        wl0 wl0Var = (wl0) this.f27701b.f27998b;
        View view = wl0Var.N1;
        if (view != null && (i10 = wl0Var.O1) != -1) {
            ml0 ml0Var = wl0Var.X0;
            if (ml0Var != null || wl0Var.Y0 != null) {
                if (ml0Var != null) {
                    if (ml0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (wl0Var.Y0.mo18c(motionEvent.getX() - wl0Var.N1.getX(), motionEvent.getY() - wl0Var.N1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    wl0Var.Z0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ll0 ll0Var;
        View view = this.f27700a;
        if (view != null && (ll0Var = ((wl0) this.f27701b.f27998b).W0) != null && ll0Var.d1(view)) {
            b(motionEvent, this.f27700a);
            this.f27700a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        wl0 wl0Var = (wl0) this.f27701b.f27998b;
        View view = wl0Var.N1;
        if (view != null) {
            ll0 ll0Var = wl0Var.W0;
            if (ll0Var != null && ll0Var.d1(view)) {
                this.f27700a = wl0Var.N1;
                return false;
            }
            b(motionEvent, wl0Var.N1);
        }
        return false;
    }
}
