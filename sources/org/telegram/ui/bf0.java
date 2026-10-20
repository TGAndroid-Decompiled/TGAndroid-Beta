package org.telegram.ui;

import android.content.DialogInterface;
public final class bf0 implements DialogInterface.OnDismissListener {
    public final int f35622a;
    public final hf0 f35623b;

    public bf0(hf0 hf0Var, int i10) {
        this.f35622a = i10;
        this.f35623b = hf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35622a) {
            case 0:
                this.f35623b.f37616s0.finishFragment();
                return;
            default:
                this.f35623b.f37616s0.finishFragment();
                return;
        }
    }
}
