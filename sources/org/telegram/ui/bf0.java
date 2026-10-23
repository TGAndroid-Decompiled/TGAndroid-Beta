package org.telegram.ui;

import android.content.DialogInterface;
public final class bf0 implements DialogInterface.OnDismissListener {
    public final int f35627a;
    public final hf0 f35628b;

    public bf0(hf0 hf0Var, int i10) {
        this.f35627a = i10;
        this.f35628b = hf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35627a) {
            case 0:
                this.f35628b.f37621s0.finishFragment();
                return;
            default:
                this.f35628b.f37621s0.finishFragment();
                return;
        }
    }
}
