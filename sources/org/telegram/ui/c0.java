package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f44168a = 0;
    public final z2 f44169b;
    public final View f44170c;

    public c0(View view, z2 z2Var) {
        this.f44170c = view;
        this.f44169b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f44168a) {
            case 0:
                z2 z2Var = this.f44169b;
                View view = this.f44170c;
                view.post(new c0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f44169b;
                z2Var2.I.clear();
                z2Var2.K.set(null);
                this.f44170c.invalidate();
                return;
        }
    }

    public c0(z2 z2Var, View view) {
        this.f44169b = z2Var;
        this.f44170c = view;
    }
}
