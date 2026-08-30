package org.telegram.ui;

import android.content.DialogInterface;
public final class nf0 implements DialogInterface.OnDismissListener {
    public final int f36616a;
    public final rf0 f36617b;

    public nf0(rf0 rf0Var, int i10) {
        this.f36616a = i10;
        this.f36617b = rf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36616a) {
            case 0:
                this.f36617b.f38034p0.finishFragment();
                return;
            default:
                this.f36617b.f38034p0.finishFragment();
                return;
        }
    }
}
