package org.telegram.ui;

import android.view.View;
public final class l40 implements View.OnClickListener {
    public final int f48828a;
    public final w40 f48829b;

    public l40(w40 w40Var, int i7) {
        this.f48828a = i7;
        this.f48829b = w40Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48828a) {
            case 0:
                w40 w40Var = this.f48829b;
                w40Var.Y = null;
                w40Var.f52399a0.b();
                w40Var.h.b();
                w40Var.p0();
                w40Var.w0();
                w40Var.x0();
                return;
            case 1:
                w40 w40Var2 = this.f48829b;
                w40Var2.f52407f.f40202r.clearFocus();
                w40Var2.f52407f.f40202r.requestFocus();
                org.telegram.messenger.g0.J3(w40Var2.f52407f.f40202r);
                return;
            case 2:
                this.f48829b.t0();
                return;
            case 3:
                w40 w40Var3 = this.f48829b;
                w40Var3.s0(w40Var3.q0());
                return;
            default:
                w40 w40Var4 = this.f48829b;
                w40Var4.s0(w40Var4.q0());
                return;
        }
    }
}
