package org.telegram.ui;

import android.content.DialogInterface;
public final class dg implements DialogInterface.OnDismissListener {
    public final int f36182a;
    public final xn f36183b;

    public dg(xn xnVar, int i10) {
        this.f36182a = i10;
        this.f36183b = xnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36182a) {
            case 0:
                xn.B0(this.f36183b);
                return;
            case 1:
                this.f36183b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f36183b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f36183b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f36183b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f36183b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f36183b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f36183b.Db = null;
                return;
            default:
                dk dkVar = this.f36183b.U1;
                if (dkVar != null) {
                    dkVar.c(false);
                    return;
                }
                return;
        }
    }
}
