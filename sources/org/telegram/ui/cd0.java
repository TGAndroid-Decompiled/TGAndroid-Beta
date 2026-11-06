package org.telegram.ui;

import android.content.DialogInterface;
public final class cd0 implements DialogInterface.OnDismissListener {
    public final int f44751a;
    public final gd0 f44752b;

    public cd0(gd0 gd0Var, int i7) {
        this.f44751a = i7;
        this.f44752b = gd0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44751a) {
            case 0:
                this.f44752b.f45980u0.finishFragment();
                return;
            default:
                this.f44752b.f45980u0.finishFragment();
                return;
        }
    }
}
