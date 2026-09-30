package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class au implements DialogInterface.OnShowListener {
    public final int f22713a;
    public final EditTextBoldCursor f22714b;

    public au(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f22713a = i10;
        this.f22714b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f22713a) {
            case 0:
                fi.o oVar = (fi.o) this.f22714b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f22714b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f22714b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
