package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class vt implements DialogInterface.OnShowListener {
    public final int f32004a;
    public final EditTextBoldCursor f32005b;

    public vt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f32004a = i10;
        this.f32005b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f32004a) {
            case 0:
                gi.o oVar = (gi.o) this.f32005b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                gi.o oVar2 = (gi.o) this.f32005b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                f4 f4Var = (f4) this.f32005b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
        }
    }
}
