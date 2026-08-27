package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

public final class gt implements DialogInterface.OnShowListener {

    public final int f28809a;

    public final EditTextBoldCursor f28810b;

    public gt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f28809a = i10;
        this.f28810b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f28809a) {
            case 0:
                hh.o oVar = (hh.o) this.f28810b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                break;
            case 1:
                hh.o oVar2 = (hh.o) this.f28810b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                break;
            default:
                z3 z3Var = (z3) this.f28810b;
                z3Var.requestFocus();
                AndroidUtilities.showKeyboard(z3Var);
                break;
        }
    }
}
