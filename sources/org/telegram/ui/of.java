package org.telegram.ui;

import android.content.DialogInterface;
public final class of implements DialogInterface.OnShowListener {
    public final int f40562a;
    public final zn f40563b;

    public of(zn znVar, int i10) {
        this.f40562a = i10;
        this.f40563b = znVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f40562a) {
            case 0:
                this.f40563b.Rb(false);
                return;
            default:
                this.f40563b.Rb(false);
                return;
        }
    }
}
