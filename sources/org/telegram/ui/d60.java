package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d60 implements View.OnClickListener {
    public final int f37315a;
    public final m60 f37316b;

    public d60(m60 m60Var, int i10) {
        this.f37315a = i10;
        this.f37316b = m60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37315a) {
            case 0:
                m60 m60Var = this.f37316b;
                m60Var.f40450f.f34546r.clearFocus();
                m60Var.f40450f.f34546r.requestFocus();
                AndroidUtilities.showKeyboard(m60Var.f40450f.f34546r);
                return;
            case 1:
                this.f37316b.o0();
                return;
            case 2:
                m60 m60Var2 = this.f37316b;
                m60Var2.n0(m60Var2.l0());
                return;
            case 3:
                m60 m60Var3 = this.f37316b;
                m60Var3.n0(m60Var3.l0());
                return;
            default:
                m60 m60Var4 = this.f37316b;
                m60Var4.T = null;
                m60Var4.V.b();
                m60Var4.h.b();
                m60Var4.k0();
                m60Var4.r0();
                m60Var4.s0();
                return;
        }
    }
}
