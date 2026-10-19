package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c60 implements View.OnClickListener {
    public final int f35826a;
    public final l60 f35827b;

    public c60(l60 l60Var, int i10) {
        this.f35826a = i10;
        this.f35827b = l60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35826a) {
            case 0:
                l60 l60Var = this.f35827b;
                l60Var.f38804f.f27688r.clearFocus();
                l60Var.f38804f.f27688r.requestFocus();
                AndroidUtilities.showKeyboard(l60Var.f38804f.f27688r);
                return;
            case 1:
                this.f35827b.o0();
                return;
            case 2:
                l60 l60Var2 = this.f35827b;
                l60Var2.n0(l60Var2.l0());
                return;
            case 3:
                l60 l60Var3 = this.f35827b;
                l60Var3.n0(l60Var3.l0());
                return;
            default:
                l60 l60Var4 = this.f35827b;
                l60Var4.X = null;
                l60Var4.Z.b();
                l60Var4.h.b();
                l60Var4.k0();
                l60Var4.r0();
                l60Var4.s0();
                return;
        }
    }
}
