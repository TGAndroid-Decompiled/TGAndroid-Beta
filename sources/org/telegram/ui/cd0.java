package org.telegram.ui;

import android.content.DialogInterface;
public final class cd0 implements DialogInterface.OnDismissListener {
    public final int f44731a;
    public final gd0 f44732b;

    public cd0(gd0 gd0Var, int i7) {
        this.f44731a = i7;
        this.f44732b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44731a) {
            case 0:
                this.f44732b.f45954u0.finishFragment();
                return;
            default:
                this.f44732b.f45954u0.finishFragment();
                return;
        }
    }
}
