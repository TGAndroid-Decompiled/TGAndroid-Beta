package org.telegram.ui;

import android.content.DialogInterface;
public final class i20 implements DialogInterface.OnDismissListener {
    public final int f37724a;
    public final s50 f37725b;

    public i20(s50 s50Var, int i10) {
        this.f37724a = i10;
        this.f37725b = s50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37724a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f37725b.f41009x0 && (U instanceof sn)) {
                    ((sn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f37725b.dismiss();
                return;
            case 2:
                this.f37725b.E1 = null;
                return;
            default:
                this.f37725b.f40982r0 = null;
                return;
        }
    }
}
