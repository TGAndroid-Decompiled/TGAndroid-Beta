package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class y80 implements DialogInterface.OnDismissListener {
    public final int f34978a;
    public final Object f34979b;
    public final boolean f34980c;

    public y80(int i10, Object obj, boolean z10) {
        this.f34978a = i10;
        this.f34979b = obj;
        this.f34980c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34978a) {
            case 0:
                c90 c90Var = (c90) this.f34979b;
                c90.w(c90Var.getContext(), c90Var.d, c90Var.f27102r, this.f34980c);
                return;
            case 1:
                c90 c90Var2 = (c90) this.f34979b;
                c90.w(c90Var2.getContext(), c90Var2.d, c90Var2.f27102r, this.f34980c);
                return;
            default:
                fi.sb sbVar = (fi.sb) this.f34979b;
                sbVar.f11689z2 = false;
                sbVar.X0.x(7, true);
                if (this.f34980c) {
                    sbVar.p(true);
                    return;
                }
                return;
        }
    }
}
