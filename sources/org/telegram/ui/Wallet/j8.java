package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.m41;
public final class j8 implements org.telegram.ui.ActionBar.r1 {
    public final int f42671a;
    public final m41 f42672b;
    public final Object f42673c;
    public final Object d;

    public j8(m41 m41Var, Object obj, Object obj2, int i7) {
        this.f42671a = i7;
        this.f42672b = m41Var;
        this.d = obj;
        this.f42673c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        switch (this.f42671a) {
            case 0:
                o8 o8Var = (o8) this.f42672b;
                n0 n0Var = (n0) this.f42673c;
                if (!((Boolean) this.d).booleanValue()) {
                    n0Var.f42795c.B();
                }
                if (o8Var.getParentLayout() != null && o8Var.getParentLayout().getFragmentStack().size() > 1) {
                    f2Var = (org.telegram.ui.ActionBar.f2) o8Var.getParentLayout().getFragmentStack().get(o8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    f2Var = null;
                }
                i3.a(n0Var.f42793a, new ai.c0(10), null, null, null, new di.b0(5, n0Var, new t(10, o8Var, f2Var)), false, true, new bg.v0((Object) null, 2));
                return;
            case 1:
                n0 n0Var2 = (n0) this.f42673c;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                k8 k8Var = new k8((o8) this.f42672b, h, 2);
                n0.H("disable backup: getting phrase...");
                n0Var2.z(new j((Object) n0Var2, (Object) k8Var, (Object) ((i0) this.d), 1), false, true);
                return;
            default:
                n9 n9Var = (n9) this.f42672b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42673c;
                String str = null;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -n9Var.f42861o0;
                    n9Var.f42861o0 = i10;
                    org.telegram.messenger.g0.G3(i10, x0Var, null);
                    return;
                }
                String trim = x0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                n9Var.f42853g0 = str;
                n9Var.f42854h0 = !c2Var.b();
                if (TextUtils.isEmpty(n9Var.f42853g0)) {
                    n9Var.P.setVisibility(8);
                } else {
                    n9Var.P.setText(n9Var.f42853g0);
                    n9Var.P.setVisibility(0);
                }
                n9Var.E0();
                u1Var.dismiss();
                n9Var.t0();
                return;
        }
    }

    public j8(o8 o8Var, n0 n0Var, i0 i0Var) {
        this.f42671a = 1;
        this.f42672b = o8Var;
        this.f42673c = n0Var;
        this.d = i0Var;
    }
}
