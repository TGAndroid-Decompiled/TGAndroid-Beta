package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a70 implements View.OnClickListener {
    public final int f34061a;
    public final j70 f34062b;

    public a70(j70 j70Var, int i10) {
        this.f34061a = i10;
        this.f34062b = j70Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34061a) {
            case 0:
                j70 j70Var = this.f34062b;
                j70Var.f37277f.f27815r.clearFocus();
                j70Var.f37277f.f27815r.requestFocus();
                AndroidUtilities.showKeyboard(j70Var.f37277f.f27815r);
                return;
            case 1:
                this.f34062b.o0();
                return;
            case 2:
                j70 j70Var2 = this.f34062b;
                j70Var2.n0(j70Var2.l0());
                return;
            case 3:
                j70 j70Var3 = this.f34062b;
                j70Var3.n0(j70Var3.l0());
                return;
            default:
                j70 j70Var4 = this.f34062b;
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
