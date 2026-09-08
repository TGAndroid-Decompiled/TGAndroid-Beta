package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class vt implements DialogInterface.OnShowListener {
    public final int f32003a;
    public final EditTextBoldCursor f32004b;

    public vt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f32003a = i10;
        this.f32004b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32003a) {
            case 0:
                gi.o oVar = (gi.o) this.f32004b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                gi.o oVar2 = (gi.o) this.f32004b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f32004b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
