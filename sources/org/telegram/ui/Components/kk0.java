package org.telegram.ui.Components;

import android.view.View;
public final class kk0 implements Runnable {
    public final View f27812a;
    public final int f27813b;
    public final float f27814c;
    public final float d;
    public final lk0 e;

    public kk0(lk0 lk0Var, View view, int i10, float f7, float f10) {
        this.e = lk0Var;
        this.f27812a = view;
        this.f27813b = i10;
        this.f27814c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        mk0 mk0Var = this.e.f28133b;
        tk0 tk0Var = (tk0) mk0Var.f28546b;
        if (this == tk0Var.Q1) {
            tk0Var.Q1 = null;
        }
        View view = this.f27812a;
        if (view != null) {
            tk0Var.j1(view, 0.0f, 0.0f, false);
            if (!((tk0) mk0Var.f28546b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f27813b;
                if (i10 != -1) {
                    tk0 tk0Var2 = (tk0) mk0Var.f28546b;
                    gk0 gk0Var = tk0Var2.T0;
                    if (gk0Var != null) {
                        gk0Var.f(i10, view);
                        return;
                    }
                    hk0 hk0Var = tk0Var2.U0;
                    if (hk0Var != null) {
                        hk0Var.b(this.f27814c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
