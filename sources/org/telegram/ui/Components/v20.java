package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v20 implements org.telegram.messenger.x10, org.telegram.messenger.y10 {
    public final w20 f40238a;

    public v20(w20 w20Var) {
        this.f40238a = w20Var;
    }

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        int i7 = b41Var.d;
        boolean z10 = false;
        if (i7 != 0) {
            w20 w20Var = this.f40238a;
            String str = (String) w20Var.f41236c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, w20Var.getContext(), w20Var.f41235b);
            String M0 = org.telegram.messenger.hd.M0(2131752054, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752055, null), new f1(19, w20Var, str));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            t1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = ((b41) obj).d;
        w20 w20Var = this.f40238a;
        if (i7 == 0) {
            org.telegram.messenger.na a10 = org.telegram.messenger.na.a(w20Var.f41234a);
            a10.f25183f.clear();
            a10.d();
            w20Var.f41238f.O(true);
            return;
        }
        org.telegram.messenger.z10 z10Var = w20Var.h;
        if (z10Var != null) {
            z10Var.a((String) w20Var.f41236c.get(i7 - 1));
        }
    }
}
