package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

public final class oh implements r0.o, gf.e0, org.telegram.ui.ActionBar.a2 {

    public final rn f41098a;

    public oh(rn rnVar) {
        this.f41098a = rnVar;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f10489a;
        int i11 = defaultWindowInsets.f10491c;
        rn rnVar = this.f41098a;
        if (rnVar.Qa != i10 || rnVar.Ra != i11) {
            rnVar.Qa = i10;
            rnVar.Ra = i11;
            rnVar.T0.requestLayout();
        }
        rnVar.v.i(m1Var);
        qg.e eVar = rnVar.G3;
        if (eVar != null) {
            eVar.setPadding(i10, 0, i11, 0);
        }
        rnVar.n7();
        rnVar.r7();
        rnVar.p9();
        boolean zP = m1Var.f46619a.p(8);
        if (rnVar.Pa != zP) {
            rnVar.Pa = zP;
            rnVar.T0.S();
        }
        lh.h1 h1Var = rnVar.f42126m1;
        if (h1Var != null) {
            r0.j0.b(h1Var, m1Var);
        }
        return r0.m1.f46618b;
    }

    @Override
    public void a(int i10) {
        rn.S0(this.f41098a, i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        rn rnVar = this.f41098a;
        rnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            rnVar.getParentActivity().startActivity(intent);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
