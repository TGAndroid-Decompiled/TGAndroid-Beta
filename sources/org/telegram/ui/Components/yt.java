package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class yt implements DialogInterface.OnShowListener {
    public final int f30388a;
    public final EditTextBoldCursor f30389b;

    public yt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30388a = i10;
        this.f30389b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30388a) {
            case 0:
                fi.o oVar = (fi.o) this.f30389b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f30389b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f30389b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
