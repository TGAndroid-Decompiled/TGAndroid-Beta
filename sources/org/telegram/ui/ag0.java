package org.telegram.ui;

import android.content.DialogInterface;
public final class ag0 implements DialogInterface.OnDismissListener {
    public final int f34211a;
    public final eg0 f34212b;

    public ag0(eg0 eg0Var, int i10) {
        this.f34211a = i10;
        this.f34212b = eg0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34211a) {
            case 0:
                this.f34212b.f35566s0.finishFragment();
                return;
            default:
                this.f34212b.f35566s0.finishFragment();
                return;
        }
    }
}
