package org.telegram.ui;

import android.content.DialogInterface;
public final class pf0 implements DialogInterface.OnDismissListener {
    public final int f37116a;
    public final tf0 f37117b;

    public pf0(tf0 tf0Var, int i10) {
        this.f37116a = i10;
        this.f37117b = tf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37116a) {
            case 0:
                this.f37117b.f38503p0.finishFragment();
                return;
            default:
                this.f37117b.f38503p0.finishFragment();
                return;
        }
    }
}
