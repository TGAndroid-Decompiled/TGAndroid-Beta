package org.telegram.ui;

import android.content.DialogInterface;
public final class jf implements DialogInterface.OnShowListener {
    public final int f38135a;
    public final xn f38136b;

    public jf(xn xnVar, int i10) {
        this.f38135a = i10;
        this.f38136b = xnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38135a) {
            case 0:
                this.f38136b.Nb(false);
                return;
            default:
                this.f38136b.Nb(false);
                return;
        }
    }
}
