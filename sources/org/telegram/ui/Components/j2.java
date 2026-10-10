package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class j2 implements DialogInterface.OnShowListener {
    public final int f27510a;
    public final EditTextBoldCursor f27511b;

    public j2(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f27510a = i10;
        this.f27511b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f27510a) {
            case 0:
                h4 h4Var = (h4) this.f27511b;
                h4Var.requestFocus();
                AndroidUtilities.showKeyboard(h4Var);
                return;
            default:
                hg.b1 b1Var = (hg.b1) this.f27511b;
                b1Var.requestFocus();
                AndroidUtilities.showKeyboard(b1Var);
                return;
        }
    }
}
