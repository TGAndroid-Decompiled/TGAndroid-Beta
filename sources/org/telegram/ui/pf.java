package org.telegram.ui;

import android.content.DialogInterface;
public final class pf implements DialogInterface.OnShowListener {
    public final int f40830a;
    public final zn f40831b;

    public pf(zn znVar, int i10) {
        this.f40830a = i10;
        this.f40831b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40830a) {
            case 0:
                this.f40831b.Rb(false);
                return;
            default:
                this.f40831b.Rb(false);
                return;
        }
    }
}
