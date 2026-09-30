package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class tl0 extends p20 {
    public View f28599a;
    public final ul0 f28600b;

    public tl0(ul0 ul0Var) {
        this.f28600b = ul0Var;
    }

    @Override
    public final boolean a() {
        if (((zl0) this.f28600b.f28891b).Y0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        zl0 zl0Var = (zl0) this.f28600b.f28891b;
        if (view != null) {
            if (zl0Var.V0 != null || zl0Var.W0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                zl0Var.k1(view, x10, y3, true);
                int i10 = zl0Var.O1;
                if (zl0Var.R1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    nl0 nl0Var = zl0Var.V0;
                    if (nl0Var != null) {
                        nl0Var.d(i10, view);
                    } else {
                        ol0 ol0Var = zl0Var.W0;
                        if (ol0Var != null) {
                            ol0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                sl0 sl0Var = new sl0(this, view, i10, x10, y3);
                zl0Var.S1 = sl0Var;
                AndroidUtilities.runOnUIThread(sl0Var, ViewConfiguration.getPressedStateDuration());
                rl0 rl0Var = zl0Var.f30993e1;
                if (rl0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(rl0Var);
                    zl0Var.f30993e1 = null;
                    zl0Var.N1 = null;
                    zl0Var.P1 = false;
                    zl0Var.n1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ol0 ol0Var;
        zl0 zl0Var = (zl0) this.f28600b.f28891b;
        View view = this.f28599a;
        if (view != null && (ol0Var = zl0Var.W0) != null && ol0Var.d1(view)) {
            zl0Var.W0.r0(this.f28599a, motionEvent.getX(), motionEvent.getY());
            this.f28599a = null;
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
        zl0 zl0Var = (zl0) this.f28600b.f28891b;
        View view = zl0Var.N1;
        if (view != null && (i10 = zl0Var.O1) != -1) {
            pl0 pl0Var = zl0Var.X0;
            if (pl0Var != null || zl0Var.Y0 != null) {
                if (pl0Var != null) {
                    if (pl0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (zl0Var.Y0.mo18c(motionEvent.getX() - zl0Var.N1.getX(), motionEvent.getY() - zl0Var.N1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    zl0Var.Z0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ol0 ol0Var;
        View view = this.f28599a;
        if (view != null && (ol0Var = ((zl0) this.f28600b.f28891b).W0) != null && ol0Var.d1(view)) {
            b(motionEvent, this.f28599a);
            this.f28599a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        zl0 zl0Var = (zl0) this.f28600b.f28891b;
        View view = zl0Var.N1;
        if (view != null) {
            ol0 ol0Var = zl0Var.W0;
            if (ol0Var != null && ol0Var.d1(view)) {
                this.f28599a = zl0Var.N1;
                return false;
            }
            b(motionEvent, zl0Var.N1);
        }
        return false;
    }
}
