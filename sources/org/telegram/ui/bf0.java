package org.telegram.ui;

import android.content.DialogInterface;
public final class bf0 implements DialogInterface.OnDismissListener {
    public final int f35632a;
    public final gf0 f35633b;

    public bf0(gf0 gf0Var, int i10) {
        this.f35632a = i10;
        this.f35633b = gf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35632a) {
            case 0:
                this.f35633b.f37335s0.finishFragment();
                return;
            default:
                this.f35633b.f37335s0.finishFragment();
                return;
        }
    }
}
