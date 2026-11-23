package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class k70 implements DialogInterface.OnDismissListener {
    public final int f36659a;
    public final Object f36660b;
    public final boolean f36661c;

    public k70(int i7, Object obj, boolean z10) {
        this.f36659a = i7;
        this.f36660b = obj;
        this.f36661c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36659a) {
            case 0:
                o70 o70Var = (o70) this.f36660b;
                o70.K0(o70Var.getContext(), o70Var.f38053o1, o70Var.f38058t1, this.f36661c);
                return;
            case 1:
                o70 o70Var2 = (o70) this.f36660b;
                o70.K0(o70Var2.getContext(), o70Var2.f38053o1, o70Var2.f38058t1, this.f36661c);
                return;
            default:
                hi.nb nbVar = (hi.nb) this.f36660b;
                nbVar.A2 = false;
                nbVar.Y0.x(7, true);
                if (this.f36661c) {
                    nbVar.p(true);
                    return;
                }
                return;
        }
    }
}
