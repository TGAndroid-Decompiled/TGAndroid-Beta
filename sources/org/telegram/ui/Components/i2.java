package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class i2 implements DialogInterface.OnShowListener {
    public final int f25798a;
    public final EditTextBoldCursor f25799b;

    public i2(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f25798a = i10;
        this.f25799b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f25798a) {
            case 0:
                h4 h4Var = (h4) this.f25799b;
                h4Var.requestFocus();
                AndroidUtilities.showKeyboard(h4Var);
                return;
            default:
                ig.b1 b1Var = (ig.b1) this.f25799b;
                b1Var.requestFocus();
                AndroidUtilities.showKeyboard(b1Var);
                return;
        }
    }
}
