package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class ph implements FlagSecureReason.FlagSecureCondition, zu0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final un f42501a;

    public ph(un unVar) {
        this.f42501a = unVar;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        un unVar = this.f42501a;
        r0.k1 C8 = unVar.C8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(C8, false);
        int i10 = defaultWindowInsets.f13450a;
        int i11 = defaultWindowInsets.f13452c;
        if (unVar.pb != i10 || unVar.f44386qb != i11) {
            unVar.pb = i10;
            unVar.f44386qb = i11;
            unVar.f44292j1.requestLayout();
        }
        unVar.v.j(C8);
        bh.r rVar = unVar.W3;
        if (rVar != null) {
            rVar.setPadding(i10, 0, i11, 0);
        }
        unVar.u7();
        unVar.y7();
        unVar.y9();
        boolean p10 = C8.f47115a.p(8);
        if (unVar.f44364ob != p10) {
            unVar.f44364ob = p10;
            unVar.f44292j1.R();
        }
        fi.h1 h1Var = unVar.C1;
        if (h1Var != null) {
            r0.i0.b(h1Var, C8);
        }
        return r0.k1.f47114b;
    }

    @Override
    public void a(float[] fArr) {
        un unVar = this.f42501a;
        fArr[1] = unVar.f44468x0.getBottom() - unVar.Na;
        fArr[0] = (unVar.f44468x0.getTop() + unVar.E9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        un unVar = this.f42501a;
        unVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            unVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean run() {
        un unVar = this.f42501a;
        if (unVar.h == null && !unVar.H9()) {
            return false;
        }
        return true;
    }
}
