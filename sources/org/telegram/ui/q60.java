package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q60 implements View.OnClickListener {
    public final int f40356a;
    public final z60 f40357b;

    public q60(z60 z60Var, int i10) {
        this.f40356a = i10;
        this.f40357b = z60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40356a) {
            case 0:
                z60 z60Var = this.f40357b;
                z60Var.f43833f.f26172r.clearFocus();
                z60Var.f43833f.f26172r.requestFocus();
                AndroidUtilities.showKeyboard(z60Var.f43833f.f26172r);
                return;
            case 1:
                this.f40357b.o0();
                return;
            case 2:
                z60 z60Var2 = this.f40357b;
                z60Var2.n0(z60Var2.l0());
                return;
            case 3:
                z60 z60Var3 = this.f40357b;
                z60Var3.n0(z60Var3.l0());
                return;
            default:
                z60 z60Var4 = this.f40357b;
                z60Var4.U = null;
                z60Var4.W.b();
                z60Var4.h.b();
                z60Var4.k0();
                z60Var4.r0();
                z60Var4.s0();
                return;
        }
    }
}
