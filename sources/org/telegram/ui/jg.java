package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnDismissListener {
    public final int f37793a;
    public final co f37794b;

    public jg(co coVar, int i10) {
        this.f37793a = i10;
        this.f37794b = coVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37793a) {
            case 0:
                co.B0(this.f37794b);
                return;
            case 1:
                this.f37794b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f37794b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f37794b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f37794b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f37794b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f37794b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f37794b.Gb = null;
                return;
            default:
                hk hkVar = this.f37794b.X1;
                if (hkVar != null) {
                    hkVar.c(false);
                    return;
                }
                return;
        }
    }
}
