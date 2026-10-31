package org.telegram.ui;

import android.content.DialogInterface;
public final class lf implements DialogInterface.OnShowListener {
    public final int f39227a;
    public final un f39228b;

    public lf(un unVar, int i10) {
        this.f39227a = i10;
        this.f39228b = unVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39227a) {
            case 0:
                this.f39228b.gc(false);
                return;
            default:
                this.f39228b.gc(false);
                return;
        }
    }
}
