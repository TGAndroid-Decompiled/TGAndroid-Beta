package org.telegram.ui;

import android.content.DialogInterface;
public final class gf0 implements DialogInterface.OnDismissListener {
    public final int f37555a;
    public final lf0 f37556b;

    public gf0(lf0 lf0Var, int i10) {
        this.f37555a = i10;
        this.f37556b = lf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37555a) {
            case 0:
                this.f37556b.f39255u0.finishFragment();
                return;
            default:
                this.f37556b.f39255u0.finishFragment();
                return;
        }
    }
}
