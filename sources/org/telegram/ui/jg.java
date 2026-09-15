package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnDismissListener {
    public final int f34896a;
    public final bo f34897b;

    public jg(bo boVar, int i10) {
        this.f34896a = i10;
        this.f34897b = boVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34896a) {
            case 0:
                bo.B0(this.f34897b);
                return;
            case 1:
                this.f34897b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f34897b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f34897b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f34897b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f34897b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f34897b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f34897b.Gb = null;
                return;
            default:
                hk hkVar = this.f34897b.X1;
                if (hkVar != null) {
                    hkVar.c(false);
                    return;
                }
                return;
        }
    }
}
