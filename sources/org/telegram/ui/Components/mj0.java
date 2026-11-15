package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class mj0 extends f10 {
    public View f37309a;
    public final nj0 f37310b;

    public mj0(nj0 nj0Var) {
        this.f37310b = nj0Var;
    }

    @Override
    public final boolean a() {
        if (((uj0) this.f37310b.f37624b).X0 != null) {
            return true;
        }
        return false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        uj0 uj0Var = (uj0) this.f37310b.f37624b;
        if (view != null) {
            if (uj0Var.U0 != null || uj0Var.V0 != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                uj0Var.j1(view, x10, y10, true);
                int i7 = uj0Var.N1;
                if (uj0Var.Q1 && i7 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    gj0 gj0Var = uj0Var.U0;
                    if (gj0Var != null) {
                        gj0Var.b(i7, view);
                    } else {
                        hj0 hj0Var = uj0Var.V0;
                        if (hj0Var != null) {
                            hj0Var.f(x10 - view.getX(), y10 - view.getY(), i7, view);
                        }
                    }
                }
                lj0 lj0Var = new lj0(this, view, i7, x10, y10);
                uj0Var.R1 = lj0Var;
                org.telegram.messenger.g0.i3(lj0Var, ViewConfiguration.getPressedStateDuration());
                kj0 kj0Var = uj0Var.f40049d1;
                if (kj0Var != null) {
                    org.telegram.messenger.g0.r(kj0Var);
                    uj0Var.f40049d1 = null;
                    uj0Var.M1 = null;
                    uj0Var.O1 = false;
                    uj0Var.m1(view, motionEvent);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        hj0 hj0Var;
        uj0 uj0Var = (uj0) this.f37310b.f37624b;
        View view = this.f37309a;
        if (view != null && (hj0Var = uj0Var.V0) != null && hj0Var.c1(view)) {
            uj0Var.V0.r0(this.f37309a, motionEvent.getX(), motionEvent.getY());
            this.f37309a = null;
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
        int i7;
        uj0 uj0Var = (uj0) this.f37310b.f37624b;
        View view = uj0Var.M1;
        if (view != null && (i7 = uj0Var.N1) != -1) {
            ij0 ij0Var = uj0Var.W0;
            if (ij0Var != null || uj0Var.X0 != null) {
                if (ij0Var != null) {
                    if (ij0Var.b(i7, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (uj0Var.X0.mo0f(motionEvent.getX() - uj0Var.M1.getX(), motionEvent.getY() - uj0Var.M1.getY(), i7, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    uj0Var.Y0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        hj0 hj0Var;
        View view = this.f37309a;
        if (view != null && (hj0Var = ((uj0) this.f37310b.f37624b).V0) != null && hj0Var.c1(view)) {
            b(this.f37309a, motionEvent);
            this.f37309a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        uj0 uj0Var = (uj0) this.f37310b.f37624b;
        View view = uj0Var.M1;
        if (view != null) {
            hj0 hj0Var = uj0Var.V0;
            if (hj0Var != null && hj0Var.c1(view)) {
                this.f37309a = uj0Var.M1;
                return false;
            }
            b(uj0Var.M1, motionEvent);
        }
        return false;
    }
}
