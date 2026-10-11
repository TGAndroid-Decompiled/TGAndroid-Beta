package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f36519a = 0;
    public final a3 f36520b;
    public final View f36521c;

    public c0(View view, a3 a3Var) {
        this.f36521c = view;
        this.f36520b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f36519a) {
            case 0:
                a3 a3Var = this.f36520b;
                View view = this.f36521c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f36520b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f36521c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f36520b = a3Var;
        this.f36521c = view;
    }
}
