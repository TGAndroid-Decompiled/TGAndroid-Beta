package org.telegram.ui.Components;

import android.view.View;
public final class ll0 implements Runnable {
    public final View f26777a;
    public final int f26778b;
    public final float f26779c;
    public final float d;
    public final ml0 e;

    public ll0(ml0 ml0Var, View view, int i10, float f10, float f11) {
        this.e = ml0Var;
        this.f26777a = view;
        this.f26778b = i10;
        this.f26779c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        f2.y yVar = this.e.f27087b;
        rl0 rl0Var = (rl0) yVar.f5851b;
        if (this == rl0Var.P1) {
            rl0Var.P1 = null;
        }
        View view = this.f26777a;
        if (view != null) {
            rl0Var.g1(view, 0.0f, 0.0f, false);
            if (!((rl0) yVar.f5851b).O1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f26778b;
                if (i10 != -1) {
                    rl0 rl0Var2 = (rl0) yVar.f5851b;
                    hl0 hl0Var = rl0Var2.S0;
                    if (hl0Var != null) {
                        hl0Var.d(i10, view);
                        return;
                    }
                    il0 il0Var = rl0Var2.T0;
                    if (il0Var != null) {
                        il0Var.c(this.f26779c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
