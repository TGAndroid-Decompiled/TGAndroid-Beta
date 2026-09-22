package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class m80 implements DialogInterface.OnDismissListener {
    public final int f26375a;
    public final Object f26376b;
    public final boolean f26377c;

    public m80(int i10, Object obj, boolean z10) {
        this.f26375a = i10;
        this.f26376b = obj;
        this.f26377c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26375a) {
            case 0:
                r80 r80Var = (r80) this.f26376b;
                r80.w(r80Var.getContext(), r80Var.f27848c, r80Var.f27850n, this.f26377c);
                return;
            case 1:
                r80 r80Var2 = (r80) this.f26376b;
                r80.w(r80Var2.getContext(), r80Var2.f27848c, r80Var2.f27850n, this.f26377c);
                return;
            default:
                ci.oc ocVar = (ci.oc) this.f26376b;
                ocVar.f5287z2 = false;
                ocVar.X0.x(7, true);
                if (this.f26377c) {
                    ocVar.q(true);
                    return;
                }
                return;
        }
    }
}
