package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class pl0 extends u20 {
    public View f26206a;
    public final ql0 f26207b;

    public pl0(ql0 ql0Var) {
        this.f26207b = ql0Var;
    }

    @Override
    public final boolean a() {
        if (((vl0) this.f26207b.f26446b).Y0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        vl0 vl0Var = (vl0) this.f26207b.f26446b;
        if (view != null) {
            if (vl0Var.V0 != null || vl0Var.W0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                vl0Var.g1(view, x10, y3, true);
                int i10 = vl0Var.O1;
                if (vl0Var.R1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    jl0 jl0Var = vl0Var.V0;
                    if (jl0Var != null) {
                        jl0Var.d(i10, view);
                    } else {
                        kl0 kl0Var = vl0Var.W0;
                        if (kl0Var != null) {
                            kl0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                ol0 ol0Var = new ol0(this, view, i10, x10, y3);
                vl0Var.S1 = ol0Var;
                AndroidUtilities.runOnUIThread(ol0Var, ViewConfiguration.getPressedStateDuration());
                nl0 nl0Var = vl0Var.f27965e1;
                if (nl0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(nl0Var);
                    vl0Var.f27965e1 = null;
                    vl0Var.N1 = null;
                    vl0Var.P1 = false;
                    vl0Var.j1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        kl0 kl0Var;
        vl0 vl0Var = (vl0) this.f26207b.f26446b;
        View view = this.f26206a;
        if (view != null && (kl0Var = vl0Var.W0) != null && kl0Var.d1(view)) {
            vl0Var.W0.p0(this.f26206a, motionEvent.getX(), motionEvent.getY());
            this.f26206a = null;
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
        vl0 vl0Var = (vl0) this.f26207b.f26446b;
        View view = vl0Var.N1;
        if (view != null && (i10 = vl0Var.O1) != -1) {
            ll0 ll0Var = vl0Var.X0;
            if (ll0Var != null || vl0Var.Y0 != null) {
                if (ll0Var != null) {
                    if (ll0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (vl0Var.Y0.mo18c(motionEvent.getX() - vl0Var.N1.getX(), motionEvent.getY() - vl0Var.N1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    vl0Var.Z0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        kl0 kl0Var;
        View view = this.f26206a;
        if (view != null && (kl0Var = ((vl0) this.f26207b.f26446b).W0) != null && kl0Var.d1(view)) {
            b(motionEvent, this.f26206a);
            this.f26206a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        vl0 vl0Var = (vl0) this.f26207b.f26446b;
        View view = vl0Var.N1;
        if (view != null) {
            kl0 kl0Var = vl0Var.W0;
            if (kl0Var != null && kl0Var.d1(view)) {
                this.f26206a = vl0Var.N1;
                return false;
            }
            b(motionEvent, vl0Var.N1);
        }
        return false;
    }
}
