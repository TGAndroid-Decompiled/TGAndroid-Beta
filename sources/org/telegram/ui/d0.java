package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f31796a = 0;
    public final c3 f31797b;
    public final View f31798c;

    public d0(View view, c3 c3Var) {
        this.f31798c = view;
        this.f31797b = c3Var;
    }

    @Override
    public final void run() {
        switch (this.f31796a) {
            case 0:
                c3 c3Var = this.f31797b;
                View view = this.f31798c;
                view.post(new d0(c3Var, view));
                return;
            default:
                c3 c3Var2 = this.f31797b;
                c3Var2.I.clear();
                c3Var2.K.set(null);
                this.f31798c.invalidate();
                return;
        }
    }

    public d0(c3 c3Var, View view) {
        this.f31797b = c3Var;
        this.f31798c = view;
    }
}
