package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w80 implements DialogInterface.OnDismissListener {
    public final int f31990a;
    public final Object f31991b;
    public final boolean f31992c;

    public w80(int i10, Object obj, boolean z10) {
        this.f31990a = i10;
        this.f31991b = obj;
        this.f31992c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31990a) {
            case 0:
                a90 a90Var = (a90) this.f31991b;
                a90.y(a90Var.getContext(), a90Var.f24552c, a90Var.f24554n, this.f31992c);
                return;
            case 1:
                a90 a90Var2 = (a90) this.f31991b;
                a90.y(a90Var2.getContext(), a90Var2.f24552c, a90Var2.f24554n, this.f31992c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f31991b;
                vbVar.f10031z2 = false;
                vbVar.X0.x(7, true);
                if (this.f31992c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
