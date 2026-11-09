package org.telegram.ui;

import android.content.DialogInterface;
public final class ee implements DialogInterface.OnDismissListener {
    public final int f45365a;
    public final cn f45366b;

    public ee(cn cnVar, int i7) {
        this.f45365a = i7;
        this.f45366b = cnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45365a) {
            case 0:
                nj njVar = this.f45366b.f44525l2;
                if (njVar != null) {
                    njVar.c(false);
                    return;
                }
                return;
            case 1:
                cn.j1(this.f45366b);
                return;
            case 2:
                this.f45366b.w8(false, true, 0.0f);
                return;
            case 3:
                this.f45366b.w8(false, true, 0.0f);
                return;
            case 4:
                this.f45366b.w8(false, true, 0.0f);
                return;
            case 5:
                this.f45366b.w8(false, true, 0.0f);
                return;
            case 6:
                this.f45366b.w8(false, true, 0.0f);
                return;
            case 7:
                this.f45366b.w8(false, true, 0.0f);
                return;
            default:
                this.f45366b.f44497ic = null;
                return;
        }
    }
}
