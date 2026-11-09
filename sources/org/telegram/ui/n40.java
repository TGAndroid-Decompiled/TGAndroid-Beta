package org.telegram.ui;

import android.view.View;
public final class n40 implements View.OnClickListener {
    public final int f48091a;
    public final y40 f48092b;

    public n40(y40 y40Var, int i7) {
        this.f48091a = i7;
        this.f48092b = y40Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48091a) {
            case 0:
                y40 y40Var = this.f48092b;
                y40Var.X = null;
                y40Var.Z.b();
                y40Var.h.b();
                y40Var.p0();
                y40Var.w0();
                y40Var.x0();
                return;
            case 1:
                y40 y40Var2 = this.f48092b;
                y40Var2.f51864f.f37857r.clearFocus();
                y40Var2.f51864f.f37857r.requestFocus();
                org.telegram.messenger.g0.K3(y40Var2.f51864f.f37857r);
                return;
            case 2:
                this.f48092b.t0();
                return;
            case 3:
                y40 y40Var3 = this.f48092b;
                y40Var3.s0(y40Var3.q0());
                return;
            default:
                y40 y40Var4 = this.f48092b;
                y40Var4.s0(y40Var4.q0());
                return;
        }
    }
}
