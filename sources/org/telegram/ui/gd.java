package org.telegram.ui;

import android.view.View;
public final class gd implements View.OnClickListener {
    public final int f37152a;
    public final od f37153b;

    public gd(od odVar, int i10) {
        this.f37152a = i10;
        this.f37153b = odVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f37152a) {
            case 0:
                od.X(this.f37153b, view);
                return;
            case 1:
                od odVar = this.f37153b;
                org.telegram.ui.Components.e50 e50Var = odVar.v;
                if (odVar.f39753x != null) {
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
                od odVar2 = this.f37153b;
                if (!odVar2.f39736j0) {
                    odVar2.f0();
                    return;
                } else if (odVar2.f39724a0) {
                    odVar2.f39724a0 = false;
                    odVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                od odVar3 = this.f37153b;
                if (!odVar3.f39724a0) {
                    odVar3.f39724a0 = true;
                    odVar3.h0();
                    return;
                }
                return;
        }
    }
}
