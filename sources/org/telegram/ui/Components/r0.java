package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class r0 implements DialogInterface.OnShowListener {
    public final int f38796a;
    public final s4 f38797b;

    public r0(int i7, s4 s4Var) {
        this.f38796a = i7;
        this.f38797b = s4Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38796a) {
            case 0:
                s4 s4Var = this.f38797b;
                s4Var.requestFocus();
                org.telegram.messenger.g0.J3(s4Var);
                return;
            case 1:
                s4 s4Var2 = this.f38797b;
                s4Var2.requestFocus();
                org.telegram.messenger.g0.J3(s4Var2);
                return;
            default:
                org.telegram.messenger.g0.h3(new dg(this.f38797b, 2));
                return;
        }
    }
}
