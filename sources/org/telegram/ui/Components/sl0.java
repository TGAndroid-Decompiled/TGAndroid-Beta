package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class sl0 extends l20 {
    public View f28272a;
    public final tl0 f28273b;

    public sl0(tl0 tl0Var) {
        this.f28273b = tl0Var;
    }

    @Override
    public final boolean a() {
        if (((yl0) this.f28273b.f28496b).Y0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        yl0 yl0Var = (yl0) this.f28273b.f28496b;
        if (view != null) {
            if (yl0Var.V0 != null || yl0Var.W0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                yl0Var.i1(view, x10, y3, true);
                int i10 = yl0Var.O1;
                if (yl0Var.R1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    ml0 ml0Var = yl0Var.V0;
                    if (ml0Var != null) {
                        ml0Var.d(i10, view);
                    } else {
                        nl0 nl0Var = yl0Var.W0;
                        if (nl0Var != null) {
                            nl0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                rl0 rl0Var = new rl0(this, view, i10, x10, y3);
                yl0Var.S1 = rl0Var;
                AndroidUtilities.runOnUIThread(rl0Var, ViewConfiguration.getPressedStateDuration());
                ql0 ql0Var = yl0Var.f30682e1;
                if (ql0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ql0Var);
                    yl0Var.f30682e1 = null;
                    yl0Var.N1 = null;
                    yl0Var.P1 = false;
                    yl0Var.l1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        nl0 nl0Var;
        yl0 yl0Var = (yl0) this.f28273b.f28496b;
        View view = this.f28272a;
        if (view != null && (nl0Var = yl0Var.W0) != null && nl0Var.c1(view)) {
            yl0Var.W0.q0(this.f28272a, motionEvent.getX(), motionEvent.getY());
            this.f28272a = null;
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
        yl0 yl0Var = (yl0) this.f28273b.f28496b;
        View view = yl0Var.N1;
        if (view != null && (i10 = yl0Var.O1) != -1) {
            ol0 ol0Var = yl0Var.X0;
            if (ol0Var != null || yl0Var.Y0 != null) {
                if (ol0Var != null) {
                    if (ol0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (yl0Var.Y0.mo18c(motionEvent.getX() - yl0Var.N1.getX(), motionEvent.getY() - yl0Var.N1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    yl0Var.Z0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        nl0 nl0Var;
        View view = this.f28272a;
        if (view != null && (nl0Var = ((yl0) this.f28273b.f28496b).W0) != null && nl0Var.c1(view)) {
            b(motionEvent, this.f28272a);
            this.f28272a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        yl0 yl0Var = (yl0) this.f28273b.f28496b;
        View view = yl0Var.N1;
        if (view != null) {
            nl0 nl0Var = yl0Var.W0;
            if (nl0Var != null && nl0Var.c1(view)) {
                this.f28272a = yl0Var.N1;
                return false;
            }
            b(motionEvent, yl0Var.N1);
        }
        return false;
    }
}
