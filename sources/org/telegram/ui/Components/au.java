package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class au implements DialogInterface.OnShowListener {
    public final int f24658a;
    public final EditTextBoldCursor f24659b;

    public au(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f24658a = i10;
        this.f24659b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f24658a) {
            case 0:
                fi.o oVar = (fi.o) this.f24659b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f24659b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f24659b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
