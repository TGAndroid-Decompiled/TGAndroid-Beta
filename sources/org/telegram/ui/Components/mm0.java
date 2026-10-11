package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class mm0 extends d30 {
    public View f28798a;
    public final nm0 f28799b;

    public mm0(nm0 nm0Var) {
        this.f28799b = nm0Var;
    }

    @Override
    public final boolean a() {
        if (((sm0) this.f28799b.f29093b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        sm0 sm0Var = (sm0) this.f28799b.f29093b;
        if (view != null) {
            if (sm0Var.T0 != null || sm0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                sm0Var.h1(view, x10, y3, true);
                int i10 = sm0Var.M1;
                if (sm0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    gm0 gm0Var = sm0Var.T0;
                    if (gm0Var != null) {
                        gm0Var.d(i10, view);
                    } else {
                        hm0 hm0Var = sm0Var.U0;
                        if (hm0Var != null) {
                            hm0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                lm0 lm0Var = new lm0(this, view, i10, x10, y3);
                sm0Var.Q1 = lm0Var;
                AndroidUtilities.runOnUIThread(lm0Var, ViewConfiguration.getPressedStateDuration());
                km0 km0Var = sm0Var.f30785c1;
                if (km0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(km0Var);
                    sm0Var.f30785c1 = null;
                    sm0Var.L1 = null;
                    sm0Var.N1 = false;
                    sm0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        hm0 hm0Var;
        sm0 sm0Var = (sm0) this.f28799b.f29093b;
        View view = this.f28798a;
        if (view != null && (hm0Var = sm0Var.U0) != null && hm0Var.Y0(view)) {
            sm0Var.U0.n0(this.f28798a, motionEvent.getX(), motionEvent.getY());
            this.f28798a = null;
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
        sm0 sm0Var = (sm0) this.f28799b.f29093b;
        View view = sm0Var.L1;
        if (view != null && (i10 = sm0Var.M1) != -1) {
            im0 im0Var = sm0Var.V0;
            if (im0Var != null || sm0Var.W0 != null) {
                if (im0Var != null) {
                    if (im0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (sm0Var.W0.mo17c(motionEvent.getX() - sm0Var.L1.getX(), motionEvent.getY() - sm0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    sm0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        hm0 hm0Var;
        View view = this.f28798a;
        if (view != null && (hm0Var = ((sm0) this.f28799b.f29093b).U0) != null && hm0Var.Y0(view)) {
            b(motionEvent, this.f28798a);
            this.f28798a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sm0 sm0Var = (sm0) this.f28799b.f29093b;
        View view = sm0Var.L1;
        if (view != null) {
            hm0 hm0Var = sm0Var.U0;
            if (hm0Var != null && hm0Var.Y0(view)) {
                this.f28798a = sm0Var.L1;
                return false;
            }
            b(motionEvent, sm0Var.L1);
        }
        return false;
    }
}
