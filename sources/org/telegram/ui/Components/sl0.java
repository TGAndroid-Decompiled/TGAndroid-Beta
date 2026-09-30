package org.telegram.ui.Components;

import android.view.View;
public final class sl0 implements Runnable {
    public final View f28284a;
    public final int f28285b;
    public final float f28286c;
    public final float d;
    public final tl0 e;

    public sl0(tl0 tl0Var, View view, int i10, float f7, float f10) {
        this.e = tl0Var;
        this.f28284a = view;
        this.f28285b = i10;
        this.f28286c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        ul0 ul0Var = this.e.f28600b;
        zl0 zl0Var = (zl0) ul0Var.f28891b;
        if (this == zl0Var.S1) {
            zl0Var.S1 = null;
        }
        View view = this.f28284a;
        if (view != null) {
            zl0Var.k1(view, 0.0f, 0.0f, false);
            if (!((zl0) ul0Var.f28891b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f28285b;
                if (i10 != -1) {
                    zl0 zl0Var2 = (zl0) ul0Var.f28891b;
                    nl0 nl0Var = zl0Var2.V0;
                    if (nl0Var != null) {
                        nl0Var.d(i10, view);
                        return;
                    }
                    ol0 ol0Var = zl0Var2.W0;
                    if (ol0Var != null) {
                        ol0Var.c(this.f28286c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
