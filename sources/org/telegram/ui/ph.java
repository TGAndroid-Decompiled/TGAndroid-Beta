package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class ph implements FlagSecureReason.FlagSecureCondition, uu0, r0.n, zf.a0, org.telegram.ui.ActionBar.a2 {
    public final sn f40151a;

    public ph(sn snVar) {
        this.f40151a = snVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        sn snVar = this.f40151a;
        r0.k1 z82 = snVar.z8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.f12286a;
        int i11 = defaultWindowInsets.f12288c;
        if (snVar.Ua != i10 || snVar.Va != i11) {
            snVar.Ua = i10;
            snVar.Va = i11;
            snVar.X0.requestLayout();
        }
        snVar.v.j(z82);
        ah.x xVar = snVar.K3;
        if (xVar != null) {
            xVar.setPadding(i10, 0, i11, 0);
        }
        snVar.q7();
        snVar.u7();
        snVar.u9();
        boolean p5 = z82.f44873a.p(8);
        if (snVar.Ta != p5) {
            snVar.Ta = p5;
            snVar.X0.S();
        }
        ei.h1 h1Var = snVar.f41363q1;
        if (h1Var != null) {
            r0.i0.b(h1Var, z82);
        }
        return r0.k1.f44872b;
    }

    @Override
    public void a(int i10) {
        sn.X0(this.f40151a, i10);
    }

    @Override
    public void b(float[] fArr) {
        sn snVar = this.f40151a;
        fArr[1] = snVar.f41454x0.getBottom() - snVar.Ba;
        fArr[0] = (snVar.f41454x0.getTop() + snVar.f41398s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        sn snVar = this.f40151a;
        snVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            snVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean run() {
        sn snVar = this.f40151a;
        if (snVar.h == null && !snVar.D9()) {
            return false;
        }
        return true;
    }
}
