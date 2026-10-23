package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class nh implements FlagSecureReason.FlagSecureCondition, vu0, r0.n, zf.a0, org.telegram.ui.ActionBar.z1 {
    public final sn f39872a;

    public nh(sn snVar) {
        this.f39872a = snVar;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        sn snVar = this.f39872a;
        r0.k1 z82 = snVar.z8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.f12315a;
        int i11 = defaultWindowInsets.f12317c;
        if (snVar.f41535gb != i10 || snVar.f41547hb != i11) {
            snVar.f41535gb = i10;
            snVar.f41547hb = i11;
            snVar.f41561j1.requestLayout();
        }
        snVar.v.j(z82);
        ah.x xVar = snVar.W3;
        if (xVar != null) {
            xVar.setPadding(i10, 0, i11, 0);
        }
        snVar.q7();
        snVar.u7();
        snVar.u9();
        boolean p5 = z82.f45251a.p(8);
        if (snVar.f41523fb != p5) {
            snVar.f41523fb = p5;
            snVar.f41561j1.R();
        }
        ei.h1 h1Var = snVar.C1;
        if (h1Var != null) {
            r0.i0.b(h1Var, z82);
        }
        return r0.k1.f45250b;
    }

    @Override
    public void a(int i10) {
        sn.c1(this.f39872a, i10);
    }

    @Override
    public void b(float[] fArr) {
        sn snVar = this.f39872a;
        fArr[1] = snVar.f41737x0.getBottom() - snVar.Na;
        fArr[0] = (snVar.f41737x0.getTop() + snVar.E9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        sn snVar = this.f39872a;
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
        sn snVar = this.f39872a;
        if (snVar.h == null && !snVar.D9()) {
            return false;
        }
        return true;
    }
}
