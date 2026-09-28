package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o80 implements DialogInterface.OnDismissListener {
    public final int f27006a;
    public final Object f27007b;
    public final boolean f27008c;

    public o80(int i10, Object obj, boolean z10) {
        this.f27006a = i10;
        this.f27007b = obj;
        this.f27008c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27006a) {
            case 0:
                t80 t80Var = (t80) this.f27007b;
                t80.w(t80Var.getContext(), t80Var.f28498c, t80Var.f28500n, this.f27008c);
                return;
            case 1:
                t80 t80Var2 = (t80) this.f27007b;
                t80.w(t80Var2.getContext(), t80Var2.f28498c, t80Var2.f28500n, this.f27008c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f27007b;
                lcVar.f5110z2 = false;
                lcVar.X0.x(7, true);
                if (this.f27008c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
