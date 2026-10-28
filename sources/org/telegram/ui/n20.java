package org.telegram.ui;

import android.content.DialogInterface;
public final class n20 implements DialogInterface.OnDismissListener {
    public final int f41616a;
    public final x50 f41617b;

    public n20(x50 x50Var, int i10) {
        this.f41616a = i10;
        this.f41617b = x50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41616a) {
            case 0:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (this.f41617b.f45587x0 && (U instanceof wn)) {
                    ((wn) U).ga(true, true);
                    return;
                }
                return;
            case 1:
                this.f41617b.dismiss();
                return;
            case 2:
                this.f41617b.E1 = null;
                return;
            default:
                this.f41617b.f45560r0 = null;
                return;
        }
    }
}
