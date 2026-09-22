package org.telegram.ui;

import android.content.DialogInterface;
public final class of implements DialogInterface.OnShowListener {
    public final int f36210a;
    public final bo f36211b;

    public of(bo boVar, int i10) {
        this.f36210a = i10;
        this.f36211b = boVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36210a) {
            case 0:
                this.f36211b.Nb(false);
                return;
            default:
                this.f36211b.Nb(false);
                return;
        }
    }
}
