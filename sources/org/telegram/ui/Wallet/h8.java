package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.o41;
public final class h8 implements org.telegram.ui.ActionBar.r1 {
    public final int f42559a;
    public final o41 f42560b;
    public final Object f42561c;
    public final Object d;

    public h8(o41 o41Var, Object obj, Object obj2, int i7) {
        this.f42559a = i7;
        this.f42560b = o41Var;
        this.d = obj;
        this.f42561c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        switch (this.f42559a) {
            case 0:
                m8 m8Var = (m8) this.f42560b;
                l0 l0Var = (l0) this.f42561c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f42682c.B();
                }
                if (m8Var.getParentLayout() != null && m8Var.getParentLayout().getFragmentStack().size() > 1) {
                    f2Var = (org.telegram.ui.ActionBar.f2) m8Var.getParentLayout().getFragmentStack().get(m8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    f2Var = null;
                }
                g3.a(l0Var.f42680a, new ai.c0(10), null, null, null, new di.b0(5, l0Var, new s(10, m8Var, f2Var)), false, true, new bg.v0((Object) null, 2));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f42561c;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                i8 i8Var = new i8((m8) this.f42560b, h, 2);
                l0.H("disable backup: getting phrase...");
                l0Var2.z(new j((Object) l0Var2, (Object) i8Var, (Object) ((g0) this.d), 1), false, true);
                return;
            default:
                l9 l9Var = (l9) this.f42560b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42561c;
                String str = null;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -l9Var.f42748o0;
                    l9Var.f42748o0 = i10;
                    org.telegram.messenger.g0.G3(i10, x0Var, null);
                    return;
                }
                String trim = x0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                l9Var.f42740g0 = str;
                l9Var.f42741h0 = !c2Var.b();
                if (TextUtils.isEmpty(l9Var.f42740g0)) {
                    l9Var.P.setVisibility(8);
                } else {
                    l9Var.P.setText(l9Var.f42740g0);
                    l9Var.P.setVisibility(0);
                }
                l9Var.E0();
                u1Var.dismiss();
                l9Var.t0();
                return;
        }
    }

    public h8(m8 m8Var, l0 l0Var, g0 g0Var) {
        this.f42559a = 1;
        this.f42560b = m8Var;
        this.f42561c = l0Var;
        this.d = g0Var;
    }
}
