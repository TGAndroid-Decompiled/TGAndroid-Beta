package org.telegram.ui;

import android.content.DialogInterface;
public final class jf implements DialogInterface.OnShowListener {
    public final int f35337a;
    public final xn f35338b;

    public jf(xn xnVar, int i10) {
        this.f35337a = i10;
        this.f35338b = xnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35337a) {
            case 0:
                this.f35338b.Nb(false);
                return;
            default:
                this.f35338b.Nb(false);
                return;
        }
    }
}
