package org.telegram.ui;

import android.content.DialogInterface;
public final class bd0 implements DialogInterface.OnDismissListener {
    public final int f45867a;
    public final gd0 f45868b;

    public bd0(gd0 gd0Var, int i7) {
        this.f45867a = i7;
        this.f45868b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45867a) {
            case 0:
                this.f45868b.f48080v0.finishFragment();
                return;
            default:
                this.f45868b.f48080v0.finishFragment();
                return;
        }
    }
}
