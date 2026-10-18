package org.telegram.ui;

import android.content.DialogInterface;
public final class df0 implements DialogInterface.OnDismissListener {
    public final int f36207a;
    public final jf0 f36208b;

    public df0(jf0 jf0Var, int i10) {
        this.f36207a = i10;
        this.f36208b = jf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36207a) {
            case 0:
                this.f36208b.f38174s0.finishFragment();
                return;
            default:
                this.f36208b.f38174s0.finishFragment();
                return;
        }
    }
}
