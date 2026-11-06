package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class j70 implements View.OnClickListener {
    public final int f34898a;
    public final q70 f34899b;

    public j70(q70 q70Var, int i7) {
        this.f34898a = i7;
        this.f34899b = q70Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z9;
        int i7;
        int i10 = this.f34898a;
        q70 q70Var = this.f34899b;
        switch (i10) {
            case 0:
                q70Var.f37299r.f();
                return;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = q70Var.f37300s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                q70Var.f37299r.d();
                return;
            case 2:
                q70 q70Var2 = this.f34899b;
                String str = q70Var2.f37294b;
                if (str != null && str.endsWith("?direct")) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Context context = q70Var2.getContext();
                String M0 = org.telegram.messenger.hd.M0(2131749169, null);
                String str2 = q70Var2.f37294b;
                String str3 = q70Var2.J;
                if (str3 == null) {
                    if (q70Var2.H) {
                        if (z9) {
                            i7 = 2131746506;
                        } else {
                            i7 = 2131746507;
                        }
                    } else {
                        i7 = 2131746504;
                    }
                    str3 = org.telegram.messenger.hd.M0(i7, null);
                }
                n70 n70Var = new n70(q70Var2, context, M0, str2, str3);
                q70Var2.E = n70Var;
                n70Var.I0();
                q70Var2.E.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = q70Var2.f37300s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = q70Var.f37300s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.f2 f2Var = q70Var.f37295c;
                if (f2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                    String M02 = org.telegram.messenger.hd.M0(2131746024, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M02;
                    u1Var.T = org.telegram.messenger.hd.M0(2131746027, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746025, null), new i70(q70Var, 1));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
