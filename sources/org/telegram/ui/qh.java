package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class qh implements FlagSecureReason.FlagSecureCondition, bv0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final wn f42707a;

    public qh(wn wnVar) {
        this.f42707a = wnVar;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        wn wnVar = this.f42707a;
        r0.k1 F8 = wnVar.F8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(F8, false);
        int i10 = defaultWindowInsets.f13449a;
        int i11 = defaultWindowInsets.f13451c;
        if (wnVar.f45297tb != i10 || wnVar.f45310ub != i11) {
            wnVar.f45297tb = i10;
            wnVar.f45310ub = i11;
            wnVar.f45163j1.requestLayout();
        }
        wnVar.v.j(F8);
        bh.r rVar = wnVar.W3;
        if (rVar != null) {
            rVar.setPadding(i10, 0, i11, 0);
        }
        wnVar.w7();
        wnVar.A7();
        wnVar.B9();
        boolean p10 = F8.f47153a.p(8);
        if (wnVar.f45284sb != p10) {
            wnVar.f45284sb = p10;
            wnVar.f45163j1.R();
        }
        fi.h1 h1Var = wnVar.C1;
        if (h1Var != null) {
            r0.i0.b(h1Var, F8);
        }
        return r0.k1.f47152b;
    }

    @Override
    public void a(float[] fArr) {
        wn wnVar = this.f42707a;
        fArr[1] = wnVar.f45339x0.getBottom() - wnVar.Ra;
        fArr[0] = (wnVar.f45339x0.getTop() + wnVar.I9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        wn wnVar = this.f42707a;
        wnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            wnVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean run() {
        wn wnVar = this.f42707a;
        if (wnVar.h == null && !wnVar.K9()) {
            return false;
        }
        return true;
    }
}
