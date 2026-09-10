package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class k80 implements DialogInterface.OnDismissListener {
    public final int f24668a;
    public final Object f24669b;
    public final boolean f24670c;

    public k80(int i10, Object obj, boolean z10) {
        this.f24668a = i10;
        this.f24669b = obj;
        this.f24670c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24668a) {
            case 0:
                q80 q80Var = (q80) this.f24669b;
                q80.w(q80Var.getContext(), q80Var.f26339c, q80Var.f26341n, this.f24670c);
                return;
            case 1:
                q80 q80Var2 = (q80) this.f24669b;
                q80.w(q80Var2.getContext(), q80Var2.f26339c, q80Var2.f26341n, this.f24670c);
                return;
            default:
                bi.ce ceVar = (bi.ce) this.f24669b;
                ceVar.f2514z2 = false;
                ceVar.X0.x(7, true);
                if (this.f24670c) {
                    ceVar.q(true);
                    return;
                }
                return;
        }
    }
}
