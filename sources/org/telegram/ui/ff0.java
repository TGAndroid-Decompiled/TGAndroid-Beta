package org.telegram.ui;

import android.content.DialogInterface;
public final class ff0 implements DialogInterface.OnDismissListener {
    public final int f38252a;
    public final jf0 f38253b;

    public ff0(jf0 jf0Var, int i9) {
        this.f38252a = i9;
        this.f38253b = jf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38252a) {
            case 0:
                this.f38253b.f39488o0.finishFragment();
                return;
            default:
                this.f38253b.f39488o0.finishFragment();
                return;
        }
    }
}
