package org.telegram.ui;

import android.content.DialogInterface;
public final class qe implements DialogInterface.OnDismissListener {
    public final int f41092a;
    public final zn f41093b;

    public qe(zn znVar, int i10) {
        this.f41092a = i10;
        this.f41093b = znVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41092a) {
            case 0:
                ik ikVar = this.f41093b.X1;
                if (ikVar != null) {
                    ikVar.c(false);
                    return;
                }
                return;
            case 1:
                zn.a1(this.f41093b);
                return;
            case 2:
                this.f41093b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f41093b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f41093b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f41093b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f41093b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f41093b.j8(false, true, 0.0f);
                return;
            default:
                this.f41093b.Gb = null;
                return;
        }
    }
}
