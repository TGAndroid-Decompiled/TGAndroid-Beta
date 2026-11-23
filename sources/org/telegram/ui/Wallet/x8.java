package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.e51;
import org.telegram.ui.p51;
public final class x8 implements org.telegram.ui.ActionBar.q1 {
    public final int f45290a;
    public final e51 f45291b;
    public final Object f45292c;
    public final Object d;

    public x8(e51 e51Var, Object obj, Object obj2, int i7) {
        this.f45290a = i7;
        this.f45291b = e51Var;
        this.d = obj;
        this.f45292c = obj2;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.g2 g2Var;
        switch (this.f45290a) {
            case 0:
                d9 d9Var = (d9) this.f45291b;
                u0 u0Var = (u0) this.f45292c;
                if (!((Boolean) this.d).booleanValue()) {
                    u0Var.f45095c.C();
                }
                if (d9Var.getParentLayout() != null && d9Var.getParentLayout().getFragmentStack().size() > 1) {
                    g2Var = (org.telegram.ui.ActionBar.g2) d9Var.getParentLayout().getFragmentStack().get(d9Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    g2Var = null;
                }
                n3.a(u0Var.f45093a, new ci.y(11), null, null, null, new fi.b0(6, u0Var, new p51(14, d9Var, g2Var)), false, true, new m.b3(null, null));
                return;
            case 1:
                u0 u0Var2 = (u0) this.f45292c;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                z8 z8Var = new z8((d9) this.f45291b, h, 0);
                u0.P("disable backup: getting phrase...");
                u0Var2.F(false, true, false, new j((Object) u0Var2, (Object) z8Var, (Object) ((o0) this.d), 6));
                return;
            default:
                da daVar = (da) this.f45291b;
                kg.a1 a1Var = (kg.a1) this.d;
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f45292c;
                String str = null;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -daVar.f44080p0;
                    daVar.f44080p0 = i10;
                    org.telegram.messenger.g0.E3(i10, a1Var, null);
                    return;
                }
                String trim = a1Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                daVar.f44072h0 = str;
                daVar.f44073i0 = !d2Var.b();
                if (TextUtils.isEmpty(daVar.f44072h0)) {
                    daVar.Q.setVisibility(8);
                } else {
                    daVar.Q.setText(daVar.f44072h0);
                    daVar.Q.setVisibility(0);
                }
                daVar.E0();
                t1Var.dismiss();
                daVar.t0();
                return;
        }
    }

    public x8(d9 d9Var, u0 u0Var, o0 o0Var) {
        this.f45290a = 1;
        this.f45291b = d9Var;
        this.f45292c = u0Var;
        this.d = o0Var;
    }
}
