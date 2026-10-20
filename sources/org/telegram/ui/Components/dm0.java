package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class dm0 extends u20 {
    public View f25568a;
    public final em0 f25569b;

    public dm0(em0 em0Var) {
        this.f25569b = em0Var;
    }

    @Override
    public final boolean a() {
        if (((jm0) this.f25569b.f25931b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        jm0 jm0Var = (jm0) this.f25569b.f25931b;
        if (view != null) {
            if (jm0Var.T0 != null || jm0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                jm0Var.h1(view, x10, y3, true);
                int i10 = jm0Var.M1;
                if (jm0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    xl0 xl0Var = jm0Var.T0;
                    if (xl0Var != null) {
                        xl0Var.a(i10, view);
                    } else {
                        yl0 yl0Var = jm0Var.U0;
                        if (yl0Var != null) {
                            yl0Var.d(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                cm0 cm0Var = new cm0(this, view, i10, x10, y3);
                jm0Var.Q1 = cm0Var;
                AndroidUtilities.runOnUIThread(cm0Var, ViewConfiguration.getPressedStateDuration());
                bm0 bm0Var = jm0Var.f27557c1;
                if (bm0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(bm0Var);
                    jm0Var.f27557c1 = null;
                    jm0Var.L1 = null;
                    jm0Var.N1 = false;
                    jm0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        yl0 yl0Var;
        jm0 jm0Var = (jm0) this.f25569b.f25931b;
        View view = this.f25568a;
        if (view != null && (yl0Var = jm0Var.U0) != null && yl0Var.P0(view)) {
            jm0Var.U0.a0(this.f25568a, motionEvent.getX(), motionEvent.getY());
            this.f25568a = null;
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
        jm0 jm0Var = (jm0) this.f25569b.f25931b;
        View view = jm0Var.L1;
        if (view != null && (i10 = jm0Var.M1) != -1) {
            zl0 zl0Var = jm0Var.V0;
            if (zl0Var != null || jm0Var.W0 != null) {
                if (zl0Var != null) {
                    if (zl0Var.a(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (jm0Var.W0.mo17d(motionEvent.getX() - jm0Var.L1.getX(), motionEvent.getY() - jm0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    jm0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        yl0 yl0Var;
        View view = this.f25568a;
        if (view != null && (yl0Var = ((jm0) this.f25569b.f25931b).U0) != null && yl0Var.P0(view)) {
            b(motionEvent, this.f25568a);
            this.f25568a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        jm0 jm0Var = (jm0) this.f25569b.f25931b;
        View view = jm0Var.L1;
        if (view != null) {
            yl0 yl0Var = jm0Var.U0;
            if (yl0Var != null && yl0Var.P0(view)) {
                this.f25568a = jm0Var.L1;
                return false;
            }
            b(motionEvent, jm0Var.L1);
        }
        return false;
    }
}
