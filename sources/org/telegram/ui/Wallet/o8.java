package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.r51;
import org.telegram.ui.aa0;
import org.telegram.ui.f11;
import org.telegram.ui.jo;
import org.telegram.ui.zh;
public final class o8 implements org.telegram.ui.ActionBar.u1 {
    public final int f34990a;
    public final r51 f34991b;
    public final Object f34992c;
    public final Object d;

    public o8(r51 r51Var, Object obj, Object obj2, int i10) {
        this.f34990a = i10;
        this.f34991b = r51Var;
        this.d = obj;
        this.f34992c = obj2;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        switch (this.f34990a) {
            case 0:
                t8 t8Var = (t8) this.f34991b;
                k0 k0Var = (k0) this.f34992c;
                if (!((Boolean) this.d).booleanValue()) {
                    k0Var.f34778c.B();
                }
                if (t8Var.getParentLayout() != null && t8Var.getParentLayout().getFragmentStack().size() > 1) {
                    k2Var = (org.telegram.ui.ActionBar.k2) t8Var.getParentLayout().getFragmentStack().get(t8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    k2Var = null;
                }
                h3.a(k0Var.f34776a, new zh(7), null, null, null, new jo(2, k0Var, new f11(16, t8Var, k2Var)), false, true, new aa0((Object) null, 1));
                return;
            case 1:
                k0 k0Var2 = (k0) this.f34992c;
                gf.e h = x1Var.h(i10, true, true);
                h.d();
                p8 p8Var = new p8((t8) this.f34991b, h, 2);
                k0.H("disable backup: getting phrase...");
                k0Var2.z(new j((Object) k0Var2, (Object) p8Var, (Object) ((f0) this.d), 1), false, true);
                return;
            default:
                r9 r9Var = (r9) this.f34991b;
                ag.a2 a2Var = (ag.a2) this.d;
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f34992c;
                String str = null;
                if (a2Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -r9Var.f35140o0;
                    r9Var.f35140o0 = i11;
                    org.telegram.messenger.i0.F3(i11, a2Var, null);
                    return;
                }
                String trim = a2Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                r9Var.f35132g0 = str;
                r9Var.f35133h0 = !c2Var.b();
                if (TextUtils.isEmpty(r9Var.f35132g0)) {
                    r9Var.P.setVisibility(8);
                } else {
                    r9Var.P.setText(r9Var.f35132g0);
                    r9Var.P.setVisibility(0);
                }
                r9Var.D0();
                x1Var.dismiss();
                r9Var.s0();
                return;
        }
    }

    public o8(t8 t8Var, k0 k0Var, f0 f0Var) {
        this.f34990a = 1;
        this.f34991b = t8Var;
        this.f34992c = k0Var;
        this.d = f0Var;
    }
}
