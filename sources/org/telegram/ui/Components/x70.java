package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x70 implements View.OnClickListener {
    public final int f41928a;
    public final e80 f41929b;

    public x70(e80 e80Var, int i7) {
        this.f41928a = i7;
        this.f41929b = e80Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        int i10 = this.f41928a;
        e80 e80Var = this.f41929b;
        switch (i10) {
            case 0:
                e80Var.f34645r.f();
                return;
            case 1:
                org.telegram.ui.ActionBar.h1 h1Var = e80Var.f34646s;
                if (h1Var != null) {
                    h1Var.d(true);
                }
                e80Var.f34645r.d();
                return;
            case 2:
                e80 e80Var2 = this.f41929b;
                String str = e80Var2.f34640b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = e80Var2.getContext();
                String M0 = org.telegram.messenger.gd.M0(2131748978, null);
                String str2 = e80Var2.f34640b;
                String str3 = e80Var2.K;
                if (str3 == null) {
                    if (e80Var2.I) {
                        if (z10) {
                            i7 = 2131746312;
                        } else {
                            i7 = 2131746313;
                        }
                    } else {
                        i7 = 2131746310;
                    }
                    str3 = org.telegram.messenger.gd.M0(i7, null);
                }
                b80 b80Var = new b80(e80Var2, context, M0, str2, str3);
                e80Var2.F = b80Var;
                b80Var.J0();
                e80Var2.F.show();
                org.telegram.ui.ActionBar.h1 h1Var2 = e80Var2.f34646s;
                if (h1Var2 != null) {
                    h1Var2.d(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.h1 h1Var3 = e80Var.f34646s;
                if (h1Var3 != null) {
                    h1Var3.d(true);
                }
                org.telegram.ui.ActionBar.h2 h2Var = e80Var.f34641c;
                if (h2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getParentActivity());
                    String M02 = org.telegram.messenger.gd.M0(2131745828, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M02;
                    u1Var.U = org.telegram.messenger.gd.M0(2131745831, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745829, null), new w70(e80Var, 1));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
