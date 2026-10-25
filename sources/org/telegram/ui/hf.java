package org.telegram.ui;

import android.content.DialogInterface;
public final class hf implements DialogInterface.OnShowListener {
    public final int f39996a;
    public final un f39997b;

    public hf(un unVar, int i10) {
        this.f39996a = i10;
        this.f39997b = unVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39996a) {
            case 0:
                this.f39997b.Zb(false);
                return;
            default:
                this.f39997b.Zb(false);
                return;
        }
    }
}
