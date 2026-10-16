package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.mb0;
public final class f7 implements org.telegram.ui.ActionBar.z1 {
    public final int f32924a;
    public final d71 f32925b;
    public final Object f32926c;
    public final Object d;

    public f7(d71 d71Var, Object obj, Object obj2, int i10) {
        this.f32924a = i10;
        this.f32925b = d71Var;
        this.d = obj;
        this.f32926c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f32924a) {
            case 0:
                l7 l7Var = (l7) this.f32925b;
                k0 k0Var = (k0) this.f32926c;
                if (!((Boolean) this.d).booleanValue()) {
                    k0Var.f33094c.B();
                }
                if (l7Var.getParentLayout() != null && l7Var.getParentLayout().getFragmentStack().size() > 1) {
                    m2Var = (org.telegram.ui.ActionBar.m2) l7Var.getParentLayout().getFragmentStack().get(l7Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    m2Var = null;
                }
                r2.a(k0Var.f33092a, new fi.c(8), null, null, null, new bi.j0(5, k0Var, new z6(2, l7Var, m2Var)), false, true, new mb0((Object) null, 1));
                return;
            case 1:
                k0 k0Var2 = (k0) this.f32926c;
                pf.c g10 = a2Var.g(i10, true, true);
                g10.d();
                h7 h7Var = new h7((l7) this.f32925b, g10, 2);
                k0.E("disable backup: getting phrase...");
                k0Var2.x(new j((Object) k0Var2, (Object) h7Var, (Object) ((f0) this.d), 3), false, true);
                return;
            default:
                j8 j8Var = (j8) this.f32925b;
                ig.b1 b1Var = (ig.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.f32926c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -j8Var.f33078l0;
                    j8Var.f33078l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    return;
                }
                String trim = b1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                j8Var.f33069d0 = trim;
                j8Var.f33070e0 = !a2Var2.b();
                if (TextUtils.isEmpty(j8Var.f33069d0)) {
                    j8Var.M.setVisibility(8);
                } else {
                    j8Var.M.setText(j8Var.f33069d0);
                    j8Var.M.setVisibility(0);
                }
                j8Var.y0();
                a2Var.dismiss();
                j8Var.n0();
                return;
        }
    }

    public f7(l7 l7Var, k0 k0Var, f0 f0Var) {
        this.f32924a = 1;
        this.f32925b = l7Var;
        this.f32926c = k0Var;
        this.d = f0Var;
    }
}
