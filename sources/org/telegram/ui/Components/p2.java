package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p2 implements DialogInterface.OnShowListener {
    public final int f38451a;
    public final EditTextBoldCursor f38452b;

    public p2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f38451a = i7;
        this.f38452b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38451a) {
            case 0:
                i4 i4Var = (i4) this.f38452b;
                i4Var.requestFocus();
                org.telegram.messenger.g0.I3(i4Var);
                return;
            case 1:
                kg.z0 z0Var = (kg.z0) this.f38452b;
                z0Var.requestFocus();
                org.telegram.messenger.g0.I3(z0Var);
                return;
            default:
                org.telegram.messenger.g0.g3(new j(this.f38452b, 8));
                return;
        }
    }
}
