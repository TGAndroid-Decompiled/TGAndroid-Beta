package org.telegram.ui;

import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f37217a;
    public final od f37218b;

    public gd(od odVar, int i10) {
        this.f37217a = i10;
        this.f37218b = odVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f37217a) {
            case 0:
                od.X(this.f37218b, view);
                return;
            case 1:
                od odVar = this.f37218b;
                org.telegram.ui.Components.e50 e50Var = odVar.v;
                if (odVar.f39740x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e50Var.n(z10, new fd(odVar, 1), new w5(odVar, 2), 0);
                odVar.J.M(0);
                odVar.J.P(43);
                odVar.h.d();
                return;
            case 2:
                od odVar2 = this.f37218b;
                if (!odVar2.f39723j0) {
                    odVar2.f0();
                    return;
                } else if (odVar2.f39711a0) {
                    odVar2.f39711a0 = false;
                    odVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                od odVar3 = this.f37218b;
                if (!odVar3.f39711a0) {
                    odVar3.f39711a0 = true;
                    odVar3.h0();
                    return;
                }
                return;
        }
    }
}
