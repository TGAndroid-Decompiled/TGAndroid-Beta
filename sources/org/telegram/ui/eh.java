package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class eh implements lh.d, org.telegram.messenger.h9, er0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final bn f47557a;

    public eh(bn bnVar) {
        this.f47557a = bnVar;
    }

    @Override
    public void a(float[] fArr) {
        bn bnVar = this.f47557a;
        fArr[1] = bnVar.A0.getBottom() - bnVar.Ya;
        fArr[0] = (bnVar.A0.getTop() + bnVar.P9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        bn bnVar = this.f47557a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
            bnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        bn bnVar = this.f47557a;
        r0.l1 P8 = bnVar.P8(l1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(P8, false);
        int i7 = I0.f15978a;
        int i10 = I0.f15980c;
        if (bnVar.f46352rb != i7 || bnVar.f46364sb != i10) {
            bnVar.f46352rb = i7;
            bnVar.f46364sb = i10;
            bnVar.f46279m1.requestLayout();
        }
        bnVar.f46404w.j(P8);
        bi.g3 g3Var = bnVar.Z3;
        if (g3Var != null) {
            g3Var.setPadding(i7, 0, i10, 0);
        }
        bnVar.C7();
        bnVar.G7();
        bnVar.N9();
        boolean p10 = P8.f56381a.p(8);
        if (bnVar.f46338qb != p10) {
            bnVar.f46338qb = p10;
            bnVar.f46279m1.R();
        }
        hi.q1 q1Var = bnVar.F1;
        if (q1Var != null) {
            r0.i0.b(q1Var, P8);
        }
        return r0.l1.f56380b;
    }

    @Override
    public boolean run() {
        bn bnVar = this.f47557a;
        if (bnVar.h == null && !bnVar.W9()) {
            return false;
        }
        return true;
    }
}
