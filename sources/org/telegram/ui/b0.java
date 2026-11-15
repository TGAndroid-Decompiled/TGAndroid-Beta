package org.telegram.ui;

import android.view.View;
public final class b0 implements Runnable {
    public final int f45544a = 0;
    public final z2 f45545b;
    public final View f45546c;

    public b0(View view, z2 z2Var) {
        this.f45546c = view;
        this.f45545b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f45544a) {
            case 0:
                z2 z2Var = this.f45545b;
                View view = this.f45546c;
                view.post(new b0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f45545b;
                z2Var2.J.clear();
                z2Var2.L.set(null);
                this.f45546c.invalidate();
                return;
        }
    }

    public b0(z2 z2Var, View view) {
        this.f45545b = z2Var;
        this.f45546c = view;
    }
}
