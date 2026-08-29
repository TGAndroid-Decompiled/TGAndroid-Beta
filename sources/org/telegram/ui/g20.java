package org.telegram.ui;

import android.content.DialogInterface;
public final class g20 implements DialogInterface.OnDismissListener {
    public final int f38442a;
    public final r50 f38443b;

    public g20(r50 r50Var, int i10) {
        this.f38442a = i10;
        this.f38443b = r50Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38442a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (this.f38443b.f41947t0 && (U instanceof tn)) {
                    ((tn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f38443b.dismiss();
                return;
            case 2:
                this.f38443b.A1 = null;
                return;
            default:
                this.f38443b.f41921n0 = null;
                return;
        }
    }
}
