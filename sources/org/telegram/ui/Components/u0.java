package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class u0 implements DialogInterface.OnShowListener {
    public final int f30740a;
    public final r4 f30741b;

    public u0(int i10, r4 r4Var) {
        this.f30740a = i10;
        this.f30741b = r4Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30740a) {
            case 0:
                r4 r4Var = this.f30741b;
                r4Var.requestFocus();
                org.telegram.messenger.i0.J3(r4Var);
                return;
            case 1:
                r4 r4Var2 = this.f30741b;
                r4Var2.requestFocus();
                org.telegram.messenger.i0.J3(r4Var2);
                return;
            default:
                org.telegram.messenger.i0.g3(new tf(this.f30741b, 2));
                return;
        }
    }
}
