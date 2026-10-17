package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v61;
import org.telegram.ui.pa0;
public final class e8 implements org.telegram.ui.ActionBar.a2 {
    public final int f34172a;
    public final v61 f34173b;
    public final Object f34174c;
    public final Object d;

    public e8(v61 v61Var, Object obj, Object obj2, int i10) {
        this.f34172a = i10;
        this.f34173b = v61Var;
        this.d = obj;
        this.f34174c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f34172a) {
            case 0:
                k8 k8Var = (k8) this.f34173b;
                m0 m0Var = (m0) this.f34174c;
                if (!((Boolean) this.d).booleanValue()) {
                    m0Var.f34553c.B();
                }
                if (k8Var.getParentLayout() != null && k8Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) k8Var.getParentLayout().getFragmentStack().get(k8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    n2Var = null;
                }
                s2.a(m0Var.f34551a, new gi.c(9), null, null, null, new ci.c0(5, m0Var, new x(9, k8Var, n2Var)), false, true, new pa0((Object) null, 1));
                return;
            case 1:
                m0 m0Var2 = (m0) this.f34174c;
                pf.c g10 = b2Var.g(i10, true, true);
                g10.d();
                g8 g8Var = new g8((k8) this.f34173b, g10, 2);
                m0.F("disable backup: getting phrase...");
                m0Var2.y(new k((Object) m0Var2, (Object) g8Var, (Object) ((h0) this.d), 5), false, true);
                return;
            default:
                l9 l9Var = (l9) this.f34173b;
                ig.y0 y0Var = (ig.y0) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f34174c;
                if (y0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -l9Var.f34536l0;
                    l9Var.f34536l0 = i11;
                    AndroidUtilities.shakeViewSpring(y0Var, i11);
                    return;
                }
                String trim = y0Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                l9Var.f34527d0 = trim;
                l9Var.f34528e0 = !a2Var.b();
                if (TextUtils.isEmpty(l9Var.f34527d0)) {
                    l9Var.M.setVisibility(8);
                } else {
                    l9Var.M.setText(l9Var.f34527d0);
                    l9Var.M.setVisibility(0);
                }
                l9Var.y0();
                b2Var.dismiss();
                l9Var.n0();
                return;
        }
    }

    public e8(k8 k8Var, m0 m0Var, h0 h0Var) {
        this.f34172a = 1;
        this.f34173b = k8Var;
        this.f34174c = m0Var;
        this.d = h0Var;
    }
}
