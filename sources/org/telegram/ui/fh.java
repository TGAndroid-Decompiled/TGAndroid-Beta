package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class fh implements lh.d, org.telegram.messenger.j9, hr0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final cn f45769a;

    public fh(cn cnVar) {
        this.f45769a = cnVar;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        cn cnVar = this.f45769a;
        r0.k1 O8 = cnVar.O8(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(O8, false);
        int i7 = I0.f15122a;
        int i10 = I0.f15124c;
        if (cnVar.f44623pb != i7 || cnVar.f44636qb != i10) {
            cnVar.f44623pb = i7;
            cnVar.f44636qb = i10;
            cnVar.l1.requestLayout();
        }
        cnVar.f44702w.j(O8);
        bi.e5 e5Var = cnVar.Y3;
        if (e5Var != null) {
            e5Var.setPadding(i7, 0, i10, 0);
        }
        cnVar.C7();
        cnVar.G7();
        cnVar.M9();
        boolean p10 = O8.f54213a.p(8);
        if (cnVar.f44610ob != p10) {
            cnVar.f44610ob = p10;
            cnVar.l1.R();
        }
        fi.g1 g1Var = cnVar.E1;
        if (g1Var != null) {
            r0.i0.b(g1Var, O8);
        }
        return r0.k1.f54212b;
    }

    @Override
    public void a(float[] fArr) {
        cn cnVar = this.f45769a;
        fArr[1] = cnVar.f44741z0.getBottom() - cnVar.Wa;
        fArr[0] = (cnVar.f44741z0.getTop() + cnVar.N9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cn cnVar = this.f45769a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
            cnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean run() {
        cn cnVar = this.f45769a;
        if (cnVar.h == null && !cnVar.V9()) {
            return false;
        }
        return true;
    }
}
