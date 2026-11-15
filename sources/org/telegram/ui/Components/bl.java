package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class bl extends jg.s0 {
    public final int E = 0;
    public final org.telegram.messenger.is F;

    public bl(dl dlVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
        this.F = dlVar;
    }

    @Override
    public final void f() {
        int i7 = this.E;
        org.telegram.messenger.is isVar = this.F;
        switch (i7) {
            case 0:
                dl dlVar = (dl) isVar;
                bl blVar = dlVar.O;
                org.telegram.ui.ActionBar.q0 q0Var = dlVar.f34000x;
                if (q0Var != null) {
                    q0Var.setShowSearchProgress(blVar.f17027w);
                }
                TextView textView = dlVar.f33998w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748165, blVar.h));
                }
                super.f();
                return;
            default:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) isVar;
                org.telegram.ui.ActionBar.d5 d5Var = pa0Var.f50214r;
                if (d5Var != null) {
                    d5Var.setShowSearchProgress(pa0Var.T.f17027w);
                }
                TextView textView2 = pa0Var.f50209n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131748165, pa0Var.T.h));
                }
                super.f();
                return;
        }
    }

    public bl(org.telegram.ui.pa0 pa0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.F = pa0Var;
    }
}
