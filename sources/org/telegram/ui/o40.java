package org.telegram.ui;

import android.view.View;
public final class o40 implements View.OnClickListener {
    public final int f50466a;
    public final z40 f50467b;

    public o40(z40 z40Var, int i7) {
        this.f50466a = i7;
        this.f50467b = z40Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50466a) {
            case 0:
                z40 z40Var = this.f50467b;
                z40Var.Y = null;
                z40Var.f54401a0.b();
                z40Var.h.b();
                z40Var.p0();
                z40Var.w0();
                z40Var.x0();
                return;
            case 1:
                z40 z40Var2 = this.f50467b;
                z40Var2.f54409f.f34647r.clearFocus();
                z40Var2.f54409f.f34647r.requestFocus();
                org.telegram.messenger.g0.I3(z40Var2.f54409f.f34647r);
                return;
            case 2:
                this.f50467b.t0();
                return;
            case 3:
                z40 z40Var3 = this.f50467b;
                z40Var3.s0(z40Var3.q0());
                return;
            default:
                z40 z40Var4 = this.f50467b;
                z40Var4.s0(z40Var4.q0());
                return;
        }
    }
}
