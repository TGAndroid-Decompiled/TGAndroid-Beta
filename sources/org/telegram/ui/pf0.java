package org.telegram.ui;

import android.content.DialogInterface;
public final class pf0 implements DialogInterface.OnDismissListener {
    public final int f36513a;
    public final tf0 f36514b;

    public pf0(tf0 tf0Var, int i10) {
        this.f36513a = i10;
        this.f36514b = tf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36513a) {
            case 0:
                this.f36514b.f38097s0.finishFragment();
                return;
            default:
                this.f36514b.f38097s0.finishFragment();
                return;
        }
    }
}
