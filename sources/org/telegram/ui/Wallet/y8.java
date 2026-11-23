package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.d51;
import org.telegram.ui.a31;
public final class y8 implements org.telegram.ui.ActionBar.q1 {
    public final int f45452a;
    public final d51 f45453b;
    public final Object f45454c;
    public final Object d;

    public y8(d51 d51Var, Object obj, Object obj2, int i7) {
        this.f45452a = i7;
        this.f45453b = d51Var;
        this.d = obj;
        this.f45454c = obj2;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.ui.ActionBar.g2 g2Var;
        switch (this.f45452a) {
            case 0:
                e9 e9Var = (e9) this.f45453b;
                v0 v0Var = (v0) this.f45454c;
                if (!((Boolean) this.d).booleanValue()) {
                    v0Var.f45257c.C();
                }
                if (e9Var.getParentLayout() != null && e9Var.getParentLayout().getFragmentStack().size() > 1) {
                    g2Var = (org.telegram.ui.ActionBar.g2) e9Var.getParentLayout().getFragmentStack().get(e9Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    g2Var = null;
                }
                o3.a(v0Var.f45255a, new ci.y(11), null, null, null, new fi.b0(6, v0Var, new a31(15, e9Var, g2Var)), false, true, new m.b3(null, null));
                return;
            case 1:
                v0 v0Var2 = (v0) this.f45454c;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                a9 a9Var = new a9((e9) this.f45453b, h, 0);
                v0.P("disable backup: getting phrase...");
                v0Var2.F(false, true, false, new j((Object) v0Var2, (Object) a9Var, (Object) ((p0) this.d), 6));
                return;
            default:
                ea eaVar = (ea) this.f45453b;
                kg.z0 z0Var = (kg.z0) this.d;
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f45454c;
                String str = null;
                if (z0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i10 = -eaVar.f44242p0;
                    eaVar.f44242p0 = i10;
                    org.telegram.messenger.g0.E3(i10, z0Var, null);
                    return;
                }
                String trim = z0Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                eaVar.f44234h0 = str;
                eaVar.f44235i0 = !d2Var.b();
                if (TextUtils.isEmpty(eaVar.f44234h0)) {
                    eaVar.Q.setVisibility(8);
                } else {
                    eaVar.Q.setText(eaVar.f44234h0);
                    eaVar.Q.setVisibility(0);
                }
                eaVar.E0();
                t1Var.dismiss();
                eaVar.t0();
                return;
        }
    }

    public y8(e9 e9Var, v0 v0Var, p0 p0Var) {
        this.f45452a = 1;
        this.f45453b = e9Var;
        this.f45454c = v0Var;
        this.d = p0Var;
    }
}
