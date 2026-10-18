package org.telegram.ui;

import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f37187a;
    public final od f37188b;

    public gd(od odVar, int i10) {
        this.f37187a = i10;
        this.f37188b = odVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f37187a) {
            case 0:
                od.X(this.f37188b, view);
                return;
            case 1:
                od odVar = this.f37188b;
                org.telegram.ui.Components.e50 e50Var = odVar.v;
                if (odVar.f39761x != null) {
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
                od odVar2 = this.f37188b;
                if (!odVar2.f39744j0) {
                    odVar2.f0();
                    return;
                } else if (odVar2.f39732a0) {
                    odVar2.f39732a0 = false;
                    odVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                od odVar3 = this.f37188b;
                if (!odVar3.f39732a0) {
                    odVar3.f39732a0 = true;
                    odVar3.h0();
                    return;
                }
                return;
        }
    }
}
