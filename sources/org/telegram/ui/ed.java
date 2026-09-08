package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f36025a;
    public final md f36026b;

    public ed(md mdVar, int i10) {
        this.f36025a = i10;
        this.f36026b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36025a) {
            case 0:
                md.X(this.f36026b, view);
                return;
            case 1:
                md mdVar = this.f36026b;
                org.telegram.ui.Components.u40 u40Var = mdVar.v;
                if (mdVar.f38691x != null) {
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
                md mdVar2 = this.f36026b;
                if (!mdVar2.f38674j0) {
                    mdVar2.f0();
                    return;
                } else if (mdVar2.f38661a0) {
                    mdVar2.f38661a0 = false;
                    mdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f36026b;
                if (!mdVar3.f38661a0) {
                    mdVar3.f38661a0 = true;
                    mdVar3.h0();
                    return;
                }
                return;
        }
    }
}
