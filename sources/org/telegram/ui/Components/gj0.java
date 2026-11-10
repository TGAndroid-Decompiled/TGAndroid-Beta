package org.telegram.ui.Components;

import android.view.View;
public final class gj0 implements Runnable {
    public final View f33917a;
    public final int f33918b;
    public final float f33919c;
    public final float d;
    public final hj0 f33920e;

    public gj0(hj0 hj0Var, View view, int i7, float f10, float f11) {
        this.f33920e = hj0Var;
        this.f33917a = view;
        this.f33918b = i7;
        this.f33919c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        ij0 ij0Var = this.f33920e.f34367b;
        pj0 pj0Var = (pj0) ij0Var.f34689b;
        if (this == pj0Var.Q1) {
            pj0Var.Q1 = null;
        }
        View view = this.f33917a;
        if (view != null) {
            pj0Var.j1(view, 0.0f, 0.0f, false);
            if (!((pj0) ij0Var.f34689b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i7 = this.f33918b;
                if (i7 != -1) {
                    pj0 pj0Var2 = (pj0) ij0Var.f34689b;
                    bj0 bj0Var = pj0Var2.T0;
                    if (bj0Var != null) {
                        bj0Var.c(i7, view);
                        return;
                    }
                    cj0 cj0Var = pj0Var2.U0;
                    if (cj0Var != null) {
                        cj0Var.f(this.f33919c - view.getX(), this.d - view.getY(), i7, view);
                    }
                }
            }
        }
    }
}
