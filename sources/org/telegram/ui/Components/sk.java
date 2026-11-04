package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
public final class sk extends kg.p0 {
    public final int E = 0;
    public final org.telegram.messenger.cs F;

    public sk(uk ukVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
        this.F = ukVar;
    }

    @Override
    public final void f() {
        int i3 = this.E;
        org.telegram.messenger.cs csVar = this.F;
        switch (i3) {
            case 0:
                uk ukVar = (uk) csVar;
                sk skVar = ukVar.O;
                org.telegram.ui.ActionBar.q0 q0Var = ukVar.f38806x;
                if (q0Var != null) {
                    q0Var.setShowSearchProgress(skVar.f16937w);
                }
                TextView textView = ukVar.f38804w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.bd.a0(null, null, 2131748173, skVar.h));
                }
                super.f();
                return;
            default:
                org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) csVar;
                org.telegram.ui.ActionBar.f5 f5Var = la0Var.f47261r;
                if (f5Var != null) {
                    f5Var.setShowSearchProgress(la0Var.T.f16937w);
                }
                TextView textView2 = la0Var.f47256n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.bd.a0(null, null, 2131748173, la0Var.T.h));
                }
                super.f();
                return;
        }
    }

    public sk(org.telegram.ui.la0 la0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.F = la0Var;
    }
}
