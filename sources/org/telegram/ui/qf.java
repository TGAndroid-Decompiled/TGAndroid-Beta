package org.telegram.ui;

import android.content.DialogInterface;
public final class qf implements DialogInterface.OnShowListener {
    public final int f36914a;
    public final bo f36915b;

    public qf(bo boVar, int i10) {
        this.f36914a = i10;
        this.f36915b = boVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36914a) {
            case 0:
                this.f36915b.Nb(false);
                return;
            default:
                this.f36915b.Nb(false);
                return;
        }
    }
}
