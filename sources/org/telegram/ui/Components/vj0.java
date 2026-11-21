package org.telegram.ui.Components;

import android.view.View;
public final class vj0 implements Runnable {
    public final View f40852a;
    public final int f40853b;
    public final float f40854c;
    public final float d;
    public final wj0 f40855e;

    public vj0(wj0 wj0Var, View view, int i7, float f10, float f11) {
        this.f40855e = wj0Var;
        this.f40852a = view;
        this.f40853b = i7;
        this.f40854c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        xj0 xj0Var = this.f40855e.f41842b;
        ek0 ek0Var = (ek0) xj0Var.f42160b;
        if (this == ek0Var.R1) {
            ek0Var.R1 = null;
        }
        View view = this.f40852a;
        if (view != null) {
            ek0Var.j1(view, 0.0f, 0.0f, false);
            if (!((ek0) xj0Var.f42160b).Q1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i7 = this.f40853b;
                if (i7 != -1) {
                    ek0 ek0Var2 = (ek0) xj0Var.f42160b;
                    qj0 qj0Var = ek0Var2.U0;
                    if (qj0Var != null) {
                        qj0Var.c(i7, view);
                        return;
                    }
                    rj0 rj0Var = ek0Var2.V0;
                    if (rj0Var != null) {
                        rj0Var.f(this.f40854c - view.getX(), this.d - view.getY(), i7, view);
                    }
                }
            }
        }
    }
}
