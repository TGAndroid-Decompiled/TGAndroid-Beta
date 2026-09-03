package org.telegram.ui;

import android.view.View;
public final class e0 implements Runnable {
    public final int f36292a = 0;
    public final d3 f36293b;
    public final View f36294c;

    public e0(View view, d3 d3Var) {
        this.f36294c = view;
        this.f36293b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f36292a) {
            case 0:
                d3 d3Var = this.f36293b;
                View view = this.f36294c;
                view.post(new e0(d3Var, view));
                return;
            default:
                d3 d3Var2 = this.f36293b;
                d3Var2.F.clear();
                d3Var2.H.set(null);
                this.f36294c.invalidate();
                return;
        }
    }

    public e0(d3 d3Var, View view) {
        this.f36293b = d3Var;
        this.f36294c = view;
    }
}
