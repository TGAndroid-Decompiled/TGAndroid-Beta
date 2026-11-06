package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s20 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final t20 f37865a;

    public s20(t20 t20Var) {
        this.f37865a = t20Var;
    }

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        int i7 = x31Var.d;
        boolean z9 = false;
        if (i7 != 0) {
            t20 t20Var = this.f37865a;
            String str = (String) t20Var.f38191c.get(i7 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t20Var.getContext(), t20Var.f38190b);
            String M0 = org.telegram.messenger.hd.M0(2131752054, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752055, null), new f2(15, t20Var, str));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
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
        int i7 = ((x31) obj).d;
        t20 t20Var = this.f37865a;
        if (i7 == 0) {
            org.telegram.messenger.oa a10 = org.telegram.messenger.oa.a(t20Var.f38189a);
            a10.f24312f.clear();
            a10.d();
            t20Var.f38193f.O(true);
            return;
        }
        org.telegram.messenger.c20 c20Var = t20Var.h;
        if (c20Var != null) {
            c20Var.a((String) t20Var.f38191c.get(i7 - 1));
        }
    }
}
