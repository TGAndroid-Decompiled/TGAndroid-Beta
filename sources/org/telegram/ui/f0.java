package org.telegram.ui;

import android.view.View;
public final class f0 implements Runnable {
    public final int f37939a = 0;
    public final f3 f37940b;
    public final View f37941c;

    public f0(View view, f3 f3Var) {
        this.f37941c = view;
        this.f37940b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f37939a) {
            case 0:
                f3 f3Var = this.f37940b;
                View view = this.f37941c;
                view.post(new f0(f3Var, view));
                return;
            default:
                f3 f3Var2 = this.f37940b;
                f3Var2.E.clear();
                f3Var2.G.set(null);
                this.f37941c.invalidate();
                return;
        }
    }

    public f0(f3 f3Var, View view) {
        this.f37940b = f3Var;
        this.f37941c = view;
    }
}
