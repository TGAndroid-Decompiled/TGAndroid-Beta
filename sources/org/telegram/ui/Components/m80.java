package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m80 implements DialogInterface.OnDismissListener {
    public final int f26403a;
    public final Object f26404b;
    public final boolean f26405c;

    public m80(int i10, Object obj, boolean z10) {
        this.f26403a = i10;
        this.f26404b = obj;
        this.f26405c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26403a) {
            case 0:
                r80 r80Var = (r80) this.f26404b;
                r80.w(r80Var.getContext(), r80Var.f27905c, r80Var.f27907n, this.f26405c);
                return;
            case 1:
                r80 r80Var2 = (r80) this.f26404b;
                r80.w(r80Var2.getContext(), r80Var2.f27905c, r80Var2.f27907n, this.f26405c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f26404b;
                lcVar.f5110z2 = false;
                lcVar.X0.x(7, true);
                if (this.f26405c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
