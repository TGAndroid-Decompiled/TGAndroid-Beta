package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class e2 implements DialogInterface.OnShowListener {
    public final int f33271a;
    public final EditTextBoldCursor f33272b;

    public e2(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.f33271a = i3;
        this.f33272b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33271a) {
            case 0:
                z3 z3Var = (z3) this.f33272b;
                z3Var.requestFocus();
                org.telegram.messenger.g0.K3(z3Var);
                return;
            case 1:
                lg.y0 y0Var = (lg.y0) this.f33272b;
                y0Var.requestFocus();
                org.telegram.messenger.g0.K3(y0Var);
                return;
            default:
                org.telegram.messenger.g0.h3(new zs(this.f33272b, 7));
                return;
        }
    }
}
