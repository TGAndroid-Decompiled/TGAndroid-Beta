package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d1 implements DialogInterface.OnShowListener {
    public final int f34305a;
    public final b5 f34306b;

    public d1(int i7, b5 b5Var) {
        this.f34305a = i7;
        this.f34306b = b5Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f34305a) {
            case 0:
                b5 b5Var = this.f34306b;
                b5Var.requestFocus();
                org.telegram.messenger.g0.I3(b5Var);
                return;
            case 1:
                b5 b5Var2 = this.f34306b;
                b5Var2.requestFocus();
                org.telegram.messenger.g0.I3(b5Var2);
                return;
            default:
                org.telegram.messenger.g0.g3(new ng(this.f34306b, 2));
                return;
        }
    }
}
