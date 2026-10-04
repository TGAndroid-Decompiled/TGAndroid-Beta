package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class au implements DialogInterface.OnShowListener {
    public final int f24659a;
    public final EditTextBoldCursor f24660b;

    public au(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f24659a = i10;
        this.f24660b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f24659a) {
            case 0:
                fi.o oVar = (fi.o) this.f24660b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f24660b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f24660b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
