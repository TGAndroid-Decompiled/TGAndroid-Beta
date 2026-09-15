package org.telegram.ui;

import android.content.DialogInterface;
public final class of implements DialogInterface.OnShowListener {
    public final int f36202a;
    public final bo f36203b;

    public of(bo boVar, int i10) {
        this.f36202a = i10;
        this.f36203b = boVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f36202a) {
            case 0:
                this.f36203b.Nb(false);
                return;
            default:
                this.f36203b.Nb(false);
                return;
        }
    }
}
