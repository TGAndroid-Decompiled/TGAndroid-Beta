package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class rl0 extends n20 {
    public View f27996a;
    public final sl0 f27997b;

    public rl0(sl0 sl0Var) {
        this.f27997b = sl0Var;
    }

    @Override
    public final boolean a() {
        if (((xl0) this.f27997b.f28307b).Y0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        xl0 xl0Var = (xl0) this.f27997b.f28307b;
        if (view != null) {
            if (xl0Var.V0 != null || xl0Var.W0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                xl0Var.h1(view, x10, y3, true);
                int i10 = xl0Var.O1;
                if (xl0Var.R1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    ll0 ll0Var = xl0Var.V0;
                    if (ll0Var != null) {
                        ll0Var.d(i10, view);
                    } else {
                        ml0 ml0Var = xl0Var.W0;
                        if (ml0Var != null) {
                            ml0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                ql0 ql0Var = new ql0(this, view, i10, x10, y3);
                xl0Var.S1 = ql0Var;
                AndroidUtilities.runOnUIThread(ql0Var, ViewConfiguration.getPressedStateDuration());
                pl0 pl0Var = xl0Var.f30377e1;
                if (pl0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(pl0Var);
                    xl0Var.f30377e1 = null;
                    xl0Var.N1 = null;
                    xl0Var.P1 = false;
                    xl0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ml0 ml0Var;
        xl0 xl0Var = (xl0) this.f27997b.f28307b;
        View view = this.f27996a;
        if (view != null && (ml0Var = xl0Var.W0) != null && ml0Var.d1(view)) {
            xl0Var.W0.r0(this.f27996a, motionEvent.getX(), motionEvent.getY());
            this.f27996a = null;
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
        xl0 xl0Var = (xl0) this.f27997b.f28307b;
        View view = xl0Var.N1;
        if (view != null && (i10 = xl0Var.O1) != -1) {
            nl0 nl0Var = xl0Var.X0;
            if (nl0Var != null || xl0Var.Y0 != null) {
                if (nl0Var != null) {
                    if (nl0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (xl0Var.Y0.mo18c(motionEvent.getX() - xl0Var.N1.getX(), motionEvent.getY() - xl0Var.N1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    xl0Var.Z0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ml0 ml0Var;
        View view = this.f27996a;
        if (view != null && (ml0Var = ((xl0) this.f27997b.f28307b).W0) != null && ml0Var.d1(view)) {
            b(motionEvent, this.f27996a);
            this.f27996a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        xl0 xl0Var = (xl0) this.f27997b.f28307b;
        View view = xl0Var.N1;
        if (view != null) {
            ml0 ml0Var = xl0Var.W0;
            if (ml0Var != null && ml0Var.d1(view)) {
                this.f27996a = xl0Var.N1;
                return false;
            }
            b(motionEvent, xl0Var.N1);
        }
        return false;
    }
}
