package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w80 implements DialogInterface.OnDismissListener {
    public final int f31994a;
    public final Object f31995b;
    public final boolean f31996c;

    public w80(int i10, Object obj, boolean z10) {
        this.f31994a = i10;
        this.f31995b = obj;
        this.f31996c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31994a) {
            case 0:
                a90 a90Var = (a90) this.f31995b;
                a90.y(a90Var.getContext(), a90Var.f24556c, a90Var.f24558n, this.f31996c);
                return;
            case 1:
                a90 a90Var2 = (a90) this.f31995b;
                a90.y(a90Var2.getContext(), a90Var2.f24556c, a90Var2.f24558n, this.f31996c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f31995b;
                vbVar.f10031z2 = false;
                vbVar.X0.x(7, true);
                if (this.f31996c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
