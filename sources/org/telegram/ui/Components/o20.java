package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class o20 implements org.telegram.messenger.s10, org.telegram.messenger.t10 {
    public final p20 f36684a;

    public o20(p20 p20Var) {
        this.f36684a = p20Var;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        int i3 = r31Var.d;
        boolean z10 = false;
        if (i3 != 0) {
            p20 p20Var = this.f36684a;
            String str = (String) p20Var.f37036c.get(i3 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, p20Var.getContext(), p20Var.f37035b);
            String M0 = org.telegram.messenger.bd.M0(2131752054, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752055, null), new org.telegram.ui.jo(25, p20Var, str));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i3 = ((r31) obj).d;
        p20 p20Var = this.f36684a;
        if (i3 == 0) {
            org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(p20Var.f37034a);
            a10.f22910f.clear();
            a10.d();
            p20Var.f37038f.O(true);
            return;
        }
        org.telegram.messenger.u10 u10Var = p20Var.h;
        if (u10Var != null) {
            u10Var.a((String) p20Var.f37036c.get(i3 - 1));
        }
    }
}
