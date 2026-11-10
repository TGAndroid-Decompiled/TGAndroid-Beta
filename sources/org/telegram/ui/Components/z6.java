package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class z6 implements Runnable {
    public final int f40883a;
    public final a8 f40884b;
    public final k60 f40885c;

    public z6(a8 a8Var, k60 k60Var, int i7) {
        this.f40883a = i7;
        this.f40884b = a8Var;
        this.f40885c = k60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f40883a;
        k60 k60Var = this.f40885c;
        a8 a8Var = this.f40884b;
        switch (i7) {
            case 0:
                a8Var.getClass();
                k60Var.u();
                a8Var.P0(1);
                return;
            case 1:
                a8Var.getClass();
                k60Var.u();
                a8Var.P0(2);
                return;
            case 2:
                a8Var.getClass();
                k60Var.u();
                a8Var.P0(4);
                return;
            case 3:
                a8Var.getClass();
                k60Var.u();
                a8Var.P0(7);
                return;
            default:
                a8Var.U0(true);
                org.telegram.messenger.k5.o(null, 2131753912, new gc((FrameLayout) a8Var.f28672b, a8Var.I0), 2131624190, 36);
                k60Var.u();
                return;
        }
    }
}
