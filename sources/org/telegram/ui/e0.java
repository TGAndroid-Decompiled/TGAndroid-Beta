package org.telegram.ui;

import android.view.View;
public final class e0 implements Runnable {
    public final int f33829a = 0;
    public final d3 f33830b;
    public final View f33831c;

    public e0(View view, d3 d3Var) {
        this.f33831c = view;
        this.f33830b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f33829a) {
            case 0:
                d3 d3Var = this.f33830b;
                View view = this.f33831c;
                view.post(new e0(d3Var, view));
                return;
            default:
                d3 d3Var2 = this.f33830b;
                d3Var2.F.clear();
                d3Var2.H.set(null);
                this.f33831c.invalidate();
                return;
        }
    }

    public e0(d3 d3Var, View view) {
        this.f33830b = d3Var;
        this.f33831c = view;
    }
}
