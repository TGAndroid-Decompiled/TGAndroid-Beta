package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f36878a;
    public final md f36879b;

    public ed(md mdVar, int i10) {
        this.f36878a = i10;
        this.f36879b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f36878a) {
            case 0:
                md.X(this.f36879b, view);
                return;
            case 1:
                md mdVar = this.f36879b;
                org.telegram.ui.Components.c50 c50Var = mdVar.f39562w;
                if (mdVar.f39566y != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c50Var.n(z10, new cd(mdVar, 2), new v5(mdVar, 2), 0);
                mdVar.K.M(0);
                mdVar.K.P(43);
                mdVar.f39550n.d();
                return;
            case 2:
                md mdVar2 = this.f36879b;
                if (!mdVar2.f39548k0) {
                    mdVar2.g0();
                    return;
                } else if (mdVar2.f39537b0) {
                    mdVar2.f39537b0 = false;
                    mdVar2.i0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f36879b;
                if (!mdVar3.f39537b0) {
                    mdVar3.f39537b0 = true;
                    mdVar3.i0();
                    return;
                }
                return;
        }
    }
}
