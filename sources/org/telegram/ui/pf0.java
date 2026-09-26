package org.telegram.ui;

import android.content.DialogInterface;
public final class pf0 implements DialogInterface.OnDismissListener {
    public final int f36514a;
    public final tf0 f36515b;

    public pf0(tf0 tf0Var, int i10) {
        this.f36514a = i10;
        this.f36515b = tf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36514a) {
            case 0:
                this.f36515b.f38098s0.finishFragment();
                return;
            default:
                this.f36515b.f38098s0.finishFragment();
                return;
        }
    }
}
