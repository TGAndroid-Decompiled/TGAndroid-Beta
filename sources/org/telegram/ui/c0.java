package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f34951a = 0;
    public final b3 f34952b;
    public final View f34953c;

    public c0(View view, b3 b3Var) {
        this.f34953c = view;
        this.f34952b = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f34951a) {
            case 0:
                b3 b3Var = this.f34952b;
                View view = this.f34953c;
                view.post(new c0(b3Var, view));
                return;
            default:
                b3 b3Var2 = this.f34952b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.f34953c.invalidate();
                return;
        }
    }

    public c0(b3 b3Var, View view) {
        this.f34952b = b3Var;
        this.f34953c = view;
    }
}
