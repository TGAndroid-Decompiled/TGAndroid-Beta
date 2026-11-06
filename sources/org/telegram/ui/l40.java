package org.telegram.ui;

import android.view.View;
public final class l40 implements View.OnClickListener {
    public final int f47406a;
    public final w40 f47407b;

    public l40(w40 w40Var, int i7) {
        this.f47406a = i7;
        this.f47407b = w40Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47406a) {
            case 0:
                w40 w40Var = this.f47407b;
                w40Var.X = null;
                w40Var.Z.b();
                w40Var.h.b();
                w40Var.p0();
                w40Var.w0();
                w40Var.x0();
                return;
            case 1:
                w40 w40Var2 = this.f47407b;
                w40Var2.f50932f.f37441r.clearFocus();
                w40Var2.f50932f.f37441r.requestFocus();
                org.telegram.messenger.g0.K3(w40Var2.f50932f.f37441r);
                return;
            case 2:
                this.f47407b.t0();
                return;
            case 3:
                w40 w40Var3 = this.f47407b;
                w40Var3.s0(w40Var3.q0());
                return;
            default:
                w40 w40Var4 = this.f47407b;
                w40Var4.s0(w40Var4.q0());
                return;
        }
    }
}
