package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class dh implements lh.d, org.telegram.messenger.h9, er0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final bn f46977a;

    public dh(bn bnVar) {
        this.f46977a = bnVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        bn bnVar = this.f46977a;
        r0.l1 P8 = bnVar.P8(l1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(P8, false);
        int i7 = I0.f15892a;
        int i10 = I0.f15894c;
        if (bnVar.f46166rb != i7 || bnVar.f46178sb != i10) {
            bnVar.f46166rb = i7;
            bnVar.f46178sb = i10;
            bnVar.f46093m1.requestLayout();
        }
        bnVar.f46218w.j(P8);
        bi.a3 a3Var = bnVar.Z3;
        if (a3Var != null) {
            a3Var.setPadding(i7, 0, i10, 0);
        }
        bnVar.C7();
        bnVar.G7();
        bnVar.N9();
        boolean p10 = P8.f56258a.p(8);
        if (bnVar.f46152qb != p10) {
            bnVar.f46152qb = p10;
            bnVar.f46093m1.R();
        }
        hi.i1 i1Var = bnVar.F1;
        if (i1Var != null) {
            r0.i0.b(i1Var, P8);
        }
        return r0.l1.f56257b;
    }

    @Override
    public void a(float[] fArr) {
        bn bnVar = this.f46977a;
        fArr[1] = bnVar.A0.getBottom() - bnVar.Ya;
        fArr[0] = (bnVar.A0.getTop() + bnVar.P9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        bn bnVar = this.f46977a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
            bnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean run() {
        bn bnVar = this.f46977a;
        if (bnVar.h == null && !bnVar.W9()) {
            return false;
        }
        return true;
    }
}
