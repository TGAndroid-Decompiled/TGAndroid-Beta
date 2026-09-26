package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q60 implements View.OnClickListener {
    public final int f36803a;
    public final z60 f36804b;

    public q60(z60 z60Var, int i10) {
        this.f36803a = i10;
        this.f36804b = z60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36803a) {
            case 0:
                z60 z60Var = this.f36804b;
                z60Var.f40373f.f23475r.clearFocus();
                z60Var.f40373f.f23475r.requestFocus();
                AndroidUtilities.showKeyboard(z60Var.f40373f.f23475r);
                return;
            case 1:
                this.f36804b.o0();
                return;
            case 2:
                z60 z60Var2 = this.f36804b;
                z60Var2.n0(z60Var2.l0());
                return;
            case 3:
                z60 z60Var3 = this.f36804b;
                z60Var3.n0(z60Var3.l0());
                return;
            default:
                z60 z60Var4 = this.f36804b;
                z60Var4.X = null;
                z60Var4.Z.b();
                z60Var4.h.b();
                z60Var4.k0();
                z60Var4.r0();
                z60Var4.s0();
                return;
        }
    }
}
