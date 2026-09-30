package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p80 implements DialogInterface.OnDismissListener {
    public final int f27290a;
    public final Object f27291b;
    public final boolean f27292c;

    public p80(int i10, Object obj, boolean z10) {
        this.f27290a = i10;
        this.f27291b = obj;
        this.f27292c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27290a) {
            case 0:
                u80 u80Var = (u80) this.f27291b;
                u80.w(u80Var.getContext(), u80Var.f28796c, u80Var.f28798n, this.f27292c);
                return;
            case 1:
                u80 u80Var2 = (u80) this.f27291b;
                u80.w(u80Var2.getContext(), u80Var2.f28796c, u80Var2.f28798n, this.f27292c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f27291b;
                lcVar.f5117z2 = false;
                lcVar.X0.x(7, true);
                if (this.f27292c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
