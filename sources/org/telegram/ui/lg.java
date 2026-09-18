package org.telegram.ui;

import android.content.DialogInterface;
public final class lg implements DialogInterface.OnDismissListener {
    public final int f35545a;
    public final bo f35546b;

    public lg(bo boVar, int i10) {
        this.f35545a = i10;
        this.f35546b = boVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35545a) {
            case 0:
                bo.B0(this.f35546b);
                return;
            case 1:
                this.f35546b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f35546b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f35546b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f35546b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f35546b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f35546b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f35546b.Fb = null;
                return;
            default:
                ik ikVar = this.f35546b.X1;
                if (ikVar != null) {
                    ikVar.c(false);
                    return;
                }
                return;
        }
    }
}
