package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g60 implements View.OnClickListener {
    public final int f37463a;
    public final p60 f37464b;

    public g60(p60 p60Var, int i10) {
        this.f37463a = i10;
        this.f37464b = p60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37463a) {
            case 0:
                p60 p60Var = this.f37464b;
                p60Var.f40356f.f27258r.clearFocus();
                p60Var.f40356f.f27258r.requestFocus();
                AndroidUtilities.showKeyboard(p60Var.f40356f.f27258r);
                return;
            case 1:
                this.f37464b.o0();
                return;
            case 2:
                p60 p60Var2 = this.f37464b;
                p60Var2.n0(p60Var2.l0());
                return;
            case 3:
                p60 p60Var3 = this.f37464b;
                p60Var3.n0(p60Var3.l0());
                return;
            default:
                p60 p60Var4 = this.f37464b;
                p60Var4.X = null;
                p60Var4.Z.b();
                p60Var4.h.b();
                p60Var4.k0();
                p60Var4.r0();
                p60Var4.s0();
                return;
        }
    }
}
