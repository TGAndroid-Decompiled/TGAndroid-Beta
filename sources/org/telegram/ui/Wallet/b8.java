package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n71;
public final class b8 implements org.telegram.ui.ActionBar.b2 {
    public final int f36425a;
    public final n71 f36426b;
    public final Object f36427c;
    public final Object d;

    public b8(n71 n71Var, Object obj, Object obj2, int i10) {
        this.f36425a = i10;
        this.f36426b = n71Var;
        this.d = obj;
        this.f36427c = obj2;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        switch (this.f36425a) {
            case 0:
                h8 h8Var = (h8) this.f36426b;
                l0 l0Var = (l0) this.f36427c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f36836c.B();
                }
                if (h8Var.getParentLayout() != null && h8Var.getParentLayout().getFragmentStack().size() > 1) {
                    r2Var = (org.telegram.ui.ActionBar.r2) h8Var.getParentLayout().getFragmentStack().get(h8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    r2Var = null;
                }
                r2.a(l0Var.f36834a, new ai.d0(13), null, null, null, new di.c0(5, l0Var, new s(11, h8Var, r2Var)), false, true, new ag.b1((Object) null, 2));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f36427c;
                qf.c h = e2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8((h8) this.f36426b, h, 2);
                l0.H("disable backup: getting phrase...");
                l0Var2.z(new j((Object) l0Var2, (Object) d8Var, (Object) ((g0) this.d), 5), false, true);
                return;
            default:
                i9 i9Var = (i9) this.f36426b;
                jg.a1 a1Var = (jg.a1) this.d;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f36427c;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -i9Var.f36731o0;
                    i9Var.f36731o0 = i11;
                    AndroidUtilities.shakeViewSpring(a1Var, i11);
                    return;
                }
                String trim = a1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                i9Var.f36723g0 = trim;
                i9Var.f36724h0 = !y1Var.b();
                if (TextUtils.isEmpty(i9Var.f36723g0)) {
                    i9Var.P.setVisibility(8);
                } else {
                    i9Var.P.setText(i9Var.f36723g0);
                    i9Var.P.setVisibility(0);
                }
                i9Var.A0();
                e2Var.dismiss();
                i9Var.p0();
                return;
        }
    }

    public b8(h8 h8Var, l0 l0Var, g0 g0Var) {
        this.f36425a = 1;
        this.f36426b = h8Var;
        this.f36427c = l0Var;
        this.d = g0Var;
    }
}
