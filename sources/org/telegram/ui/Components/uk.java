package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class uk extends jg.s0 {
    public final int D = 0;
    public final org.telegram.messenger.ls E;

    public uk(wk wkVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context, g6Var, z9, false);
        this.E = wkVar;
    }

    @Override
    public final void f() {
        int i7 = this.D;
        org.telegram.messenger.ls lsVar = this.E;
        switch (i7) {
            case 0:
                wk wkVar = (wk) lsVar;
                uk ukVar = wkVar.N;
                org.telegram.ui.ActionBar.r0 r0Var = wkVar.f40091x;
                if (r0Var != null) {
                    r0Var.setShowSearchProgress(ukVar.f16678w);
                }
                TextView textView = wkVar.f40089w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131748165, ukVar.h));
                }
                super.f();
                return;
            default:
                org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) lsVar;
                org.telegram.ui.ActionBar.f5 f5Var = ra0Var.f49380r;
                if (f5Var != null) {
                    f5Var.setShowSearchProgress(ra0Var.S.f16678w);
                }
                TextView textView2 = ra0Var.f49375n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.id.a0(null, null, 2131748165, ra0Var.S.h));
                }
                super.f();
                return;
        }
    }

    public uk(org.telegram.ui.ra0 ra0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context, g6Var, false, z9);
        this.E = ra0Var;
    }
}
