package org.telegram.ui;

import android.view.View;

public final class f0 implements Runnable {

    public final int f37887a = 0;

    public final f3 f37888b;

    public final View f37889c;

    public f0(View view, f3 f3Var) {
        this.f37889c = view;
        this.f37888b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f37887a) {
            case 0:
                f3 f3Var = this.f37888b;
                View view = this.f37889c;
                view.post(new f0(f3Var, view));
                break;
            default:
                f3 f3Var2 = this.f37888b;
                f3Var2.E.clear();
                f3Var2.G.set(null);
                this.f37889c.invalidate();
                break;
        }
    }

    public f0(f3 f3Var, View view) {
        this.f37888b = f3Var;
        this.f37889c = view;
    }
}
