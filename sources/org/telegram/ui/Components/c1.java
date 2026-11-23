package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class c1 implements DialogInterface.OnShowListener {
    public final int f33875a;
    public final a5 f33876b;

    public c1(int i7, a5 a5Var) {
        this.f33875a = i7;
        this.f33876b = a5Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33875a) {
            case 0:
                a5 a5Var = this.f33876b;
                a5Var.requestFocus();
                org.telegram.messenger.g0.I3(a5Var);
                return;
            case 1:
                a5 a5Var2 = this.f33876b;
                a5Var2.requestFocus();
                org.telegram.messenger.g0.I3(a5Var2);
                return;
            default:
                org.telegram.messenger.g0.g3(new ng(this.f33876b, 2));
                return;
        }
    }
}
