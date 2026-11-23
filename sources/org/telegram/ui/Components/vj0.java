package org.telegram.ui.Components;

import android.view.View;
public final class vj0 implements Runnable {
    public final View f40804a;
    public final int f40805b;
    public final float f40806c;
    public final float d;
    public final wj0 f40807e;

    public vj0(wj0 wj0Var, View view, int i7, float f10, float f11) {
        this.f40807e = wj0Var;
        this.f40804a = view;
        this.f40805b = i7;
        this.f40806c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        xj0 xj0Var = this.f40807e.f41810b;
        ek0 ek0Var = (ek0) xj0Var.f42107b;
        if (this == ek0Var.R1) {
            ek0Var.R1 = null;
        }
        View view = this.f40804a;
        if (view != null) {
            ek0Var.j1(view, 0.0f, 0.0f, false);
            if (!((ek0) xj0Var.f42107b).Q1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i7 = this.f40805b;
                if (i7 != -1) {
                    ek0 ek0Var2 = (ek0) xj0Var.f42107b;
                    qj0 qj0Var = ek0Var2.U0;
                    if (qj0Var != null) {
                        qj0Var.c(i7, view);
                        return;
                    }
                    rj0 rj0Var = ek0Var2.V0;
                    if (rj0Var != null) {
                        rj0Var.f(this.f40806c - view.getX(), this.d - view.getY(), i7, view);
                    }
                }
            }
        }
    }
}
