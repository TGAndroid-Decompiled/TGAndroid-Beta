package org.telegram.ui.Components;

import android.view.View;
public final class rl0 implements Runnable {
    public final View f30440a;
    public final int f30441b;
    public final float f30442c;
    public final float d;
    public final sl0 f30443e;

    public rl0(sl0 sl0Var, View view, int i10, float f7, float f10) {
        this.f30443e = sl0Var;
        this.f30440a = view;
        this.f30441b = i10;
        this.f30442c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        tl0 tl0Var = this.f30443e.f30805b;
        zl0 zl0Var = (zl0) tl0Var.f31090b;
        if (this == zl0Var.S1) {
            zl0Var.S1 = null;
        }
        View view = this.f30440a;
        if (view != null) {
            zl0Var.k1(view, 0.0f, 0.0f, false);
            if (!((zl0) tl0Var.f31090b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f30441b;
                if (i10 != -1) {
                    zl0 zl0Var2 = (zl0) tl0Var.f31090b;
                    ml0 ml0Var = zl0Var2.V0;
                    if (ml0Var != null) {
                        ml0Var.d(i10, view);
                        return;
                    }
                    nl0 nl0Var = zl0Var2.W0;
                    if (nl0Var != null) {
                        nl0Var.c(this.f30442c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
