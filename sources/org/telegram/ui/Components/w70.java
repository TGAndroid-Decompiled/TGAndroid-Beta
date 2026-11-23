package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w70 implements View.OnClickListener {
    public final int f41522a;
    public final d80 f41523b;

    public w70(d80 d80Var, int i7) {
        this.f41522a = i7;
        this.f41523b = d80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        int i10 = this.f41522a;
        d80 d80Var = this.f41523b;
        switch (i10) {
            case 0:
                d80Var.f34240r.g();
                return;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = d80Var.f34241s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                d80Var.f34240r.d();
                return;
            case 2:
                d80 d80Var2 = this.f41523b;
                String str = d80Var2.f34235b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = d80Var2.getContext();
                String N0 = org.telegram.messenger.gd.N0(2131748977, null);
                String str2 = d80Var2.f34235b;
                String str3 = d80Var2.K;
                if (str3 == null) {
                    if (d80Var2.I) {
                        if (z10) {
                            i7 = 2131746311;
                        } else {
                            i7 = 2131746312;
                        }
                    } else {
                        i7 = 2131746309;
                    }
                    str3 = org.telegram.messenger.gd.N0(i7, null);
                }
                a80 a80Var = new a80(d80Var2, context, N0, str2, str3);
                d80Var2.F = a80Var;
                a80Var.J0();
                d80Var2.F.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = d80Var2.f34241s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = d80Var.f34241s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.g2 g2Var = d80Var.f34236c;
                if (g2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
                    String N02 = org.telegram.messenger.gd.N0(2131745827, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N02;
                    t1Var.U = org.telegram.messenger.gd.N0(2131745830, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745828, null), new v70(d80Var, 1));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
