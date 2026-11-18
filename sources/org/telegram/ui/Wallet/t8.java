package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t8 implements Runnable {
    public final int f45074a;
    public final u8 f45075b;

    public t8(u8 u8Var, int i7) {
        this.f45074a = i7;
        this.f45075b = u8Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45074a;
        u8 u8Var = this.f45075b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u8Var.getParentActivity(), u8Var.getResourceProvider());
                alertDialog$Builder.f28744a.U = gd.M0(2131742886, null);
                org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                return;
            default:
                u8Var.d0();
                return;
        }
    }
}
