package org.telegram.ui.Components;

import android.view.View;
public final class rl0 implements Runnable {
    public final View f28008a;
    public final int f28009b;
    public final float f28010c;
    public final float d;
    public final sl0 e;

    public rl0(sl0 sl0Var, View view, int i10, float f7, float f10) {
        this.e = sl0Var;
        this.f28008a = view;
        this.f28009b = i10;
        this.f28010c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        tl0 tl0Var = this.e.f28273b;
        yl0 yl0Var = (yl0) tl0Var.f28496b;
        if (this == yl0Var.S1) {
            yl0Var.S1 = null;
        }
        View view = this.f28008a;
        if (view != null) {
            yl0Var.i1(view, 0.0f, 0.0f, false);
            if (!((yl0) tl0Var.f28496b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f28009b;
                if (i10 != -1) {
                    yl0 yl0Var2 = (yl0) tl0Var.f28496b;
                    ml0 ml0Var = yl0Var2.V0;
                    if (ml0Var != null) {
                        ml0Var.d(i10, view);
                        return;
                    }
                    nl0 nl0Var = yl0Var2.W0;
                    if (nl0Var != null) {
                        nl0Var.c(this.f28010c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
