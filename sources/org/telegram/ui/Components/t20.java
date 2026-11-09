package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t20 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final u20 f38260a;

    public t20(u20 u20Var) {
        this.f38260a = u20Var;
    }

    @Override
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        int i7 = y31Var.d;
        boolean z9 = false;
        if (i7 != 0) {
            u20 u20Var = this.f38260a;
            String str = (String) u20Var.f38573c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, u20Var.getContext(), u20Var.f38572b);
            String M0 = org.telegram.messenger.id.M0(2131752054, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752055, null), new f2(15, u20Var, str));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var.show();
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = ((y31) obj).d;
        u20 u20Var = this.f38260a;
        if (i7 == 0) {
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(u20Var.f38571a);
            a10.f24316f.clear();
            a10.d();
            u20Var.f38575f.O(true);
            return;
        }
        org.telegram.messenger.c20 c20Var = u20Var.h;
        if (c20Var != null) {
            c20Var.a((String) u20Var.f38573c.get(i7 - 1));
        }
    }
}
