package org.telegram.ui;

import android.content.DialogInterface;
public final class i20 implements DialogInterface.OnDismissListener {
    public final int f37700a;
    public final s50 f37701b;

    public i20(s50 s50Var, int i10) {
        this.f37700a = i10;
        this.f37701b = s50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37700a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f37701b.f40992x0 && (U instanceof sn)) {
                    ((sn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f37701b.dismiss();
                return;
            case 2:
                this.f37701b.E1 = null;
                return;
            default:
                this.f37701b.f40965r0 = null;
                return;
        }
    }
}
