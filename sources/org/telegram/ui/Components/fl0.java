package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class fl0 extends l20 {
    public View f26126a;
    public final gl0 f26127b;

    public fl0(gl0 gl0Var) {
        this.f26127b = gl0Var;
    }

    @Override
    public final boolean a() {
        if (((ll0) this.f26127b.f26460b).Y0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        ll0 ll0Var = (ll0) this.f26127b.f26460b;
        if (view != null) {
            if (ll0Var.V0 != null || ll0Var.W0 != null) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                ll0Var.g1(view, x10, y3, true);
                int i10 = ll0Var.O1;
                if (ll0Var.R1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    zk0 zk0Var = ll0Var.V0;
                    if (zk0Var != null) {
                        zk0Var.a(i10, view);
                    } else {
                        al0 al0Var = ll0Var.W0;
                        if (al0Var != null) {
                            al0Var.d(x10 - view.getX(), y3 - view.getY(), i10, view);
                        }
                    }
                }
                el0 el0Var = new el0(this, view, i10, x10, y3);
                ll0Var.S1 = el0Var;
                AndroidUtilities.runOnUIThread(el0Var, ViewConfiguration.getPressedStateDuration());
                dl0 dl0Var = ll0Var.f28202e1;
                if (dl0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(dl0Var);
                    ll0Var.f28202e1 = null;
                    ll0Var.N1 = null;
                    ll0Var.P1 = false;
                    ll0Var.j1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        al0 al0Var;
        ll0 ll0Var = (ll0) this.f26127b.f26460b;
        View view = this.f26126a;
        if (view != null && (al0Var = ll0Var.W0) != null && al0Var.d1(view)) {
            ll0Var.W0.q0(this.f26126a, motionEvent.getX(), motionEvent.getY());
            this.f26126a = null;
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
        ll0 ll0Var = (ll0) this.f26127b.f26460b;
        View view = ll0Var.N1;
        if (view != null && (i10 = ll0Var.O1) != -1) {
            bl0 bl0Var = ll0Var.X0;
            if (bl0Var != null || ll0Var.Y0 != null) {
                if (bl0Var != null) {
                    if (bl0Var.a(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (ll0Var.Y0.mo18d(motionEvent.getX() - ll0Var.N1.getX(), motionEvent.getY() - ll0Var.N1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    ll0Var.Z0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        al0 al0Var;
        View view = this.f26126a;
        if (view != null && (al0Var = ((ll0) this.f26127b.f26460b).W0) != null && al0Var.d1(view)) {
            b(motionEvent, this.f26126a);
            this.f26126a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ll0 ll0Var = (ll0) this.f26127b.f26460b;
        View view = ll0Var.N1;
        if (view != null) {
            al0 al0Var = ll0Var.W0;
            if (al0Var != null && al0Var.d1(view)) {
                this.f26126a = ll0Var.N1;
                return false;
            }
            b(motionEvent, ll0Var.N1);
        }
        return false;
    }
}
