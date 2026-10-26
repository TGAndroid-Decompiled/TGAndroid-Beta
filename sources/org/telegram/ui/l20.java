package org.telegram.ui;

import android.content.DialogInterface;
public final class l20 implements DialogInterface.OnDismissListener {
    public final int f41120a;
    public final v50 f41121b;

    public l20(v50 v50Var, int i10) {
        this.f41120a = i10;
        this.f41121b = v50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41120a) {
            case 0:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (this.f41121b.f44706x0 && (U instanceof un)) {
                    ((un) U).da(true, true);
                    return;
                }
                return;
            case 1:
                this.f41121b.dismiss();
                return;
            case 2:
                this.f41121b.E1 = null;
                return;
            default:
                this.f41121b.f44679r0 = null;
                return;
        }
    }
}
