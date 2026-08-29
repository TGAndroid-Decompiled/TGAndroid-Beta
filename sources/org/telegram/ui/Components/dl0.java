package org.telegram.ui.Components;

import android.view.View;
public final class dl0 implements Runnable {
    public final View f27807a;
    public final int f27808b;
    public final float f27809c;
    public final float d;
    public final el0 f27810e;

    public dl0(el0 el0Var, View view, int i10, float f9, float f10) {
        this.f27810e = el0Var;
        this.f27807a = view;
        this.f27808b = i10;
        this.f27809c = f9;
        this.d = f10;
    }

    @Override
    public final void run() {
        f2.y yVar = this.f27810e.f28106b;
        jl0 jl0Var = (jl0) yVar.f6512b;
        if (this == jl0Var.O1) {
            jl0Var.O1 = null;
        }
        View view = this.f27807a;
        if (view != null) {
            jl0Var.h1(view, 0.0f, 0.0f, false);
            if (!((jl0) yVar.f6512b).N1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f27808b;
                if (i10 != -1) {
                    jl0 jl0Var2 = (jl0) yVar.f6512b;
                    zk0 zk0Var = jl0Var2.R0;
                    if (zk0Var != null) {
                        zk0Var.c(i10, view);
                        return;
                    }
                    al0 al0Var = jl0Var2.S0;
                    if (al0Var != null) {
                        al0Var.b(this.f27809c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
