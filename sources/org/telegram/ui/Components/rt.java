package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class rt implements DialogInterface.OnShowListener {
    public final int f28531a;
    public final EditTextBoldCursor f28532b;

    public rt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f28531a = i10;
        this.f28532b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f28531a) {
            case 0:
                lh.n nVar = (lh.n) this.f28532b;
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                return;
            case 1:
                lh.n nVar2 = (lh.n) this.f28532b;
                nVar2.requestFocus();
                AndroidUtilities.showKeyboard(nVar2);
                return;
            default:
                a4 a4Var = (a4) this.f28532b;
                a4Var.requestFocus();
                AndroidUtilities.showKeyboard(a4Var);
                return;
        }
    }
}
