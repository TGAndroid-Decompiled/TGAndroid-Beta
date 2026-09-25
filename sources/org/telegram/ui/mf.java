package org.telegram.ui;

import android.content.DialogInterface;
public final class mf implements DialogInterface.OnShowListener {
    public final int f35548a;
    public final wn f35549b;

    public mf(wn wnVar, int i10) {
        this.f35548a = i10;
        this.f35549b = wnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35548a) {
            case 0:
                this.f35549b.Nb(false);
                return;
            default:
                this.f35549b.Nb(false);
                return;
        }
    }
}
