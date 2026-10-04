package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p80 implements DialogInterface.OnDismissListener {
    public final int f29566a;
    public final Object f29567b;
    public final boolean f29568c;

    public p80(int i10, Object obj, boolean z10) {
        this.f29566a = i10;
        this.f29567b = obj;
        this.f29568c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29566a) {
            case 0:
                u80 u80Var = (u80) this.f29567b;
                u80.w(u80Var.getContext(), u80Var.f31321c, u80Var.f31324n, this.f29568c);
                return;
            case 1:
                u80 u80Var2 = (u80) this.f29567b;
                u80.w(u80Var2.getContext(), u80Var2.f31321c, u80Var2.f31324n, this.f29568c);
                return;
            default:
                ci.kc kcVar = (ci.kc) this.f29567b;
                kcVar.f5458z2 = false;
                kcVar.X0.x(7, true);
                if (this.f29568c) {
                    kcVar.q(true);
                    return;
                }
                return;
        }
    }
}
