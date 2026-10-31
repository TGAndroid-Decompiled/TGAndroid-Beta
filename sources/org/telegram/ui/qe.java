package org.telegram.ui;

import android.content.DialogInterface;
public final class qe implements DialogInterface.OnDismissListener {
    public final int f40965a;
    public final un f40966b;

    public qe(un unVar, int i10) {
        this.f40965a = i10;
        this.f40966b = unVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40965a) {
            case 0:
                gk gkVar = this.f40966b.f42318l2;
                if (gkVar != null) {
                    gkVar.c(false);
                    return;
                }
                return;
            case 1:
                un.Y0(this.f40966b);
                return;
            case 2:
                this.f40966b.o8(false, true, 0.0f);
                return;
            case 3:
                this.f40966b.o8(false, true, 0.0f);
                return;
            case 4:
                this.f40966b.o8(false, true, 0.0f);
                return;
            case 5:
                this.f40966b.o8(false, true, 0.0f);
                return;
            case 6:
                this.f40966b.o8(false, true, 0.0f);
                return;
            case 7:
                this.f40966b.o8(false, true, 0.0f);
                return;
            default:
                this.f40966b.f42204bc = null;
                return;
        }
    }
}
