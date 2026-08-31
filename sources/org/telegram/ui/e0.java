package org.telegram.ui;

import android.view.View;
public final class e0 implements Runnable {
    public final int f36334a = 0;
    public final d3 f36335b;
    public final View f36336c;

    public e0(View view, d3 d3Var) {
        this.f36336c = view;
        this.f36335b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f36334a) {
            case 0:
                d3 d3Var = this.f36335b;
                View view = this.f36336c;
                view.post(new e0(d3Var, view));
                return;
            default:
                d3 d3Var2 = this.f36335b;
                d3Var2.F.clear();
                d3Var2.H.set(null);
                this.f36336c.invalidate();
                return;
        }
    }

    public e0(d3 d3Var, View view) {
        this.f36335b = d3Var;
        this.f36336c = view;
    }
}
