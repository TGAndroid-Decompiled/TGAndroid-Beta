package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t8 implements Runnable {
    public final int f45118a;
    public final u8 f45119b;

    public t8(u8 u8Var, int i7) {
        this.f45118a = i7;
        this.f45119b = u8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45118a;
        u8 u8Var = this.f45119b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
                alertDialog$Builder.f28777a.U = hd.N0(2131742878, null);
                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                return;
            default:
                u8Var.d0();
                return;
        }
    }
}
