package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f35098a = 0;
    public final d3 f35099b;
    public final View f35100c;

    public d0(View view, d3 d3Var) {
        this.f35100c = view;
        this.f35099b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f35098a) {
            case 0:
                d3 d3Var = this.f35099b;
                View view = this.f35100c;
                view.post(new d0(d3Var, view));
                return;
            default:
                d3 d3Var2 = this.f35099b;
                d3Var2.I.clear();
                d3Var2.K.set(null);
                this.f35100c.invalidate();
                return;
        }
    }

    public d0(d3 d3Var, View view) {
        this.f35099b = d3Var;
        this.f35100c = view;
    }
}
