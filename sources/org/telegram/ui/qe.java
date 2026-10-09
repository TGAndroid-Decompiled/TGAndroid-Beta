package org.telegram.ui;

import android.content.DialogInterface;
public final class qe implements DialogInterface.OnDismissListener {
    public final int f41090a;
    public final zn f41091b;

    public qe(zn znVar, int i10) {
        this.f41090a = i10;
        this.f41091b = znVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41090a) {
            case 0:
                ik ikVar = this.f41091b.X1;
                if (ikVar != null) {
                    ikVar.c(false);
                    return;
                }
                return;
            case 1:
                zn.a1(this.f41091b);
                return;
            case 2:
                this.f41091b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f41091b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f41091b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f41091b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f41091b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f41091b.j8(false, true, 0.0f);
                return;
            default:
                this.f41091b.Gb = null;
                return;
        }
    }
}
