package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class cm0 extends u20 {
    public View f25281a;
    public final dm0 f25282b;

    public cm0(dm0 dm0Var) {
        this.f25282b = dm0Var;
    }

    @Override
    public final boolean a() {
        if (((im0) this.f25282b.f25592b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        im0 im0Var = (im0) this.f25282b.f25592b;
        if (view != null) {
            if (im0Var.T0 != null || im0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                im0Var.h1(view, x10, y3, true);
                int i10 = im0Var.M1;
                if (im0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    wl0 wl0Var = im0Var.T0;
                    if (wl0Var != null) {
                        wl0Var.a(i10, view);
                    } else {
                        xl0 xl0Var = im0Var.U0;
                        if (xl0Var != null) {
                            xl0Var.d(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                bm0 bm0Var = new bm0(this, view, i10, x10, y3);
                im0Var.Q1 = bm0Var;
                AndroidUtilities.runOnUIThread(bm0Var, ViewConfiguration.getPressedStateDuration());
                am0 am0Var = im0Var.f27277c1;
                if (am0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(am0Var);
                    im0Var.f27277c1 = null;
                    im0Var.L1 = null;
                    im0Var.N1 = false;
                    im0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        xl0 xl0Var;
        im0 im0Var = (im0) this.f25282b.f25592b;
        View view = this.f25281a;
        if (view != null && (xl0Var = im0Var.U0) != null && xl0Var.P0(view)) {
            im0Var.U0.a0(this.f25281a, motionEvent.getX(), motionEvent.getY());
            this.f25281a = null;
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
        im0 im0Var = (im0) this.f25282b.f25592b;
        View view = im0Var.L1;
        if (view != null && (i10 = im0Var.M1) != -1) {
            yl0 yl0Var = im0Var.V0;
            if (yl0Var != null || im0Var.W0 != null) {
                if (yl0Var != null) {
                    if (yl0Var.a(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (im0Var.W0.mo17d(motionEvent.getX() - im0Var.L1.getX(), motionEvent.getY() - im0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    im0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        xl0 xl0Var;
        View view = this.f25281a;
        if (view != null && (xl0Var = ((im0) this.f25282b.f25592b).U0) != null && xl0Var.P0(view)) {
            b(motionEvent, this.f25281a);
            this.f25281a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        im0 im0Var = (im0) this.f25282b.f25592b;
        View view = im0Var.L1;
        if (view != null) {
            xl0 xl0Var = im0Var.U0;
            if (xl0Var != null && xl0Var.P0(view)) {
                this.f25281a = im0Var.L1;
                return false;
            }
            b(motionEvent, im0Var.L1);
        }
        return false;
    }
}
