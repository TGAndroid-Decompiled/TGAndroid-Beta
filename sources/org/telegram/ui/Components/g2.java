package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnShowListener {
    public final int f33733a;
    public final EditTextBoldCursor f33734b;

    public g2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f33733a = i7;
        this.f33734b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f33733a) {
            case 0:
                b4 b4Var = (b4) this.f33734b;
                b4Var.requestFocus();
                org.telegram.messenger.g0.K3(b4Var);
                return;
            case 1:
                kg.x0 x0Var = (kg.x0) this.f33734b;
                x0Var.requestFocus();
                org.telegram.messenger.g0.K3(x0Var);
                return;
            default:
                org.telegram.messenger.g0.h3(new at(this.f33734b, 7));
                return;
        }
    }
}
