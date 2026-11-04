package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class lj0 extends x00 {
    public View f35780a;
    public final mj0 f35781b;

    public lj0(mj0 mj0Var) {
        this.f35781b = mj0Var;
    }

    @Override
    public final boolean a() {
        if (((tj0) this.f35781b.f36172b).X0 != null) {
            return true;
        }
        return false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        tj0 tj0Var = (tj0) this.f35781b.f36172b;
        if (view != null) {
            if (tj0Var.U0 != null || tj0Var.V0 != null) {
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                tj0Var.j1(view, x10, y9, true);
                int i3 = tj0Var.N1;
                if (tj0Var.Q1 && i3 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    fj0 fj0Var = tj0Var.U0;
                    if (fj0Var != null) {
                        fj0Var.f(i3, view);
                    } else {
                        gj0 gj0Var = tj0Var.V0;
                        if (gj0Var != null) {
                            gj0Var.b(x10 - view.getX(), y9 - view.getY(), i3, view);
                        }
                    }
                }
                kj0 kj0Var = new kj0(this, view, i3, x10, y9);
                tj0Var.R1 = kj0Var;
                org.telegram.messenger.g0.i3(kj0Var, ViewConfiguration.getPressedStateDuration());
                jj0 jj0Var = tj0Var.f38439d1;
                if (jj0Var != null) {
                    org.telegram.messenger.g0.r(jj0Var);
                    tj0Var.f38439d1 = null;
                    tj0Var.M1 = null;
                    tj0Var.O1 = false;
                    tj0Var.m1(view, motionEvent);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        gj0 gj0Var;
        tj0 tj0Var = (tj0) this.f35781b.f36172b;
        View view = this.f35780a;
        if (view != null && (gj0Var = tj0Var.V0) != null && gj0Var.b1(view)) {
            tj0Var.V0.r0(this.f35780a, motionEvent.getX(), motionEvent.getY());
            this.f35780a = null;
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
        int i3;
        tj0 tj0Var = (tj0) this.f35781b.f36172b;
        View view = tj0Var.M1;
        if (view != null && (i3 = tj0Var.N1) != -1) {
            hj0 hj0Var = tj0Var.W0;
            if (hj0Var != null || tj0Var.X0 != null) {
                if (hj0Var != null) {
                    if (hj0Var.f(i3, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (tj0Var.X0.mo20b(motionEvent.getX() - tj0Var.M1.getX(), motionEvent.getY() - tj0Var.M1.getY(), i3, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    tj0Var.Y0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        gj0 gj0Var;
        View view = this.f35780a;
        if (view != null && (gj0Var = ((tj0) this.f35781b.f36172b).V0) != null && gj0Var.b1(view)) {
            b(this.f35780a, motionEvent);
            this.f35780a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        tj0 tj0Var = (tj0) this.f35781b.f36172b;
        View view = tj0Var.M1;
        if (view != null) {
            gj0 gj0Var = tj0Var.V0;
            if (gj0Var != null && gj0Var.b1(view)) {
                this.f35780a = tj0Var.M1;
                return false;
            }
            b(tj0Var.M1, motionEvent);
        }
        return false;
    }
}
