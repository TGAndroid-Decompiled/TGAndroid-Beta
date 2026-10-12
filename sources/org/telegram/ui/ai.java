package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class ai implements FlagSecureReason.FlagSecureCondition, pv0, r0.n, yf.a0, org.telegram.ui.ActionBar.z1 {
    public final eo f35814a;

    public ai(eo eoVar) {
        this.f35814a = eoVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        eo eoVar = this.f35814a;
        r0.k1 z82 = eoVar.z8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.f11574a;
        int i11 = defaultWindowInsets.f11576c;
        if (eoVar.Ua != i10 || eoVar.Va != i11) {
            eoVar.Ua = i10;
            eoVar.Va = i11;
            eoVar.X0.requestLayout();
        }
        eoVar.v.k(z82);
        ai.f0 f0Var = eoVar.K3;
        if (f0Var != null) {
            f0Var.setPadding(i10, 0, i11, 0);
        }
        eoVar.q7();
        eoVar.u7();
        eoVar.u9();
        boolean p5 = z82.f47000a.p(8);
        if (eoVar.Ta != p5) {
            eoVar.Ta = p5;
            eoVar.X0.S();
        }
        ci.h1 h1Var = eoVar.f37392q1;
        if (h1Var != null) {
            r0.i0.b(h1Var, z82);
        }
        return r0.k1.f46999b;
    }

    @Override
    public void a(int i10) {
        eo.X0(this.f35814a, i10);
    }

    @Override
    public void b(float[] fArr) {
        eo eoVar = this.f35814a;
        fArr[1] = eoVar.f37483x0.getBottom() - eoVar.Ba;
        fArr[0] = (eoVar.f37483x0.getTop() + eoVar.f37427s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        eo eoVar = this.f35814a;
        eoVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            eoVar.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public boolean run() {
        eo eoVar = this.f35814a;
        if (eoVar.h == null && !eoVar.D9()) {
            return false;
        }
        return true;
    }
}
