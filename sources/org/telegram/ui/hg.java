package org.telegram.ui;

import android.content.DialogInterface;
public final class hg implements DialogInterface.OnDismissListener {
    public final int f33846a;
    public final xn f33847b;

    public hg(xn xnVar, int i10) {
        this.f33846a = i10;
        this.f33847b = xnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33846a) {
            case 0:
                xn.B0(this.f33847b);
                return;
            case 1:
                this.f33847b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f33847b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f33847b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f33847b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f33847b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f33847b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f33847b.Fb = null;
                return;
            default:
                ek ekVar = this.f33847b.X1;
                if (ekVar != null) {
                    ekVar.c(false);
                    return;
                }
                return;
        }
    }
}
