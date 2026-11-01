package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.s51;
import org.telegram.ui.d01;
import org.telegram.ui.jo;
import org.telegram.ui.z90;
import org.telegram.ui.zh;
public final class o8 implements org.telegram.ui.ActionBar.u1 {
    public final int f34993a;
    public final s51 f34994b;
    public final Object f34995c;
    public final Object d;

    public o8(s51 s51Var, Object obj, Object obj2, int i10) {
        this.f34993a = i10;
        this.f34994b = s51Var;
        this.d = obj;
        this.f34995c = obj2;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        switch (this.f34993a) {
            case 0:
                t8 t8Var = (t8) this.f34994b;
                k0 k0Var = (k0) this.f34995c;
                if (!((Boolean) this.d).booleanValue()) {
                    k0Var.f34783c.B();
                }
                if (t8Var.getParentLayout() != null && t8Var.getParentLayout().getFragmentStack().size() > 1) {
                    k2Var = (org.telegram.ui.ActionBar.k2) t8Var.getParentLayout().getFragmentStack().get(t8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    k2Var = null;
                }
                i3.a(k0Var.f34781a, new zh(7), null, null, null, new jo(2, k0Var, new d01(17, t8Var, k2Var)), false, true, new z90((Object) null, 1));
                return;
            case 1:
                k0 k0Var2 = (k0) this.f34995c;
                gf.e h = x1Var.h(i10, true, true);
                h.d();
                p8 p8Var = new p8((t8) this.f34994b, h, 2);
                k0.H("disable backup: getting phrase...");
                k0Var2.z(new j((Object) k0Var2, (Object) p8Var, (Object) ((f0) this.d), 1), false, true);
                return;
            default:
                r9 r9Var = (r9) this.f34994b;
                ag.a2 a2Var = (ag.a2) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f34995c;
                String str = null;
                if (a2Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -r9Var.f35145o0;
                    r9Var.f35145o0 = i11;
                    org.telegram.messenger.i0.F3(i11, a2Var, null);
                    return;
                }
                String trim = a2Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                r9Var.f35137g0 = str;
                r9Var.f35138h0 = !c2Var.b();
                if (TextUtils.isEmpty(r9Var.f35137g0)) {
                    r9Var.P.setVisibility(8);
                } else {
                    r9Var.P.setText(r9Var.f35137g0);
                    r9Var.P.setVisibility(0);
                }
                r9Var.E0();
                x1Var.dismiss();
                r9Var.t0();
                return;
        }
    }

    public o8(t8 t8Var, k0 k0Var, f0 f0Var) {
        this.f34993a = 1;
        this.f34994b = t8Var;
        this.f34995c = k0Var;
        this.d = f0Var;
    }
}
