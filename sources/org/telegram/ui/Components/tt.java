package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class tt implements DialogInterface.OnShowListener {
    public final int f31407a;
    public final EditTextBoldCursor f31408b;

    public tt(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f31407a = i10;
        this.f31408b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f31407a) {
            case 0:
                mh.m mVar = (mh.m) this.f31408b;
                mVar.requestFocus();
                AndroidUtilities.showKeyboard(mVar);
                return;
            case 1:
                mh.m mVar2 = (mh.m) this.f31408b;
                mVar2.requestFocus();
                AndroidUtilities.showKeyboard(mVar2);
                return;
            default:
                a4 a4Var = (a4) this.f31408b;
                a4Var.requestFocus();
                AndroidUtilities.showKeyboard(a4Var);
                return;
        }
    }
}
