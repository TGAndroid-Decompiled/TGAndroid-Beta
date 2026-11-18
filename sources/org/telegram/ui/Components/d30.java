package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d30 implements org.telegram.messenger.v10, org.telegram.messenger.w10 {
    public final e30 f34271a;

    public d30(e30 e30Var) {
        this.f34271a = e30Var;
    }

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = l41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            e30 e30Var = this.f34271a;
            String str = (String) e30Var.f34592c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e30Var.getContext(), e30Var.f34591b);
            String M0 = org.telegram.messenger.gd.M0(2131752043, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752041, str);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752044, null), new g2(18, e30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            u1Var.show();
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
        int i7 = ((l41) obj).d;
        e30 e30Var = this.f34271a;
        if (i7 == 0) {
            org.telegram.messenger.ma a10 = org.telegram.messenger.ma.a(e30Var.f34590a);
            a10.f25552f.clear();
            a10.d();
            e30Var.f34594f.O(true);
            return;
        }
        org.telegram.messenger.x10 x10Var = e30Var.h;
        if (x10Var != null) {
            x10Var.a((String) e30Var.f34592c.get(i7 - 1));
        }
    }
}
