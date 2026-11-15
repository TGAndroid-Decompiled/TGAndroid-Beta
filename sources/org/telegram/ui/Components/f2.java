package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class f2 implements DialogInterface.OnShowListener {
    public final int f34476a;
    public final EditTextBoldCursor f34477b;

    public f2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f34476a = i7;
        this.f34477b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f34476a) {
            case 0:
                z3 z3Var = (z3) this.f34477b;
                z3Var.requestFocus();
                org.telegram.messenger.g0.J3(z3Var);
                return;
            case 1:
                kg.x0 x0Var = (kg.x0) this.f34477b;
                x0Var.requestFocus();
                org.telegram.messenger.g0.J3(x0Var);
                return;
            default:
                org.telegram.messenger.g0.h3(new ht(this.f34477b, 7));
                return;
        }
    }
}
