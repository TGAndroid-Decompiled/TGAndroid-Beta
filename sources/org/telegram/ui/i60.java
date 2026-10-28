package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i60 implements View.OnClickListener {
    public final int f40055a;
    public final t60 f40056b;

    public i60(t60 t60Var, int i10) {
        this.f40055a = i10;
        this.f40056b = t60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40055a) {
            case 0:
                t60 t60Var = this.f40056b;
                t60Var.X = null;
                t60Var.Z.b();
                t60Var.h.b();
                t60Var.l0();
                t60Var.s0();
                t60Var.t0();
                return;
            case 1:
                t60 t60Var2 = this.f40056b;
                t60Var2.f43505f.f30347r.clearFocus();
                t60Var2.f43505f.f30347r.requestFocus();
                AndroidUtilities.showKeyboard(t60Var2.f43505f.f30347r);
                return;
            case 2:
                this.f40056b.p0();
                return;
            case 3:
                t60 t60Var3 = this.f40056b;
                t60Var3.o0(t60Var3.m0());
                return;
            default:
                t60 t60Var4 = this.f40056b;
                t60Var4.o0(t60Var4.m0());
                return;
        }
    }
}
