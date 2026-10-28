package org.telegram.ui;

import android.content.DialogInterface;
public final class hf0 implements DialogInterface.OnDismissListener {
    public final int f39874a;
    public final lf0 f39875b;

    public hf0(lf0 lf0Var, int i10) {
        this.f39874a = i10;
        this.f39875b = lf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39874a) {
            case 0:
                this.f39875b.f41134u0.finishFragment();
                return;
            default:
                this.f39875b.f41134u0.finishFragment();
                return;
        }
    }
}
