package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f36270a;
    public final nd f36271b;

    public fd(nd ndVar, int i10) {
        this.f36270a = i10;
        this.f36271b = ndVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36270a) {
            case 0:
                nd.W(this.f36271b, view);
                return;
            case 1:
                nd ndVar = this.f36271b;
                org.telegram.ui.Components.y40 y40Var = ndVar.v;
                if (ndVar.f38930x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                y40Var.o(z10, new ed(ndVar, 1), new s5(ndVar, 2), 0);
                ndVar.J.M(0);
                ndVar.J.P(43);
                ndVar.h.d();
                return;
            case 2:
                nd ndVar2 = this.f36271b;
                if (!ndVar2.f38913j0) {
                    ndVar2.f0();
                    return;
                } else if (ndVar2.f38900a0) {
                    ndVar2.f38900a0 = false;
                    ndVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                nd ndVar3 = this.f36271b;
                if (!ndVar3.f38900a0) {
                    ndVar3.f38900a0 = true;
                    ndVar3.h0();
                    return;
                }
                return;
        }
    }
}
