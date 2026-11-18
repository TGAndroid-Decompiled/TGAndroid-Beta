package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class l70 implements DialogInterface.OnDismissListener {
    public final int f37062a;
    public final Object f37063b;
    public final boolean f37064c;

    public l70(int i7, Object obj, boolean z10) {
        this.f37062a = i7;
        this.f37063b = obj;
        this.f37064c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37062a) {
            case 0:
                p70 p70Var = (p70) this.f37063b;
                p70.K0(p70Var.getContext(), p70Var.f38305o1, p70Var.f38310t1, this.f37064c);
                return;
            case 1:
                p70 p70Var2 = (p70) this.f37063b;
                p70.K0(p70Var2.getContext(), p70Var2.f38305o1, p70Var2.f38310t1, this.f37064c);
                return;
            default:
                hi.ta taVar = (hi.ta) this.f37063b;
                taVar.A2 = false;
                taVar.Y0.x(7, true);
                if (this.f37064c) {
                    taVar.p(true);
                    return;
                }
                return;
        }
    }
}
