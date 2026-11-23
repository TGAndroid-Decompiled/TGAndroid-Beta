package org.telegram.ui;

import android.content.DialogInterface;
public final class bd0 implements DialogInterface.OnDismissListener {
    public final int f45819a;
    public final gd0 f45820b;

    public bd0(gd0 gd0Var, int i7) {
        this.f45819a = i7;
        this.f45820b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45819a) {
            case 0:
                this.f45820b.f48028v0.finishFragment();
                return;
            default:
                this.f45820b.f48028v0.finishFragment();
                return;
        }
    }
}
