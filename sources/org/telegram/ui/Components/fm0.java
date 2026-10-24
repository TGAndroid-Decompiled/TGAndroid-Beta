package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class fm0 extends s20 {
    public View f26393a;
    public final gm0 f26394b;

    public fm0(gm0 gm0Var) {
        this.f26394b = gm0Var;
    }

    @Override
    public final boolean a() {
        if (((lm0) this.f26394b.f26729b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        lm0 lm0Var = (lm0) this.f26394b.f26729b;
        if (view != null) {
            if (lm0Var.T0 != null || lm0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                lm0Var.j1(view, x10, y3, true);
                int i10 = lm0Var.M1;
                if (lm0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    zl0 zl0Var = lm0Var.T0;
                    if (zl0Var != null) {
                        zl0Var.d(i10, view);
                    } else {
                        am0 am0Var = lm0Var.U0;
                        if (am0Var != null) {
                            am0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                em0 em0Var = new em0(this, view, i10, x10, y3);
                lm0Var.Q1 = em0Var;
                AndroidUtilities.runOnUIThread(em0Var, ViewConfiguration.getPressedStateDuration());
                dm0 dm0Var = lm0Var.f28374c1;
                if (dm0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(dm0Var);
                    lm0Var.f28374c1 = null;
                    lm0Var.L1 = null;
                    lm0Var.N1 = false;
                    lm0Var.m1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        am0 am0Var;
        lm0 lm0Var = (lm0) this.f26394b.f26729b;
        View view = this.f26393a;
        if (view != null && (am0Var = lm0Var.U0) != null && am0Var.P0(view)) {
            lm0Var.U0.a0(this.f26393a, motionEvent.getX(), motionEvent.getY());
            this.f26393a = null;
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
        lm0 lm0Var = (lm0) this.f26394b.f26729b;
        View view = lm0Var.L1;
        if (view != null && (i10 = lm0Var.M1) != -1) {
            bm0 bm0Var = lm0Var.V0;
            if (bm0Var != null || lm0Var.W0 != null) {
                if (bm0Var != null) {
                    if (bm0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (lm0Var.W0.mo17c(motionEvent.getX() - lm0Var.L1.getX(), motionEvent.getY() - lm0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    lm0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        am0 am0Var;
        View view = this.f26393a;
        if (view != null && (am0Var = ((lm0) this.f26394b.f26729b).U0) != null && am0Var.P0(view)) {
            b(motionEvent, this.f26393a);
            this.f26393a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        lm0 lm0Var = (lm0) this.f26394b.f26729b;
        View view = lm0Var.L1;
        if (view != null) {
            am0 am0Var = lm0Var.U0;
            if (am0Var != null && am0Var.P0(view)) {
                this.f26393a = lm0Var.L1;
                return false;
            }
            b(motionEvent, lm0Var.L1);
        }
        return false;
    }
}
