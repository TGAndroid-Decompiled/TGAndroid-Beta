package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class d1 implements DialogInterface.OnShowListener {
    public final int f25508a;
    public final c5 f25509b;

    public d1(int i10, c5 c5Var) {
        this.f25508a = i10;
        this.f25509b = c5Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f25508a) {
            case 0:
                c5 c5Var = this.f25509b;
                c5Var.requestFocus();
                AndroidUtilities.showKeyboard(c5Var);
                return;
            case 1:
                c5 c5Var2 = this.f25509b;
                c5Var2.requestFocus();
                AndroidUtilities.showKeyboard(c5Var2);
                return;
            default:
                AndroidUtilities.runOnUIThread(new ng(this.f25509b, 3));
                return;
        }
    }
}
