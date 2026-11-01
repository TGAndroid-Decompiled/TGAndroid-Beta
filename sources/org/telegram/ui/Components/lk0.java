package org.telegram.ui.Components;

import android.view.View;
public final class lk0 implements Runnable {
    public final View f28194a;
    public final int f28195b;
    public final float f28196c;
    public final float d;
    public final mk0 e;

    public lk0(mk0 mk0Var, View view, int i10, float f7, float f10) {
        this.e = mk0Var;
        this.f28194a = view;
        this.f28195b = i10;
        this.f28196c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        nk0 nk0Var = this.e.f28510b;
        uk0 uk0Var = (uk0) nk0Var.f28908b;
        if (this == uk0Var.Q1) {
            uk0Var.Q1 = null;
        }
        View view = this.f28194a;
        if (view != null) {
            uk0Var.j1(view, 0.0f, 0.0f, false);
            if (!((uk0) nk0Var.f28908b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f28195b;
                if (i10 != -1) {
                    uk0 uk0Var2 = (uk0) nk0Var.f28908b;
                    hk0 hk0Var = uk0Var2.T0;
                    if (hk0Var != null) {
                        hk0Var.f(i10, view);
                        return;
                    }
                    ik0 ik0Var = uk0Var2.U0;
                    if (ik0Var != null) {
                        ik0Var.b(this.f28196c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
