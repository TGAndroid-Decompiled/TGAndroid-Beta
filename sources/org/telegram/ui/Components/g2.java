package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnShowListener {
    public final int f33766a;
    public final EditTextBoldCursor f33767b;

    public g2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f33766a = i7;
        this.f33767b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33766a) {
            case 0:
                b4 b4Var = (b4) this.f33767b;
                b4Var.requestFocus();
                org.telegram.messenger.g0.K3(b4Var);
                return;
            case 1:
                kg.x0 x0Var = (kg.x0) this.f33767b;
                x0Var.requestFocus();
                org.telegram.messenger.g0.K3(x0Var);
                return;
            default:
                org.telegram.messenger.g0.h3(new at(this.f33767b, 7));
                return;
        }
    }
}
