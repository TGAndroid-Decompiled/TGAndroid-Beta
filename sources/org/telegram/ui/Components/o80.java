package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o80 implements DialogInterface.OnDismissListener {
    public final int f27005a;
    public final Object f27006b;
    public final boolean f27007c;

    public o80(int i10, Object obj, boolean z10) {
        this.f27005a = i10;
        this.f27006b = obj;
        this.f27007c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27005a) {
            case 0:
                t80 t80Var = (t80) this.f27006b;
                t80.w(t80Var.getContext(), t80Var.f28497c, t80Var.f28499n, this.f27007c);
                return;
            case 1:
                t80 t80Var2 = (t80) this.f27006b;
                t80.w(t80Var2.getContext(), t80Var2.f28497c, t80Var2.f28499n, this.f27007c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f27006b;
                lcVar.f5110z2 = false;
                lcVar.X0.x(7, true);
                if (this.f27007c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
