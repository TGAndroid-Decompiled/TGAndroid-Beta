package org.telegram.ui;

import android.view.View;
public final class g40 implements View.OnClickListener {
    public final int f45524a;
    public final r40 f45525b;

    public g40(r40 r40Var, int i3) {
        this.f45524a = i3;
        this.f45525b = r40Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45524a) {
            case 0:
                r40 r40Var = this.f45525b;
                r40Var.Y = null;
                r40Var.f49032a0.b();
                r40Var.h.b();
                r40Var.p0();
                r40Var.w0();
                r40Var.x0();
                return;
            case 1:
                r40 r40Var2 = this.f45525b;
                r40Var2.f49040f.f36302r.clearFocus();
                r40Var2.f49040f.f36302r.requestFocus();
                org.telegram.messenger.g0.K3(r40Var2.f49040f.f36302r);
                return;
            case 2:
                this.f45525b.t0();
                return;
            case 3:
                r40 r40Var3 = this.f45525b;
                r40Var3.s0(r40Var3.q0());
                return;
            default:
                r40 r40Var4 = this.f45525b;
                r40Var4.s0(r40Var4.q0());
                return;
        }
    }
}
