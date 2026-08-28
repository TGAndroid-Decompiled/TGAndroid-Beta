package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class mh implements r0.o, ff.e0, org.telegram.ui.ActionBar.b2 {
    public final qn f40422a;

    public mh(qn qnVar) {
        this.f40422a = qnVar;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i9 = defaultWindowInsets.f10848a;
        int i10 = defaultWindowInsets.f10850c;
        qn qnVar = this.f40422a;
        if (qnVar.Qa != i9 || qnVar.Ra != i10) {
            qnVar.Qa = i9;
            qnVar.Ra = i10;
            qnVar.T0.requestLayout();
        }
        qnVar.v.i(m1Var);
        pg.e eVar = qnVar.G3;
        if (eVar != null) {
            eVar.setPadding(i9, 0, i10, 0);
        }
        qnVar.n7();
        qnVar.r7();
        qnVar.p9();
        boolean p6 = m1Var.f46929a.p(8);
        if (qnVar.Pa != p6) {
            qnVar.Pa = p6;
            qnVar.T0.S();
        }
        kh.j1 j1Var = qnVar.f41990m1;
        if (j1Var != null) {
            r0.j0.b(j1Var, m1Var);
        }
        return r0.m1.f46928b;
    }

    @Override
    public void a(int i9) {
        qn.S0(this.f40422a, i9);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        qn qnVar = this.f40422a;
        qnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            qnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
