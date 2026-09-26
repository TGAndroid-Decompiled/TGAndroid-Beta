package org.telegram.ui.Components;

import android.view.View;
public final class ql0 implements Runnable {
    public final View f27712a;
    public final int f27713b;
    public final float f27714c;
    public final float d;
    public final rl0 e;

    public ql0(rl0 rl0Var, View view, int i10, float f7, float f10) {
        this.e = rl0Var;
        this.f27712a = view;
        this.f27713b = i10;
        this.f27714c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        sl0 sl0Var = this.e.f27997b;
        xl0 xl0Var = (xl0) sl0Var.f28307b;
        if (this == xl0Var.S1) {
            xl0Var.S1 = null;
        }
        View view = this.f27712a;
        if (view != null) {
            xl0Var.h1(view, 0.0f, 0.0f, false);
            if (!((xl0) sl0Var.f28307b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f27713b;
                if (i10 != -1) {
                    xl0 xl0Var2 = (xl0) sl0Var.f28307b;
                    ll0 ll0Var = xl0Var2.V0;
                    if (ll0Var != null) {
                        ll0Var.d(i10, view);
                        return;
                    }
                    ml0 ml0Var = xl0Var2.W0;
                    if (ml0Var != null) {
                        ml0Var.c(this.f27714c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
