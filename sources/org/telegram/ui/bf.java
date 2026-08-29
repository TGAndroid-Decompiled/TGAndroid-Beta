package org.telegram.ui;

import android.content.DialogInterface;
public final class bf implements DialogInterface.OnShowListener {
    public final int f36780a;
    public final tn f36781b;

    public bf(tn tnVar, int i10) {
        this.f36780a = i10;
        this.f36781b = tnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36780a) {
            case 0:
                this.f36781b.Nb(false);
                return;
            default:
                this.f36781b.Nb(false);
                return;
        }
    }
}
