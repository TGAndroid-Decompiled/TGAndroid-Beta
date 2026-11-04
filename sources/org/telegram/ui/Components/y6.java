package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class y6 implements Runnable {
    public final int f40632a;
    public final z7 f40633b;
    public final f60 f40634c;

    public y6(z7 z7Var, f60 f60Var, int i3) {
        this.f40632a = i3;
        this.f40633b = z7Var;
        this.f40634c = f60Var;
    }

    @Override
    public final void run() {
        int i3 = this.f40632a;
        f60 f60Var = this.f40634c;
        z7 z7Var = this.f40633b;
        switch (i3) {
            case 0:
                z7Var.getClass();
                f60Var.u();
                z7Var.P0(1);
                return;
            case 1:
                z7Var.getClass();
                f60Var.u();
                z7Var.P0(2);
                return;
            case 2:
                z7Var.getClass();
                f60Var.u();
                z7Var.P0(4);
                return;
            case 3:
                z7Var.getClass();
                f60Var.u();
                z7Var.P0(7);
                return;
            default:
                z7Var.U0(true);
                org.telegram.messenger.k5.o(null, 2131753912, new fc((FrameLayout) z7Var.f28586b, z7Var.J0), 2131624190, 36);
                f60Var.u();
                return;
        }
    }
}
