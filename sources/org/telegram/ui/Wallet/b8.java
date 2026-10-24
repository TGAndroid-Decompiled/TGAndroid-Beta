package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.ta0;
public final class b8 implements org.telegram.ui.ActionBar.z1 {
    public final int f34340a;
    public final d71 f34341b;
    public final Object f34342c;
    public final Object d;

    public b8(d71 d71Var, Object obj, Object obj2, int i10) {
        this.f34340a = i10;
        this.f34341b = d71Var;
        this.d = obj;
        this.f34342c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.f34340a) {
            case 0:
                i8 i8Var = (i8) this.f34341b;
                l0 l0Var = (l0) this.f34342c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f34745c.B();
                }
                if (i8Var.getParentLayout() != null && i8Var.getParentLayout().getFragmentStack().size() > 1) {
                    o2Var = (org.telegram.ui.ActionBar.o2) i8Var.getParentLayout().getFragmentStack().get(i8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    o2Var = null;
                }
                r2.a(l0Var.f34743a, new gi.c(9), null, null, null, new ci.c0(5, l0Var, new w(9, i8Var, o2Var)), false, true, new ta0((Object) null, 1));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f34342c;
                pf.c h = c2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8((i8) this.f34341b, h, 2);
                l0.F("disable backup: getting phrase...");
                l0Var2.y(new j((Object) l0Var2, (Object) d8Var, (Object) ((g0) this.d), 5), false, true);
                return;
            default:
                j9 j9Var = (j9) this.f34341b;
                ig.z0 z0Var = (ig.z0) this.d;
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.f34342c;
                if (z0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -j9Var.f34673n0;
                    j9Var.f34673n0 = i11;
                    AndroidUtilities.shakeViewSpring(z0Var, i11);
                    return;
                }
                String trim = z0Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                j9Var.f34665f0 = trim;
                j9Var.f34666g0 = !z1Var.b();
                if (TextUtils.isEmpty(j9Var.f34665f0)) {
                    j9Var.O.setVisibility(8);
                } else {
                    j9Var.O.setText(j9Var.f34665f0);
                    j9Var.O.setVisibility(0);
                }
                j9Var.z0();
                c2Var.dismiss();
                j9Var.o0();
                return;
        }
    }

    public b8(i8 i8Var, l0 l0Var, g0 g0Var) {
        this.f34340a = 1;
        this.f34341b = i8Var;
        this.f34342c = l0Var;
        this.d = g0Var;
    }
}
