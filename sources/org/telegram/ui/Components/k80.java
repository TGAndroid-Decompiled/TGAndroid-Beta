package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class k80 implements DialogInterface.OnDismissListener {
    public final int f25640a;
    public final Object f25641b;
    public final boolean f25642c;

    public k80(int i10, Object obj, boolean z10) {
        this.f25640a = i10;
        this.f25641b = obj;
        this.f25642c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f25640a) {
            case 0:
                p80 p80Var = (p80) this.f25641b;
                p80.w(p80Var.getContext(), p80Var.f27131c, p80Var.f27133n, this.f25642c);
                return;
            case 1:
                p80 p80Var2 = (p80) this.f25641b;
                p80.w(p80Var2.getContext(), p80Var2.f27131c, p80Var2.f27133n, this.f25642c);
                return;
            default:
                ci.oc ocVar = (ci.oc) this.f25641b;
                ocVar.f5288z2 = false;
                ocVar.X0.x(7, true);
                if (this.f25642c) {
                    ocVar.q(true);
                    return;
                }
                return;
        }
    }
}
