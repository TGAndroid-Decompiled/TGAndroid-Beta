package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ht implements DialogInterface.OnShowListener {
    public final int f29183a;
    public final EditTextBoldCursor f29184b;

    public ht(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.f29183a = i9;
        this.f29184b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f29183a) {
            case 0:
                gh.o oVar = (gh.o) this.f29184b;
                oVar.requestFocus();
                AndroidUtilities.showKeyboard(oVar);
                return;
            case 1:
                gh.o oVar2 = (gh.o) this.f29184b;
                oVar2.requestFocus();
                AndroidUtilities.showKeyboard(oVar2);
                return;
            default:
                z3 z3Var = (z3) this.f29184b;
                z3Var.requestFocus();
                AndroidUtilities.showKeyboard(z3Var);
                return;
        }
    }
}
