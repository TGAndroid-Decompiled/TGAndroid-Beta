package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f34218a;
    public final nd f34219b;

    public fd(nd ndVar, int i10) {
        this.f34218a = i10;
        this.f34219b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        switch (this.f34218a) {
            case 0:
                nd.X(this.f34219b, view);
                return;
            case 1:
                nd ndVar = this.f34219b;
                org.telegram.ui.Components.w40 w40Var = ndVar.v;
                if (ndVar.f36603x != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                w40Var.o(z4, new ed(ndVar, 1), new v5(ndVar, 2), 0);
                ndVar.G.K(0);
                ndVar.G.N(43);
                ndVar.h.d();
                return;
            case 2:
                nd ndVar2 = this.f34219b;
                if (!ndVar2.f36586g0) {
                    ndVar2.f0();
                    return;
                } else if (ndVar2.X) {
                    ndVar2.X = false;
                    ndVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                nd ndVar3 = this.f34219b;
                if (!ndVar3.X) {
                    ndVar3.X = true;
                    ndVar3.h0();
                    return;
                }
                return;
        }
    }
}
