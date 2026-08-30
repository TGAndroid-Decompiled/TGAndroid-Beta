package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p60 implements View.OnClickListener {
    public final int f37198a;
    public final y60 f37199b;

    public p60(y60 y60Var, int i10) {
        this.f37198a = i10;
        this.f37199b = y60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37198a) {
            case 0:
                y60 y60Var = this.f37199b;
                y60Var.f40419f.f23815r.clearFocus();
                y60Var.f40419f.f23815r.requestFocus();
                AndroidUtilities.showKeyboard(y60Var.f40419f.f23815r);
                return;
            case 1:
                this.f37199b.o0();
                return;
            case 2:
                y60 y60Var2 = this.f37199b;
                y60Var2.n0(y60Var2.l0());
                return;
            case 3:
                y60 y60Var3 = this.f37199b;
                y60Var3.n0(y60Var3.l0());
                return;
            default:
                y60 y60Var4 = this.f37199b;
                y60Var4.U = null;
                y60Var4.W.b();
                y60Var4.h.b();
                y60Var4.k0();
                y60Var4.r0();
                y60Var4.s0();
                return;
        }
    }
}
