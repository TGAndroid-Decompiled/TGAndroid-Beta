package org.telegram.ui;

import android.content.DialogInterface;
public final class bf0 implements DialogInterface.OnDismissListener {
    public final int f35626a;
    public final hf0 f35627b;

    public bf0(hf0 hf0Var, int i10) {
        this.f35626a = i10;
        this.f35627b = hf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35626a) {
            case 0:
                this.f35627b.f37620s0.finishFragment();
                return;
            default:
                this.f35627b.f37620s0.finishFragment();
                return;
        }
    }
}
