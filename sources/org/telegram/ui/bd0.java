package org.telegram.ui;

import android.content.DialogInterface;
public final class bd0 implements DialogInterface.OnDismissListener {
    public final int f45835a;
    public final hd0 f45836b;

    public bd0(hd0 hd0Var, int i7) {
        this.f45835a = i7;
        this.f45836b = hd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45835a) {
            case 0:
                this.f45836b.f48331v0.finishFragment();
                return;
            default:
                this.f45836b.f48331v0.finishFragment();
                return;
        }
    }
}
