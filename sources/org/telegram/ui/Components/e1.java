package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class e1 implements DialogInterface.OnShowListener {
    public final int f25804a;
    public final e5 f25805b;

    public e1(int i10, e5 e5Var) {
        this.f25804a = i10;
        this.f25805b = e5Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f25804a) {
            case 0:
                e5 e5Var = this.f25805b;
                e5Var.requestFocus();
                AndroidUtilities.showKeyboard(e5Var);
                return;
            case 1:
                e5 e5Var2 = this.f25805b;
                e5Var2.requestFocus();
                AndroidUtilities.showKeyboard(e5Var2);
                return;
            default:
                AndroidUtilities.runOnUIThread(new pg(this.f25805b, 4));
                return;
        }
    }
}
