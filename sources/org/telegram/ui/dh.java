package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class dh implements lh.d, org.telegram.messenger.i9, cr0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final an f46369a;

    public dh(an anVar) {
        this.f46369a = anVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        an anVar = this.f46369a;
        r0.k1 P8 = anVar.P8(k1Var);
        i0.c I0 = org.telegram.messenger.g0.I0(P8, false);
        int i7 = I0.f15574a;
        int i10 = I0.f15576c;
        if (anVar.f45336qb != i7 || anVar.f45350rb != i10) {
            anVar.f45336qb = i7;
            anVar.f45350rb = i10;
            anVar.f45277m1.requestLayout();
        }
        anVar.f45402w.j(P8);
        bi.g2 g2Var = anVar.Z3;
        if (g2Var != null) {
            g2Var.setPadding(i7, 0, i10, 0);
        }
        anVar.C7();
        anVar.G7();
        anVar.N9();
        boolean p10 = P8.f55682a.p(8);
        if (anVar.f45323pb != p10) {
            anVar.f45323pb = p10;
            anVar.f45277m1.R();
        }
        hi.i1 i1Var = anVar.F1;
        if (i1Var != null) {
            r0.i0.b(i1Var, P8);
        }
        return r0.k1.f55681b;
    }

    @Override
    public void a(float[] fArr) {
        an anVar = this.f46369a;
        fArr[1] = anVar.A0.getBottom() - anVar.Xa;
        fArr[0] = (anVar.A0.getTop() + anVar.O9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        an anVar = this.f46369a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26609b.getPackageName()));
            anVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean run() {
        an anVar = this.f46369a;
        if (anVar.h == null && !anVar.W9()) {
            return false;
        }
        return true;
    }
}
