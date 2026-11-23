package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n70 implements DialogInterface.OnDismissListener {
    public final int f37781a;
    public final Object f37782b;
    public final boolean f37783c;

    public n70(int i7, Object obj, boolean z10) {
        this.f37781a = i7;
        this.f37782b = obj;
        this.f37783c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37781a) {
            case 0:
                r70 r70Var = (r70) this.f37782b;
                r70.K0(r70Var.getContext(), r70Var.f39061o1, r70Var.f39066t1, this.f37783c);
                return;
            case 1:
                r70 r70Var2 = (r70) this.f37782b;
                r70.K0(r70Var2.getContext(), r70Var2.f39061o1, r70Var2.f39066t1, this.f37783c);
                return;
            default:
                hi.ta taVar = (hi.ta) this.f37782b;
                taVar.A2 = false;
                taVar.Y0.x(7, true);
                if (this.f37783c) {
                    taVar.p(true);
                    return;
                }
                return;
        }
    }
}
