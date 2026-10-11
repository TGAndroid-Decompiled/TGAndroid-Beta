package org.telegram.ui.Components;

import android.view.View;
public final class lm0 implements Runnable {
    public final View f28364a;
    public final int f28365b;
    public final float f28366c;
    public final float d;
    public final mm0 f28367e;

    public lm0(mm0 mm0Var, View view, int i10, float f7, float f10) {
        this.f28367e = mm0Var;
        this.f28364a = view;
        this.f28365b = i10;
        this.f28366c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        nm0 nm0Var = this.f28367e.f28799b;
        sm0 sm0Var = (sm0) nm0Var.f29093b;
        if (this == sm0Var.Q1) {
            sm0Var.Q1 = null;
        }
        View view = this.f28364a;
        if (view != null) {
            sm0Var.h1(view, 0.0f, 0.0f, false);
            if (!((sm0) nm0Var.f29093b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f28365b;
                if (i10 != -1) {
                    sm0 sm0Var2 = (sm0) nm0Var.f29093b;
                    gm0 gm0Var = sm0Var2.T0;
                    if (gm0Var != null) {
                        gm0Var.d(i10, view);
                        return;
                    }
                    hm0 hm0Var = sm0Var2.U0;
                    if (hm0Var != null) {
                        hm0Var.c(this.f28366c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
