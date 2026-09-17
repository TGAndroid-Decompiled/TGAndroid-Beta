package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f34978a = 0;
    public final b3 f34979b;
    public final View f34980c;

    public c0(View view, b3 b3Var) {
        this.f34980c = view;
        this.f34979b = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f34978a) {
            case 0:
                b3 b3Var = this.f34979b;
                View view = this.f34980c;
                view.post(new c0(b3Var, view));
                return;
            default:
                b3 b3Var2 = this.f34979b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.f34980c.invalidate();
                return;
        }
    }

    public c0(b3 b3Var, View view) {
        this.f34979b = b3Var;
        this.f34980c = view;
    }
}
