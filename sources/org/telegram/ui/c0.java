package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f36337a = 0;
    public final z2 f36338b;
    public final View f36339c;

    public c0(View view, z2 z2Var) {
        this.f36339c = view;
        this.f36338b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f36337a) {
            case 0:
                z2 z2Var = this.f36338b;
                View view = this.f36339c;
                view.post(new c0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f36338b;
                z2Var2.I.clear();
                z2Var2.K.set(null);
                this.f36339c.invalidate();
                return;
        }
    }

    public c0(z2 z2Var, View view) {
        this.f36338b = z2Var;
        this.f36339c = view;
    }
}
