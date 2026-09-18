package org.telegram.ui.Components;

import android.view.View;
public final class fl0 implements Runnable {
    public final View f23961a;
    public final int f23962b;
    public final float f23963c;
    public final float d;
    public final gl0 e;

    public fl0(gl0 gl0Var, View view, int i10, float f7, float f10) {
        this.e = gl0Var;
        this.f23961a = view;
        this.f23962b = i10;
        this.f23963c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        hl0 hl0Var = this.e.f24345b;
        ml0 ml0Var = (ml0) hl0Var.f24696b;
        if (this == ml0Var.S1) {
            ml0Var.S1 = null;
        }
        View view = this.f23961a;
        if (view != null) {
            ml0Var.i1(view, 0.0f, 0.0f, false);
            if (!((ml0) hl0Var.f24696b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f23962b;
                if (i10 != -1) {
                    ml0 ml0Var2 = (ml0) hl0Var.f24696b;
                    al0 al0Var = ml0Var2.V0;
                    if (al0Var != null) {
                        al0Var.d(i10, view);
                        return;
                    }
                    bl0 bl0Var = ml0Var2.W0;
                    if (bl0Var != null) {
                        bl0Var.c(this.f23963c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
