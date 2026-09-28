package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class zt implements DialogInterface.OnShowListener {
    public final int f30968a;
    public final EditTextBoldCursor f30969b;

    public zt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30968a = i10;
        this.f30969b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30968a) {
            case 0:
                fi.o oVar = (fi.o) this.f30969b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f30969b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f30969b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
