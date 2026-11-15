package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.r41;
import org.telegram.ui.x21;
public final class j8 implements org.telegram.ui.ActionBar.q1 {
    public final int f44028a;
    public final r41 f44029b;
    public final Object f44030c;
    public final Object d;

    public j8(r41 r41Var, Object obj, Object obj2, int i7) {
        this.f44028a = i7;
        this.f44029b = r41Var;
        this.d = obj;
        this.f44030c = obj2;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.e2 e2Var;
        switch (this.f44028a) {
            case 0:
                p8 p8Var = (p8) this.f44029b;
                l0 l0Var = (l0) this.f44030c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f44080c.B();
                }
                if (p8Var.getParentLayout() != null && p8Var.getParentLayout().getFragmentStack().size() > 1) {
                    e2Var = (org.telegram.ui.ActionBar.e2) p8Var.getParentLayout().getFragmentStack().get(p8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    e2Var = null;
                }
                f3.a(l0Var.f44078a, new ci.x(10), null, null, null, new fi.b0(5, l0Var, new x21(15, p8Var, e2Var)), false, true, new bg.u0((Object) null, 2));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f44030c;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                l8 l8Var = new l8((p8) this.f44029b, h, 2);
                l0.H("disable backup: getting phrase...");
                l0Var2.z(new j((Object) l0Var2, (Object) l8Var, (Object) ((g0) this.d), 1), false, true);
                return;
            default:
                p9 p9Var = (p9) this.f44029b;
                kg.x0 x0Var = (kg.x0) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f44030c;
                String str = null;
                if (x0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -p9Var.f44350p0;
                    p9Var.f44350p0 = i10;
                    org.telegram.messenger.g0.F3(i10, x0Var, null);
                    return;
                }
                String trim = x0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                p9Var.f44342h0 = str;
                p9Var.f44343i0 = !c2Var.b();
                if (TextUtils.isEmpty(p9Var.f44342h0)) {
                    p9Var.Q.setVisibility(8);
                } else {
                    p9Var.Q.setText(p9Var.f44342h0);
                    p9Var.Q.setVisibility(0);
                }
                p9Var.E0();
                t1Var.dismiss();
                p9Var.t0();
                return;
        }
    }

    public j8(p8 p8Var, l0 l0Var, g0 g0Var) {
        this.f44028a = 1;
        this.f44029b = p8Var;
        this.f44030c = l0Var;
        this.d = g0Var;
    }
}
