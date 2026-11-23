package org.telegram.ui;

import android.content.DialogInterface;
public final class bd0 implements DialogInterface.OnDismissListener {
    public final int f45871a;
    public final gd0 f45872b;

    public bd0(gd0 gd0Var, int i7) {
        this.f45871a = i7;
        this.f45872b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45871a) {
            case 0:
                this.f45872b.f48084v0.finishFragment();
                return;
            default:
                this.f45872b.f48084v0.finishFragment();
                return;
        }
    }
}
