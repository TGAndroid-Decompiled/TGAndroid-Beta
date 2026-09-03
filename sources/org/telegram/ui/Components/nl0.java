package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class nl0 extends n20 {
    public View f29514a;
    public final f2.y f29515b;

    public nl0(f2.y yVar) {
        this.f29515b = yVar;
    }

    @Override
    public final boolean a() {
        if (((sl0) this.f29515b.f5956b).V0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        sl0 sl0Var = (sl0) this.f29515b.f5956b;
        if (view != null) {
            if (sl0Var.S0 != null || sl0Var.T0 != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                sl0Var.g1(view, x10, y10, true);
                int i10 = sl0Var.L1;
                if (sl0Var.O1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    il0 il0Var = sl0Var.S0;
                    if (il0Var != null) {
                        il0Var.f(i10, view);
                    } else {
                        jl0 jl0Var = sl0Var.T0;
                        if (jl0Var != null) {
                            jl0Var.c(x10 - view.getX(), y10 - view.getY(), i10, view);
                        }
                    }
                }
                ml0 ml0Var = new ml0(this, view, i10, x10, y10);
                sl0Var.P1 = ml0Var;
                AndroidUtilities.runOnUIThread(ml0Var, ViewConfiguration.getPressedStateDuration());
                gg.d dVar = sl0Var.f31084b1;
                if (dVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    sl0Var.f31084b1 = null;
                    sl0Var.K1 = null;
                    sl0Var.M1 = false;
                    sl0Var.j1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        jl0 jl0Var;
        sl0 sl0Var = (sl0) this.f29515b.f5956b;
        View view = this.f29514a;
        if (view != null && (jl0Var = sl0Var.T0) != null && jl0Var.Y0(view)) {
            sl0Var.T0.r0(this.f29514a, motionEvent.getX(), motionEvent.getY());
            this.f29514a = null;
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
        sl0 sl0Var = (sl0) this.f29515b.f5956b;
        View view = sl0Var.K1;
        if (view != null && (i10 = sl0Var.L1) != -1) {
            kl0 kl0Var = sl0Var.U0;
            if (kl0Var != null || sl0Var.V0 != null) {
                if (kl0Var != null) {
                    if (kl0Var.f(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (sl0Var.V0.mo17c(motionEvent.getX() - sl0Var.K1.getX(), motionEvent.getY() - sl0Var.K1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    sl0Var.W0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        jl0 jl0Var;
        View view = this.f29514a;
        if (view != null && (jl0Var = ((sl0) this.f29515b.f5956b).T0) != null && jl0Var.Y0(view)) {
            b(motionEvent, this.f29514a);
            this.f29514a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sl0 sl0Var = (sl0) this.f29515b.f5956b;
        View view = sl0Var.K1;
        if (view != null) {
            jl0 jl0Var = sl0Var.T0;
            if (jl0Var != null && jl0Var.Y0(view)) {
                this.f29514a = sl0Var.K1;
                return false;
            }
            b(motionEvent, sl0Var.K1);
        }
        return false;
    }
}
