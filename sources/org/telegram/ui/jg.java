package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnDismissListener {
    public final int f34947a;
    public final zn f34948b;

    public jg(zn znVar, int i10) {
        this.f34947a = i10;
        this.f34948b = znVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34947a) {
            case 0:
                zn.R0(this.f34948b);
                return;
            case 1:
                this.f34948b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f34948b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f34948b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f34948b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f34948b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f34948b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f34948b.Fb = null;
                return;
            default:
                hk hkVar = this.f34948b.X1;
                if (hkVar != null) {
                    hkVar.c(false);
                    return;
                }
                return;
        }
    }
}
