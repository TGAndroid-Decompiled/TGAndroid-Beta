package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.n41;
public final class i8 implements org.telegram.ui.ActionBar.r1 {
    public final int f42640a;
    public final n41 f42641b;
    public final Object f42642c;
    public final Object d;

    public i8(n41 n41Var, Object obj, Object obj2, int i7) {
        this.f42640a = i7;
        this.f42641b = n41Var;
        this.d = obj;
        this.f42642c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        switch (this.f42640a) {
            case 0:
                n8 n8Var = (n8) this.f42641b;
                m0 m0Var = (m0) this.f42642c;
                if (!((Boolean) this.d).booleanValue()) {
                    m0Var.f42764c.B();
                }
                if (n8Var.getParentLayout() != null && n8Var.getParentLayout().getFragmentStack().size() > 1) {
                    f2Var = (org.telegram.ui.ActionBar.f2) n8Var.getParentLayout().getFragmentStack().get(n8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    f2Var = null;
                }
                h3.a(m0Var.f42762a, new ai.c0(10), null, null, null, new di.b0(5, m0Var, new t(10, n8Var, f2Var)), false, true, new bg.v0((Object) null, 2));
                return;
            case 1:
                m0 m0Var2 = (m0) this.f42642c;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                j8 j8Var = new j8((n8) this.f42641b, h, 2);
                m0.H("disable backup: getting phrase...");
                m0Var2.z(new j((Object) m0Var2, (Object) j8Var, (Object) ((h0) this.d), 1), false, true);
                return;
            default:
                m9 m9Var = (m9) this.f42641b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42642c;
                String str = null;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -m9Var.f42830o0;
                    m9Var.f42830o0 = i10;
                    org.telegram.messenger.g0.G3(i10, x0Var, null);
                    return;
                }
                String trim = x0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                m9Var.f42822g0 = str;
                m9Var.f42823h0 = !c2Var.b();
                if (TextUtils.isEmpty(m9Var.f42822g0)) {
                    m9Var.P.setVisibility(8);
                } else {
                    m9Var.P.setText(m9Var.f42822g0);
                    m9Var.P.setVisibility(0);
                }
                m9Var.E0();
                u1Var.dismiss();
                m9Var.t0();
                return;
        }
    }

    public i8(n8 n8Var, m0 m0Var, h0 h0Var) {
        this.f42640a = 1;
        this.f42641b = n8Var;
        this.f42642c = m0Var;
        this.d = h0Var;
    }
}
