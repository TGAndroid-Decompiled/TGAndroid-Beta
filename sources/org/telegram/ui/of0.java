package org.telegram.ui;

import android.content.DialogInterface;
public final class of0 implements DialogInterface.OnDismissListener {
    public final int f39743a;
    public final sf0 f39744b;

    public of0(sf0 sf0Var, int i10) {
        this.f39743a = i10;
        this.f39744b = sf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39743a) {
            case 0:
                this.f39744b.f41271p0.finishFragment();
                return;
            default:
                this.f39744b.f41271p0.finishFragment();
                return;
        }
    }
}
