package org.telegram.ui;

import android.content.DialogInterface;
public final class pf implements DialogInterface.OnShowListener {
    public final int f40784a;
    public final zn f40785b;

    public pf(zn znVar, int i10) {
        this.f40784a = i10;
        this.f40785b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40784a) {
            case 0:
                this.f40785b.Rb(false);
                return;
            default:
                this.f40785b.Rb(false);
                return;
        }
    }
}
