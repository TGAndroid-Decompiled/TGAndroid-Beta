package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t8 implements Runnable {
    public final int f45114a;
    public final u8 f45115b;

    public t8(u8 u8Var, int i7) {
        this.f45114a = i7;
        this.f45115b = u8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45114a;
        u8 u8Var = this.f45115b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
                alertDialog$Builder.f28774a.U = gd.N0(2131742880, null);
                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                return;
            default:
                u8Var.d0();
                return;
        }
    }
}
