package org.telegram.ui;

import android.content.DialogInterface;
public final class d30 implements DialogInterface.OnDismissListener {
    public final int f35136a;
    public final n60 f35137b;

    public d30(n60 n60Var, int i10) {
        this.f35136a = i10;
        this.f35137b = n60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35136a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f35137b.f38538x0 && (U instanceof fo)) {
                    ((fo) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f35137b.dismiss();
                return;
            case 2:
                this.f35137b.E1 = null;
                return;
            default:
                this.f35137b.f38511r0 = null;
                return;
        }
    }
}
