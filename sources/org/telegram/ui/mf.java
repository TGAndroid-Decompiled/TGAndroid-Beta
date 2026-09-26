package org.telegram.ui;

import android.content.DialogInterface;
public final class mf implements DialogInterface.OnShowListener {
    public final int f35546a;
    public final wn f35547b;

    public mf(wn wnVar, int i10) {
        this.f35546a = i10;
        this.f35547b = wnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35546a) {
            case 0:
                this.f35547b.Nb(false);
                return;
            default:
                this.f35547b.Nb(false);
                return;
        }
    }
}
