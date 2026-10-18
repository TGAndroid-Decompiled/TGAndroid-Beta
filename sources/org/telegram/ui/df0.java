package org.telegram.ui;

import android.content.DialogInterface;
public final class df0 implements DialogInterface.OnDismissListener {
    public final int f36179a;
    public final if0 f36180b;

    public df0(if0 if0Var, int i10) {
        this.f36179a = i10;
        this.f36180b = if0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36179a) {
            case 0:
                this.f36180b.f37877s0.finishFragment();
                return;
            default:
                this.f36180b.f37877s0.finishFragment();
                return;
        }
    }
}
