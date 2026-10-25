package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class y80 implements DialogInterface.OnDismissListener {
    public final int f34975a;
    public final Object f34976b;
    public final boolean f34977c;

    public y80(int i10, Object obj, boolean z10) {
        this.f34975a = i10;
        this.f34976b = obj;
        this.f34977c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34975a) {
            case 0:
                c90 c90Var = (c90) this.f34976b;
                c90.w(c90Var.getContext(), c90Var.d, c90Var.f27100r, this.f34977c);
                return;
            case 1:
                c90 c90Var2 = (c90) this.f34976b;
                c90.w(c90Var2.getContext(), c90Var2.d, c90Var2.f27100r, this.f34977c);
                return;
            default:
                fi.sb sbVar = (fi.sb) this.f34976b;
                sbVar.f11689z2 = false;
                sbVar.X0.x(7, true);
                if (this.f34977c) {
                    sbVar.p(true);
                    return;
                }
                return;
        }
    }
}
