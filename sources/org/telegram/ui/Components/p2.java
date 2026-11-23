package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p2 implements DialogInterface.OnShowListener {
    public final int f38407a;
    public final EditTextBoldCursor f38408b;

    public p2(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f38407a = i7;
        this.f38408b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38407a) {
            case 0:
                i4 i4Var = (i4) this.f38408b;
                i4Var.requestFocus();
                org.telegram.messenger.g0.I3(i4Var);
                return;
            case 1:
                kg.a1 a1Var = (kg.a1) this.f38408b;
                a1Var.requestFocus();
                org.telegram.messenger.g0.I3(a1Var);
                return;
            default:
                org.telegram.messenger.g0.g3(new j(this.f38408b, 8));
                return;
        }
    }
}
