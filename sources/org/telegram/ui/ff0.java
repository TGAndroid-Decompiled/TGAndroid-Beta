package org.telegram.ui;

import android.content.DialogInterface;
public final class ff0 implements DialogInterface.OnDismissListener {
    public final int f39353a;
    public final jf0 f39354b;

    public ff0(jf0 jf0Var, int i10) {
        this.f39353a = i10;
        this.f39354b = jf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39353a) {
            case 0:
                this.f39354b.f40616u0.finishFragment();
                return;
            default:
                this.f39354b.f40616u0.finishFragment();
                return;
        }
    }
}
