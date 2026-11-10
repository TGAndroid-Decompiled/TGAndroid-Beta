package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class t0 implements DialogInterface.OnShowListener {
    public final int f38112a;
    public final t4 f38113b;

    public t0(int i7, t4 t4Var) {
        this.f38112a = i7;
        this.f38113b = t4Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38112a) {
            case 0:
                t4 t4Var = this.f38113b;
                t4Var.requestFocus();
                org.telegram.messenger.g0.K3(t4Var);
                return;
            case 1:
                t4 t4Var2 = this.f38113b;
                t4Var2.requestFocus();
                org.telegram.messenger.g0.K3(t4Var2);
                return;
            default:
                org.telegram.messenger.g0.h3(new wf(this.f38113b, 2));
                return;
        }
    }
}
