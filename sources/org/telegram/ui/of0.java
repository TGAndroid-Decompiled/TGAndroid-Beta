package org.telegram.ui;

import android.content.DialogInterface;
public final class of0 implements DialogInterface.OnDismissListener {
    public final int f39689a;
    public final sf0 f39690b;

    public of0(sf0 sf0Var, int i10) {
        this.f39689a = i10;
        this.f39690b = sf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39689a) {
            case 0:
                this.f39690b.f41181p0.finishFragment();
                return;
            default:
                this.f39690b.f41181p0.finishFragment();
                return;
        }
    }
}
