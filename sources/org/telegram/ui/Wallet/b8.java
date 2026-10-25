package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m71;
public final class b8 implements org.telegram.ui.ActionBar.b2 {
    public final int f36396a;
    public final m71 f36397b;
    public final Object f36398c;
    public final Object d;

    public b8(m71 m71Var, Object obj, Object obj2, int i10) {
        this.f36396a = i10;
        this.f36397b = m71Var;
        this.d = obj;
        this.f36398c = obj2;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        switch (this.f36396a) {
            case 0:
                h8 h8Var = (h8) this.f36397b;
                l0 l0Var = (l0) this.f36398c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f36806c.B();
                }
                if (h8Var.getParentLayout() != null && h8Var.getParentLayout().getFragmentStack().size() > 1) {
                    r2Var = (org.telegram.ui.ActionBar.r2) h8Var.getParentLayout().getFragmentStack().get(h8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    r2Var = null;
                }
                r2.a(l0Var.f36804a, new ai.d0(13), null, null, null, new di.c0(5, l0Var, new s(11, h8Var, r2Var)), false, true, new ag.b1((Object) null, 2));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f36398c;
                qf.c h = e2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8((h8) this.f36397b, h, 2);
                l0.F("disable backup: getting phrase...");
                l0Var2.y(new j((Object) l0Var2, (Object) d8Var, (Object) ((g0) this.d), 5), false, true);
                return;
            default:
                i9 i9Var = (i9) this.f36397b;
                jg.a1 a1Var = (jg.a1) this.d;
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f36398c;
                if (a1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -i9Var.f36703o0;
                    i9Var.f36703o0 = i11;
                    AndroidUtilities.shakeViewSpring(a1Var, i11);
                    return;
                }
                String trim = a1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                i9Var.f36695g0 = trim;
                i9Var.f36696h0 = !y1Var.b();
                if (TextUtils.isEmpty(i9Var.f36695g0)) {
                    i9Var.P.setVisibility(8);
                } else {
                    i9Var.P.setText(i9Var.f36695g0);
                    i9Var.P.setVisibility(0);
                }
                i9Var.A0();
                e2Var.dismiss();
                i9Var.p0();
                return;
        }
    }

    public b8(h8 h8Var, l0 l0Var, g0 g0Var) {
        this.f36396a = 1;
        this.f36397b = h8Var;
        this.f36398c = l0Var;
        this.d = g0Var;
    }
}
