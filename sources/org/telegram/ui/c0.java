package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f36202a = 0;
    public final c3 f36203b;
    public final View f36204c;

    public c0(View view, c3 c3Var) {
        this.f36204c = view;
        this.f36203b = c3Var;
    }

    @Override
    public final void run() {
        switch (this.f36202a) {
            case 0:
                c3 c3Var = this.f36203b;
                View view = this.f36204c;
                view.post(new c0(c3Var, view));
                return;
            default:
                c3 c3Var2 = this.f36203b;
                c3Var2.I.clear();
                c3Var2.K.set(null);
                this.f36204c.invalidate();
                return;
        }
    }

    public c0(c3 c3Var, View view) {
        this.f36203b = c3Var;
        this.f36204c = view;
    }
}
