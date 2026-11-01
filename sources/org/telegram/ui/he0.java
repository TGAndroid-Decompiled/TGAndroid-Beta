package org.telegram.ui;

import android.content.DialogInterface;
public final class he0 implements DialogInterface.OnDismissListener {
    public final int f37804a;
    public final le0 f37805b;

    public he0(le0 le0Var, int i10) {
        this.f37804a = i10;
        this.f37805b = le0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37804a) {
            case 0:
                this.f37805b.f39259u0.finishFragment();
                return;
            default:
                this.f37805b.f39259u0.finishFragment();
                return;
        }
    }
}
