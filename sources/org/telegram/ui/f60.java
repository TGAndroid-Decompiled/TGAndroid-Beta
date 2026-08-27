package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class f60 implements View.OnClickListener {

    public final int f37948a;

    public final o60 f37949b;

    public f60(o60 o60Var, int i10) {
        this.f37948a = i10;
        this.f37949b = o60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37948a) {
            case 0:
                o60 o60Var = this.f37949b;
                o60Var.f41002f.f31468r.clearFocus();
                o60Var.f41002f.f31468r.requestFocus();
                AndroidUtilities.showKeyboard(o60Var.f41002f.f31468r);
                break;
            case 1:
                this.f37949b.o0();
                break;
            case 2:
                o60 o60Var2 = this.f37949b;
                o60Var2.n0(o60Var2.l0());
                break;
            case 3:
                o60 o60Var3 = this.f37949b;
                o60Var3.n0(o60Var3.l0());
                break;
            default:
                o60 o60Var4 = this.f37949b;
                o60Var4.T = null;
                o60Var4.V.b();
                o60Var4.h.b();
                o60Var4.k0();
                o60Var4.r0();
                o60Var4.s0();
                break;
        }
    }
}
