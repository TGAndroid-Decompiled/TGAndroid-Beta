package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class ml0 extends n20 {
    public View f27086a;
    public final f2.y f27087b;

    public ml0(f2.y yVar) {
        this.f27087b = yVar;
    }

    @Override
    public final boolean a() {
        if (((rl0) this.f27087b.f5851b).V0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        rl0 rl0Var = (rl0) this.f27087b.f5851b;
        if (view != null) {
            if (rl0Var.S0 != null || rl0Var.T0 != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                rl0Var.g1(view, x10, y10, true);
                int i10 = rl0Var.L1;
                if (rl0Var.O1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    hl0 hl0Var = rl0Var.S0;
                    if (hl0Var != null) {
                        hl0Var.d(i10, view);
                    } else {
                        il0 il0Var = rl0Var.T0;
                        if (il0Var != null) {
                            il0Var.c(x10 - view.getX(), y10 - view.getY(), i10, view);
                        }
                    }
                }
                ll0 ll0Var = new ll0(this, view, i10, x10, y10);
                rl0Var.P1 = ll0Var;
                AndroidUtilities.runOnUIThread(ll0Var, ViewConfiguration.getPressedStateDuration());
                fg.d dVar = rl0Var.f28489b1;
                if (dVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    rl0Var.f28489b1 = null;
                    rl0Var.K1 = null;
                    rl0Var.M1 = false;
                    rl0Var.j1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        il0 il0Var;
        rl0 rl0Var = (rl0) this.f27087b.f5851b;
        View view = this.f27086a;
        if (view != null && (il0Var = rl0Var.T0) != null && il0Var.Z0(view)) {
            rl0Var.T0.n0(this.f27086a, motionEvent.getX(), motionEvent.getY());
            this.f27086a = null;
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
        rl0 rl0Var = (rl0) this.f27087b.f5851b;
        View view = rl0Var.K1;
        if (view != null && (i10 = rl0Var.L1) != -1) {
            jl0 jl0Var = rl0Var.U0;
            if (jl0Var != null || rl0Var.V0 != null) {
                if (jl0Var != null) {
                    if (jl0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (rl0Var.V0.mo17c(motionEvent.getX() - rl0Var.K1.getX(), motionEvent.getY() - rl0Var.K1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    rl0Var.W0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        il0 il0Var;
        View view = this.f27086a;
        if (view != null && (il0Var = ((rl0) this.f27087b.f5851b).T0) != null && il0Var.Z0(view)) {
            b(motionEvent, this.f27086a);
            this.f27086a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        rl0 rl0Var = (rl0) this.f27087b.f5851b;
        View view = rl0Var.K1;
        if (view != null) {
            il0 il0Var = rl0Var.T0;
            if (il0Var != null && il0Var.Z0(view)) {
                this.f27086a = rl0Var.K1;
                return false;
            }
            b(motionEvent, rl0Var.K1);
        }
        return false;
    }
}
