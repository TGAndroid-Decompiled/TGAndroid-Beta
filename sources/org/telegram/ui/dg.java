package org.telegram.ui;

import android.content.DialogInterface;
public final class dg implements DialogInterface.OnDismissListener {
    public final int f33631a;
    public final xn f33632b;

    public dg(xn xnVar, int i10) {
        this.f33631a = i10;
        this.f33632b = xnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33631a) {
            case 0:
                xn.B0(this.f33632b);
                return;
            case 1:
                this.f33632b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f33632b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f33632b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f33632b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f33632b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f33632b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f33632b.Db = null;
                return;
            default:
                dk dkVar = this.f33632b.U1;
                if (dkVar != null) {
                    dkVar.c(false);
                    return;
                }
                return;
        }
    }
}
