package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f34818a = 0;
    public final d3 f34819b;
    public final View f34820c;

    public d0(View view, d3 d3Var) {
        this.f34820c = view;
        this.f34819b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f34818a) {
            case 0:
                d3 d3Var = this.f34819b;
                View view = this.f34820c;
                view.post(new d0(d3Var, view));
                return;
            default:
                d3 d3Var2 = this.f34819b;
                d3Var2.I.clear();
                d3Var2.K.set(null);
                this.f34820c.invalidate();
                return;
        }
    }

    public d0(d3 d3Var, View view) {
        this.f34819b = d3Var;
        this.f34820c = view;
    }
}
