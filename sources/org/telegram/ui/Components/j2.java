package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class j2 implements DialogInterface.OnShowListener {
    public final int f27523a;
    public final EditTextBoldCursor f27524b;

    public j2(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f27523a = i10;
        this.f27524b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f27523a) {
            case 0:
                h4 h4Var = (h4) this.f27524b;
                h4Var.requestFocus();
                AndroidUtilities.showKeyboard(h4Var);
                return;
            default:
                hg.b1 b1Var = (hg.b1) this.f27524b;
                b1Var.requestFocus();
                AndroidUtilities.showKeyboard(b1Var);
                return;
        }
    }
}
