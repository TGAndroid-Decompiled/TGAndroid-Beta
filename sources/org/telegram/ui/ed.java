package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f37275a;
    public final md f37276b;

    public ed(md mdVar, int i10) {
        this.f37275a = i10;
        this.f37276b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f37275a) {
            case 0:
                md.X(this.f37276b, view);
                return;
            case 1:
                md mdVar = this.f37276b;
                org.telegram.ui.Components.n50 n50Var = mdVar.v;
                if (mdVar.f39913x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n50Var.n(z10, new dd(mdVar, 1), new r5(mdVar, 2), 0);
                mdVar.J.M(0);
                mdVar.J.P(43);
                mdVar.h.d();
                return;
            case 2:
                md mdVar2 = this.f37276b;
                if (!mdVar2.f39896j0) {
                    mdVar2.f0();
                    return;
                } else if (mdVar2.f39883a0) {
                    mdVar2.f39883a0 = false;
                    mdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f37276b;
                if (!mdVar3.f39883a0) {
                    mdVar3.f39883a0 = true;
                    mdVar3.h0();
                    return;
                }
                return;
        }
    }
}
