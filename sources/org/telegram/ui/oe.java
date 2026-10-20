package org.telegram.ui;

import android.content.DialogInterface;
public final class oe implements DialogInterface.OnDismissListener {
    public final int f39851a;
    public final qn f39852b;

    public oe(qn qnVar, int i10) {
        this.f39851a = i10;
        this.f39852b = qnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39851a) {
            case 0:
                zj zjVar = this.f39852b.X1;
                if (zjVar != null) {
                    zjVar.c(false);
                    return;
                }
                return;
            case 1:
                qn.a1(this.f39852b);
                return;
            case 2:
                this.f39852b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f39852b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f39852b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f39852b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f39852b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f39852b.j8(false, true, 0.0f);
                return;
            default:
                this.f39852b.Gb = null;
                return;
        }
    }
}
