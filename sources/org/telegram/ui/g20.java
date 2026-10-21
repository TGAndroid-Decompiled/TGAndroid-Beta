package org.telegram.ui;

import android.content.DialogInterface;
public final class g20 implements DialogInterface.OnDismissListener {
    public final int f37171a;
    public final q50 f37172b;

    public g20(q50 q50Var, int i10) {
        this.f37171a = i10;
        this.f37172b = q50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37171a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f37172b.f40472x0 && (U instanceof qn)) {
                    ((qn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f37172b.dismiss();
                return;
            case 2:
                this.f37172b.E1 = null;
                return;
            default:
                this.f37172b.f40445r0 = null;
                return;
        }
    }
}
