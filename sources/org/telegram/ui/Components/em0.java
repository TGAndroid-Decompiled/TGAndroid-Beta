package org.telegram.ui.Components;

import android.view.View;
public final class em0 implements Runnable {
    public final View f26076a;
    public final int f26077b;
    public final float f26078c;
    public final float d;
    public final fm0 e;

    public em0(fm0 fm0Var, View view, int i10, float f7, float f10) {
        this.e = fm0Var;
        this.f26076a = view;
        this.f26077b = i10;
        this.f26078c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        gm0 gm0Var = this.e.f26394b;
        lm0 lm0Var = (lm0) gm0Var.f26729b;
        if (this == lm0Var.Q1) {
            lm0Var.Q1 = null;
        }
        View view = this.f26076a;
        if (view != null) {
            lm0Var.j1(view, 0.0f, 0.0f, false);
            if (!((lm0) gm0Var.f26729b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f26077b;
                if (i10 != -1) {
                    lm0 lm0Var2 = (lm0) gm0Var.f26729b;
                    zl0 zl0Var = lm0Var2.T0;
                    if (zl0Var != null) {
                        zl0Var.d(i10, view);
                        return;
                    }
                    am0 am0Var = lm0Var2.U0;
                    if (am0Var != null) {
                        am0Var.c(this.f26078c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
