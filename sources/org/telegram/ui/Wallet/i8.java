package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.h41;
import org.telegram.ui.e51;
public final class i8 implements org.telegram.ui.ActionBar.p1 {
    public final int f42661a;
    public final h41 f42662b;
    public final Object f42663c;
    public final Object d;

    public i8(h41 h41Var, Object obj, Object obj2, int i3) {
        this.f42661a = i3;
        this.f42662b = h41Var;
        this.d = obj;
        this.f42663c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        org.telegram.ui.ActionBar.d2 d2Var;
        switch (this.f42661a) {
            case 0:
                n8 n8Var = (n8) this.f42662b;
                k0 k0Var = (k0) this.f42663c;
                if (!((Boolean) this.d).booleanValue()) {
                    k0Var.f42720c.B();
                }
                if (n8Var.getParentLayout() != null && n8Var.getParentLayout().getFragmentStack().size() > 1) {
                    d2Var = (org.telegram.ui.ActionBar.d2) n8Var.getParentLayout().getFragmentStack().get(n8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    d2Var = null;
                }
                g3.a(k0Var.f42718a, new bi.x(10), null, null, null, new ei.d0(5, k0Var, new e51(13, n8Var, d2Var)), false, true, new cg.u0((Object) null, 2));
                return;
            case 1:
                k0 k0Var2 = (k0) this.f42663c;
                sf.b h = s1Var.h(i3, true, true);
                h.d();
                j8 j8Var = new j8((n8) this.f42662b, h, 2);
                k0.H("disable backup: getting phrase...");
                k0Var2.z(new j((Object) k0Var2, (Object) j8Var, (Object) ((f0) this.d), 1), false, true);
                return;
            default:
                m9 m9Var = (m9) this.f42662b;
                lg.y0 y0Var = (lg.y0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42663c;
                String str = null;
                if (y0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -m9Var.f42886p0;
                    m9Var.f42886p0 = i10;
                    org.telegram.messenger.g0.G3(i10, y0Var, null);
                    return;
                }
                String trim = y0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                m9Var.f42878h0 = str;
                m9Var.f42879i0 = !c2Var.b();
                if (TextUtils.isEmpty(m9Var.f42878h0)) {
                    m9Var.Q.setVisibility(8);
                } else {
                    m9Var.Q.setText(m9Var.f42878h0);
                    m9Var.Q.setVisibility(0);
                }
                m9Var.E0();
                s1Var.dismiss();
                m9Var.t0();
                return;
        }
    }

    public i8(n8 n8Var, k0 k0Var, f0 f0Var) {
        this.f42661a = 1;
        this.f42662b = n8Var;
        this.f42663c = k0Var;
        this.d = f0Var;
    }
}
