package org.telegram.ui.Components;

import android.view.View;
public final class kj0 implements Runnable {
    public final View f35420a;
    public final int f35421b;
    public final float f35422c;
    public final float d;
    public final lj0 f35423e;

    public kj0(lj0 lj0Var, View view, int i3, float f10, float f11) {
        this.f35423e = lj0Var;
        this.f35420a = view;
        this.f35421b = i3;
        this.f35422c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        mj0 mj0Var = this.f35423e.f35781b;
        tj0 tj0Var = (tj0) mj0Var.f36172b;
        if (this == tj0Var.R1) {
            tj0Var.R1 = null;
        }
        View view = this.f35420a;
        if (view != null) {
            tj0Var.j1(view, 0.0f, 0.0f, false);
            if (!((tj0) mj0Var.f36172b).Q1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i3 = this.f35421b;
                if (i3 != -1) {
                    tj0 tj0Var2 = (tj0) mj0Var.f36172b;
                    fj0 fj0Var = tj0Var2.U0;
                    if (fj0Var != null) {
                        fj0Var.f(i3, view);
                        return;
                    }
                    gj0 gj0Var = tj0Var2.V0;
                    if (gj0Var != null) {
                        gj0Var.b(this.f35422c - view.getX(), this.d - view.getY(), i3, view);
                    }
                }
            }
        }
    }
}
