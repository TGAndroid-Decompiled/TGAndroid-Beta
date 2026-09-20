package org.telegram.ui;

import android.content.DialogInterface;
public final class pf implements DialogInterface.OnShowListener {
    public final int f36552a;
    public final zn f36553b;

    public pf(zn znVar, int i10) {
        this.f36552a = i10;
        this.f36553b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36552a) {
            case 0:
                this.f36553b.Nb(false);
                return;
            default:
                this.f36553b.Nb(false);
                return;
        }
    }
}
