package org.telegram.ui.Components;

import android.view.View;
public final class el0 implements Runnable {
    public final View f23684a;
    public final int f23685b;
    public final float f23686c;
    public final float d;
    public final fl0 e;

    public el0(fl0 fl0Var, View view, int i10, float f7, float f10) {
        this.e = fl0Var;
        this.f23684a = view;
        this.f23685b = i10;
        this.f23686c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        gl0 gl0Var = this.e.f24014b;
        ll0 ll0Var = (ll0) gl0Var.f24417b;
        if (this == ll0Var.S1) {
            ll0Var.S1 = null;
        }
        View view = this.f23684a;
        if (view != null) {
            ll0Var.h1(view, 0.0f, 0.0f, false);
            if (!((ll0) gl0Var.f24417b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f23685b;
                if (i10 != -1) {
                    ll0 ll0Var2 = (ll0) gl0Var.f24417b;
                    zk0 zk0Var = ll0Var2.V0;
                    if (zk0Var != null) {
                        zk0Var.d(i10, view);
                        return;
                    }
                    al0 al0Var = ll0Var2.W0;
                    if (al0Var != null) {
                        al0Var.c(this.f23686c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
