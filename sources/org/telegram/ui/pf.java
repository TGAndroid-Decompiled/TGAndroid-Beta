package org.telegram.ui;

import android.content.DialogInterface;
public final class pf implements DialogInterface.OnShowListener {
    public final int f36579a;
    public final zn f36580b;

    public pf(zn znVar, int i10) {
        this.f36579a = i10;
        this.f36580b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36579a) {
            case 0:
                this.f36580b.Nb(false);
                return;
            default:
                this.f36580b.Nb(false);
                return;
        }
    }
}
