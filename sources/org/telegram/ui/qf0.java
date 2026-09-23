package org.telegram.ui;

import android.content.DialogInterface;
public final class qf0 implements DialogInterface.OnDismissListener {
    public final int f36416a;
    public final uf0 f36417b;

    public qf0(uf0 uf0Var, int i10) {
        this.f36416a = i10;
        this.f36417b = uf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36416a) {
            case 0:
                this.f36417b.f38093s0.finishFragment();
                return;
            default:
                this.f36417b.f38093s0.finishFragment();
                return;
        }
    }
}
