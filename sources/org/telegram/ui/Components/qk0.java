package org.telegram.ui.Components;

import android.view.View;
public final class qk0 implements Runnable {
    public final View f31981a;
    public final int f31982b;
    public final float f31983c;
    public final float d;
    public final rk0 f31984e;

    public qk0(rk0 rk0Var, View view, int i9, float f10, float f11) {
        this.f31984e = rk0Var;
        this.f31981a = view;
        this.f31982b = i9;
        this.f31983c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        f2.a0 a0Var = this.f31984e.f32193b;
        wk0 wk0Var = (wk0) a0Var.f5310b;
        if (this == wk0Var.O1) {
            wk0Var.O1 = null;
        }
        View view = this.f31981a;
        if (view != null) {
            wk0Var.h1(view, 0.0f, 0.0f, false);
            if (!((wk0) a0Var.f5310b).N1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i9 = this.f31982b;
                if (i9 != -1) {
                    wk0 wk0Var2 = (wk0) a0Var.f5310b;
                    mk0 mk0Var = wk0Var2.R0;
                    if (mk0Var != null) {
                        mk0Var.a(i9, view);
                        return;
                    }
                    nk0 nk0Var = wk0Var2.S0;
                    if (nk0Var != null) {
                        nk0Var.c(this.f31983c - view.getX(), this.d - view.getY(), i9, view);
                    }
                }
            }
        }
    }
}
