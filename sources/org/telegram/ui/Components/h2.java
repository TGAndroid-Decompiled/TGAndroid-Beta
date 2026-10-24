package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class h2 implements DialogInterface.OnShowListener {
    public final int f26858a;
    public final EditTextBoldCursor f26859b;

    public h2(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f26858a = i10;
        this.f26859b = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f26858a) {
            case 0:
                e4 e4Var = (e4) this.f26859b;
                e4Var.requestFocus();
                AndroidUtilities.showKeyboard(e4Var);
                return;
            case 1:
                ig.z0 z0Var = (ig.z0) this.f26859b;
                z0Var.requestFocus();
                AndroidUtilities.showKeyboard(z0Var);
                return;
            default:
                AndroidUtilities.runOnUIThread(new l70(this.f26859b, 4));
                return;
        }
    }
}
