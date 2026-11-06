package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f44490a = 0;
    public final z2 f44491b;
    public final View f44492c;

    public c0(View view, z2 z2Var) {
        this.f44492c = view;
        this.f44491b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f44490a) {
            case 0:
                z2 z2Var = this.f44491b;
                View view = this.f44492c;
                view.post(new c0(z2Var, view));
                return;
            default:
                z2 z2Var2 = this.f44491b;
                z2Var2.I.clear();
                z2Var2.K.set(null);
                this.f44492c.invalidate();
                return;
        }
    }

    public c0(z2 z2Var, View view) {
        this.f44491b = z2Var;
        this.f44492c = view;
    }
}
