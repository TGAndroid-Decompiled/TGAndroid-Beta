package org.telegram.ui;

import android.content.DialogInterface;
public final class mf implements DialogInterface.OnShowListener {
    public final int f35551a;
    public final wn f35552b;

    public mf(wn wnVar, int i10) {
        this.f35551a = i10;
        this.f35552b = wnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35551a) {
            case 0:
                this.f35552b.Nb(false);
                return;
            default:
                this.f35552b.Nb(false);
                return;
        }
    }
}
