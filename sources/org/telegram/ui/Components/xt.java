package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class xt implements DialogInterface.OnShowListener {
    public final int f29984a;
    public final EditTextBoldCursor f29985b;

    public xt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f29984a = i10;
        this.f29985b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f29984a) {
            case 0:
                fi.o oVar = (fi.o) this.f29985b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                fi.o oVar2 = (fi.o) this.f29985b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                d4 d4Var = (d4) this.f29985b;
                d4Var.requestFocus();
                AndroidUtilities.showKeyboard(d4Var);
                return;
        }
    }
}
