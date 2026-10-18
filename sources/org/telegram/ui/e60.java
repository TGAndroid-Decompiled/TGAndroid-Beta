package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e60 implements View.OnClickListener {
    public final int f36374a;
    public final n60 f36375b;

    public e60(n60 n60Var, int i10) {
        this.f36374a = i10;
        this.f36375b = n60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36374a) {
            case 0:
                n60 n60Var = this.f36375b;
                n60Var.f39321f.f27712r.clearFocus();
                n60Var.f39321f.f27712r.requestFocus();
                AndroidUtilities.showKeyboard(n60Var.f39321f.f27712r);
                return;
            case 1:
                this.f36375b.o0();
                return;
            case 2:
                n60 n60Var2 = this.f36375b;
                n60Var2.n0(n60Var2.l0());
                return;
            case 3:
                n60 n60Var3 = this.f36375b;
                n60Var3.n0(n60Var3.l0());
                return;
            default:
                n60 n60Var4 = this.f36375b;
                n60Var4.X = null;
                n60Var4.Z.b();
                n60Var4.h.b();
                n60Var4.k0();
                n60Var4.r0();
                n60Var4.s0();
                return;
        }
    }
}
