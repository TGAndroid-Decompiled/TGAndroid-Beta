package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f38192a = 0;
    public final a3 f38193b;
    public final View f38194c;

    public c0(View view, a3 a3Var) {
        this.f38194c = view;
        this.f38193b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f38192a) {
            case 0:
                a3 a3Var = this.f38193b;
                View view = this.f38194c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f38193b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f38194c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f38193b = a3Var;
        this.f38194c = view;
    }
}
