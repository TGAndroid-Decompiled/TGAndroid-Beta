package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class uj0 extends m10 {
    public View f40368a;
    public final vj0 f40369b;

    public uj0(vj0 vj0Var) {
        this.f40369b = vj0Var;
    }

    @Override
    public final boolean a() {
        if (((ck0) this.f40369b.f40689b).X0 != null) {
            return true;
        }
        return false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        ck0 ck0Var = (ck0) this.f40369b.f40689b;
        if (view != null) {
            if (ck0Var.U0 != null || ck0Var.V0 != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                ck0Var.j1(view, x10, y10, true);
                int i7 = ck0Var.N1;
                if (ck0Var.Q1 && i7 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    oj0 oj0Var = ck0Var.U0;
                    if (oj0Var != null) {
                        oj0Var.c(i7, view);
                    } else {
                        pj0 pj0Var = ck0Var.V0;
                        if (pj0Var != null) {
                            pj0Var.f(x10 - view.getX(), y10 - view.getY(), i7, view);
                        }
                    }
                }
                tj0 tj0Var = new tj0(this, view, i7, x10, y10);
                ck0Var.R1 = tj0Var;
                org.telegram.messenger.g0.h3(tj0Var, ViewConfiguration.getPressedStateDuration());
                sj0 sj0Var = ck0Var.f34054d1;
                if (sj0Var != null) {
                    org.telegram.messenger.g0.r(sj0Var);
                    ck0Var.f34054d1 = null;
                    ck0Var.M1 = null;
                    ck0Var.O1 = false;
                    ck0Var.m1(view, motionEvent);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        pj0 pj0Var;
        ck0 ck0Var = (ck0) this.f40369b.f40689b;
        View view = this.f40368a;
        if (view != null && (pj0Var = ck0Var.V0) != null && pj0Var.b1(view)) {
            ck0Var.V0.s0(this.f40368a, motionEvent.getX(), motionEvent.getY());
            this.f40368a = null;
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
        ck0 ck0Var = (ck0) this.f40369b.f40689b;
        View view = ck0Var.M1;
        if (view != null && (i7 = ck0Var.N1) != -1) {
            qj0 qj0Var = ck0Var.W0;
            if (qj0Var != null || ck0Var.X0 != null) {
                if (qj0Var != null) {
                    if (qj0Var.c(i7, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (ck0Var.X0.mo23f(motionEvent.getX() - ck0Var.M1.getX(), motionEvent.getY() - ck0Var.M1.getY(), i7, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    ck0Var.Y0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        pj0 pj0Var;
        View view = this.f40368a;
        if (view != null && (pj0Var = ((ck0) this.f40369b.f40689b).V0) != null && pj0Var.b1(view)) {
            b(this.f40368a, motionEvent);
            this.f40368a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ck0 ck0Var = (ck0) this.f40369b.f40689b;
        View view = ck0Var.M1;
        if (view != null) {
            pj0 pj0Var = ck0Var.V0;
            if (pj0Var != null && pj0Var.b1(view)) {
                this.f40368a = ck0Var.M1;
                return false;
            }
            b(ck0Var.M1, motionEvent);
        }
        return false;
    }
}
