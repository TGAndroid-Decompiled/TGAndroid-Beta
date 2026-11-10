package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.o41;
public final class k8 implements org.telegram.ui.ActionBar.r1 {
    public final int f42732a;
    public final o41 f42733b;
    public final Object f42734c;
    public final Object d;

    public k8(o41 o41Var, Object obj, Object obj2, int i7) {
        this.f42732a = i7;
        this.f42733b = o41Var;
        this.d = obj;
        this.f42734c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.ui.ActionBar.f2 f2Var;
        switch (this.f42732a) {
            case 0:
                p8 p8Var = (p8) this.f42733b;
                l0 l0Var = (l0) this.f42734c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f42751c.B();
                }
                if (p8Var.getParentLayout() != null && p8Var.getParentLayout().getFragmentStack().size() > 1) {
                    f2Var = (org.telegram.ui.ActionBar.f2) p8Var.getParentLayout().getFragmentStack().get(p8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    f2Var = null;
                }
                g3.a(l0Var.f42749a, new ai.c0(10), null, null, null, new di.b0(5, l0Var, new s(10, p8Var, f2Var)), false, true, new bg.v0((Object) null, 2));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f42734c;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                l8 l8Var = new l8((p8) this.f42733b, h, 2);
                l0.H("disable backup: getting phrase...");
                l0Var2.z(new j((Object) l0Var2, (Object) l8Var, (Object) ((g0) this.d), 1), false, true);
                return;
            default:
                o9 o9Var = (o9) this.f42733b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42734c;
                String str = null;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -o9Var.f42932o0;
                    o9Var.f42932o0 = i10;
                    org.telegram.messenger.g0.G3(i10, x0Var, null);
                    return;
                }
                String trim = x0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                o9Var.f42924g0 = str;
                o9Var.f42925h0 = !c2Var.b();
                if (TextUtils.isEmpty(o9Var.f42924g0)) {
                    o9Var.P.setVisibility(8);
                } else {
                    o9Var.P.setText(o9Var.f42924g0);
                    o9Var.P.setVisibility(0);
                }
                o9Var.E0();
                u1Var.dismiss();
                o9Var.t0();
                return;
        }
    }

    public k8(p8 p8Var, l0 l0Var, g0 g0Var) {
        this.f42732a = 1;
        this.f42733b = p8Var;
        this.f42734c = l0Var;
        this.d = g0Var;
    }
}
