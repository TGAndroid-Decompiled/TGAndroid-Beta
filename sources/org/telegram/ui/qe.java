package org.telegram.ui;

import android.content.DialogInterface;
public final class qe implements DialogInterface.OnDismissListener {
    public final int f40758a;
    public final un f40759b;

    public qe(un unVar, int i10) {
        this.f40758a = i10;
        this.f40759b = unVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40758a) {
            case 0:
                gk gkVar = this.f40759b.f42129l2;
                if (gkVar != null) {
                    gkVar.c(false);
                    return;
                }
                return;
            case 1:
                un.w0(this.f40759b);
                return;
            case 2:
                this.f40759b.s8(false, true, 0.0f);
                return;
            case 3:
                this.f40759b.s8(false, true, 0.0f);
                return;
            case 4:
                this.f40759b.s8(false, true, 0.0f);
                return;
            case 5:
                this.f40759b.s8(false, true, 0.0f);
                return;
            case 6:
                this.f40759b.s8(false, true, 0.0f);
                return;
            case 7:
                this.f40759b.s8(false, true, 0.0f);
                return;
            default:
                this.f40759b.f42029cc = null;
                return;
        }
    }
}
