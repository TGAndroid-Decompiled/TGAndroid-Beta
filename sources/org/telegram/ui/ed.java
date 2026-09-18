package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f33259a;
    public final md f33260b;

    public ed(md mdVar, int i10) {
        this.f33259a = i10;
        this.f33260b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f33259a) {
            case 0:
                md.X(this.f33260b, view);
                return;
            case 1:
                md mdVar = this.f33260b;
                org.telegram.ui.Components.u40 u40Var = mdVar.v;
                if (mdVar.f35633x != null) {
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
                md mdVar2 = this.f33260b;
                if (!mdVar2.f35616j0) {
                    mdVar2.f0();
                    return;
                } else if (mdVar2.f35604a0) {
                    mdVar2.f35604a0 = false;
                    mdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f33260b;
                if (!mdVar3.f35604a0) {
                    mdVar3.f35604a0 = true;
                    mdVar3.h0();
                    return;
                }
                return;
        }
    }
}
