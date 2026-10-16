package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class i2 implements DialogInterface.OnShowListener {
    public final int f25470a;
    public final EditTextBoldCursor f25471b;

    public i2(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f25470a = i10;
        this.f25471b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f25470a) {
            case 0:
                h4 h4Var = (h4) this.f25471b;
                h4Var.requestFocus();
                AndroidUtilities.showKeyboard(h4Var);
                return;
            default:
                ig.b1 b1Var = (ig.b1) this.f25471b;
                b1Var.requestFocus();
                AndroidUtilities.showKeyboard(b1Var);
                return;
        }
    }
}
