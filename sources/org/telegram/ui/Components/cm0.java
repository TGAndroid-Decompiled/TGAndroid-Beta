package org.telegram.ui.Components;

import android.view.View;
public final class cm0 implements Runnable {
    public final View f25223a;
    public final int f25224b;
    public final float f25225c;
    public final float d;
    public final dm0 e;

    public cm0(dm0 dm0Var, View view, int i10, float f7, float f10) {
        this.e = dm0Var;
        this.f25223a = view;
        this.f25224b = i10;
        this.f25225c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        em0 em0Var = this.e.f25573b;
        jm0 jm0Var = (jm0) em0Var.f25935b;
        if (this == jm0Var.Q1) {
            jm0Var.Q1 = null;
        }
        View view = this.f25223a;
        if (view != null) {
            jm0Var.h1(view, 0.0f, 0.0f, false);
            if (!((jm0) em0Var.f25935b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f25224b;
                if (i10 != -1) {
                    jm0 jm0Var2 = (jm0) em0Var.f25935b;
                    xl0 xl0Var = jm0Var2.T0;
                    if (xl0Var != null) {
                        xl0Var.a(i10, view);
                        return;
                    }
                    yl0 yl0Var = jm0Var2.U0;
                    if (yl0Var != null) {
                        yl0Var.d(this.f25225c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
