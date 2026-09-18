package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class gl0 extends l20 {
    public View f24344a;
    public final hl0 f24345b;

    public gl0(hl0 hl0Var) {
        this.f24345b = hl0Var;
    }

    @Override
    public final boolean a() {
        if (((ml0) this.f24345b.f24696b).Y0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        ml0 ml0Var = (ml0) this.f24345b.f24696b;
        if (view != null) {
            if (ml0Var.V0 != null || ml0Var.W0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                ml0Var.i1(view, x10, y3, true);
                int i10 = ml0Var.O1;
                if (ml0Var.R1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    al0 al0Var = ml0Var.V0;
                    if (al0Var != null) {
                        al0Var.d(i10, view);
                    } else {
                        bl0 bl0Var = ml0Var.W0;
                        if (bl0Var != null) {
                            bl0Var.c(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                fl0 fl0Var = new fl0(this, view, i10, x10, y3);
                ml0Var.S1 = fl0Var;
                AndroidUtilities.runOnUIThread(fl0Var, ViewConfiguration.getPressedStateDuration());
                el0 el0Var = ml0Var.f26172e1;
                if (el0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(el0Var);
                    ml0Var.f26172e1 = null;
                    ml0Var.N1 = null;
                    ml0Var.P1 = false;
                    ml0Var.l1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        bl0 bl0Var;
        ml0 ml0Var = (ml0) this.f24345b.f24696b;
        View view = this.f24344a;
        if (view != null && (bl0Var = ml0Var.W0) != null && bl0Var.d1(view)) {
            ml0Var.W0.r0(this.f24344a, motionEvent.getX(), motionEvent.getY());
            this.f24344a = null;
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
        ml0 ml0Var = (ml0) this.f24345b.f24696b;
        View view = ml0Var.N1;
        if (view != null && (i10 = ml0Var.O1) != -1) {
            cl0 cl0Var = ml0Var.X0;
            if (cl0Var != null || ml0Var.Y0 != null) {
                if (cl0Var != null) {
                    if (cl0Var.d(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (ml0Var.Y0.mo18c(motionEvent.getX() - ml0Var.N1.getX(), motionEvent.getY() - ml0Var.N1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    ml0Var.Z0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bl0 bl0Var;
        View view = this.f24344a;
        if (view != null && (bl0Var = ((ml0) this.f24345b.f24696b).W0) != null && bl0Var.d1(view)) {
            b(motionEvent, this.f24344a);
            this.f24344a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ml0 ml0Var = (ml0) this.f24345b.f24696b;
        View view = ml0Var.N1;
        if (view != null) {
            bl0 bl0Var = ml0Var.W0;
            if (bl0Var != null && bl0Var.d1(view)) {
                this.f24344a = ml0Var.N1;
                return false;
            }
            b(motionEvent, ml0Var.N1);
        }
        return false;
    }
}
