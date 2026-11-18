package org.telegram.ui.Components;

import android.view.View;
public final class tj0 implements Runnable {
    public final View f40026a;
    public final int f40027b;
    public final float f40028c;
    public final float d;
    public final uj0 f40029e;

    public tj0(uj0 uj0Var, View view, int i7, float f10, float f11) {
        this.f40029e = uj0Var;
        this.f40026a = view;
        this.f40027b = i7;
        this.f40028c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        vj0 vj0Var = this.f40029e.f40369b;
        ck0 ck0Var = (ck0) vj0Var.f40689b;
        if (this == ck0Var.R1) {
            ck0Var.R1 = null;
        }
        View view = this.f40026a;
        if (view != null) {
            ck0Var.j1(view, 0.0f, 0.0f, false);
            if (!((ck0) vj0Var.f40689b).Q1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i7 = this.f40027b;
                if (i7 != -1) {
                    ck0 ck0Var2 = (ck0) vj0Var.f40689b;
                    oj0 oj0Var = ck0Var2.U0;
                    if (oj0Var != null) {
                        oj0Var.c(i7, view);
                        return;
                    }
                    pj0 pj0Var = ck0Var2.V0;
                    if (pj0Var != null) {
                        pj0Var.f(this.f40028c - view.getX(), this.d - view.getY(), i7, view);
                    }
                }
            }
        }
    }
}
