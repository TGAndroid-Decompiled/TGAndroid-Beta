package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h71;
import org.telegram.ui.hb0;
public final class h7 implements org.telegram.ui.ActionBar.z1 {
    public final int f35053a;
    public final h71 f35054b;
    public final Object f35055c;
    public final Object d;

    public h7(h71 h71Var, Object obj, Object obj2, int i10) {
        this.f35053a = i10;
        this.f35054b = h71Var;
        this.d = obj;
        this.f35055c = obj2;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f35053a) {
            case 0:
                n7 n7Var = (n7) this.f35054b;
                l0 l0Var = (l0) this.f35055c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f35187c.B();
                }
                if (n7Var.getParentLayout() != null && n7Var.getParentLayout().getFragmentStack().size() > 1) {
                    m2Var = (org.telegram.ui.ActionBar.m2) n7Var.getParentLayout().getFragmentStack().get(n7Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    m2Var = null;
                }
                s2.a(l0Var.f35185a, new ei.c(8), null, null, null, new ai.q0(5, l0Var, new b7(2, n7Var, m2Var)), false, true, new hb0((Object) null, 1));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f35055c;
                of.e g10 = a2Var.g(i10, true, true);
                g10.d();
                j7 j7Var = new j7((n7) this.f35054b, g10, 2);
                l0.E("disable backup: getting phrase...");
                l0Var2.x(new k((Object) l0Var2, (Object) j7Var, (Object) ((g0) this.d), 3), false, true);
                return;
            default:
                l8 l8Var = (l8) this.f35054b;
                hg.b1 b1Var = (hg.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.f35055c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -l8Var.f35243l0;
                    l8Var.f35243l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    return;
                }
                String trim = b1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                l8Var.f35233d0 = trim;
                l8Var.f35235e0 = !a2Var2.b();
                if (TextUtils.isEmpty(l8Var.f35233d0)) {
                    l8Var.M.setVisibility(8);
                } else {
                    l8Var.M.setText(l8Var.f35233d0);
                    l8Var.M.setVisibility(0);
                }
                l8Var.y0();
                a2Var.dismiss();
                l8Var.n0();
                return;
        }
    }

    public h7(n7 n7Var, l0 l0Var, g0 g0Var) {
        this.f35053a = 1;
        this.f35054b = n7Var;
        this.f35055c = l0Var;
        this.d = g0Var;
    }
}
