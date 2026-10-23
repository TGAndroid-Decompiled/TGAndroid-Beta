package org.telegram.ui;

import android.content.DialogInterface;
public final class oe implements DialogInterface.OnDismissListener {
    public final int f40142a;
    public final sn f40143b;

    public oe(sn snVar, int i10) {
        this.f40142a = i10;
        this.f40143b = snVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40142a) {
            case 0:
                ak akVar = this.f40143b.f41562j2;
                if (akVar != null) {
                    akVar.c(false);
                    return;
                }
                return;
            case 1:
                sn.k1(this.f40143b);
                return;
            case 2:
                this.f40143b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f40143b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f40143b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f40143b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f40143b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f40143b.j8(false, true, 0.0f);
                return;
            default:
                this.f40143b.Tb = null;
                return;
        }
    }
}
