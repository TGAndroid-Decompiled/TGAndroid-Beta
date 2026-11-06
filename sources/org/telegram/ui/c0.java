package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f44510a = 0;
    public final z2 f44511b;
    public final View f44512c;

    public c0(View view, z2 z2Var) {
        this.f44512c = view;
        this.f44511b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f44510a) {
            case 0:
                z2 z2Var = this.f44511b;
                View view = this.f44512c;
                view.post(new c0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f44511b;
                z2Var2.I.clear();
                z2Var2.K.set(null);
                this.f44512c.invalidate();
                return;
        }
    }

    public c0(z2 z2Var, View view) {
        this.f44511b = z2Var;
        this.f44512c = view;
    }
}
