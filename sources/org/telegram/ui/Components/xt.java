package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class xt implements DialogInterface.OnShowListener {
    public final int f30406a;
    public final EditTextBoldCursor f30407b;

    public xt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30406a = i10;
        this.f30407b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30406a) {
            case 0:
                fi.o oVar = (fi.o) this.f30407b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f30407b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                e4 e4Var = (e4) this.f30407b;
                e4Var.requestFocus();
                AndroidUtilities.showKeyboard(e4Var);
                return;
        }
    }
}
