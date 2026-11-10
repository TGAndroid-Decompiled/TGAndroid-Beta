package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnShowListener {
    public final int f33446a;
    public final EditTextBoldCursor f33447b;

    public f2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f33446a = i7;
        this.f33447b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33446a) {
            case 0:
                a4 a4Var = (a4) this.f33447b;
                a4Var.requestFocus();
                org.telegram.messenger.g0.K3(a4Var);
                return;
            case 1:
                kg.x0 x0Var = (kg.x0) this.f33447b;
                x0Var.requestFocus();
                org.telegram.messenger.g0.K3(x0Var);
                return;
            default:
                org.telegram.messenger.g0.h3(new at(this.f33447b, 7));
                return;
        }
    }
}
