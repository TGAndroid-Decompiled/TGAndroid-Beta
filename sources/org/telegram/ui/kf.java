package org.telegram.ui;

import android.content.DialogInterface;
public final class kf implements DialogInterface.OnShowListener {
    public final int f38502a;
    public final sn f38503b;

    public kf(sn snVar, int i10) {
        this.f38502a = i10;
        this.f38503b = snVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38502a) {
            case 0:
                this.f38503b.Rb(false);
                return;
            default:
                this.f38503b.Rb(false);
                return;
        }
    }
}
