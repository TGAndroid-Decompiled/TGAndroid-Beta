package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o2 implements DialogInterface.OnShowListener {
    public final int f37938a;
    public final EditTextBoldCursor f37939b;

    public o2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f37938a = i7;
        this.f37939b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37938a) {
            case 0:
                h4 h4Var = (h4) this.f37939b;
                h4Var.requestFocus();
                org.telegram.messenger.g0.I3(h4Var);
                return;
            case 1:
                kg.a1 a1Var = (kg.a1) this.f37939b;
                a1Var.requestFocus();
                org.telegram.messenger.g0.I3(a1Var);
                return;
            default:
                org.telegram.messenger.g0.g3(new i(this.f37939b, 8));
                return;
        }
    }
}
