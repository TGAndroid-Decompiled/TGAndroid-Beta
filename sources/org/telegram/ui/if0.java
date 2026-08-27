package org.telegram.ui;

import android.content.DialogInterface;

public final class if0 implements DialogInterface.OnDismissListener {

    public final int f39071a;

    public final mf0 f39072b;

    public if0(mf0 mf0Var, int i10) {
        this.f39071a = i10;
        this.f39072b = mf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39071a) {
            case 0:
                this.f39072b.f40497o0.finishFragment();
                break;
            default:
                this.f39072b.f40497o0.finishFragment();
                break;
        }
    }
}
