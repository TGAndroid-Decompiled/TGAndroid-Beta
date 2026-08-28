package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b60 implements View.OnClickListener {
    public final int f36658a;
    public final k60 f36659b;

    public b60(k60 k60Var, int i9) {
        this.f36658a = i9;
        this.f36659b = k60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36658a) {
            case 0:
                k60 k60Var = this.f36659b;
                k60Var.f39734f.f30664r.clearFocus();
                k60Var.f39734f.f30664r.requestFocus();
                AndroidUtilities.showKeyboard(k60Var.f39734f.f30664r);
                return;
            case 1:
                this.f36659b.n0();
                return;
            case 2:
                k60 k60Var2 = this.f36659b;
                k60Var2.m0(k60Var2.k0());
                return;
            case 3:
                k60 k60Var3 = this.f36659b;
                k60Var3.m0(k60Var3.k0());
                return;
            default:
                k60 k60Var4 = this.f36659b;
                k60Var4.T = null;
                k60Var4.V.b();
                k60Var4.h.b();
                k60Var4.j0();
                k60Var4.q0();
                k60Var4.r0();
                return;
        }
    }
}
