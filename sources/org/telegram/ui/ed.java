package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f36026a;
    public final md f36027b;

    public ed(md mdVar, int i10) {
        this.f36026a = i10;
        this.f36027b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36026a) {
            case 0:
                md.X(this.f36027b, view);
                return;
            case 1:
                md mdVar = this.f36027b;
                org.telegram.ui.Components.u40 u40Var = mdVar.v;
                if (mdVar.f38692x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u40Var.o(z10, new dd(mdVar, 1), new r5(mdVar, 2), 0);
                mdVar.J.K(0);
                mdVar.J.N(43);
                mdVar.h.d();
                return;
            case 2:
                md mdVar2 = this.f36027b;
                if (!mdVar2.f38675j0) {
                    mdVar2.f0();
                    return;
                } else if (mdVar2.f38662a0) {
                    mdVar2.f38662a0 = false;
                    mdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f36027b;
                if (!mdVar3.f38662a0) {
                    mdVar3.f38662a0 = true;
                    mdVar3.h0();
                    return;
                }
                return;
        }
    }
}
