package org.telegram.ui.Components;

import android.view.View;
public final class ml0 implements Runnable {
    public final View f27050a;
    public final int f27051b;
    public final float f27052c;
    public final float d;
    public final nl0 e;

    public ml0(nl0 nl0Var, View view, int i10, float f10, float f11) {
        this.e = nl0Var;
        this.f27050a = view;
        this.f27051b = i10;
        this.f27052c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        f2.y yVar = this.e.f27313b;
        sl0 sl0Var = (sl0) yVar.f5862b;
        if (this == sl0Var.P1) {
            sl0Var.P1 = null;
        }
        View view = this.f27050a;
        if (view != null) {
            sl0Var.h1(view, 0.0f, 0.0f, false);
            if (!((sl0) yVar.f5862b).O1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f27051b;
                if (i10 != -1) {
                    sl0 sl0Var2 = (sl0) yVar.f5862b;
                    il0 il0Var = sl0Var2.S0;
                    if (il0Var != null) {
                        il0Var.f(i10, view);
                        return;
                    }
                    jl0 jl0Var = sl0Var2.T0;
                    if (jl0Var != null) {
                        jl0Var.c(this.f27052c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
