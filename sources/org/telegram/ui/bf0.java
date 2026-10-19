package org.telegram.ui;

import android.content.DialogInterface;
public final class bf0 implements DialogInterface.OnDismissListener {
    public final int f35616a;
    public final hf0 f35617b;

    public bf0(hf0 hf0Var, int i10) {
        this.f35616a = i10;
        this.f35617b = hf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35616a) {
            case 0:
                this.f35617b.f37610s0.finishFragment();
                return;
            default:
                this.f35617b.f37610s0.finishFragment();
                return;
        }
    }
}
