package org.telegram.ui.Components;

import android.view.View;
public final class vj0 implements Runnable {
    public final View f40854a;
    public final int f40855b;
    public final float f40856c;
    public final float d;
    public final wj0 f40857e;

    public vj0(wj0 wj0Var, View view, int i7, float f10, float f11) {
        this.f40857e = wj0Var;
        this.f40854a = view;
        this.f40855b = i7;
        this.f40856c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        xj0 xj0Var = this.f40857e.f41836b;
        ek0 ek0Var = (ek0) xj0Var.f42153b;
        if (this == ek0Var.R1) {
            ek0Var.R1 = null;
        }
        View view = this.f40854a;
        if (view != null) {
            ek0Var.j1(view, 0.0f, 0.0f, false);
            if (!((ek0) xj0Var.f42153b).Q1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i7 = this.f40855b;
                if (i7 != -1) {
                    ek0 ek0Var2 = (ek0) xj0Var.f42153b;
                    qj0 qj0Var = ek0Var2.U0;
                    if (qj0Var != null) {
                        qj0Var.c(i7, view);
                        return;
                    }
                    rj0 rj0Var = ek0Var2.V0;
                    if (rj0Var != null) {
                        rj0Var.f(this.f40856c - view.getX(), this.d - view.getY(), i7, view);
                    }
                }
            }
        }
    }
}
