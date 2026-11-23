package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d30 implements org.telegram.messenger.u10, org.telegram.messenger.v10 {
    public final e30 f34204a;

    public d30(e30 e30Var) {
        this.f34204a = e30Var;
    }

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = n41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            e30 e30Var = this.f34204a;
            String str = (String) e30Var.f34559c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e30Var.getContext(), e30Var.f34558b);
            String N0 = org.telegram.messenger.gd.N0(2131752042, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752040, str);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752043, null), new g2(18, e30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = ((n41) obj).d;
        e30 e30Var = this.f34204a;
        if (i7 == 0) {
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(e30Var.f34557a);
            a10.f25647f.clear();
            a10.d();
            e30Var.f34561f.O(true);
            return;
        }
        org.telegram.messenger.w10 w10Var = e30Var.h;
        if (w10Var != null) {
            w10Var.a((String) e30Var.f34559c.get(i7 - 1));
        }
    }
}
