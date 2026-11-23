package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class kl extends jg.s0 {
    public final int E = 0;
    public final org.telegram.messenger.gs F;

    public kl(ml mlVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var, z10, false);
        this.F = mlVar;
    }

    @Override
    public final void f() {
        int i7 = this.E;
        org.telegram.messenger.gs gsVar = this.F;
        switch (i7) {
            case 0:
                ml mlVar = (ml) gsVar;
                kl klVar = mlVar.O;
                org.telegram.ui.ActionBar.q0 q0Var = mlVar.f37530x;
                if (q0Var != null) {
                    q0Var.setShowSearchProgress(klVar.f17404w);
                }
                TextView textView = mlVar.f37528w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747972, klVar.h));
                }
                super.f();
                return;
            default:
                org.telegram.ui.qa0 qa0Var = (org.telegram.ui.qa0) gsVar;
                org.telegram.ui.ActionBar.g5 g5Var = qa0Var.f51109r;
                if (g5Var != null) {
                    g5Var.setShowSearchProgress(qa0Var.T.f17404w);
                }
                TextView textView2 = qa0Var.f51104n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131747972, qa0Var.T.h));
                }
                super.f();
                return;
        }
    }

    public kl(org.telegram.ui.qa0 qa0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var, false, z10);
        this.F = qa0Var;
    }
}
