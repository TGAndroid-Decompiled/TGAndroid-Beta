package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n70 implements DialogInterface.OnDismissListener {
    public final int f37821a;
    public final Object f37822b;
    public final boolean f37823c;

    public n70(int i7, Object obj, boolean z10) {
        this.f37821a = i7;
        this.f37822b = obj;
        this.f37823c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37821a) {
            case 0:
                r70 r70Var = (r70) this.f37822b;
                r70.K0(r70Var.getContext(), r70Var.f39097o1, r70Var.f39102t1, this.f37823c);
                return;
            case 1:
                r70 r70Var2 = (r70) this.f37822b;
                r70.K0(r70Var2.getContext(), r70Var2.f39097o1, r70Var2.f39102t1, this.f37823c);
                return;
            default:
                hi.sa saVar = (hi.sa) this.f37822b;
                saVar.A2 = false;
                saVar.Y0.x(7, true);
                if (this.f37823c) {
                    saVar.p(true);
                    return;
                }
                return;
        }
    }
}
