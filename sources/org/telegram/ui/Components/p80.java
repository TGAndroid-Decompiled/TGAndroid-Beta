package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class p80 implements DialogInterface.OnDismissListener {
    public final int f29645a;
    public final Object f29646b;
    public final boolean f29647c;

    public p80(int i10, Object obj, boolean z10) {
        this.f29645a = i10;
        this.f29646b = obj;
        this.f29647c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f29645a) {
            case 0:
                u80 u80Var = (u80) this.f29646b;
                u80.w(u80Var.getContext(), u80Var.f31380c, u80Var.f31383n, this.f29647c);
                return;
            case 1:
                u80 u80Var2 = (u80) this.f29646b;
                u80.w(u80Var2.getContext(), u80Var2.f31380c, u80Var2.f31383n, this.f29647c);
                return;
            default:
                ci.kc kcVar = (ci.kc) this.f29646b;
                kcVar.f5459z2 = false;
                kcVar.X0.x(7, true);
                if (this.f29647c) {
                    kcVar.q(true);
                    return;
                }
                return;
        }
    }
}
