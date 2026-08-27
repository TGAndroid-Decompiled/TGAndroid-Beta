package org.telegram.ui;

import android.content.DialogInterface;

public final class ag implements DialogInterface.OnDismissListener {

    public final int f36529a;

    public final rn f36530b;

    public ag(rn rnVar, int i10) {
        this.f36529a = i10;
        this.f36530b = rnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36529a) {
            case 0:
                rn.B0(this.f36530b);
                break;
            case 1:
                this.f36530b.g8(false, true, 0.0f);
                break;
            case 2:
                this.f36530b.g8(false, true, 0.0f);
                break;
            case 3:
                this.f36530b.g8(false, true, 0.0f);
                break;
            case 4:
                this.f36530b.g8(false, true, 0.0f);
                break;
            case 5:
                this.f36530b.g8(false, true, 0.0f);
                break;
            case 6:
                this.f36530b.g8(false, true, 0.0f);
                break;
            case 7:
                this.f36530b.Cb = null;
                break;
            default:
                xj xjVar = this.f36530b.T1;
                if (xjVar != null) {
                    xjVar.c(false);
                }
                break;
        }
    }
}
