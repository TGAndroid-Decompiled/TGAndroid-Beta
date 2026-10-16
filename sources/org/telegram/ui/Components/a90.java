package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class a90 implements DialogInterface.OnDismissListener {
    public final int f23170a;
    public final Object f23171b;
    public final boolean f23172c;

    public a90(int i10, Object obj, boolean z10) {
        this.f23170a = i10;
        this.f23171b = obj;
        this.f23172c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f23170a) {
            case 0:
                f90 f90Var = (f90) this.f23171b;
                f90.y(f90Var.getContext(), f90Var.f24662c, f90Var.f24664n, this.f23172c);
                return;
            case 1:
                f90 f90Var2 = (f90) this.f23171b;
                f90.y(f90Var2.getContext(), f90Var2.f24662c, f90Var2.f24664n, this.f23172c);
                return;
            default:
                di.kc kcVar = (di.kc) this.f23171b;
                kcVar.f7321z2 = false;
                kcVar.X0.x(7, true);
                if (this.f23172c) {
                    kcVar.p(true);
                    return;
                }
                return;
        }
    }
}
