package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f70 implements View.OnClickListener {
    public final int f33757a;
    public final m70 f33758b;

    public f70(m70 m70Var, int i3) {
        this.f33757a = i3;
        this.f33758b = m70Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i3;
        int i10 = this.f33757a;
        m70 m70Var = this.f33758b;
        switch (i10) {
            case 0:
                m70Var.f36061r.h();
                return;
            case 1:
                org.telegram.ui.ActionBar.f1 f1Var = m70Var.f36062s;
                if (f1Var != null) {
                    f1Var.d(true);
                }
                m70Var.f36061r.b();
                return;
            case 2:
                m70 m70Var2 = this.f33758b;
                String str = m70Var2.f36056b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = m70Var2.getContext();
                String M0 = org.telegram.messenger.bd.M0(2131749178, null);
                String str2 = m70Var2.f36056b;
                String str3 = m70Var2.K;
                if (str3 == null) {
                    if (m70Var2.I) {
                        if (z10) {
                            i3 = 2131746515;
                        } else {
                            i3 = 2131746516;
                        }
                    } else {
                        i3 = 2131746513;
                    }
                    str3 = org.telegram.messenger.bd.M0(i3, null);
                }
                j70 j70Var = new j70(m70Var2, context, M0, str2, str3);
                m70Var2.F = j70Var;
                j70Var.I0();
                m70Var2.F.show();
                org.telegram.ui.ActionBar.f1 f1Var2 = m70Var2.f36062s;
                if (f1Var2 != null) {
                    f1Var2.d(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var3 = m70Var.f36062s;
                if (f1Var3 != null) {
                    f1Var3.d(true);
                }
                org.telegram.ui.ActionBar.d2 d2Var = m70Var.f36057c;
                if (d2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d2Var.getParentActivity());
                    String M02 = org.telegram.messenger.bd.M0(2131746033, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M02;
                    s1Var.U = org.telegram.messenger.bd.M0(2131746036, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new e70(m70Var, 1));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
