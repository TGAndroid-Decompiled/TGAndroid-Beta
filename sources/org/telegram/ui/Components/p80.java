package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p80 implements DialogInterface.OnDismissListener {
    public final int f29571a;
    public final Object f29572b;
    public final boolean f29573c;

    public p80(int i10, Object obj, boolean z10) {
        this.f29571a = i10;
        this.f29572b = obj;
        this.f29573c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29571a) {
            case 0:
                u80 u80Var = (u80) this.f29572b;
                u80.w(u80Var.getContext(), u80Var.f31327c, u80Var.f31330n, this.f29573c);
                return;
            case 1:
                u80 u80Var2 = (u80) this.f29572b;
                u80.w(u80Var2.getContext(), u80Var2.f31327c, u80Var2.f31330n, this.f29573c);
                return;
            default:
                ci.kc kcVar = (ci.kc) this.f29572b;
                kcVar.f5459z2 = false;
                kcVar.X0.x(7, true);
                if (this.f29573c) {
                    kcVar.q(true);
                    return;
                }
                return;
        }
    }
}
