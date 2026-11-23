package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class e7 implements Runnable {
    public final int f34587a;
    public final e8 f34588b;
    public final x60 f34589c;

    public e7(e8 e8Var, x60 x60Var, int i7) {
        this.f34587a = i7;
        this.f34588b = e8Var;
        this.f34589c = x60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f34587a;
        x60 x60Var = this.f34589c;
        e8 e8Var = this.f34588b;
        switch (i7) {
            case 0:
                e8Var.getClass();
                x60Var.v();
                e8Var.Q0(1);
                return;
            case 1:
                e8Var.getClass();
                x60Var.v();
                e8Var.Q0(2);
                return;
            case 2:
                e8Var.getClass();
                x60Var.v();
                e8Var.Q0(4);
                return;
            case 3:
                e8Var.getClass();
                x60Var.v();
                e8Var.Q0(7);
                return;
            default:
                e8Var.V0(true);
                org.telegram.messenger.f3.n(null, 2131753909, new kc((FrameLayout) e8Var.f30226b, e8Var.J0), 2131624191, 36);
                x60Var.v();
                return;
        }
    }
}
