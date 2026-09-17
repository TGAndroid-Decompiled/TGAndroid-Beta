package org.telegram.ui;

import android.content.DialogInterface;
public final class qf implements DialogInterface.OnShowListener {
    public final int f36909a;
    public final bo f36910b;

    public qf(bo boVar, int i10) {
        this.f36909a = i10;
        this.f36910b = boVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36909a) {
            case 0:
                this.f36910b.Nb(false);
                return;
            default:
                this.f36910b.Nb(false);
                return;
        }
    }
}
