package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class g2 implements DialogInterface.OnShowListener {
    public final int f26222a;
    public final EditTextBoldCursor f26223b;

    public g2(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f26222a = i10;
        this.f26223b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26222a) {
            case 0:
                y3 y3Var = (y3) this.f26223b;
                y3Var.requestFocus();
                org.telegram.messenger.i0.J3(y3Var);
                return;
            case 1:
                ag.a2 a2Var = (ag.a2) this.f26223b;
                a2Var.requestFocus();
                org.telegram.messenger.i0.J3(a2Var);
                return;
            default:
                org.telegram.messenger.i0.g3(new ot(this.f26223b, 7));
                return;
        }
    }
}
