package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class l2 implements DialogInterface.OnShowListener {
    public final int f30030a;
    public final EditTextBoldCursor f30031b;

    public l2(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f30030a = i10;
        this.f30031b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f30030a) {
            case 0:
                h4 h4Var = (h4) this.f30031b;
                h4Var.requestFocus();
                AndroidUtilities.showKeyboard(h4Var);
                return;
            case 1:
                jg.a1 a1Var = (jg.a1) this.f30031b;
                a1Var.requestFocus();
                AndroidUtilities.showKeyboard(a1Var);
                return;
            default:
                AndroidUtilities.runOnUIThread(new o70(this.f30031b, 4));
                return;
        }
    }
}
