package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class z80 implements DialogInterface.OnDismissListener {
    public final int f35289a;
    public final Object f35290b;
    public final boolean f35291c;

    public z80(int i10, Object obj, boolean z10) {
        this.f35289a = i10;
        this.f35290b = obj;
        this.f35291c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35289a) {
            case 0:
                d90 d90Var = (d90) this.f35290b;
                d90.w(d90Var.getContext(), d90Var.d, d90Var.f27379r, this.f35291c);
                return;
            case 1:
                d90 d90Var2 = (d90) this.f35290b;
                d90.w(d90Var2.getContext(), d90Var2.d, d90Var2.f27379r, this.f35291c);
                return;
            default:
                fi.sb sbVar = (fi.sb) this.f35290b;
                sbVar.f11688z2 = false;
                sbVar.X0.x(7, true);
                if (this.f35291c) {
                    sbVar.p(true);
                    return;
                }
                return;
        }
    }
}
