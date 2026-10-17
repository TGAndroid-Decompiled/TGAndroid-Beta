package org.telegram.ui;

import android.content.DialogInterface;
public final class qe implements DialogInterface.OnDismissListener {
    public final int f40390a;
    public final sn f40391b;

    public qe(sn snVar, int i10) {
        this.f40390a = i10;
        this.f40391b = snVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40390a) {
            case 0:
                bk bkVar = this.f40391b.X1;
                if (bkVar != null) {
                    bkVar.c(false);
                    return;
                }
                return;
            case 1:
                sn.a1(this.f40391b);
                return;
            case 2:
                this.f40391b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f40391b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f40391b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f40391b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f40391b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f40391b.j8(false, true, 0.0f);
                return;
            default:
                this.f40391b.Gb = null;
                return;
        }
    }
}
