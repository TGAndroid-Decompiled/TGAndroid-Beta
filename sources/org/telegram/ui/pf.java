package org.telegram.ui;

import android.content.DialogInterface;
public final class pf implements DialogInterface.OnShowListener {
    public final int f40786a;
    public final zn f40787b;

    public pf(zn znVar, int i10) {
        this.f40786a = i10;
        this.f40787b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40786a) {
            case 0:
                this.f40787b.Rb(false);
                return;
            default:
                this.f40787b.Rb(false);
                return;
        }
    }
}
