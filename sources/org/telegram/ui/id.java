package org.telegram.ui;

import android.view.View;
public final class id implements View.OnClickListener {
    public final int f38843a;
    public final qd f38844b;

    public id(qd qdVar, int i10) {
        this.f38843a = i10;
        this.f38844b = qdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f38843a) {
            case 0:
                qd.X(this.f38844b, view);
                return;
            case 1:
                qd qdVar = this.f38844b;
                org.telegram.ui.Components.p50 p50Var = qdVar.v;
                if (qdVar.f41305x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p50Var.n(z10, new hd(qdVar, 1), new u5(qdVar, 2), 0);
                qdVar.J.M(0);
                qdVar.J.P(43);
                qdVar.h.d();
                return;
            case 2:
                qd qdVar2 = this.f38844b;
                if (!qdVar2.f41288j0) {
                    qdVar2.f0();
                    return;
                } else if (qdVar2.f41275a0) {
                    qdVar2.f41275a0 = false;
                    qdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                qd qdVar3 = this.f38844b;
                if (!qdVar3.f41275a0) {
                    qdVar3.f41275a0 = true;
                    qdVar3.h0();
                    return;
                }
                return;
        }
    }
}
