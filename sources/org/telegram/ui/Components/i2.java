package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class i2 implements DialogInterface.OnShowListener {
    public final int f27179a;
    public final EditTextBoldCursor f27180b;

    public i2(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f27179a = i10;
        this.f27180b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f27179a) {
            case 0:
                f4 f4Var = (f4) this.f27180b;
                f4Var.requestFocus();
                AndroidUtilities.showKeyboard(f4Var);
                return;
            case 1:
                ig.z0 z0Var = (ig.z0) this.f27180b;
                z0Var.requestFocus();
                AndroidUtilities.showKeyboard(z0Var);
                return;
            default:
                AndroidUtilities.runOnUIThread(new n70(this.f27180b, 4));
                return;
        }
    }
}
