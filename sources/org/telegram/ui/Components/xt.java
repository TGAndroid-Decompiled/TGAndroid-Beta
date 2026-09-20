package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class xt implements DialogInterface.OnShowListener {
    public final int f30360a;
    public final EditTextBoldCursor f30361b;

    public xt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30360a = i10;
        this.f30361b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30360a) {
            case 0:
                fi.o oVar = (fi.o) this.f30361b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f30361b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                e4 e4Var = (e4) this.f30361b;
                e4Var.requestFocus();
                AndroidUtilities.showKeyboard(e4Var);
                return;
        }
    }
}
