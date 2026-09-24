package org.telegram.ui;

import android.content.DialogInterface;
public final class mf implements DialogInterface.OnShowListener {
    public final int f35535a;
    public final wn f35536b;

    public mf(wn wnVar, int i10) {
        this.f35535a = i10;
        this.f35536b = wnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35535a) {
            case 0:
                this.f35536b.Nb(false);
                return;
            default:
                this.f35536b.Nb(false);
                return;
        }
    }
}
