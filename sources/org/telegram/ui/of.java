package org.telegram.ui;

import android.content.DialogInterface;
public final class of implements DialogInterface.OnShowListener {
    public final int f40528a;
    public final zn f40529b;

    public of(zn znVar, int i10) {
        this.f40528a = i10;
        this.f40529b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40528a) {
            case 0:
                this.f40529b.Rb(false);
                return;
            default:
                this.f40529b.Rb(false);
                return;
        }
    }
}
