package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c80 implements View.OnClickListener {
    public final int f25022a;
    public final j80 f25023b;

    public c80(j80 j80Var, int i10) {
        this.f25022a = i10;
        this.f25023b = j80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10;
        int i11 = this.f25022a;
        j80 j80Var = this.f25023b;
        switch (i11) {
            case 0:
                j80Var.f27261r.g();
                return;
            case 1:
                org.telegram.ui.ActionBar.k1 k1Var = j80Var.f27262s;
                if (k1Var != null) {
                    k1Var.d(true);
                }
                j80Var.f27261r.b();
                return;
            case 2:
                j80 j80Var2 = this.f25023b;
                String str = j80Var2.f27257b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = j80Var2.getContext();
                String L0 = org.telegram.messenger.cd.L0(2131749180, null);
                String str2 = j80Var2.f27257b;
                String str3 = j80Var2.J;
                if (str3 == null) {
                    if (j80Var2.H) {
                        if (z10) {
                            i10 = 2131746522;
                        } else {
                            i10 = 2131746523;
                        }
                    } else {
                        i10 = 2131746520;
                    }
                    str3 = org.telegram.messenger.cd.L0(i10, null);
                }
                g80 g80Var = new g80(j80Var2, context, L0, str2, str3);
                j80Var2.E = g80Var;
                g80Var.I0();
                j80Var2.E.show();
                org.telegram.ui.ActionBar.k1 k1Var2 = j80Var2.f27262s;
                if (k1Var2 != null) {
                    k1Var2.d(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k1 k1Var3 = j80Var.f27262s;
                if (k1Var3 != null) {
                    k1Var3.d(true);
                }
                org.telegram.ui.ActionBar.k2 k2Var = j80Var.f27258c;
                if (k2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
                    String L02 = org.telegram.messenger.cd.L0(2131746040, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L02;
                    x1Var.T = org.telegram.messenger.cd.L0(2131746043, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746041, null), new b80(j80Var, 1));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
