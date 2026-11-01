package org.telegram.ui;

import android.content.DialogInterface;
public final class kf implements DialogInterface.OnShowListener {
    public final int f38869a;
    public final un f38870b;

    public kf(un unVar, int i10) {
        this.f38869a = i10;
        this.f38870b = unVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f38869a) {
            case 0:
                this.f38870b.lc(false);
                return;
            default:
                this.f38870b.lc(false);
                return;
        }
    }
}
