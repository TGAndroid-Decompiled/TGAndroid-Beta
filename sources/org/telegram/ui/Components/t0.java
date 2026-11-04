package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class t0 implements DialogInterface.OnShowListener {
    public final int f38211a;
    public final s4 f38212b;

    public t0(int i3, s4 s4Var) {
        this.f38211a = i3;
        this.f38212b = s4Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38211a) {
            case 0:
                s4 s4Var = this.f38212b;
                s4Var.requestFocus();
                org.telegram.messenger.g0.K3(s4Var);
                return;
            case 1:
                s4 s4Var2 = this.f38212b;
                s4Var2.requestFocus();
                org.telegram.messenger.g0.K3(s4Var2);
                return;
            default:
                org.telegram.messenger.g0.h3(new vf(this.f38212b, 2));
                return;
        }
    }
}
