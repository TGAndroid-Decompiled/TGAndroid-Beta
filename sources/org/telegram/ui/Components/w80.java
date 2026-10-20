package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w80 implements DialogInterface.OnDismissListener {
    public final int f31989a;
    public final Object f31990b;
    public final boolean f31991c;

    public w80(int i10, Object obj, boolean z10) {
        this.f31989a = i10;
        this.f31990b = obj;
        this.f31991c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31989a) {
            case 0:
                a90 a90Var = (a90) this.f31990b;
                a90.y(a90Var.getContext(), a90Var.f24552c, a90Var.f24554n, this.f31991c);
                return;
            case 1:
                a90 a90Var2 = (a90) this.f31990b;
                a90.y(a90Var2.getContext(), a90Var2.f24552c, a90Var2.f24554n, this.f31991c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f31990b;
                vbVar.f10031z2 = false;
                vbVar.X0.x(7, true);
                if (this.f31991c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
