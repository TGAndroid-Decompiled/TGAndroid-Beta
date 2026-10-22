package org.telegram.ui;

import android.content.DialogInterface;
public final class g20 implements DialogInterface.OnDismissListener {
    public final int f37174a;
    public final q50 f37175b;

    public g20(q50 q50Var, int i10) {
        this.f37174a = i10;
        this.f37175b = q50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37174a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f37175b.f40475x0 && (U instanceof qn)) {
                    ((qn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f37175b.dismiss();
                return;
            case 2:
                this.f37175b.E1 = null;
                return;
            default:
                this.f37175b.f40448r0 = null;
                return;
        }
    }
}
