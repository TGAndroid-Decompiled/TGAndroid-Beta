package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k70 implements View.OnClickListener {
    public final int f35267a;
    public final r70 f35268b;

    public k70(r70 r70Var, int i7) {
        this.f35267a = i7;
        this.f35268b = r70Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7;
        int i10 = this.f35267a;
        r70 r70Var = this.f35268b;
        switch (i10) {
            case 0:
                r70Var.f37570r.f();
                return;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = r70Var.f37571s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                r70Var.f37570r.d();
                return;
            case 2:
                r70 r70Var2 = this.f35268b;
                String str = r70Var2.f37565b;
                if (str != null && str.endsWith("?direct")) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Context context = r70Var2.getContext();
                String M0 = org.telegram.messenger.id.M0(2131749170, null);
                String str2 = r70Var2.f37565b;
                String str3 = r70Var2.J;
                if (str3 == null) {
                    if (r70Var2.H) {
                        if (z9) {
                            i7 = 2131746507;
                        } else {
                            i7 = 2131746508;
                        }
                    } else {
                        i7 = 2131746505;
                    }
                    str3 = org.telegram.messenger.id.M0(i7, null);
                }
                o70 o70Var = new o70(r70Var2, context, M0, str2, str3);
                r70Var2.E = o70Var;
                o70Var.I0();
                r70Var2.E.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = r70Var2.f37571s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = r70Var.f37571s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.f2 f2Var = r70Var.f37566c;
                if (f2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                    String M02 = org.telegram.messenger.id.M0(2131746023, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M02;
                    u1Var.T = org.telegram.messenger.id.M0(2131746026, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new j70(r70Var, 1));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
