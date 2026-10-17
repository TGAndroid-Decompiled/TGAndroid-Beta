package org.telegram.ui;

import android.content.DialogInterface;
public final class df0 implements DialogInterface.OnDismissListener {
    public final int f36186a;
    public final jf0 f36187b;

    public df0(jf0 jf0Var, int i10) {
        this.f36186a = i10;
        this.f36187b = jf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36186a) {
            case 0:
                this.f36187b.f38158s0.finishFragment();
                return;
            default:
                this.f36187b.f38158s0.finishFragment();
                return;
        }
    }
}
