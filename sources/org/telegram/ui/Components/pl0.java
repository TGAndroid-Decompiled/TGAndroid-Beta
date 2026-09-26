package org.telegram.ui.Components;

import android.view.View;
public final class pl0 implements Runnable {
    public final View f27380a;
    public final int f27381b;
    public final float f27382c;
    public final float d;
    public final ql0 e;

    public pl0(ql0 ql0Var, View view, int i10, float f7, float f10) {
        this.e = ql0Var;
        this.f27380a = view;
        this.f27381b = i10;
        this.f27382c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        rl0 rl0Var = this.e.f27701b;
        wl0 wl0Var = (wl0) rl0Var.f27998b;
        if (this == wl0Var.S1) {
            wl0Var.S1 = null;
        }
        View view = this.f27380a;
        if (view != null) {
            wl0Var.h1(view, 0.0f, 0.0f, false);
            if (!((wl0) rl0Var.f27998b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f27381b;
                if (i10 != -1) {
                    wl0 wl0Var2 = (wl0) rl0Var.f27998b;
                    kl0 kl0Var = wl0Var2.V0;
                    if (kl0Var != null) {
                        kl0Var.d(i10, view);
                        return;
                    }
                    ll0 ll0Var = wl0Var2.W0;
                    if (ll0Var != null) {
                        ll0Var.c(this.f27382c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
