package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class lm0 extends d30 {
    public View f28503a;
    public final mm0 f28504b;

    public lm0(mm0 mm0Var) {
        this.f28504b = mm0Var;
    }

    @Override
    public final boolean a() {
        if (((rm0) this.f28504b.f28890b).W0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        rm0 rm0Var = (rm0) this.f28504b.f28890b;
        if (view != null) {
            if (rm0Var.T0 != null || rm0Var.U0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                rm0Var.h1(view, x10, y3, true);
                int i10 = rm0Var.M1;
                if (rm0Var.P1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    fm0 fm0Var = rm0Var.T0;
                    if (fm0Var != null) {
                        fm0Var.d(i10, view);
                    } else {
                        gm0 gm0Var = rm0Var.U0;
                        if (gm0Var != null) {
                            gm0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                km0 km0Var = new km0(this, view, i10, x10, y3);
                rm0Var.Q1 = km0Var;
                AndroidUtilities.runOnUIThread(km0Var, ViewConfiguration.getPressedStateDuration());
                jm0 jm0Var = rm0Var.f30548c1;
                if (jm0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jm0Var);
                    rm0Var.f30548c1 = null;
                    rm0Var.L1 = null;
                    rm0Var.N1 = false;
                    rm0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        gm0 gm0Var;
        rm0 rm0Var = (rm0) this.f28504b.f28890b;
        View view = this.f28503a;
        if (view != null && (gm0Var = rm0Var.U0) != null && gm0Var.Y0(view)) {
            rm0Var.U0.n0(this.f28503a, motionEvent.getX(), motionEvent.getY());
            this.f28503a = null;
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
        rm0 rm0Var = (rm0) this.f28504b.f28890b;
        View view = rm0Var.L1;
        if (view != null && (i10 = rm0Var.M1) != -1) {
            hm0 hm0Var = rm0Var.V0;
            if (hm0Var != null || rm0Var.W0 != null) {
                if (hm0Var != null) {
                    if (hm0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (rm0Var.W0.mo17c(motionEvent.getX() - rm0Var.L1.getX(), motionEvent.getY() - rm0Var.L1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    rm0Var.X0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        gm0 gm0Var;
        View view = this.f28503a;
        if (view != null && (gm0Var = ((rm0) this.f28504b.f28890b).U0) != null && gm0Var.Y0(view)) {
            b(motionEvent, this.f28503a);
            this.f28503a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        rm0 rm0Var = (rm0) this.f28504b.f28890b;
        View view = rm0Var.L1;
        if (view != null) {
            gm0 gm0Var = rm0Var.U0;
            if (gm0Var != null && gm0Var.Y0(view)) {
                this.f28503a = rm0Var.L1;
                return false;
            }
            b(motionEvent, rm0Var.L1);
        }
        return false;
    }
}
