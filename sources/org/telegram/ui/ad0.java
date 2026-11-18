package org.telegram.ui;

import android.content.DialogInterface;
public final class ad0 implements DialogInterface.OnDismissListener {
    public final int f45574a;
    public final gd0 f45575b;

    public ad0(gd0 gd0Var, int i7) {
        this.f45574a = i7;
        this.f45575b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45574a) {
            case 0:
                this.f45575b.f48080v0.finishFragment();
                return;
            default:
                this.f45575b.f48080v0.finishFragment();
                return;
        }
    }
}
