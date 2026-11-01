package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class mk0 extends r10 {
    public View f28509a;
    public final nk0 f28510b;

    public mk0(nk0 nk0Var) {
        this.f28510b = nk0Var;
    }

    @Override
    public final boolean a() {
        if (((uk0) this.f28510b.f28908b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        uk0 uk0Var = (uk0) this.f28510b.f28908b;
        if (view != null) {
            if (uk0Var.T0 != null || uk0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                uk0Var.j1(view, x10, y3, true);
                int i10 = uk0Var.M1;
                if (uk0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    hk0 hk0Var = uk0Var.T0;
                    if (hk0Var != null) {
                        hk0Var.f(i10, view);
                    } else {
                        ik0 ik0Var = uk0Var.U0;
                        if (ik0Var != null) {
                            ik0Var.b(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                lk0 lk0Var = new lk0(this, view, i10, x10, y3);
                uk0Var.Q1 = lk0Var;
                org.telegram.messenger.i0.h3(lk0Var, ViewConfiguration.getPressedStateDuration());
                lg.k kVar = uk0Var.f30986c1;
                if (kVar != null) {
                    org.telegram.messenger.i0.r(kVar);
                    uk0Var.f30986c1 = null;
                    uk0Var.L1 = null;
                    uk0Var.N1 = false;
                    uk0Var.m1(view, motionEvent);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ik0 ik0Var;
        uk0 uk0Var = (uk0) this.f28510b.f28908b;
        View view = this.f28509a;
        if (view != null && (ik0Var = uk0Var.U0) != null && ik0Var.h1(view)) {
            uk0Var.U0.q0(this.f28509a, motionEvent.getX(), motionEvent.getY());
            this.f28509a = null;
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
        uk0 uk0Var = (uk0) this.f28510b.f28908b;
        View view = uk0Var.L1;
        if (view != null && (i10 = uk0Var.M1) != -1) {
            jk0 jk0Var = uk0Var.V0;
            if (jk0Var != null || uk0Var.W0 != null) {
                if (jk0Var != null) {
                    if (jk0Var.f(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (uk0Var.W0.mo16b(motionEvent.getX() - uk0Var.L1.getX(), motionEvent.getY() - uk0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    uk0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ik0 ik0Var;
        View view = this.f28509a;
        if (view != null && (ik0Var = ((uk0) this.f28510b.f28908b).U0) != null && ik0Var.h1(view)) {
            b(this.f28509a, motionEvent);
            this.f28509a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        uk0 uk0Var = (uk0) this.f28510b.f28908b;
        View view = uk0Var.L1;
        if (view != null) {
            ik0 ik0Var = uk0Var.U0;
            if (ik0Var != null && ik0Var.h1(view)) {
                this.f28509a = uk0Var.L1;
                return false;
            }
            b(uk0Var.L1, motionEvent);
        }
        return false;
    }
}
