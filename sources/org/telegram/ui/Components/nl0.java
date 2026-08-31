package org.telegram.ui.Components;

import android.view.View;
public final class nl0 implements Runnable {
    public final View f29537a;
    public final int f29538b;
    public final float f29539c;
    public final float d;
    public final ol0 f29540e;

    public nl0(ol0 ol0Var, View view, int i10, float f10, float f11) {
        this.f29540e = ol0Var;
        this.f29537a = view;
        this.f29538b = i10;
        this.f29539c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        f2.y yVar = this.f29540e.f29797b;
        tl0 tl0Var = (tl0) yVar.f5956b;
        if (this == tl0Var.P1) {
            tl0Var.P1 = null;
        }
        View view = this.f29537a;
        if (view != null) {
            tl0Var.h1(view, 0.0f, 0.0f, false);
            if (!((tl0) yVar.f5956b).O1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f29538b;
                if (i10 != -1) {
                    tl0 tl0Var2 = (tl0) yVar.f5956b;
                    jl0 jl0Var = tl0Var2.S0;
                    if (jl0Var != null) {
                        jl0Var.f(i10, view);
                        return;
                    }
                    kl0 kl0Var = tl0Var2.T0;
                    if (kl0Var != null) {
                        kl0Var.c(this.f29539c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
