package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f33484a;
    public final nd f33485b;

    public fd(nd ndVar, int i10) {
        this.f33484a = i10;
        this.f33485b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f33484a) {
            case 0:
                nd.X(this.f33485b, view);
                return;
            case 1:
                nd ndVar = this.f33485b;
                org.telegram.ui.Components.x40 x40Var = ndVar.v;
                if (ndVar.f35964x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x40Var.o(z10, new ed(ndVar, 1), new t5(ndVar, 2), 0);
                ndVar.J.M(0);
                ndVar.J.P(43);
                ndVar.h.d();
                return;
            case 2:
                nd ndVar2 = this.f33485b;
                if (!ndVar2.f35947j0) {
                    ndVar2.f0();
                    return;
                } else if (ndVar2.f35935a0) {
                    ndVar2.f35935a0 = false;
                    ndVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                nd ndVar3 = this.f33485b;
                if (!ndVar3.f35935a0) {
                    ndVar3.f35935a0 = true;
                    ndVar3.h0();
                    return;
                }
                return;
        }
    }
}
