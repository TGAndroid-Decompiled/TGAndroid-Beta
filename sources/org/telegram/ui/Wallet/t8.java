package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t8 implements Runnable {
    public final int f45084a;
    public final u8 f45085b;

    public t8(u8 u8Var, int i7) {
        this.f45084a = i7;
        this.f45085b = u8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45084a;
        u8 u8Var = this.f45085b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
                alertDialog$Builder.f28743a.U = hd.N0(2131742880, null);
                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                return;
            default:
                u8Var.d0();
                return;
        }
    }
}
