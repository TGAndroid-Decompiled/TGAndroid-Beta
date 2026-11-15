package org.telegram.ui.Components;

import android.view.View;
public final class lj0 implements Runnable {
    public final View f36826a;
    public final int f36827b;
    public final float f36828c;
    public final float d;
    public final mj0 f36829e;

    public lj0(mj0 mj0Var, View view, int i7, float f10, float f11) {
        this.f36829e = mj0Var;
        this.f36826a = view;
        this.f36827b = i7;
        this.f36828c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        nj0 nj0Var = this.f36829e.f37310b;
        uj0 uj0Var = (uj0) nj0Var.f37624b;
        if (this == uj0Var.R1) {
            uj0Var.R1 = null;
        }
        View view = this.f36826a;
        if (view != null) {
            uj0Var.j1(view, 0.0f, 0.0f, false);
            if (!((uj0) nj0Var.f37624b).Q1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i7 = this.f36827b;
                if (i7 != -1) {
                    uj0 uj0Var2 = (uj0) nj0Var.f37624b;
                    gj0 gj0Var = uj0Var2.U0;
                    if (gj0Var != null) {
                        gj0Var.b(i7, view);
                        return;
                    }
                    hj0 hj0Var = uj0Var2.V0;
                    if (hj0Var != null) {
                        hj0Var.f(this.f36828c - view.getX(), this.d - view.getY(), i7, view);
                    }
                }
            }
        }
    }
}
