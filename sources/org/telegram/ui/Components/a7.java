package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f31744a;
    public final z7 f31745b;
    public final TLRPC.TL_error f31746c;

    public a7(z7 z7Var, TLRPC.TL_error tL_error, int i3) {
        this.f31744a = i3;
        this.f31745b = z7Var;
        this.f31746c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f31744a) {
            case 0:
                z7 z7Var = this.f31745b;
                frameLayout = (FrameLayout) z7Var.f28586b;
                e6Var = z7Var.J0;
                break;
            case 1:
                z7 z7Var2 = this.f31745b;
                frameLayout = (FrameLayout) z7Var2.f28586b;
                e6Var = z7Var2.J0;
                break;
            case 2:
                z7 z7Var3 = this.f31745b;
                frameLayout = (FrameLayout) z7Var3.f28586b;
                e6Var = z7Var3.J0;
                break;
            default:
                z7 z7Var4 = this.f31745b;
                frameLayout = (FrameLayout) z7Var4.f28586b;
                e6Var = z7Var4.J0;
                break;
        }
        org.telegram.ui.Cells.f1.v(frameLayout, e6Var, this.f31746c, false);
    }
}
