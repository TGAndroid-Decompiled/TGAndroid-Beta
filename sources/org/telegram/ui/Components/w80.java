package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class w80 implements DialogInterface.OnDismissListener {
    public final int f31993a;
    public final Object f31994b;
    public final boolean f31995c;

    public w80(int i10, Object obj, boolean z10) {
        this.f31993a = i10;
        this.f31994b = obj;
        this.f31995c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31993a) {
            case 0:
                a90 a90Var = (a90) this.f31994b;
                a90.y(a90Var.getContext(), a90Var.f24555c, a90Var.f24557n, this.f31995c);
                return;
            case 1:
                a90 a90Var2 = (a90) this.f31994b;
                a90.y(a90Var2.getContext(), a90Var2.f24555c, a90Var2.f24557n, this.f31995c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f31994b;
                vbVar.f10031z2 = false;
                vbVar.X0.x(7, true);
                if (this.f31995c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
