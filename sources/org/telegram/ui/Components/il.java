package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class il extends jg.s0 {
    public final int E = 0;
    public final org.telegram.messenger.fs F;

    public il(kl klVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, z10, false);
        this.F = klVar;
    }

    @Override
    public final void f() {
        int i7 = this.E;
        org.telegram.messenger.fs fsVar = this.F;
        switch (i7) {
            case 0:
                kl klVar = (kl) fsVar;
                il ilVar = klVar.O;
                org.telegram.ui.ActionBar.q0 q0Var = klVar.f36798x;
                if (q0Var != null) {
                    q0Var.setShowSearchProgress(ilVar.f17506w);
                }
                TextView textView = klVar.f36796w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.gd.a0(null, null, 2131747972, ilVar.h));
                }
                super.f();
                return;
            default:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) fsVar;
                org.telegram.ui.ActionBar.g5 g5Var = pa0Var.f50940r;
                if (g5Var != null) {
                    g5Var.setShowSearchProgress(pa0Var.T.f17506w);
                }
                TextView textView2 = pa0Var.f50935n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.gd.a0(null, null, 2131747972, pa0Var.T.h));
                }
                super.f();
                return;
        }
    }

    public il(org.telegram.ui.pa0 pa0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, false, z10);
        this.F = pa0Var;
    }
}
