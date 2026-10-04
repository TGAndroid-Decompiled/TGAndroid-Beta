package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p80 implements DialogInterface.OnDismissListener {
    public final int f29565a;
    public final Object f29566b;
    public final boolean f29567c;

    public p80(int i10, Object obj, boolean z10) {
        this.f29565a = i10;
        this.f29566b = obj;
        this.f29567c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29565a) {
            case 0:
                u80 u80Var = (u80) this.f29566b;
                u80.w(u80Var.getContext(), u80Var.f31320c, u80Var.f31323n, this.f29567c);
                return;
            case 1:
                u80 u80Var2 = (u80) this.f29566b;
                u80.w(u80Var2.getContext(), u80Var2.f31320c, u80Var2.f31323n, this.f29567c);
                return;
            default:
                ci.kc kcVar = (ci.kc) this.f29566b;
                kcVar.f5458z2 = false;
                kcVar.X0.x(7, true);
                if (this.f29567c) {
                    kcVar.q(true);
                    return;
                }
                return;
        }
    }
}
