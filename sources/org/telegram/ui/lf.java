package org.telegram.ui;

import android.content.DialogInterface;
public final class lf implements DialogInterface.OnShowListener {
    public final int f35754a;
    public final zn f35755b;

    public lf(zn znVar, int i10) {
        this.f35754a = i10;
        this.f35755b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35754a) {
            case 0:
                this.f35755b.Nb(false);
                return;
            default:
                this.f35755b.Nb(false);
                return;
        }
    }
}
