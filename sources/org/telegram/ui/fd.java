package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f33620a;
    public final nd f33621b;

    public fd(nd ndVar, int i10) {
        this.f33620a = i10;
        this.f33621b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f33620a) {
            case 0:
                nd.X(this.f33621b, view);
                return;
            case 1:
                nd ndVar = this.f33621b;
                org.telegram.ui.Components.u40 u40Var = ndVar.v;
                if (ndVar.f36072x != null) {
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
                nd ndVar2 = this.f33621b;
                if (!ndVar2.f36055j0) {
                    ndVar2.f0();
                    return;
                } else if (ndVar2.f36043a0) {
                    ndVar2.f36043a0 = false;
                    ndVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                nd ndVar3 = this.f33621b;
                if (!ndVar3.f36043a0) {
                    ndVar3.f36043a0 = true;
                    ndVar3.h0();
                    return;
                }
                return;
        }
    }
}
