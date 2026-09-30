package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class zt implements DialogInterface.OnShowListener {
    public final int f30969a;
    public final EditTextBoldCursor f30970b;

    public zt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30969a = i10;
        this.f30970b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30969a) {
            case 0:
                fi.o oVar = (fi.o) this.f30970b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f30970b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f30970b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
