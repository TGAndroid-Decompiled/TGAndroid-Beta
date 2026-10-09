package org.telegram.ui;

import android.view.View;
public final class ed implements View.OnClickListener {
    public final int f37229a;
    public final md f37230b;

    public ed(md mdVar, int i10) {
        this.f37229a = i10;
        this.f37230b = mdVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        switch (this.f37229a) {
            case 0:
                md.X(this.f37230b, view);
                return;
            case 1:
                md mdVar = this.f37230b;
                org.telegram.ui.Components.m50 m50Var = mdVar.v;
                if (mdVar.f39867x != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m50Var.n(z10, new dd(mdVar, 1), new r5(mdVar, 2), 0);
                mdVar.J.M(0);
                mdVar.J.P(43);
                mdVar.h.d();
                return;
            case 2:
                md mdVar2 = this.f37230b;
                if (!mdVar2.f39850j0) {
                    mdVar2.f0();
                    return;
                } else if (mdVar2.f39837a0) {
                    mdVar2.f39837a0 = false;
                    mdVar2.h0();
                    return;
                } else {
                    return;
                }
            default:
                md mdVar3 = this.f37230b;
                if (!mdVar3.f39837a0) {
                    mdVar3.f39837a0 = true;
                    mdVar3.h0();
                    return;
                }
                return;
        }
    }
}
