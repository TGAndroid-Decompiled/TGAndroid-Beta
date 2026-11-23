package org.telegram.ui;

import android.view.View;
public final class n40 implements View.OnClickListener {
    public final int f50206a;
    public final y40 f50207b;

    public n40(y40 y40Var, int i7) {
        this.f50206a = i7;
        this.f50207b = y40Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50206a) {
            case 0:
                y40 y40Var = this.f50207b;
                y40Var.Y = null;
                y40Var.f54191a0.b();
                y40Var.h.b();
                y40Var.p0();
                y40Var.w0();
                y40Var.x0();
                return;
            case 1:
                y40 y40Var2 = this.f50207b;
                y40Var2.f54199f.f33883r.clearFocus();
                y40Var2.f54199f.f33883r.requestFocus();
                org.telegram.messenger.g0.I3(y40Var2.f54199f.f33883r);
                return;
            case 2:
                this.f50207b.t0();
                return;
            case 3:
                y40 y40Var3 = this.f50207b;
                y40Var3.s0(y40Var3.q0());
                return;
            default:
                y40 y40Var4 = this.f50207b;
                y40Var4.s0(y40Var4.q0());
                return;
        }
    }
}
