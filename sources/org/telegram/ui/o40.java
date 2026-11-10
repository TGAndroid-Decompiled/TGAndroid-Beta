package org.telegram.ui;

import android.view.View;
public final class o40 implements View.OnClickListener {
    public final int f48426a;
    public final z40 f48427b;

    public o40(z40 z40Var, int i7) {
        this.f48426a = i7;
        this.f48427b = z40Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48426a) {
            case 0:
                z40 z40Var = this.f48427b;
                z40Var.X = null;
                z40Var.Z.b();
                z40Var.h.b();
                z40Var.p0();
                z40Var.w0();
                z40Var.x0();
                return;
            case 1:
                z40 z40Var2 = this.f48427b;
                z40Var2.f52219f.f37446r.clearFocus();
                z40Var2.f52219f.f37446r.requestFocus();
                org.telegram.messenger.g0.K3(z40Var2.f52219f.f37446r);
                return;
            case 2:
                this.f48427b.t0();
                return;
            case 3:
                z40 z40Var3 = this.f48427b;
                z40Var3.s0(z40Var3.q0());
                return;
            default:
                z40 z40Var4 = this.f48427b;
                z40Var4.s0(z40Var4.q0());
                return;
        }
    }
}
