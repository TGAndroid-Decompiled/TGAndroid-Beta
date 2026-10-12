package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class qm0 extends f30 {
    public View f29864a;
    public final rm0 f29865b;

    public qm0(rm0 rm0Var) {
        this.f29865b = rm0Var;
    }

    @Override
    public final boolean a() {
        if (((wm0) this.f29865b.f30192b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        wm0 wm0Var = (wm0) this.f29865b.f30192b;
        if (view != null) {
            if (wm0Var.T0 != null || wm0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                wm0Var.h1(view, x10, y3, true);
                int i10 = wm0Var.M1;
                if (wm0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    km0 km0Var = wm0Var.T0;
                    if (km0Var != null) {
                        km0Var.d(i10, view);
                    } else {
                        lm0 lm0Var = wm0Var.U0;
                        if (lm0Var != null) {
                            lm0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                pm0 pm0Var = new pm0(this, view, i10, x10, y3);
                wm0Var.Q1 = pm0Var;
                AndroidUtilities.runOnUIThread(pm0Var, ViewConfiguration.getPressedStateDuration());
                om0 om0Var = wm0Var.f32445c1;
                if (om0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(om0Var);
                    wm0Var.f32445c1 = null;
                    wm0Var.L1 = null;
                    wm0Var.N1 = false;
                    wm0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        lm0 lm0Var;
        wm0 wm0Var = (wm0) this.f29865b.f30192b;
        View view = this.f29864a;
        if (view != null && (lm0Var = wm0Var.U0) != null && lm0Var.Y0(view)) {
            wm0Var.U0.n0(this.f29864a, motionEvent.getX(), motionEvent.getY());
            this.f29864a = null;
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
        wm0 wm0Var = (wm0) this.f29865b.f30192b;
        View view = wm0Var.L1;
        if (view != null && (i10 = wm0Var.M1) != -1) {
            mm0 mm0Var = wm0Var.V0;
            if (mm0Var != null || wm0Var.W0 != null) {
                if (mm0Var != null) {
                    if (mm0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (wm0Var.W0.mo17c(motionEvent.getX() - wm0Var.L1.getX(), motionEvent.getY() - wm0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    wm0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        lm0 lm0Var;
        View view = this.f29864a;
        if (view != null && (lm0Var = ((wm0) this.f29865b.f30192b).U0) != null && lm0Var.Y0(view)) {
            b(motionEvent, this.f29864a);
            this.f29864a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        wm0 wm0Var = (wm0) this.f29865b.f30192b;
        View view = wm0Var.L1;
        if (view != null) {
            lm0 lm0Var = wm0Var.U0;
            if (lm0Var != null && lm0Var.Y0(view)) {
                this.f29864a = wm0Var.L1;
                return false;
            }
            b(motionEvent, wm0Var.L1);
        }
        return false;
    }
}
