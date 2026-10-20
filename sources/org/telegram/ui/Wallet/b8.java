package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x61;
import org.telegram.ui.na0;
public final class b8 implements org.telegram.ui.ActionBar.a2 {
    public final int f34046a;
    public final x61 f34047b;
    public final Object f34048c;
    public final Object d;

    public b8(x61 x61Var, Object obj, Object obj2, int i10) {
        this.f34046a = i10;
        this.f34047b = x61Var;
        this.d = obj;
        this.f34048c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f34046a) {
            case 0:
                h8 h8Var = (h8) this.f34047b;
                m0 m0Var = (m0) this.f34048c;
                if (!((Boolean) this.d).booleanValue()) {
                    m0Var.f34478c.B();
                }
                if (h8Var.getParentLayout() != null && h8Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) h8Var.getParentLayout().getFragmentStack().get(h8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    n2Var = null;
                }
                s2.a(m0Var.f34476a, new gi.c(9), null, null, null, new ci.c0(5, m0Var, new x(9, h8Var, n2Var)), false, true, new na0((Object) null, 1));
                return;
            case 1:
                m0 m0Var2 = (m0) this.f34048c;
                pf.c h = b2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8((h8) this.f34047b, h, 2);
                m0.F("disable backup: getting phrase...");
                m0Var2.y(new k((Object) m0Var2, (Object) d8Var, (Object) ((h0) this.d), 5), false, true);
                return;
            default:
                i9 i9Var = (i9) this.f34047b;
                ig.a1 a1Var = (ig.a1) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f34048c;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -i9Var.f34356l0;
                    i9Var.f34356l0 = i11;
                    AndroidUtilities.shakeViewSpring(a1Var, i11);
                    return;
                }
                String trim = a1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                i9Var.f34347d0 = trim;
                i9Var.f34348e0 = !a2Var.b();
                if (TextUtils.isEmpty(i9Var.f34347d0)) {
                    i9Var.M.setVisibility(8);
                } else {
                    i9Var.M.setText(i9Var.f34347d0);
                    i9Var.M.setVisibility(0);
                }
                i9Var.y0();
                b2Var.dismiss();
                i9Var.n0();
                return;
        }
    }

    public b8(h8 h8Var, m0 m0Var, h0 h0Var) {
        this.f34046a = 1;
        this.f34047b = h8Var;
        this.f34048c = m0Var;
        this.d = h0Var;
    }
}
