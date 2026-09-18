package org.telegram.ui;

import android.content.DialogInterface;
public final class pf implements DialogInterface.OnShowListener {
    public final int f36467a;
    public final zn f36468b;

    public pf(zn znVar, int i10) {
        this.f36467a = i10;
        this.f36468b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36467a) {
            case 0:
                this.f36468b.Nb(false);
                return;
            default:
                this.f36468b.Nb(false);
                return;
        }
    }
}
