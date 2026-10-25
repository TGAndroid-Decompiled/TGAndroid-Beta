package org.telegram.ui;

import android.content.DialogInterface;
public final class qe implements DialogInterface.OnDismissListener {
    public final int f42815a;
    public final un f42816b;

    public qe(un unVar, int i10) {
        this.f42815a = i10;
        this.f42816b = unVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42815a) {
            case 0:
                bk bkVar = this.f42816b.f44293j2;
                if (bkVar != null) {
                    bkVar.c(false);
                    return;
                }
                return;
            case 1:
                un.j1(this.f42816b);
                return;
            case 2:
                this.f42816b.n8(false, true, 0.0f);
                return;
            case 3:
                this.f42816b.n8(false, true, 0.0f);
                return;
            case 4:
                this.f42816b.n8(false, true, 0.0f);
                return;
            case 5:
                this.f42816b.n8(false, true, 0.0f);
                return;
            case 6:
                this.f42816b.n8(false, true, 0.0f);
                return;
            case 7:
                this.f42816b.n8(false, true, 0.0f);
                return;
            default:
                this.f42816b.f44216cc = null;
                return;
        }
    }
}
