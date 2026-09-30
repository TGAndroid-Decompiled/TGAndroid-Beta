package org.telegram.ui;

import android.content.DialogInterface;
public final class pf0 implements DialogInterface.OnDismissListener {
    public final int f36619a;
    public final tf0 f36620b;

    public pf0(tf0 tf0Var, int i10) {
        this.f36619a = i10;
        this.f36620b = tf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36619a) {
            case 0:
                this.f36620b.f38208s0.finishFragment();
                return;
            default:
                this.f36620b.f38208s0.finishFragment();
                return;
        }
    }
}
