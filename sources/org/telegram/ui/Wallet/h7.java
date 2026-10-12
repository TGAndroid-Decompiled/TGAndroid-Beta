package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k71;
import org.telegram.ui.jb0;
public final class h7 implements org.telegram.ui.ActionBar.z1 {
    public final int f34864a;
    public final k71 f34865b;
    public final Object f34866c;
    public final Object d;

    public h7(k71 k71Var, Object obj, Object obj2, int i10) {
        this.f34864a = i10;
        this.f34865b = k71Var;
        this.d = obj;
        this.f34866c = obj2;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f34864a) {
            case 0:
                n7 n7Var = (n7) this.f34865b;
                l0 l0Var = (l0) this.f34866c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f34998c.B();
                }
                if (n7Var.getParentLayout() != null && n7Var.getParentLayout().getFragmentStack().size() > 1) {
                    m2Var = (org.telegram.ui.ActionBar.m2) n7Var.getParentLayout().getFragmentStack().get(n7Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    m2Var = null;
                }
                s2.a(l0Var.f34996a, new ei.c(8), null, null, null, new ai.q0(5, l0Var, new b7(2, n7Var, m2Var)), false, true, new jb0((Object) null, 1));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f34866c;
                of.e g10 = a2Var.g(i10, true, true);
                g10.d();
                j7 j7Var = new j7((n7) this.f34865b, g10, 2);
                l0.E("disable backup: getting phrase...");
                l0Var2.x(new j((Object) l0Var2, (Object) j7Var, (Object) ((g0) this.d), 3), false, true);
                return;
            default:
                l8 l8Var = (l8) this.f34865b;
                hg.b1 b1Var = (hg.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.f34866c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -l8Var.f35054l0;
                    l8Var.f35054l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    return;
                }
                String trim = b1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                l8Var.f35044d0 = trim;
                l8Var.f35046e0 = !a2Var2.b();
                if (TextUtils.isEmpty(l8Var.f35044d0)) {
                    l8Var.M.setVisibility(8);
                } else {
                    l8Var.M.setText(l8Var.f35044d0);
                    l8Var.M.setVisibility(0);
                }
                l8Var.y0();
                a2Var.dismiss();
                l8Var.n0();
                return;
        }
    }

    public h7(n7 n7Var, l0 l0Var, g0 g0Var) {
        this.f34864a = 1;
        this.f34865b = n7Var;
        this.f34866c = l0Var;
        this.d = g0Var;
    }
}
