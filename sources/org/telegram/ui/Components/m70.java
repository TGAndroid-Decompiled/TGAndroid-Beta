package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m70 implements View.OnClickListener {
    public final int f37123a;
    public final t70 f37124b;

    public m70(t70 t70Var, int i7) {
        this.f37123a = i7;
        this.f37124b = t70Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7;
        int i10 = this.f37123a;
        t70 t70Var = this.f37124b;
        switch (i10) {
            case 0:
                t70Var.f39582r.f();
                return;
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = t70Var.f39583s;
                if (g1Var != null) {
                    g1Var.d(true);
                }
                t70Var.f39582r.d();
                return;
            case 2:
                t70 t70Var2 = this.f37124b;
                String str = t70Var2.f39577b;
                if (str != null && str.endsWith("?direct")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Context context = t70Var2.getContext();
                String M0 = org.telegram.messenger.hd.M0(2131749170, null);
                String str2 = t70Var2.f39577b;
                String str3 = t70Var2.K;
                if (str3 == null) {
                    if (t70Var2.I) {
                        if (z10) {
                            i7 = 2131746507;
                        } else {
                            i7 = 2131746508;
                        }
                    } else {
                        i7 = 2131746505;
                    }
                    str3 = org.telegram.messenger.hd.M0(i7, null);
                }
                q70 q70Var = new q70(t70Var2, context, M0, str2, str3);
                t70Var2.F = q70Var;
                q70Var.I0();
                t70Var2.F.show();
                org.telegram.ui.ActionBar.g1 g1Var2 = t70Var2.f39583s;
                if (g1Var2 != null) {
                    g1Var2.d(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g1 g1Var3 = t70Var.f39583s;
                if (g1Var3 != null) {
                    g1Var3.d(true);
                }
                org.telegram.ui.ActionBar.e2 e2Var = t70Var.f39578c;
                if (e2Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e2Var.getParentActivity());
                    String M02 = org.telegram.messenger.hd.M0(2131746023, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M02;
                    t1Var.U = org.telegram.messenger.hd.M0(2131746026, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746024, null), new l70(t70Var, 1));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                    }
                    alertDialog$Builder.p();
                    return;
                }
                return;
        }
    }
}
