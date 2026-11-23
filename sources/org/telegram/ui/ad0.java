package org.telegram.ui;

import android.content.DialogInterface;
public final class ad0 implements DialogInterface.OnDismissListener {
    public final int f45694a;
    public final gd0 f45695b;

    public ad0(gd0 gd0Var, int i7) {
        this.f45694a = i7;
        this.f45695b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45694a) {
            case 0:
                this.f45695b.f48275v0.finishFragment();
                return;
            default:
                this.f45695b.f48275v0.finishFragment();
                return;
        }
    }
}
