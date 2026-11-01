package org.telegram.ui;

import android.content.DialogInterface;
public final class nv implements DialogInterface.OnDismissListener {
    public final int f39975a;
    public final zx f39976b;

    public nv(zx zxVar, int i10) {
        this.f39975a = i10;
        this.f39976b = zxVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39975a) {
            case 0:
                zx zxVar = this.f39976b;
                if (zxVar.R3 != null) {
                    zxVar.getMessagesController().h4(0L, zxVar.R3);
                    zxVar.R3 = null;
                    zxVar.X4();
                    return;
                }
                return;
            case 1:
                this.f39976b.n4(true);
                return;
            case 2:
                this.f39976b.n4(true);
                return;
            default:
                zx.l0(this.f39976b);
                return;
        }
    }
}
