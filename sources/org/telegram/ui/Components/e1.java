package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
public final class e1 implements DialogInterface.OnShowListener {
    public final int f27682a;
    public final f5 f27683b;

    public e1(int i10, f5 f5Var) {
        this.f27682a = i10;
        this.f27683b = f5Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f27682a) {
            case 0:
                f5 f5Var = this.f27683b;
                f5Var.requestFocus();
                AndroidUtilities.showKeyboard(f5Var);
                return;
            case 1:
                f5 f5Var2 = this.f27683b;
                f5Var2.requestFocus();
                AndroidUtilities.showKeyboard(f5Var2);
                return;
            default:
                AndroidUtilities.runOnUIThread(new pg(this.f27683b, 3));
                return;
        }
    }
}
