package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class a7 implements Runnable {
    public final int f31711a;
    public final b8 f31712b;
    public final k60 f31713c;

    public a7(b8 b8Var, k60 k60Var, int i7) {
        this.f31711a = i7;
        this.f31712b = b8Var;
        this.f31713c = k60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f31711a;
        k60 k60Var = this.f31713c;
        b8 b8Var = this.f31712b;
        switch (i7) {
            case 0:
                b8Var.getClass();
                k60Var.u();
                b8Var.P0(1);
                return;
            case 1:
                b8Var.getClass();
                k60Var.u();
                b8Var.P0(2);
                return;
            case 2:
                b8Var.getClass();
                k60Var.u();
                b8Var.P0(4);
                return;
            case 3:
                b8Var.getClass();
                k60Var.u();
                b8Var.P0(7);
                return;
            default:
                b8Var.U0(true);
                org.telegram.messenger.k5.o(null, 2131753912, new hc((FrameLayout) b8Var.f28616b, b8Var.I0), 2131624190, 36);
                k60Var.u();
                return;
        }
    }
}
