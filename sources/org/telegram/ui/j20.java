package org.telegram.ui;

import android.content.DialogInterface;
public final class j20 implements DialogInterface.OnDismissListener {
    public final int f38446a;
    public final u50 f38447b;

    public j20(u50 u50Var, int i10) {
        this.f38446a = i10;
        this.f38447b = u50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38446a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (this.f38447b.f42267x0 && (U instanceof sn)) {
                    ((sn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f38447b.dismiss();
                return;
            case 2:
                this.f38447b.E1 = null;
                return;
            default:
                this.f38447b.f42240r0 = null;
                return;
        }
    }
}
