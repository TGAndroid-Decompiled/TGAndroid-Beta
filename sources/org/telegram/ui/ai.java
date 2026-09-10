package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class ai implements r0.n, xf.b0, org.telegram.ui.ActionBar.c2 {
    public final eo f31011a;

    public ai(eo eoVar) {
        this.f31011a = eoVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10074a;
        int i11 = defaultWindowInsets.f10076c;
        eo eoVar = this.f31011a;
        if (eoVar.Ua != i10 || eoVar.Va != i11) {
            eoVar.Ua = i10;
            eoVar.Va = i11;
            eoVar.X0.requestLayout();
        }
        eoVar.v.i(l1Var);
        gh.f fVar = eoVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        eoVar.n7();
        eoVar.r7();
        eoVar.p9();
        boolean p5 = l1Var.f41074a.p(8);
        if (eoVar.Ta != p5) {
            eoVar.Ta = p5;
            eoVar.X0.S();
        }
        bi.p1 p1Var = eoVar.f32452q1;
        if (p1Var != null) {
            r0.i0.b(p1Var, l1Var);
        }
        return r0.l1.f41073b;
    }

    @Override
    public void b(int i10) {
        eo.S0(this.f31011a, i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        eo eoVar = this.f31011a;
        eoVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            eoVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
