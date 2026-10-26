package org.telegram.ui;

import android.content.DialogInterface;
public final class ff0 implements DialogInterface.OnDismissListener {
    public final int f39356a;
    public final jf0 f39357b;

    public ff0(jf0 jf0Var, int i10) {
        this.f39356a = i10;
        this.f39357b = jf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39356a) {
            case 0:
                this.f39357b.f40619u0.finishFragment();
                return;
            default:
                this.f39357b.f40619u0.finishFragment();
                return;
        }
    }
}
