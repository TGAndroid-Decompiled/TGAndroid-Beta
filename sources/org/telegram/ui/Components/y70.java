package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class y70 implements DialogInterface.OnDismissListener {
    public final int f34936a;
    public final Object f34937b;
    public final boolean f34938c;

    public y70(int i10, Object obj, boolean z10) {
        this.f34936a = i10;
        this.f34937b = obj;
        this.f34938c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34936a) {
            case 0:
                c80 c80Var = (c80) this.f34937b;
                c80.w(c80Var.getContext(), c80Var.f27369c, c80Var.f27372n, this.f34938c);
                return;
            case 1:
                c80 c80Var2 = (c80) this.f34937b;
                c80.w(c80Var2.getContext(), c80Var2.f27369c, c80Var2.f27372n, this.f34938c);
                return;
            default:
                nh.gb gbVar = (nh.gb) this.f34937b;
                gbVar.f17806v2 = false;
                gbVar.T0.x(7, true);
                if (this.f34938c) {
                    gbVar.q(true);
                    return;
                }
                return;
        }
    }
}
