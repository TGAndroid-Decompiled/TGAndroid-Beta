package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.b51;
import org.telegram.ui.p51;
public final class x8 implements org.telegram.ui.ActionBar.r1 {
    public final int f45280a;
    public final b51 f45281b;
    public final Object f45282c;
    public final Object d;

    public x8(b51 b51Var, Object obj, Object obj2, int i7) {
        this.f45280a = i7;
        this.f45281b = b51Var;
        this.d = obj;
        this.f45282c = obj2;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.h2 h2Var;
        switch (this.f45280a) {
            case 0:
                d9 d9Var = (d9) this.f45281b;
                u0 u0Var = (u0) this.f45282c;
                if (!((Boolean) this.d).booleanValue()) {
                    u0Var.f45085c.C();
                }
                if (d9Var.getParentLayout() != null && d9Var.getParentLayout().getFragmentStack().size() > 1) {
                    h2Var = (org.telegram.ui.ActionBar.h2) d9Var.getParentLayout().getFragmentStack().get(d9Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    h2Var = null;
                }
                n3.a(u0Var.f45083a, new ci.y(11), null, null, null, new fi.b0(6, u0Var, new p51(14, d9Var, h2Var)), false, true, new m.b3(null, null));
                return;
            case 1:
                u0 u0Var2 = (u0) this.f45282c;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                z8 z8Var = new z8((d9) this.f45281b, h, 0);
                u0.P("disable backup: getting phrase...");
                u0Var2.F(false, true, false, new j((Object) u0Var2, (Object) z8Var, (Object) ((o0) this.d), 6));
                return;
            default:
                da daVar = (da) this.f45281b;
                kg.a1 a1Var = (kg.a1) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f45282c;
                String str = null;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -daVar.f44070p0;
                    daVar.f44070p0 = i10;
                    org.telegram.messenger.g0.E3(i10, a1Var, null);
                    return;
                }
                String trim = a1Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                daVar.f44062h0 = str;
                daVar.f44063i0 = !c2Var.b();
                if (TextUtils.isEmpty(daVar.f44062h0)) {
                    daVar.Q.setVisibility(8);
                } else {
                    daVar.Q.setText(daVar.f44062h0);
                    daVar.Q.setVisibility(0);
                }
                daVar.E0();
                u1Var.dismiss();
                daVar.t0();
                return;
        }
    }

    public x8(d9 d9Var, u0 u0Var, o0 o0Var) {
        this.f45280a = 1;
        this.f45281b = d9Var;
        this.f45282c = u0Var;
        this.d = o0Var;
    }
}
