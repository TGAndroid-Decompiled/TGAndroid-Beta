package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o80 implements DialogInterface.OnDismissListener {
    public final int f27004a;
    public final Object f27005b;
    public final boolean f27006c;

    public o80(int i10, Object obj, boolean z10) {
        this.f27004a = i10;
        this.f27005b = obj;
        this.f27006c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27004a) {
            case 0:
                t80 t80Var = (t80) this.f27005b;
                t80.w(t80Var.getContext(), t80Var.f28496c, t80Var.f28498n, this.f27006c);
                return;
            case 1:
                t80 t80Var2 = (t80) this.f27005b;
                t80.w(t80Var2.getContext(), t80Var2.f28496c, t80Var2.f28498n, this.f27006c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f27005b;
                lcVar.f5110z2 = false;
                lcVar.X0.x(7, true);
                if (this.f27006c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
