package org.telegram.ui;

import android.content.DialogInterface;
public final class l20 implements DialogInterface.OnDismissListener {
    public final int f41117a;
    public final v50 f41118b;

    public l20(v50 v50Var, int i10) {
        this.f41117a = i10;
        this.f41118b = v50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41117a) {
            case 0:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (this.f41118b.f44703x0 && (U instanceof un)) {
                    ((un) U).da(true, true);
                    return;
                }
                return;
            case 1:
                this.f41118b.dismiss();
                return;
            case 2:
                this.f41118b.E1 = null;
                return;
            default:
                this.f41118b.f44676r0 = null;
                return;
        }
    }
}
