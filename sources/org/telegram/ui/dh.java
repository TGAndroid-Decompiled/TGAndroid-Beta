package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class dh implements lh.d, org.telegram.messenger.i9, fr0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final bn f46930a;

    public dh(bn bnVar) {
        this.f46930a = bnVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        bn bnVar = this.f46930a;
        r0.l1 P8 = bnVar.P8(l1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(P8, false);
        int i7 = I0.f15883a;
        int i10 = I0.f15885c;
        if (bnVar.f46137rb != i7 || bnVar.f46149sb != i10) {
            bnVar.f46137rb = i7;
            bnVar.f46149sb = i10;
            bnVar.f46064m1.requestLayout();
        }
        bnVar.f46189w.j(P8);
        bi.g3 g3Var = bnVar.Z3;
        if (g3Var != null) {
            g3Var.setPadding(i7, 0, i10, 0);
        }
        bnVar.C7();
        bnVar.G7();
        bnVar.N9();
        boolean p10 = P8.f56268a.p(8);
        if (bnVar.f46123qb != p10) {
            bnVar.f46123qb = p10;
            bnVar.f46064m1.R();
        }
        hi.h1 h1Var = bnVar.F1;
        if (h1Var != null) {
            r0.i0.b(h1Var, P8);
        }
        return r0.l1.f56267b;
    }

    @Override
    public void a(float[] fArr) {
        bn bnVar = this.f46930a;
        fArr[1] = bnVar.A0.getBottom() - bnVar.Ya;
        fArr[0] = (bnVar.A0.getTop() + bnVar.P9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        bn bnVar = this.f46930a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26895b.getPackageName()));
            bnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean run() {
        bn bnVar = this.f46930a;
        if (bnVar.h == null && !bnVar.W9()) {
            return false;
        }
        return true;
    }
}
