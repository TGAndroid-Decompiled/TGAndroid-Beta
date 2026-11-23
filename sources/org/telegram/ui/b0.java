package org.telegram.ui;

import android.view.View;
public final class b0 implements Runnable {
    public final int f45685a = 0;
    public final z2 f45686b;
    public final View f45687c;

    public b0(View view, z2 z2Var) {
        this.f45687c = view;
        this.f45686b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f45685a) {
            case 0:
                z2 z2Var = this.f45686b;
                View view = this.f45687c;
                view.post(new b0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f45686b;
                z2Var2.J.clear();
                z2Var2.L.set(null);
                this.f45687c.invalidate();
                return;
        }
    }

    public b0(z2 z2Var, View view) {
        this.f45686b = z2Var;
        this.f45687c = view;
    }
}
