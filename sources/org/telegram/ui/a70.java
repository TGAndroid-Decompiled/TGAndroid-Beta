package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a70 implements View.OnClickListener {
    public final int f33764a;
    public final j70 f33765b;

    public a70(j70 j70Var, int i10) {
        this.f33764a = i10;
        this.f33765b = j70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33764a) {
            case 0:
                j70 j70Var = this.f33765b;
                j70Var.f36947f.f27510r.clearFocus();
                j70Var.f36947f.f27510r.requestFocus();
                AndroidUtilities.showKeyboard(j70Var.f36947f.f27510r);
                return;
            case 1:
                this.f33765b.o0();
                return;
            case 2:
                j70 j70Var2 = this.f33765b;
                j70Var2.n0(j70Var2.l0());
                return;
            case 3:
                j70 j70Var3 = this.f33765b;
                j70Var3.n0(j70Var3.l0());
                return;
            default:
                j70 j70Var4 = this.f33765b;
                j70Var4.X = null;
                j70Var4.Z.b();
                j70Var4.h.b();
                j70Var4.k0();
                j70Var4.r0();
                j70Var4.s0();
                return;
        }
    }
}
