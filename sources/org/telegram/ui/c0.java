package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f36144a = 0;
    public final z2 f36145b;
    public final View f36146c;

    public c0(View view, z2 z2Var) {
        this.f36146c = view;
        this.f36145b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f36144a) {
            case 0:
                z2 z2Var = this.f36145b;
                View view = this.f36146c;
                view.post(new c0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f36145b;
                z2Var2.I.clear();
                z2Var2.K.set(null);
                this.f36146c.invalidate();
                return;
        }
    }

    public c0(z2 z2Var, View view) {
        this.f36145b = z2Var;
        this.f36146c = view;
    }
}
