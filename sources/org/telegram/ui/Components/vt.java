package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class vt implements DialogInterface.OnShowListener {
    public final int f31976a;
    public final EditTextBoldCursor f31977b;

    public vt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f31976a = i10;
        this.f31977b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f31976a) {
            case 0:
                gi.o oVar = (gi.o) this.f31977b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                gi.o oVar2 = (gi.o) this.f31977b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f31977b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
