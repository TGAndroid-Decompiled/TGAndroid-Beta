package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class zt implements DialogInterface.OnShowListener {
    public final int f30967a;
    public final EditTextBoldCursor f30968b;

    public zt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30967a = i10;
        this.f30968b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30967a) {
            case 0:
                fi.o oVar = (fi.o) this.f30968b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f30968b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f30968b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
