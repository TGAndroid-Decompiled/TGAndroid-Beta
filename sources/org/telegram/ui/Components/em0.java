package org.telegram.ui.Components;

import android.view.View;
public final class em0 implements Runnable {
    public final View f27899a;
    public final int f27900b;
    public final float f27901c;
    public final float d;
    public final fm0 e;

    public em0(fm0 fm0Var, View view, int i10, float f7, float f10) {
        this.e = fm0Var;
        this.f27899a = view;
        this.f27900b = i10;
        this.f27901c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        gm0 gm0Var = this.e.f28277b;
        mm0 mm0Var = (mm0) gm0Var.f28603b;
        if (this == mm0Var.Q1) {
            mm0Var.Q1 = null;
        }
        View view = this.f27899a;
        if (view != null) {
            mm0Var.k1(view, 0.0f, 0.0f, false);
            if (!((mm0) gm0Var.f28603b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f27900b;
                if (i10 != -1) {
                    mm0 mm0Var2 = (mm0) gm0Var.f28603b;
                    zl0 zl0Var = mm0Var2.T0;
                    if (zl0Var != null) {
                        zl0Var.c(i10, view);
                        return;
                    }
                    am0 am0Var = mm0Var2.U0;
                    if (am0Var != null) {
                        am0Var.e(this.f27901c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
