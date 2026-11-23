package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o2 implements DialogInterface.OnShowListener {
    public final int f37990a;
    public final EditTextBoldCursor f37991b;

    public o2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f37990a = i7;
        this.f37991b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37990a) {
            case 0:
                h4 h4Var = (h4) this.f37991b;
                h4Var.requestFocus();
                org.telegram.messenger.g0.I3(h4Var);
                return;
            case 1:
                kg.z0 z0Var = (kg.z0) this.f37991b;
                z0Var.requestFocus();
                org.telegram.messenger.g0.I3(z0Var);
                return;
            default:
                org.telegram.messenger.g0.g3(new i(this.f37991b, 8));
                return;
        }
    }
}
