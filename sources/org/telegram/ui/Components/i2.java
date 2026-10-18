package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class i2 implements DialogInterface.OnShowListener {
    public final int f27046a;
    public final EditTextBoldCursor f27047b;

    public i2(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f27046a = i10;
        this.f27047b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f27046a) {
            case 0:
                g4 g4Var = (g4) this.f27047b;
                g4Var.requestFocus();
                AndroidUtilities.showKeyboard(g4Var);
                return;
            default:
                ig.a1 a1Var = (ig.a1) this.f27047b;
                a1Var.requestFocus();
                AndroidUtilities.showKeyboard(a1Var);
                return;
        }
    }
}
