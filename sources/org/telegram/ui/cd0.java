package org.telegram.ui;

import android.content.DialogInterface;
public final class cd0 implements DialogInterface.OnDismissListener {
    public final int f44756a;
    public final gd0 f44757b;

    public cd0(gd0 gd0Var, int i7) {
        this.f44756a = i7;
        this.f44757b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44756a) {
            case 0:
                this.f44757b.f45982u0.finishFragment();
                return;
            default:
                this.f44757b.f45982u0.finishFragment();
                return;
        }
    }
}
