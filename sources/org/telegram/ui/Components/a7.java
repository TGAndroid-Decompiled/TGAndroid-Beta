package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class a7 implements Runnable {
    public final int f31741a;
    public final b8 f31742b;
    public final l60 f31743c;

    public a7(b8 b8Var, l60 l60Var, int i7) {
        this.f31741a = i7;
        this.f31742b = b8Var;
        this.f31743c = l60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f31741a;
        l60 l60Var = this.f31743c;
        b8 b8Var = this.f31742b;
        switch (i7) {
            case 0:
                b8Var.getClass();
                l60Var.u();
                b8Var.P0(1);
                return;
            case 1:
                b8Var.getClass();
                l60Var.u();
                b8Var.P0(2);
                return;
            case 2:
                b8Var.getClass();
                l60Var.u();
                b8Var.P0(4);
                return;
            case 3:
                b8Var.getClass();
                l60Var.u();
                b8Var.P0(7);
                return;
            default:
                b8Var.U0(true);
                org.telegram.messenger.k5.o(null, 2131753912, new hc((FrameLayout) b8Var.f28624b, b8Var.I0), 2131624190, 36);
                l60Var.u();
                return;
        }
    }
}
