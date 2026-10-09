package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f71;
import org.telegram.ui.ib0;
public final class e7 implements org.telegram.ui.ActionBar.a2 {
    public final int f34866a;
    public final f71 f34867b;
    public final Object f34868c;
    public final Object d;

    public e7(f71 f71Var, Object obj, Object obj2, int i10) {
        this.f34866a = i10;
        this.f34867b = f71Var;
        this.d = obj;
        this.f34868c = obj2;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f34866a) {
            case 0:
                k7 k7Var = (k7) this.f34867b;
                k0 k0Var = (k0) this.f34868c;
                if (!((Boolean) this.d).booleanValue()) {
                    k0Var.f35095c.B();
                }
                if (k7Var.getParentLayout() != null && k7Var.getParentLayout().getFragmentStack().size() > 1) {
                    n2Var = (org.telegram.ui.ActionBar.n2) k7Var.getParentLayout().getFragmentStack().get(k7Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    n2Var = null;
                }
                q2.a(k0Var.f35093a, new ei.c(8), null, null, null, new ai.q0(5, k0Var, new y6(2, k7Var, n2Var)), false, true, new ib0((Object) null, 1));
                return;
            case 1:
                k0 k0Var2 = (k0) this.f34868c;
                of.e g10 = b2Var.g(i10, true, true);
                g10.d();
                g7 g7Var = new g7((k7) this.f34867b, g10, 2);
                k0.E("disable backup: getting phrase...");
                k0Var2.x(new i((Object) k0Var2, (Object) g7Var, (Object) ((f0) this.d), 3), false, true);
                return;
            default:
                i8 i8Var = (i8) this.f34867b;
                hg.b1 b1Var = (hg.b1) this.d;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f34868c;
                if (b1Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -i8Var.f35031l0;
                    i8Var.f35031l0 = i11;
                    AndroidUtilities.shakeViewSpring(b1Var, i11);
                    return;
                }
                String trim = b1Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                i8Var.f35021d0 = trim;
                i8Var.f35023e0 = !a2Var.b();
                if (TextUtils.isEmpty(i8Var.f35021d0)) {
                    i8Var.M.setVisibility(8);
                } else {
                    i8Var.M.setText(i8Var.f35021d0);
                    i8Var.M.setVisibility(0);
                }
                i8Var.y0();
                b2Var.dismiss();
                i8Var.n0();
                return;
        }
    }

    public e7(k7 k7Var, k0 k0Var, f0 f0Var) {
        this.f34866a = 1;
        this.f34867b = k7Var;
        this.f34868c = k0Var;
        this.d = f0Var;
    }
}
