package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public final class el0 extends h20 {
    public View f28105a;
    public final f2.y f28106b;

    public el0(f2.y yVar) {
        this.f28106b = yVar;
    }

    @Override
    public final boolean a() {
        if (((jl0) this.f28106b.f6512b).U0 != null) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent, View view) {
        jl0 jl0Var = (jl0) this.f28106b.f6512b;
        if (view != null) {
            if (jl0Var.R0 != null || jl0Var.S0 != null) {
                float x4 = motionEvent.getX();
                float y8 = motionEvent.getY();
                jl0Var.h1(view, x4, y8, true);
                int i10 = jl0Var.K1;
                if (jl0Var.N1 && i10 != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    zk0 zk0Var = jl0Var.R0;
                    if (zk0Var != null) {
                        zk0Var.c(i10, view);
                    } else {
                        al0 al0Var = jl0Var.S0;
                        if (al0Var != null) {
                            al0Var.b(x4 - view.getX(), y8 - view.getY(), i10, view);
                        }
                    }
                }
                dl0 dl0Var = new dl0(this, view, i10, x4, y8);
                jl0Var.O1 = dl0Var;
                AndroidUtilities.runOnUIThread(dl0Var, ViewConfiguration.getPressedStateDuration());
                dg.d dVar = jl0Var.f29688a1;
                if (dVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    jl0Var.f29688a1 = null;
                    jl0Var.J1 = null;
                    jl0Var.L1 = false;
                    jl0Var.k1(motionEvent, view);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        al0 al0Var;
        jl0 jl0Var = (jl0) this.f28106b.f6512b;
        View view = this.f28105a;
        if (view != null && (al0Var = jl0Var.S0) != null && al0Var.b1(view)) {
            jl0Var.S0.o0(this.f28105a, motionEvent.getX(), motionEvent.getY());
            this.f28105a = null;
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
        jl0 jl0Var = (jl0) this.f28106b.f6512b;
        View view = jl0Var.J1;
        if (view != null && (i10 = jl0Var.K1) != -1) {
            bl0 bl0Var = jl0Var.T0;
            if (bl0Var != null || jl0Var.U0 != null) {
                if (bl0Var != null) {
                    if (bl0Var.c(i10, view)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        view.sendAccessibilityEvent(2);
                    }
                } else if (jl0Var.U0.mo17b(motionEvent.getX() - jl0Var.J1.getX(), motionEvent.getY() - jl0Var.J1.getY(), i10, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    view.sendAccessibilityEvent(2);
                    jl0Var.V0 = true;
                }
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        al0 al0Var;
        View view = this.f28105a;
        if (view != null && (al0Var = ((jl0) this.f28106b.f6512b).S0) != null && al0Var.b1(view)) {
            b(motionEvent, this.f28105a);
            this.f28105a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        jl0 jl0Var = (jl0) this.f28106b.f6512b;
        View view = jl0Var.J1;
        if (view != null) {
            al0 al0Var = jl0Var.S0;
            if (al0Var != null && al0Var.b1(view)) {
                this.f28105a = jl0Var.J1;
                return false;
            }
            b(motionEvent, jl0Var.J1);
        }
        return false;
    }
}
