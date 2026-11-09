package org.telegram.ui;

import android.content.DialogInterface;
public final class ed0 implements DialogInterface.OnDismissListener {
    public final int f45363a;
    public final id0 f45364b;

    public ed0(id0 id0Var, int i7) {
        this.f45363a = i7;
        this.f45364b = id0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45363a) {
            case 0:
                this.f45364b.f46649u0.finishFragment();
                return;
            default:
                this.f45364b.f46649u0.finishFragment();
                return;
        }
    }
}
