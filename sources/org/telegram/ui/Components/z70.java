package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z70 implements View.OnClickListener {
    public final int f42694a;
    public final g80 f42695b;

    public z70(g80 g80Var, int i7) {
        this.f42694a = i7;
        this.f42695b = g80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        int i10 = this.f42694a;
        g80 g80Var = this.f42695b;
        switch (i10) {
            case 0:
                g80Var.f35473r.f();
                return;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = g80Var.f35474s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                g80Var.f35473r.d();
                return;
            case 2:
                g80 g80Var2 = this.f42695b;
                String str = g80Var2.f35468b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = g80Var2.getContext();
                String N0 = org.telegram.messenger.hd.N0(2131748977, null);
                String str2 = g80Var2.f35468b;
                String str3 = g80Var2.K;
                if (str3 == null) {
                    if (g80Var2.I) {
                        if (z10) {
                            i7 = 2131746311;
                        } else {
                            i7 = 2131746312;
                        }
                    } else {
                        i7 = 2131746309;
                    }
                    str3 = org.telegram.messenger.hd.N0(i7, null);
                }
                d80 d80Var = new d80(g80Var2, context, N0, str2, str3);
                g80Var2.F = d80Var;
                d80Var.J0();
                g80Var2.F.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = g80Var2.f35474s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = g80Var.f35474s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.g2 g2Var = g80Var.f35469c;
                if (g2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getParentActivity());
                    String N02 = org.telegram.messenger.hd.N0(2131745827, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = N02;
                    t1Var.U = org.telegram.messenger.hd.N0(2131745830, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745828, null), new y70(g80Var, 1));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
