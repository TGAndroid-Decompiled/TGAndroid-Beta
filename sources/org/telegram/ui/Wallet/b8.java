package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e71;
import org.telegram.ui.ta0;
public final class b8 implements org.telegram.ui.ActionBar.z1 {
    public final int f34338a;
    public final e71 f34339b;
    public final Object f34340c;
    public final Object d;

    public b8(e71 e71Var, Object obj, Object obj2, int i10) {
        this.f34338a = i10;
        this.f34339b = e71Var;
        this.d = obj;
        this.f34340c = obj2;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.f34338a) {
            case 0:
                i8 i8Var = (i8) this.f34339b;
                l0 l0Var = (l0) this.f34340c;
                if (!((Boolean) this.d).booleanValue()) {
                    l0Var.f34743c.B();
                }
                if (i8Var.getParentLayout() != null && i8Var.getParentLayout().getFragmentStack().size() > 1) {
                    o2Var = (org.telegram.ui.ActionBar.o2) i8Var.getParentLayout().getFragmentStack().get(i8Var.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    o2Var = null;
                }
                r2.a(l0Var.f34741a, new gi.c(9), null, null, null, new ci.c0(5, l0Var, new w(9, i8Var, o2Var)), false, true, new ta0((Object) null, 1));
                return;
            case 1:
                l0 l0Var2 = (l0) this.f34340c;
                pf.c h = c2Var.h(i10, true, true);
                h.d();
                d8 d8Var = new d8((i8) this.f34339b, h, 2);
                l0.F("disable backup: getting phrase...");
                l0Var2.y(new j((Object) l0Var2, (Object) d8Var, (Object) ((g0) this.d), 5), false, true);
                return;
            default:
                j9 j9Var = (j9) this.f34339b;
                ig.z0 z0Var = (ig.z0) this.d;
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.f34340c;
                if (z0Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i11 = -j9Var.f34671n0;
                    j9Var.f34671n0 = i11;
                    AndroidUtilities.shakeViewSpring(z0Var, i11);
                    return;
                }
                String trim = z0Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    trim = null;
                }
                j9Var.f34663f0 = trim;
                j9Var.f34664g0 = !z1Var.b();
                if (TextUtils.isEmpty(j9Var.f34663f0)) {
                    j9Var.O.setVisibility(8);
                } else {
                    j9Var.O.setText(j9Var.f34663f0);
                    j9Var.O.setVisibility(0);
                }
                j9Var.z0();
                c2Var.dismiss();
                j9Var.o0();
                return;
        }
    }

    public b8(i8 i8Var, l0 l0Var, g0 g0Var) {
        this.f34338a = 1;
        this.f34339b = i8Var;
        this.f34340c = l0Var;
        this.d = g0Var;
    }
}
