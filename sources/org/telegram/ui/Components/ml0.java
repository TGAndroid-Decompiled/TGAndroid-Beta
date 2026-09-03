package org.telegram.ui.Components;

import android.view.View;
public final class ml0 implements Runnable {
    public final View f29152a;
    public final int f29153b;
    public final float f29154c;
    public final float d;
    public final nl0 f29155e;

    public ml0(nl0 nl0Var, View view, int i10, float f10, float f11) {
        this.f29155e = nl0Var;
        this.f29152a = view;
        this.f29153b = i10;
        this.f29154c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        f2.y yVar = this.f29155e.f29515b;
        sl0 sl0Var = (sl0) yVar.f5956b;
        if (this == sl0Var.P1) {
            sl0Var.P1 = null;
        }
        View view = this.f29152a;
        if (view != null) {
            sl0Var.g1(view, 0.0f, 0.0f, false);
            if (!((sl0) yVar.f5956b).O1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f29153b;
                if (i10 != -1) {
                    sl0 sl0Var2 = (sl0) yVar.f5956b;
                    il0 il0Var = sl0Var2.S0;
                    if (il0Var != null) {
                        il0Var.f(i10, view);
                        return;
                    }
                    jl0 jl0Var = sl0Var2.T0;
                    if (jl0Var != null) {
                        jl0Var.c(this.f29154c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
