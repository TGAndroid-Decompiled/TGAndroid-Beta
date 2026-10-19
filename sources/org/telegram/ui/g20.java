package org.telegram.ui;

import android.content.DialogInterface;
public final class g20 implements DialogInterface.OnDismissListener {
    public final int f37164a;
    public final q50 f37165b;

    public g20(q50 q50Var, int i10) {
        this.f37164a = i10;
        this.f37165b = q50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37164a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f37165b.f40466x0 && (U instanceof qn)) {
                    ((qn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f37165b.dismiss();
                return;
            case 2:
                this.f37165b.E1 = null;
                return;
            default:
                this.f37165b.f40439r0 = null;
                return;
        }
    }
}
