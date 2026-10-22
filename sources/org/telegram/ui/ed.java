package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f36636a;
    public final md f36637b;

    public ed(md mdVar, int i10) {
        this.f36636a = i10;
        this.f36637b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36636a) {
            case 0:
                md.X(this.f36637b, view);
                return;
            case 1:
                md mdVar = this.f36637b;
                org.telegram.ui.Components.e50 e50Var = mdVar.v;
                if (mdVar.f39211x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e50Var.n(z10, new dd(mdVar, 1), new w5(mdVar, 2), 0);
                mdVar.J.M(0);
                mdVar.J.P(43);
                mdVar.h.d();
                return;
            case 2:
                md mdVar2 = this.f36637b;
                if (!mdVar2.f39194j0) {
                    mdVar2.f0();
                    return;
                } else if (mdVar2.f39182a0) {
                    mdVar2.f39182a0 = false;
                    mdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f36637b;
                if (!mdVar3.f39182a0) {
                    mdVar3.f39182a0 = true;
                    mdVar3.h0();
                    return;
                }
                return;
        }
    }
}
