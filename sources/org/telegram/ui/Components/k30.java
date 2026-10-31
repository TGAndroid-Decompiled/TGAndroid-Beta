package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k30 implements org.telegram.messenger.o20, org.telegram.messenger.p20 {
    public final l30 f27627a;

    public k30(l30 l30Var) {
        this.f27627a = l30Var;
    }

    @Override
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        int i10 = a51Var.d;
        boolean z10 = false;
        if (i10 != 0) {
            l30 l30Var = this.f27627a;
            String str = (String) l30Var.f28003c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l30Var.getContext(), l30Var.f28002b);
            String L0 = org.telegram.messenger.cd.L0(2131752054, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131752052, str);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752055, null), new f2(16, l30Var, str));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            x1Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        int i10 = ((a51) obj).d;
        l30 l30Var = this.f27627a;
        if (i10 == 0) {
            org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(l30Var.f28001a);
            a2.f17247f.clear();
            a2.d();
            l30Var.f28004f.O(true);
            return;
        }
        org.telegram.messenger.q20 q20Var = l30Var.h;
        if (q20Var != null) {
            q20Var.a((String) l30Var.f28003c.get(i10 - 1));
        }
    }
}
