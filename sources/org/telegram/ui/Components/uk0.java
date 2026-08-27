package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

public final class uk0 extends z10 {

    public View f33112a;

    public final f2.z f33113b;

    public uk0(f2.z zVar) {
        this.f33113b = zVar;
    }

    @Override
    public final boolean a() {
        return ((zk0) this.f33113b.f5868b).U0 != null;
    }

    public final void b(MotionEvent motionEvent, View view) {
        zk0 zk0Var = (zk0) this.f33113b.f5868b;
        if (view != null) {
            if (zk0Var.R0 == null && zk0Var.S0 == null) {
                return;
            }
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            zk0Var.h1(view, x8, y10, true);
            int i10 = zk0Var.K1;
            if (zk0Var.N1 && i10 != -1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                pk0 pk0Var = zk0Var.R0;
                if (pk0Var != null) {
                    pk0Var.a(i10, view);
                } else {
                    qk0 qk0Var = zk0Var.S0;
                    if (qk0Var != null) {
                        qk0Var.c(x8 - view.getX(), y10 - view.getY(), i10, view);
                    }
                }
            }
            tk0 tk0Var = new tk0(this, view, i10, x8, y10);
            zk0Var.O1 = tk0Var;
            AndroidUtilities.runOnUIThread(tk0Var, ViewConfiguration.getPressedStateDuration());
            bg.d dVar = zk0Var.f35256a1;
            if (dVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                zk0Var.f35256a1 = null;
                zk0Var.J1 = null;
                zk0Var.L1 = false;
                zk0Var.k1(motionEvent, view);
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        qk0 qk0Var;
        zk0 zk0Var = (zk0) this.f33113b.f5868b;
        View view = this.f33112a;
        if (view == null || (qk0Var = zk0Var.S0) == null || !qk0Var.f1(view)) {
            return false;
        }
        zk0Var.S0.c0(this.f33112a, motionEvent.getX(), motionEvent.getY());
        this.f33112a = null;
        return true;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        int i10;
        zk0 zk0Var = (zk0) this.f33113b.f5868b;
        View view = zk0Var.J1;
        if (view == null || (i10 = zk0Var.K1) == -1) {
            return;
        }
        rk0 rk0Var = zk0Var.T0;
        if (rk0Var == null && zk0Var.U0 == null) {
            return;
        }
        if (rk0Var != null) {
            if (rk0Var.a(i10, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(2);
                return;
            }
            return;
        }
        if (zk0Var.U0.mo5c(motionEvent.getX() - zk0Var.J1.getX(), motionEvent.getY() - zk0Var.J1.getY(), i10, view)) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused2) {
            }
            view.sendAccessibilityEvent(2);
            zk0Var.V0 = true;
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        qk0 qk0Var;
        View view = this.f33112a;
        if (view == null || (qk0Var = ((zk0) this.f33113b.f5868b).S0) == null || !qk0Var.f1(view)) {
            return false;
        }
        b(motionEvent, this.f33112a);
        this.f33112a = null;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        zk0 zk0Var = (zk0) this.f33113b.f5868b;
        View view = zk0Var.J1;
        if (view != null) {
            qk0 qk0Var = zk0Var.S0;
            if (qk0Var != null && qk0Var.f1(view)) {
                this.f33112a = zk0Var.J1;
                return false;
            }
            b(motionEvent, zk0Var.J1);
        }
        return false;
    }
}
