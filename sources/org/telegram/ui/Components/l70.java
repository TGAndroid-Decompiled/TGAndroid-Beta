package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class l70 implements DialogInterface.OnDismissListener {
    public final int f30391a;
    public final Object f30392b;
    public final boolean f30393c;

    public l70(int i9, Object obj, boolean z10) {
        this.f30391a = i9;
        this.f30392b = obj;
        this.f30393c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f30391a) {
            case 0:
                p70 p70Var = (p70) this.f30392b;
                p70.w(p70Var.getContext(), p70Var.f31567c, p70Var.f31570n, this.f30393c);
                return;
            case 1:
                p70 p70Var2 = (p70) this.f30392b;
                p70.w(p70Var2.getContext(), p70Var2.f31567c, p70Var2.f31570n, this.f30393c);
                return;
            default:
                kh.wb wbVar = (kh.wb) this.f30392b;
                wbVar.f16316v2 = false;
                wbVar.T0.x(7, true);
                if (this.f30393c) {
                    wbVar.q(true);
                    return;
                }
                return;
        }
    }
}
