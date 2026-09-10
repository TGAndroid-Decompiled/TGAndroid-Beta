package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class bu implements DialogInterface.OnShowListener {
    public final int f21903a;
    public final EditTextBoldCursor f21904b;

    public bu(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f21903a = i10;
        this.f21904b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f21903a) {
            case 0:
                ei.o oVar = (ei.o) this.f21904b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                ei.o oVar2 = (ei.o) this.f21904b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                e4 e4Var = (e4) this.f21904b;
                e4Var.requestFocus();
                AndroidUtilities.showKeyboard(e4Var);
                return;
        }
    }
}
