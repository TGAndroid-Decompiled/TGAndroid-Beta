package org.telegram.ui;

import android.content.DialogInterface;
public final class pf0 implements DialogInterface.OnDismissListener {
    public final int f36515a;
    public final tf0 f36516b;

    public pf0(tf0 tf0Var, int i10) {
        this.f36515a = i10;
        this.f36516b = tf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36515a) {
            case 0:
                this.f36516b.f38099s0.finishFragment();
                return;
            default:
                this.f36516b.f38099s0.finishFragment();
                return;
        }
    }
}
