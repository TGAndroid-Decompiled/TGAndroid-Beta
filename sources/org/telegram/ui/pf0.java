package org.telegram.ui;

import android.content.DialogInterface;
public final class pf0 implements DialogInterface.OnDismissListener {
    public final int f36503a;
    public final tf0 f36504b;

    public pf0(tf0 tf0Var, int i10) {
        this.f36503a = i10;
        this.f36504b = tf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36503a) {
            case 0:
                this.f36504b.f38081s0.finishFragment();
                return;
            default:
                this.f36504b.f38081s0.finishFragment();
                return;
        }
    }
}
