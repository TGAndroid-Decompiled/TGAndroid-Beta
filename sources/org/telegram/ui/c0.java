package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f46316a = 0;
    public final z2 f46317b;
    public final View f46318c;

    public c0(View view, z2 z2Var) {
        this.f46318c = view;
        this.f46317b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f46316a) {
            case 0:
                z2 z2Var = this.f46317b;
                View view = this.f46318c;
                view.post(new c0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f46317b;
                z2Var2.J.clear();
                z2Var2.L.set(null);
                this.f46318c.invalidate();
                return;
        }
    }

    public c0(z2 z2Var, View view) {
        this.f46317b = z2Var;
        this.f46318c = view;
    }
}
