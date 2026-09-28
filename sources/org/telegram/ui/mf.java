package org.telegram.ui;

import android.content.DialogInterface;
public final class mf implements DialogInterface.OnShowListener {
    public final int f35547a;
    public final wn f35548b;

    public mf(wn wnVar, int i10) {
        this.f35547a = i10;
        this.f35548b = wnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35547a) {
            case 0:
                this.f35548b.Nb(false);
                return;
            default:
                this.f35548b.Nb(false);
                return;
        }
    }
}
