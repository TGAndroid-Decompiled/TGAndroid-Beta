package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f71;
import org.telegram.ui.ib0;
public final class f7 implements org.telegram.ui.ActionBar.a2 {
    public final int f34932a;
    public final f71 f34933b;
    public final Object f34934c;
    public final Object d;

    public f7(f71 f71Var, Object obj, Object obj2, int i10) {
        this.f34932a = i10;
        this.f34933b = f71Var;
        this.d = obj;
        this.f34934c = obj2;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f34932a) {
            case 0:
                l7 l7Var = (l7) this.f34933b;
                k0 k0Var = (k0) this.f34934c;
                if (!((Boolean) this.d).booleanValue()) {
                    k0Var.f35119c.B();
                }
                if (l7Var.getParentLayout() != null && l7Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) l7Var.getParentLayout().getFragmentStack().get(l7Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    n2Var = null;
                }
                q2.a(k0Var.f35117a, new ei.c(8), null, null, null, new ai.q0(5, k0Var, new z6(2, l7Var, n2Var)), false, true, new ib0((Object) null, 1));
                return;
            case 1:
                k0 k0Var2 = (k0) this.f34934c;
                of.e g10 = b2Var.g(i10, true, true);
                g10.d();
                h7 h7Var = new h7((l7) this.f34933b, g10, 2);
                k0.E("disable backup: getting phrase...");
                k0Var2.x(new i((Object) k0Var2, (Object) h7Var, (Object) ((f0) this.d), 3), false, true);
                return;
            default:
                j8 j8Var = (j8) this.f34933b;
                hg.b1 b1Var = (hg.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f34934c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -j8Var.f35102l0;
                    j8Var.f35102l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    return;
                }
                String trim = b1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                j8Var.f35092d0 = trim;
                j8Var.f35094e0 = !a2Var.b();
                if (TextUtils.isEmpty(j8Var.f35092d0)) {
                    j8Var.M.setVisibility(8);
                } else {
                    j8Var.M.setText(j8Var.f35092d0);
                    j8Var.M.setVisibility(0);
                }
                j8Var.y0();
                b2Var.dismiss();
                j8Var.n0();
                return;
        }
    }

    public f7(l7 l7Var, k0 k0Var, f0 f0Var) {
        this.f34932a = 1;
        this.f34933b = l7Var;
        this.f34934c = k0Var;
        this.d = f0Var;
    }
}
