package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f34977a = 0;
    public final b3 f34978b;
    public final View f34979c;

    public c0(View view, b3 b3Var) {
        this.f34979c = view;
        this.f34978b = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f34977a) {
            case 0:
                b3 b3Var = this.f34978b;
                View view = this.f34979c;
                view.post(new c0(b3Var, view));
                return;
            default:
                b3 b3Var2 = this.f34978b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.f34979c.invalidate();
                return;
        }
    }

    public c0(b3 b3Var, View view) {
        this.f34978b = b3Var;
        this.f34979c = view;
    }
}
