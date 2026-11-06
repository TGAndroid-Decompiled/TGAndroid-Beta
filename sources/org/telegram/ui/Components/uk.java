package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class uk extends jg.s0 {
    public final int D = 0;
    public final org.telegram.messenger.ls E;

    public uk(wk wkVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, z9, false);
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
                org.telegram.ui.ActionBar.r0 r0Var = wkVar.f40021x;
                if (r0Var != null) {
                    r0Var.setShowSearchProgress(ukVar.f16675w);
                }
                TextView textView = wkVar.f40019w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748164, ukVar.h));
                }
                super.f();
                return;
            default:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) lsVar;
                org.telegram.ui.ActionBar.f5 f5Var = pa0Var.f48750r;
                if (f5Var != null) {
                    f5Var.setShowSearchProgress(pa0Var.S.f16675w);
                }
                TextView textView2 = pa0Var.f48745n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131748164, pa0Var.S.h));
                }
                super.f();
                return;
        }
    }

    public uk(org.telegram.ui.pa0 pa0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, false, z9);
        this.E = pa0Var;
    }
}
