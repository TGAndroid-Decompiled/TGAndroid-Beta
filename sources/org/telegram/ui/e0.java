package org.telegram.ui;

import android.view.View;
public final class e0 implements Runnable {
    public final int f33071a = 0;
    public final c3 f33072b;
    public final View f33073c;

    public e0(View view, c3 c3Var) {
        this.f33073c = view;
        this.f33072b = c3Var;
    }

    @Override
    public final void run() {
        switch (this.f33071a) {
            case 0:
                c3 c3Var = this.f33072b;
                View view = this.f33073c;
                view.post(new e0(c3Var, view));
                return;
            default:
                c3 c3Var2 = this.f33072b;
                c3Var2.I.clear();
                c3Var2.K.set(null);
                this.f33073c.invalidate();
                return;
        }
    }

    public e0(c3 c3Var, View view) {
        this.f33072b = c3Var;
        this.f33073c = view;
    }
}
