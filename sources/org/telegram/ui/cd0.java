package org.telegram.ui;

import android.content.DialogInterface;
public final class cd0 implements DialogInterface.OnDismissListener {
    public final int f44752a;
    public final gd0 f44753b;

    public cd0(gd0 gd0Var, int i7) {
        this.f44752a = i7;
        this.f44753b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44752a) {
            case 0:
                this.f44753b.f45981u0.finishFragment();
                return;
            default:
                this.f44753b.f45981u0.finishFragment();
                return;
        }
    }
}
