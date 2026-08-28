package org.telegram.ui;

import android.view.View;
public final class e0 implements Runnable {
    public final int f37764a = 0;
    public final e3 f37765b;
    public final View f37766c;

    public e0(View view, e3 e3Var) {
        this.f37766c = view;
        this.f37765b = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f37764a) {
            case 0:
                e3 e3Var = this.f37765b;
                View view = this.f37766c;
                view.post(new e0(e3Var, view));
                return;
            default:
                e3 e3Var2 = this.f37765b;
                e3Var2.E.clear();
                e3Var2.G.set(null);
                this.f37766c.invalidate();
                return;
        }
    }

    public e0(e3 e3Var, View view) {
        this.f37765b = e3Var;
        this.f37766c = view;
    }
}
