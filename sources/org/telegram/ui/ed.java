package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f36922a;
    public final md f36923b;

    public ed(md mdVar, int i10) {
        this.f36922a = i10;
        this.f36923b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36922a) {
            case 0:
                md.X(this.f36923b, view);
                return;
            case 1:
                md mdVar = this.f36923b;
                org.telegram.ui.Components.e50 e50Var = mdVar.f39502w;
                if (mdVar.f39506y != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e50Var.n(z10, new cd(mdVar, 2), new v5(mdVar, 2), 0);
                mdVar.K.M(0);
                mdVar.K.P(43);
                mdVar.f39490n.d();
                return;
            case 2:
                md mdVar2 = this.f36923b;
                if (!mdVar2.f39488k0) {
                    mdVar2.g0();
                    return;
                } else if (mdVar2.f39477b0) {
                    mdVar2.f39477b0 = false;
                    mdVar2.i0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f36923b;
                if (!mdVar3.f39477b0) {
                    mdVar3.f39477b0 = true;
                    mdVar3.i0();
                    return;
                }
                return;
        }
    }
}
