package org.telegram.ui;

import android.content.DialogInterface;
public final class nf implements DialogInterface.OnShowListener {
    public final int f35513a;
    public final xn f35514b;

    public nf(xn xnVar, int i10) {
        this.f35513a = i10;
        this.f35514b = xnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35513a) {
            case 0:
                this.f35514b.Nb(false);
                return;
            default:
                this.f35514b.Nb(false);
                return;
        }
    }
}
