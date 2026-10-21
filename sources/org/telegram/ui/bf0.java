package org.telegram.ui;

import android.content.DialogInterface;
public final class bf0 implements DialogInterface.OnDismissListener {
    public final int f35623a;
    public final hf0 f35624b;

    public bf0(hf0 hf0Var, int i10) {
        this.f35623a = i10;
        this.f35624b = hf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35623a) {
            case 0:
                this.f35624b.f37617s0.finishFragment();
                return;
            default:
                this.f35624b.f37617s0.finishFragment();
                return;
        }
    }
}
