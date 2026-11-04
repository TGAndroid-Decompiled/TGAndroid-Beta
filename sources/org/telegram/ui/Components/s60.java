package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class s60 implements DialogInterface.OnDismissListener {
    public final int f37934a;
    public final Object f37935b;
    public final boolean f37936c;

    public s60(int i3, Object obj, boolean z10) {
        this.f37934a = i3;
        this.f37935b = obj;
        this.f37936c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37934a) {
            case 0:
                x60 x60Var = (x60) this.f37935b;
                x60.J0(x60Var.getContext(), x60Var.f40248l1, x60Var.f40252q1, this.f37936c);
                return;
            case 1:
                x60 x60Var2 = (x60) this.f37935b;
                x60.J0(x60Var2.getContext(), x60Var2.f40248l1, x60Var2.f40252q1, this.f37936c);
                return;
            default:
                gi.va vaVar = (gi.va) this.f37935b;
                vaVar.A2 = false;
                vaVar.Y0.x(7, true);
                if (this.f37936c) {
                    vaVar.p(true);
                    return;
                }
                return;
        }
    }
}
