package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class ot implements DialogInterface.OnShowListener {
    public final int f31475a;
    public final EditTextBoldCursor f31476b;

    public ot(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f31475a = i10;
        this.f31476b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f31475a) {
            case 0:
                jh.m mVar = (jh.m) this.f31476b;
                mVar.requestFocus();
                AndroidUtilities.showKeyboard(mVar);
                return;
            case 1:
                jh.m mVar2 = (jh.m) this.f31476b;
                mVar2.requestFocus();
                AndroidUtilities.showKeyboard(mVar2);
                return;
            default:
                d4 d4Var = (d4) this.f31476b;
                d4Var.requestFocus();
                AndroidUtilities.showKeyboard(d4Var);
                return;
        }
    }
}
