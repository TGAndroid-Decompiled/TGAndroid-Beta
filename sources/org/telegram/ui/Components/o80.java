package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class o80 implements DialogInterface.OnDismissListener {
    public final int f27040a;
    public final Object f27041b;
    public final boolean f27042c;

    public o80(int i10, Object obj, boolean z10) {
        this.f27040a = i10;
        this.f27041b = obj;
        this.f27042c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f27040a) {
            case 0:
                t80 t80Var = (t80) this.f27041b;
                t80.w(t80Var.getContext(), t80Var.f28514c, t80Var.f28516n, this.f27042c);
                return;
            case 1:
                t80 t80Var2 = (t80) this.f27041b;
                t80.w(t80Var2.getContext(), t80Var2.f28514c, t80Var2.f28516n, this.f27042c);
                return;
            default:
                ci.kc kcVar = (ci.kc) this.f27041b;
                kcVar.f5066z2 = false;
                kcVar.X0.x(7, true);
                if (this.f27042c) {
                    kcVar.q(true);
                    return;
                }
                return;
        }
    }
}
