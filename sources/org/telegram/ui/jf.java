package org.telegram.ui;

import android.content.DialogInterface;
public final class jf implements DialogInterface.OnShowListener {
    public final int f38038a;
    public final xn f38039b;

    public jf(xn xnVar, int i10) {
        this.f38038a = i10;
        this.f38039b = xnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38038a) {
            case 0:
                this.f38039b.Nb(false);
                return;
            default:
                this.f38039b.Nb(false);
                return;
        }
    }
}
