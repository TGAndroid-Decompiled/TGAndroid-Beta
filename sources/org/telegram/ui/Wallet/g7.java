package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g71;
import org.telegram.ui.ib0;
public final class g7 implements org.telegram.ui.ActionBar.a2 {
    public final int f35024a;
    public final g71 f35025b;
    public final Object f35026c;
    public final Object d;

    public g7(g71 g71Var, Object obj, Object obj2, int i10) {
        this.f35024a = i10;
        this.f35025b = g71Var;
        this.d = obj;
        this.f35026c = obj2;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f35024a) {
            case 0:
                m7 m7Var = (m7) this.f35025b;
                k0 k0Var = (k0) this.f35026c;
                if (!((Boolean) this.d).booleanValue()) {
                    k0Var.f35157c.B();
                }
                if (m7Var.getParentLayout() != null && m7Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) m7Var.getParentLayout().getFragmentStack().get(m7Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    n2Var = null;
                }
                r2.a(k0Var.f35155a, new ei.c(8), null, null, null, new ai.q0(5, k0Var, new a7(2, m7Var, n2Var)), false, true, new ib0((Object) null, 1));
                return;
            case 1:
                k0 k0Var2 = (k0) this.f35026c;
                of.e g10 = b2Var.g(i10, true, true);
                g10.d();
                i7 i7Var = new i7((m7) this.f35025b, g10, 2);
                k0.E("disable backup: getting phrase...");
                k0Var2.x(new j((Object) k0Var2, (Object) i7Var, (Object) ((f0) this.d), 3), false, true);
                return;
            default:
                k8 k8Var = (k8) this.f35025b;
                hg.b1 b1Var = (hg.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f35026c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -k8Var.f35213l0;
                    k8Var.f35213l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    return;
                }
                String trim = b1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                k8Var.f35203d0 = trim;
                k8Var.f35205e0 = !a2Var.b();
                if (TextUtils.isEmpty(k8Var.f35203d0)) {
                    k8Var.M.setVisibility(8);
                } else {
                    k8Var.M.setText(k8Var.f35203d0);
                    k8Var.M.setVisibility(0);
                }
                k8Var.y0();
                b2Var.dismiss();
                k8Var.n0();
                return;
        }
    }

    public g7(m7 m7Var, k0 k0Var, f0 f0Var) {
        this.f35024a = 1;
        this.f35025b = m7Var;
        this.f35026c = k0Var;
        this.d = f0Var;
    }
}
