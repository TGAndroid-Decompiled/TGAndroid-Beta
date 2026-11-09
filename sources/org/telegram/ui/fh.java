package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class fh implements lh.d, org.telegram.messenger.j9, gr0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final cn f45717a;

    public fh(cn cnVar) {
        this.f45717a = cnVar;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        cn cnVar = this.f45717a;
        r0.k1 O8 = cnVar.O8(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(O8, false);
        int i7 = I0.f15120a;
        int i10 = I0.f15122c;
        if (cnVar.f44582pb != i7 || cnVar.f44595qb != i10) {
            cnVar.f44582pb = i7;
            cnVar.f44595qb = i10;
            cnVar.l1.requestLayout();
        }
        cnVar.f44661w.j(O8);
        bi.e5 e5Var = cnVar.Y3;
        if (e5Var != null) {
            e5Var.setPadding(i7, 0, i10, 0);
        }
        cnVar.C7();
        cnVar.G7();
        cnVar.M9();
        boolean p10 = O8.f54214a.p(8);
        if (cnVar.f44569ob != p10) {
            cnVar.f44569ob = p10;
            cnVar.l1.R();
        }
        fi.g1 g1Var = cnVar.E1;
        if (g1Var != null) {
            r0.i0.b(g1Var, O8);
        }
        return r0.k1.f54213b;
    }

    @Override
    public void a(float[] fArr) {
        cn cnVar = this.f45717a;
        fArr[1] = cnVar.f44700z0.getBottom() - cnVar.Wa;
        fArr[0] = (cnVar.f44700z0.getTop() + cnVar.N9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cn cnVar = this.f45717a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
            cnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean run() {
        cn cnVar = this.f45717a;
        if (cnVar.h == null && !cnVar.V9()) {
            return false;
        }
        return true;
    }
}
