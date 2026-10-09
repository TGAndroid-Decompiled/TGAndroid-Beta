package org.telegram.ui.Components;

import android.view.View;
public final class jm0 implements Runnable {
    public final View f27740a;
    public final int f27741b;
    public final float f27742c;
    public final float d;
    public final km0 f27743e;

    public jm0(km0 km0Var, View view, int i10, float f7, float f10) {
        this.f27743e = km0Var;
        this.f27740a = view;
        this.f27741b = i10;
        this.f27742c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        lm0 lm0Var = this.f27743e.f28111b;
        qm0 qm0Var = (qm0) lm0Var.f28488b;
        if (this == qm0Var.Q1) {
            qm0Var.Q1 = null;
        }
        View view = this.f27740a;
        if (view != null) {
            qm0Var.h1(view, 0.0f, 0.0f, false);
            if (!((qm0) lm0Var.f28488b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f27741b;
                if (i10 != -1) {
                    qm0 qm0Var2 = (qm0) lm0Var.f28488b;
                    em0 em0Var = qm0Var2.T0;
                    if (em0Var != null) {
                        em0Var.d(i10, view);
                        return;
                    }
                    fm0 fm0Var = qm0Var2.U0;
                    if (fm0Var != null) {
                        fm0Var.c(this.f27742c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
