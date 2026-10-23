package org.telegram.ui;

import android.content.DialogInterface;
public final class g20 implements DialogInterface.OnDismissListener {
    public final int f37175a;
    public final q50 f37176b;

    public g20(q50 q50Var, int i10) {
        this.f37175a = i10;
        this.f37176b = q50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37175a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f37176b.f40476x0 && (U instanceof qn)) {
                    ((qn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f37176b.dismiss();
                return;
            case 2:
                this.f37176b.E1 = null;
                return;
            default:
                this.f37176b.f40449r0 = null;
                return;
        }
    }
}
