package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f33616a;
    public final nd f33617b;

    public fd(nd ndVar, int i10) {
        this.f33616a = i10;
        this.f33617b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f33616a) {
            case 0:
                nd.X(this.f33617b, view);
                return;
            case 1:
                nd ndVar = this.f33617b;
                org.telegram.ui.Components.u40 u40Var = ndVar.v;
                if (ndVar.f36067x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u40Var.o(z10, new ed(ndVar, 1), new r5(ndVar, 2), 0);
                ndVar.J.M(0);
                ndVar.J.P(43);
                ndVar.h.d();
                return;
            case 2:
                nd ndVar2 = this.f33617b;
                if (!ndVar2.f36050j0) {
                    ndVar2.f0();
                    return;
                } else if (ndVar2.f36038a0) {
                    ndVar2.f36038a0 = false;
                    ndVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                nd ndVar3 = this.f33617b;
                if (!ndVar3.f36038a0) {
                    ndVar3.f36038a0 = true;
                    ndVar3.h0();
                    return;
                }
                return;
        }
    }
}
