package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class qt implements DialogInterface.OnShowListener {
    public final int f28254a;
    public final EditTextBoldCursor f28255b;

    public qt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f28254a = i10;
        this.f28255b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f28254a) {
            case 0:
                lh.n nVar = (lh.n) this.f28255b;
                nVar.requestFocus();
                AndroidUtilities.showKeyboard(nVar);
                return;
            case 1:
                lh.n nVar2 = (lh.n) this.f28255b;
                nVar2.requestFocus();
                AndroidUtilities.showKeyboard(nVar2);
                return;
            default:
                a4 a4Var = (a4) this.f28255b;
                a4Var.requestFocus();
                AndroidUtilities.showKeyboard(a4Var);
                return;
        }
    }
}
