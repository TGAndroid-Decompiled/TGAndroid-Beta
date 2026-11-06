package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class u0 implements DialogInterface.OnShowListener {
    public final int f38451a;
    public final u4 f38452b;

    public u0(int i7, u4 u4Var) {
        this.f38451a = i7;
        this.f38452b = u4Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38451a) {
            case 0:
                u4 u4Var = this.f38452b;
                u4Var.requestFocus();
                org.telegram.messenger.g0.K3(u4Var);
                return;
            case 1:
                u4 u4Var2 = this.f38452b;
                u4Var2.requestFocus();
                org.telegram.messenger.g0.K3(u4Var2);
                return;
            default:
                org.telegram.messenger.g0.h3(new xf(this.f38452b, 2));
                return;
        }
    }
}
