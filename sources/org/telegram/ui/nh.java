package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class nh implements FlagSecureReason.FlagSecureCondition, su0, r0.n, zf.a0, org.telegram.ui.ActionBar.a2 {
    public final qn f39596a;

    public nh(qn qnVar) {
        this.f39596a = qnVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        qn qnVar = this.f39596a;
        r0.k1 z82 = qnVar.z8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.f12283a;
        int i11 = defaultWindowInsets.f12285c;
        if (qnVar.Ua != i10 || qnVar.Va != i11) {
            qnVar.Ua = i10;
            qnVar.Va = i11;
            qnVar.X0.requestLayout();
        }
        qnVar.v.j(z82);
        ah.x xVar = qnVar.K3;
        if (xVar != null) {
            xVar.setPadding(i10, 0, i11, 0);
        }
        qnVar.q7();
        qnVar.u7();
        qnVar.u9();
        boolean p5 = z82.f44838a.p(8);
        if (qnVar.Ta != p5) {
            qnVar.Ta = p5;
            qnVar.X0.S();
        }
        ei.h1 h1Var = qnVar.f40813q1;
        if (h1Var != null) {
            r0.i0.b(h1Var, z82);
        }
        return r0.k1.f44837b;
    }

    @Override
    public void a(int i10) {
        qn.X0(this.f39596a, i10);
    }

    @Override
    public void b(float[] fArr) {
        qn qnVar = this.f39596a;
        fArr[1] = qnVar.f40904x0.getBottom() - qnVar.Ba;
        fArr[0] = (qnVar.f40904x0.getTop() + qnVar.f40848s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        qn qnVar = this.f39596a;
        qnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            qnVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean run() {
        qn qnVar = this.f39596a;
        if (qnVar.h == null && !qnVar.D9()) {
            return false;
        }
        return true;
    }
}
