package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class u0 implements DialogInterface.OnShowListener {
    public final int f30786a;
    public final r4 f30787b;

    public u0(int i10, r4 r4Var) {
        this.f30786a = i10;
        this.f30787b = r4Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30786a) {
            case 0:
                r4 r4Var = this.f30787b;
                r4Var.requestFocus();
                org.telegram.messenger.i0.J3(r4Var);
                return;
            case 1:
                r4 r4Var2 = this.f30787b;
                r4Var2.requestFocus();
                org.telegram.messenger.i0.J3(r4Var2);
                return;
            default:
                org.telegram.messenger.i0.g3(new tf(this.f30787b, 2));
                return;
        }
    }
}
