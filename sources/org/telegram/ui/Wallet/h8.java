package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v61;
import org.telegram.ui.pa0;
public final class h8 implements org.telegram.ui.ActionBar.a2 {
    public final int f34307a;
    public final v61 f34308b;
    public final Object f34309c;
    public final Object d;

    public h8(v61 v61Var, Object obj, Object obj2, int i10) {
        this.f34307a = i10;
        this.f34308b = v61Var;
        this.d = obj;
        this.f34309c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f34307a) {
            case 0:
                n8 n8Var = (n8) this.f34308b;
                m0 m0Var = (m0) this.f34309c;
                if (!((Boolean) this.d).booleanValue()) {
                    m0Var.f34532c.B();
                }
                if (n8Var.getParentLayout() != null && n8Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) n8Var.getParentLayout().getFragmentStack().get(n8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    n2Var = null;
                }
                s2.a(m0Var.f34530a, new gi.c(9), null, null, null, new ci.c0(5, m0Var, new x(9, n8Var, n2Var)), false, true, new pa0((Object) null, 1));
                return;
            case 1:
                m0 m0Var2 = (m0) this.f34309c;
                pf.c g10 = b2Var.g(i10, true, true);
                g10.d();
                j8 j8Var = new j8((n8) this.f34308b, g10, 2);
                m0.F("disable backup: getting phrase...");
                m0Var2.y(new k((Object) m0Var2, (Object) j8Var, (Object) ((h0) this.d), 5), false, true);
                return;
            default:
                o9 o9Var = (o9) this.f34308b;
                ig.a1 a1Var = (ig.a1) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f34309c;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -o9Var.f34701l0;
                    o9Var.f34701l0 = i11;
                    AndroidUtilities.shakeViewSpring(a1Var, i11);
                    return;
                }
                String trim = a1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                o9Var.f34692d0 = trim;
                o9Var.f34693e0 = !a2Var.b();
                if (TextUtils.isEmpty(o9Var.f34692d0)) {
                    o9Var.M.setVisibility(8);
                } else {
                    o9Var.M.setText(o9Var.f34692d0);
                    o9Var.M.setVisibility(0);
                }
                o9Var.y0();
                b2Var.dismiss();
                o9Var.n0();
                return;
        }
    }

    public h8(n8 n8Var, m0 m0Var, h0 h0Var) {
        this.f34307a = 1;
        this.f34308b = n8Var;
        this.f34309c = m0Var;
        this.d = h0Var;
    }
}
