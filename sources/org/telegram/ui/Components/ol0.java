package org.telegram.ui.Components;

import android.view.View;
public final class ol0 implements Runnable {
    public final View f26972a;
    public final int f26973b;
    public final float f26974c;
    public final float d;
    public final pl0 e;

    public ol0(pl0 pl0Var, View view, int i10, float f7, float f10) {
        this.e = pl0Var;
        this.f26972a = view;
        this.f26973b = i10;
        this.f26974c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        ql0 ql0Var = this.e.f27384b;
        vl0 vl0Var = (vl0) ql0Var.f27606b;
        if (this == vl0Var.S1) {
            vl0Var.S1 = null;
        }
        View view = this.f26972a;
        if (view != null) {
            vl0Var.i1(view, 0.0f, 0.0f, false);
            if (!((vl0) ql0Var.f27606b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f26973b;
                if (i10 != -1) {
                    vl0 vl0Var2 = (vl0) ql0Var.f27606b;
                    jl0 jl0Var = vl0Var2.V0;
                    if (jl0Var != null) {
                        jl0Var.d(i10, view);
                        return;
                    }
                    kl0 kl0Var = vl0Var2.W0;
                    if (kl0Var != null) {
                        kl0Var.c(this.f26974c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
