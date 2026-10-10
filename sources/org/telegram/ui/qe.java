package org.telegram.ui;

import android.content.DialogInterface;
public final class qe implements DialogInterface.OnDismissListener {
    public final int f41136a;
    public final zn f41137b;

    public qe(zn znVar, int i10) {
        this.f41136a = i10;
        this.f41137b = znVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41136a) {
            case 0:
                ik ikVar = this.f41137b.X1;
                if (ikVar != null) {
                    ikVar.c(false);
                    return;
                }
                return;
            case 1:
                zn.a1(this.f41137b);
                return;
            case 2:
                this.f41137b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f41137b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f41137b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f41137b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f41137b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f41137b.j8(false, true, 0.0f);
                return;
            default:
                this.f41137b.Gb = null;
                return;
        }
    }
}
