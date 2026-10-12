package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.nb0;
public final class e7 implements org.telegram.ui.ActionBar.z1 {
    public final int f33149a;
    public final c71 f33150b;
    public final Object f33151c;
    public final Object d;

    public e7(c71 c71Var, Object obj, Object obj2, int i10) {
        this.f33149a = i10;
        this.f33150b = c71Var;
        this.d = obj;
        this.f33151c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f33149a) {
            case 0:
                k7 k7Var = (k7) this.f33150b;
                j0 j0Var = (j0) this.f33151c;
                if (!((Boolean) this.d).booleanValue()) {
                    j0Var.f33321c.B();
                }
                if (k7Var.getParentLayout() != null && k7Var.getParentLayout().getFragmentStack().size() > 1) {
                    m2Var = (org.telegram.ui.ActionBar.m2) k7Var.getParentLayout().getFragmentStack().get(k7Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    m2Var = null;
                }
                q2.a(j0Var.f33319a, new fi.c(8), null, null, null, new bi.j0(5, j0Var, new y6(2, k7Var, m2Var)), false, true, new nb0((Object) null, 1));
                return;
            case 1:
                j0 j0Var2 = (j0) this.f33151c;
                pf.c g10 = a2Var.g(i10, true, true);
                g10.d();
                g7 g7Var = new g7((k7) this.f33150b, g10, 2);
                j0.E("disable backup: getting phrase...");
                j0Var2.x(new i((Object) j0Var2, (Object) g7Var, (Object) ((e0) this.d), 3), false, true);
                return;
            default:
                i8 i8Var = (i8) this.f33150b;
                ig.b1 b1Var = (ig.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.f33151c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -i8Var.f33305l0;
                    i8Var.f33305l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    return;
                }
                String trim = b1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                i8Var.f33296d0 = trim;
                i8Var.f33297e0 = !a2Var2.b();
                if (TextUtils.isEmpty(i8Var.f33296d0)) {
                    i8Var.M.setVisibility(8);
                } else {
                    i8Var.M.setText(i8Var.f33296d0);
                    i8Var.M.setVisibility(0);
                }
                i8Var.y0();
                a2Var.dismiss();
                i8Var.n0();
                return;
        }
    }

    public e7(k7 k7Var, j0 j0Var, e0 e0Var) {
        this.f33149a = 1;
        this.f33150b = k7Var;
        this.f33151c = j0Var;
        this.d = e0Var;
    }
}
