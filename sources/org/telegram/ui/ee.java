package org.telegram.ui;

import android.content.DialogInterface;
public final class ee implements DialogInterface.OnDismissListener {
    public final int f45242a;
    public final cn f45243b;

    public ee(cn cnVar, int i7) {
        this.f45242a = i7;
        this.f45243b = cnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45242a) {
            case 0:
                nj njVar = this.f45243b.f44566l2;
                if (njVar != null) {
                    njVar.c(false);
                    return;
                }
                return;
            case 1:
                cn.j1(this.f45243b);
                return;
            case 2:
                this.f45243b.w8(false, true, 0.0f);
                return;
            case 3:
                this.f45243b.w8(false, true, 0.0f);
                return;
            case 4:
                this.f45243b.w8(false, true, 0.0f);
                return;
            case 5:
                this.f45243b.w8(false, true, 0.0f);
                return;
            case 6:
                this.f45243b.w8(false, true, 0.0f);
                return;
            case 7:
                this.f45243b.w8(false, true, 0.0f);
                return;
            default:
                this.f45243b.f44538ic = null;
                return;
        }
    }
}
