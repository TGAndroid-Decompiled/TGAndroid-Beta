package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class xt implements DialogInterface.OnShowListener {
    public final int f30059a;
    public final EditTextBoldCursor f30060b;

    public xt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30059a = i10;
        this.f30060b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30059a) {
            case 0:
                fi.o oVar = (fi.o) this.f30060b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f30060b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                d4 d4Var = (d4) this.f30060b;
                d4Var.requestFocus();
                AndroidUtilities.showKeyboard(d4Var);
                return;
        }
    }
}
