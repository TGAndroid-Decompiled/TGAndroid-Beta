package org.telegram.ui;

import android.view.View;
public final class k50 implements View.OnClickListener {
    public final int f38686a;
    public final v50 f38687b;

    public k50(v50 v50Var, int i10) {
        this.f38686a = i10;
        this.f38687b = v50Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38686a) {
            case 0:
                v50 v50Var = this.f38687b;
                v50Var.X = null;
                v50Var.Z.b();
                v50Var.h.b();
                v50Var.o0();
                v50Var.v0();
                v50Var.w0();
                return;
            case 1:
                v50 v50Var2 = this.f38687b;
                v50Var2.f42613f.f26588r.clearFocus();
                v50Var2.f42613f.f26588r.requestFocus();
                org.telegram.messenger.i0.J3(v50Var2.f42613f.f26588r);
                return;
            case 2:
                this.f38687b.s0();
                return;
            case 3:
                v50 v50Var3 = this.f38687b;
                v50Var3.r0(v50Var3.p0());
                return;
            default:
                v50 v50Var4 = this.f38687b;
                v50Var4.r0(v50Var4.p0());
                return;
        }
    }
}
