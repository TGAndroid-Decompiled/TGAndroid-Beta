package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f44506a = 0;
    public final a3 f44507b;
    public final View f44508c;

    public d0(View view, a3 a3Var) {
        this.f44508c = view;
        this.f44507b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f44506a) {
            case 0:
                a3 a3Var = this.f44507b;
                View view = this.f44508c;
                view.post(new d0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f44507b;
                a3Var2.J.clear();
                a3Var2.L.set(null);
                this.f44508c.invalidate();
                return;
        }
    }

    public d0(a3 a3Var, View view) {
        this.f44507b = a3Var;
        this.f44508c = view;
    }
}
