package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnDismissListener {
    public final int f34869a;
    public final zn f34870b;

    public jg(zn znVar, int i10) {
        this.f34869a = i10;
        this.f34870b = znVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34869a) {
            case 0:
                zn.R0(this.f34870b);
                return;
            case 1:
                this.f34870b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f34870b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f34870b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f34870b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f34870b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f34870b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f34870b.Fb = null;
                return;
            default:
                gk gkVar = this.f34870b.X1;
                if (gkVar != null) {
                    gkVar.c(false);
                    return;
                }
                return;
        }
    }
}
