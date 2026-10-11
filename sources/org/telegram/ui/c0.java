package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f36485a = 0;
    public final a3 f36486b;
    public final View f36487c;

    public c0(View view, a3 a3Var) {
        this.f36487c = view;
        this.f36486b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f36485a) {
            case 0:
                a3 a3Var = this.f36486b;
                View view = this.f36487c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f36486b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f36487c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f36486b = a3Var;
        this.f36487c = view;
    }
}
