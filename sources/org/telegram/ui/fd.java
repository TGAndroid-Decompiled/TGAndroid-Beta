package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f36852a;
    public final nd f36853b;

    public fd(nd ndVar, int i10) {
        this.f36852a = i10;
        this.f36853b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        switch (this.f36852a) {
            case 0:
                nd.X(this.f36853b, view);
                return;
            case 1:
                nd ndVar = this.f36853b;
                org.telegram.ui.Components.y40 y40Var = ndVar.v;
                if (ndVar.f39411x != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                y40Var.o(z4, new ed(ndVar, 1), new v5(ndVar, 2), 0);
                ndVar.G.K(0);
                ndVar.G.N(43);
                ndVar.h.d();
                return;
            case 2:
                nd ndVar2 = this.f36853b;
                if (!ndVar2.f39394g0) {
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
                nd ndVar3 = this.f36853b;
                if (!ndVar3.X) {
                    ndVar3.X = true;
                    ndVar3.h0();
                    return;
                }
                return;
        }
    }
}
