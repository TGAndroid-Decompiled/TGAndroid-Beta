package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f36209a = 0;
    public final d3 f36210b;
    public final View f36211c;

    public d0(View view, d3 d3Var) {
        this.f36211c = view;
        this.f36210b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f36209a) {
            case 0:
                d3 d3Var = this.f36210b;
                View view = this.f36211c;
                view.post(new d0(d3Var, view));
                return;
            default:
                d3 d3Var2 = this.f36210b;
                d3Var2.I.clear();
                d3Var2.K.set(null);
                this.f36211c.invalidate();
                return;
        }
    }

    public d0(d3 d3Var, View view) {
        this.f36210b = d3Var;
        this.f36211c = view;
    }
}
