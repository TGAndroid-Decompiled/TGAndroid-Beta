package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class gm0 extends u20 {
    public View f26676a;
    public final hm0 f26677b;

    public gm0(hm0 hm0Var) {
        this.f26677b = hm0Var;
    }

    @Override
    public final boolean a() {
        if (((mm0) this.f26677b.f26986b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        mm0 mm0Var = (mm0) this.f26677b.f26986b;
        if (view != null) {
            if (mm0Var.T0 != null || mm0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                mm0Var.j1(view, x10, y3, true);
                int i10 = mm0Var.M1;
                if (mm0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    am0 am0Var = mm0Var.T0;
                    if (am0Var != null) {
                        am0Var.d(i10, view);
                    } else {
                        bm0 bm0Var = mm0Var.U0;
                        if (bm0Var != null) {
                            bm0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                fm0 fm0Var = new fm0(this, view, i10, x10, y3);
                mm0Var.Q1 = fm0Var;
                AndroidUtilities.runOnUIThread(fm0Var, ViewConfiguration.getPressedStateDuration());
                em0 em0Var = mm0Var.f28683c1;
                if (em0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(em0Var);
                    mm0Var.f28683c1 = null;
                    mm0Var.L1 = null;
                    mm0Var.N1 = false;
                    mm0Var.m1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        bm0 bm0Var;
        mm0 mm0Var = (mm0) this.f26677b.f26986b;
        View view = this.f26676a;
        if (view != null && (bm0Var = mm0Var.U0) != null && bm0Var.P0(view)) {
            mm0Var.U0.a0(this.f26676a, motionEvent.getX(), motionEvent.getY());
            this.f26676a = null;
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
        mm0 mm0Var = (mm0) this.f26677b.f26986b;
        View view = mm0Var.L1;
        if (view != null && (i10 = mm0Var.M1) != -1) {
            cm0 cm0Var = mm0Var.V0;
            if (cm0Var != null || mm0Var.W0 != null) {
                if (cm0Var != null) {
                    if (cm0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (mm0Var.W0.mo17c(motionEvent.getX() - mm0Var.L1.getX(), motionEvent.getY() - mm0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    mm0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bm0 bm0Var;
        View view = this.f26676a;
        if (view != null && (bm0Var = ((mm0) this.f26677b.f26986b).U0) != null && bm0Var.P0(view)) {
            b(motionEvent, this.f26676a);
            this.f26676a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        mm0 mm0Var = (mm0) this.f26677b.f26986b;
        View view = mm0Var.L1;
        if (view != null) {
            bm0 bm0Var = mm0Var.U0;
            if (bm0Var != null && bm0Var.P0(view)) {
                this.f26676a = mm0Var.L1;
                return false;
            }
            b(motionEvent, mm0Var.L1);
        }
        return false;
    }
}
