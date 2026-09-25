package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m80 implements DialogInterface.OnDismissListener {
    public final int f26404a;
    public final Object f26405b;
    public final boolean f26406c;

    public m80(int i10, Object obj, boolean z10) {
        this.f26404a = i10;
        this.f26405b = obj;
        this.f26406c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26404a) {
            case 0:
                r80 r80Var = (r80) this.f26405b;
                r80.w(r80Var.getContext(), r80Var.f27906c, r80Var.f27908n, this.f26406c);
                return;
            case 1:
                r80 r80Var2 = (r80) this.f26405b;
                r80.w(r80Var2.getContext(), r80Var2.f27906c, r80Var2.f27908n, this.f26406c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f26405b;
                lcVar.f5110z2 = false;
                lcVar.X0.x(7, true);
                if (this.f26406c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
