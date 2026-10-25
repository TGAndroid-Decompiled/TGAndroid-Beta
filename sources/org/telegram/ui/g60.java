package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g60 implements View.OnClickListener {
    public final int f39554a;
    public final r60 f39555b;

    public g60(r60 r60Var, int i10) {
        this.f39554a = i10;
        this.f39555b = r60Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39554a) {
            case 0:
                r60 r60Var = this.f39555b;
                r60Var.X = null;
                r60Var.Z.b();
                r60Var.h.b();
                r60Var.l0();
                r60Var.s0();
                r60Var.t0();
                return;
            case 1:
                r60 r60Var2 = this.f39555b;
                r60Var2.f43017f.f30365r.clearFocus();
                r60Var2.f43017f.f30365r.requestFocus();
                AndroidUtilities.showKeyboard(r60Var2.f43017f.f30365r);
                return;
            case 2:
                this.f39555b.p0();
                return;
            case 3:
                r60 r60Var3 = this.f39555b;
                r60Var3.o0(r60Var3.m0());
                return;
            default:
                r60 r60Var4 = this.f39555b;
                r60Var4.o0(r60Var4.m0());
                return;
        }
    }
}
