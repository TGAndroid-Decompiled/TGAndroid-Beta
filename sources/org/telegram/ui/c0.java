package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f46325a = 0;
    public final z2 f46326b;
    public final View f46327c;

    public c0(View view, z2 z2Var) {
        this.f46327c = view;
        this.f46326b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f46325a) {
            case 0:
                z2 z2Var = this.f46326b;
                View view = this.f46327c;
                view.post(new c0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f46326b;
                z2Var2.J.clear();
                z2Var2.L.set(null);
                this.f46327c.invalidate();
                return;
        }
    }

    public c0(z2 z2Var, View view) {
        this.f46326b = z2Var;
        this.f46327c = view;
    }
}
