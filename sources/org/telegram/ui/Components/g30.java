package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g30 implements org.telegram.messenger.v10, org.telegram.messenger.w10 {
    public final h30 f35395a;

    public g30(h30 h30Var) {
        this.f35395a = h30Var;
    }

    @Override
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = o41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            h30 h30Var = this.f35395a;
            String str = (String) h30Var.f35775c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h30Var.getContext(), h30Var.f35774b);
            String N0 = org.telegram.messenger.gd.N0(2131752042, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752040, str);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752043, null), new h2(18, h30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = ((o41) obj).d;
        h30 h30Var = this.f35395a;
        if (i7 == 0) {
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(h30Var.f35773a);
            a10.f25580f.clear();
            a10.d();
            h30Var.f35777f.O(true);
            return;
        }
        org.telegram.messenger.x10 x10Var = h30Var.h;
        if (x10Var != null) {
            x10Var.a((String) h30Var.f35775c.get(i7 - 1));
        }
    }
}
