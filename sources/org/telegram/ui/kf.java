package org.telegram.ui;

import android.content.DialogInterface;
public final class kf implements DialogInterface.OnShowListener {
    public final int f38516a;
    public final sn f38517b;

    public kf(sn snVar, int i10) {
        this.f38516a = i10;
        this.f38517b = snVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38516a) {
            case 0:
                this.f38517b.Rb(false);
                return;
            default:
                this.f38517b.Rb(false);
                return;
        }
    }
}
