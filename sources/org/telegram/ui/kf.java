package org.telegram.ui;

import android.content.DialogInterface;
public final class kf implements DialogInterface.OnShowListener {
    public final int f38507a;
    public final sn f38508b;

    public kf(sn snVar, int i10) {
        this.f38507a = i10;
        this.f38508b = snVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38507a) {
            case 0:
                this.f38508b.Rb(false);
                return;
            default:
                this.f38508b.Rb(false);
                return;
        }
    }
}
