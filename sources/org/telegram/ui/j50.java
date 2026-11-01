package org.telegram.ui;

import android.view.View;
public final class j50 implements View.OnClickListener {
    public final int f38276a;
    public final u50 f38277b;

    public j50(u50 u50Var, int i10) {
        this.f38276a = i10;
        this.f38277b = u50Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38276a) {
            case 0:
                u50 u50Var = this.f38277b;
                u50Var.X = null;
                u50Var.Z.b();
                u50Var.h.b();
                u50Var.p0();
                u50Var.w0();
                u50Var.x0();
                return;
            case 1:
                u50 u50Var2 = this.f38277b;
                u50Var2.f41808f.f26635r.clearFocus();
                u50Var2.f41808f.f26635r.requestFocus();
                org.telegram.messenger.i0.J3(u50Var2.f41808f.f26635r);
                return;
            case 2:
                this.f38277b.t0();
                return;
            case 3:
                u50 u50Var3 = this.f38277b;
                u50Var3.s0(u50Var3.q0());
                return;
            default:
                u50 u50Var4 = this.f38277b;
                u50Var4.s0(u50Var4.q0());
                return;
        }
    }
}
