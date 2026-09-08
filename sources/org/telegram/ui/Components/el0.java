package org.telegram.ui.Components;

import android.view.View;
public final class el0 implements Runnable {
    public final View f25752a;
    public final int f25753b;
    public final float f25754c;
    public final float d;
    public final fl0 f25755e;

    public el0(fl0 fl0Var, View view, int i10, float f7, float f10) {
        this.f25755e = fl0Var;
        this.f25752a = view;
        this.f25753b = i10;
        this.f25754c = f7;
        this.d = f10;
    }

    @Override
    public final void run() {
        gl0 gl0Var = this.f25755e.f26154b;
        ll0 ll0Var = (ll0) gl0Var.f26487b;
        if (this == ll0Var.S1) {
            ll0Var.S1 = null;
        }
        View view = this.f25752a;
        if (view != null) {
            ll0Var.g1(view, 0.0f, 0.0f, false);
            if (!((ll0) gl0Var.f26487b).R1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i10 = this.f25753b;
                if (i10 != -1) {
                    ll0 ll0Var2 = (ll0) gl0Var.f26487b;
                    zk0 zk0Var = ll0Var2.V0;
                    if (zk0Var != null) {
                        zk0Var.a(i10, view);
                        return;
                    }
                    al0 al0Var = ll0Var2.W0;
                    if (al0Var != null) {
                        al0Var.d(this.f25754c - view.getX(), this.d - view.getY(), i10, view);
                    }
                }
            }
        }
    }
}
