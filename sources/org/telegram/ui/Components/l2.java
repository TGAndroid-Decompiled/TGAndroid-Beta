package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class l2 implements DialogInterface.OnShowListener {
    public final int f30028a;
    public final EditTextBoldCursor f30029b;

    public l2(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f30028a = i10;
        this.f30029b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30028a) {
            case 0:
                h4 h4Var = (h4) this.f30029b;
                h4Var.requestFocus();
                AndroidUtilities.showKeyboard(h4Var);
                return;
            case 1:
                jg.a1 a1Var = (jg.a1) this.f30029b;
                a1Var.requestFocus();
                AndroidUtilities.showKeyboard(a1Var);
                return;
            default:
                AndroidUtilities.runOnUIThread(new o70(this.f30029b, 4));
                return;
        }
    }
}
