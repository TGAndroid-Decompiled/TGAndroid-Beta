package org.telegram.ui;

import android.content.DialogInterface;
public final class ie0 implements DialogInterface.OnDismissListener {
    public final int f38252a;
    public final me0 f38253b;

    public ie0(me0 me0Var, int i10) {
        this.f38252a = i10;
        this.f38253b = me0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38252a) {
            case 0:
                this.f38253b.f39682u0.finishFragment();
                return;
            default:
                this.f38253b.f39682u0.finishFragment();
                return;
        }
    }
}
