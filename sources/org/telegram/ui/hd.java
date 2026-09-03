package org.telegram.ui;

import android.view.View;
public final class hd implements View.OnClickListener {
    public final int f34644a;
    public final pd f34645b;

    public hd(pd pdVar, int i10) {
        this.f34644a = i10;
        this.f34645b = pdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        switch (this.f34644a) {
            case 0:
                pd.X(this.f34645b, view);
                return;
            case 1:
                pd pdVar = this.f34645b;
                org.telegram.ui.Components.x40 x40Var = pdVar.v;
                if (pdVar.f37102x != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                x40Var.o(z4, new gd(pdVar, 1), new x5(pdVar, 2), 0);
                pdVar.G.K(0);
                pdVar.G.N(43);
                pdVar.h.d();
                return;
            case 2:
                pd pdVar2 = this.f34645b;
                if (!pdVar2.f37085g0) {
                    pdVar2.f0();
                    return;
                } else if (pdVar2.X) {
                    pdVar2.X = false;
                    pdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                pd pdVar3 = this.f34645b;
                if (!pdVar3.X) {
                    pdVar3.X = true;
                    pdVar3.h0();
                    return;
                }
                return;
        }
    }
}
