package org.telegram.ui.Components;

import android.view.View;
public final class rl0 implements Runnable {
    public final View f27989a;
    public final int f27990b;
    public final float f27991c;
    public final float d;
    public final sl0 e;

    public rl0(sl0 sl0Var, View view, int i10, float f7, float f10) {
        this.e = sl0Var;
        this.f27989a = view;
        this.f27990b = i10;
        this.f27991c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        tl0 tl0Var = this.e.f28310b;
        yl0 yl0Var = (yl0) tl0Var.f28589b;
        if (this == yl0Var.S1) {
            yl0Var.S1 = null;
        }
        View view = this.f27989a;
        if (view != null) {
            yl0Var.h1(view, 0.0f, 0.0f, false);
            if (!((yl0) tl0Var.f28589b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f27990b;
                if (i10 != -1) {
                    yl0 yl0Var2 = (yl0) tl0Var.f28589b;
                    ml0 ml0Var = yl0Var2.V0;
                    if (ml0Var != null) {
                        ml0Var.d(i10, view);
                        return;
                    }
                    nl0 nl0Var = yl0Var2.W0;
                    if (nl0Var != null) {
                        nl0Var.c(this.f27991c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
