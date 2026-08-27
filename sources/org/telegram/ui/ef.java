package org.telegram.ui;

import android.content.DialogInterface;

public final class ef implements DialogInterface.OnShowListener {

    public final int f37748a;

    public final rn f37749b;

    public ef(rn rnVar, int i10) {
        this.f37748a = i10;
        this.f37749b = rnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37748a) {
            case 0:
                this.f37749b.Nb(false);
                break;
            default:
                this.f37749b.Nb(false);
                break;
        }
    }
}
