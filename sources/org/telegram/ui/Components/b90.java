package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b90 implements DialogInterface.OnDismissListener {
    public final int f23719a;
    public final Object f23720b;
    public final boolean f23721c;

    public b90(int i10, Object obj, boolean z10) {
        this.f23719a = i10;
        this.f23720b = obj;
        this.f23721c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f23719a) {
            case 0:
                g90 g90Var = (g90) this.f23720b;
                g90.y(g90Var.getContext(), g90Var.f25235c, g90Var.f25237n, this.f23721c);
                return;
            case 1:
                g90 g90Var2 = (g90) this.f23720b;
                g90.y(g90Var2.getContext(), g90Var2.f25235c, g90Var2.f25237n, this.f23721c);
                return;
            default:
                di.kc kcVar = (di.kc) this.f23720b;
                kcVar.f7318z2 = false;
                kcVar.X0.x(7, true);
                if (this.f23721c) {
                    kcVar.p(true);
                    return;
                }
                return;
        }
    }
}
