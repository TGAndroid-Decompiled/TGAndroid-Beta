package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g30 implements org.telegram.messenger.w10, org.telegram.messenger.x10 {
    public final h30 f35376a;

    public g30(h30 h30Var) {
        this.f35376a = h30Var;
    }

    @Override
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = o41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            h30 h30Var = this.f35376a;
            String str = (String) h30Var.f35721c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, h30Var.getContext(), h30Var.f35720b);
            String N0 = org.telegram.messenger.hd.N0(2131752042, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131752040, str);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752043, null), new h2(18, h30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
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
        h30 h30Var = this.f35376a;
        if (i7 == 0) {
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(h30Var.f35719a);
            a10.f25715f.clear();
            a10.d();
            h30Var.f35723f.O(true);
            return;
        }
        org.telegram.messenger.y10 y10Var = h30Var.h;
        if (y10Var != null) {
            y10Var.a((String) h30Var.f35721c.get(i7 - 1));
        }
    }
}
