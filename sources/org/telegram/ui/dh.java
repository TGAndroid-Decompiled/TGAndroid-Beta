package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class dh implements org.telegram.messenger.j9, er0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final an f45069a;

    public dh(an anVar) {
        this.f45069a = anVar;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        an anVar = this.f45069a;
        r0.k1 N8 = anVar.N8(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(N8, false);
        int i7 = I0.f15117a;
        int i10 = I0.f15119c;
        if (anVar.f43895nb != i7 || anVar.f43907ob != i10) {
            anVar.f43895nb = i7;
            anVar.f43907ob = i10;
            anVar.l1.requestLayout();
        }
        anVar.f43999w.j(N8);
        bi.e5 e5Var = anVar.Y3;
        if (e5Var != null) {
            e5Var.setPadding(i7, 0, i10, 0);
        }
        anVar.B7();
        anVar.F7();
        anVar.L9();
        boolean p10 = N8.f54109a.p(8);
        if (anVar.mb != p10) {
            anVar.mb = p10;
            anVar.l1.R();
        }
        fi.g1 g1Var = anVar.E1;
        if (g1Var != null) {
            r0.i0.b(g1Var, N8);
        }
        return r0.k1.f54108b;
    }

    @Override
    public void a(float[] fArr) {
        an anVar = this.f45069a;
        fArr[1] = anVar.f44038z0.getBottom() - anVar.Ua;
        fArr[0] = (anVar.f44038z0.getTop() + anVar.L9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        an anVar = this.f45069a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25555b.getPackageName()));
            anVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean run() {
        an anVar = this.f45069a;
        if (anVar.h == null && !anVar.U9()) {
            return false;
        }
        return true;
    }
}
