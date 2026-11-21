package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f46339a = 0;
    public final z2 f46340b;
    public final View f46341c;

    public c0(View view, z2 z2Var) {
        this.f46341c = view;
        this.f46340b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f46339a) {
            case 0:
                z2 z2Var = this.f46340b;
                View view = this.f46341c;
                view.post(new c0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f46340b;
                z2Var2.J.clear();
                z2Var2.L.set(null);
                this.f46341c.invalidate();
                return;
        }
    }

    public c0(z2 z2Var, View view) {
        this.f46340b = z2Var;
        this.f46341c = view;
    }
}
