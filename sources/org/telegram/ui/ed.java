package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f33329a;
    public final md f33330b;

    public ed(md mdVar, int i10) {
        this.f33329a = i10;
        this.f33330b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f33329a) {
            case 0:
                md.X(this.f33330b, view);
                return;
            case 1:
                md mdVar = this.f33330b;
                org.telegram.ui.Components.u40 u40Var = mdVar.v;
                if (mdVar.f35710x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u40Var.o(z10, new dd(mdVar, 1), new r5(mdVar, 2), 0);
                mdVar.J.M(0);
                mdVar.J.P(43);
                mdVar.h.d();
                return;
            case 2:
                md mdVar2 = this.f33330b;
                if (!mdVar2.f35693j0) {
                    mdVar2.f0();
                    return;
                } else if (mdVar2.f35681a0) {
                    mdVar2.f35681a0 = false;
                    mdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f33330b;
                if (!mdVar3.f35681a0) {
                    mdVar3.f35681a0 = true;
                    mdVar3.h0();
                    return;
                }
                return;
        }
    }
}
