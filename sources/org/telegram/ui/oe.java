package org.telegram.ui;

import android.content.DialogInterface;
public final class oe implements DialogInterface.OnDismissListener {
    public final int f39854a;
    public final qn f39855b;

    public oe(qn qnVar, int i10) {
        this.f39854a = i10;
        this.f39855b = qnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39854a) {
            case 0:
                zj zjVar = this.f39855b.X1;
                if (zjVar != null) {
                    zjVar.c(false);
                    return;
                }
                return;
            case 1:
                qn.a1(this.f39855b);
                return;
            case 2:
                this.f39855b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f39855b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f39855b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f39855b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f39855b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f39855b.j8(false, true, 0.0f);
                return;
            default:
                this.f39855b.Gb = null;
                return;
        }
    }
}
