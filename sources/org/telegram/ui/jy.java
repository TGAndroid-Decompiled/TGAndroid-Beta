package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class jy extends org.telegram.ui.ActionBar.f5 {
    public final uy f37791f;

    public jy(uy uyVar) {
        this.f37791f = uyVar;
    }

    @Override
    public final boolean b() {
        uy uyVar = this.f37791f;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (uyVar.f41445n2 != null) {
            uyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.f37791f;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (!kVar.s() && uyVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        li.n nVar;
        org.telegram.ui.Components.w00 w00Var;
        uy uyVar = this.f37791f;
        iy iyVar = uyVar.X;
        if (iyVar != null) {
            ArrayList arrayList = iyVar.F;
            if (!arrayList.isEmpty() && iyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((cy) iyVar.H).d((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        uyVar.f41428j2 = false;
        uyVar.f41432k2 = false;
        ty tyVar = uyVar.f41400e0[0];
        if (tyVar != null) {
            qy qyVar = tyVar.f40990a;
            if (uyVar.V2 == 0) {
                w00Var = tyVar.f40998w;
            } else {
                w00Var = null;
            }
            qyVar.setEmptyView(w00Var);
            uyVar.X4(false, false, true, false);
        }
        uyVar.i5(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        uyVar.X.setCloseButtonVisible(false);
        uyVar.h5(true);
        uyVar.K3();
        nVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
        nVar.g();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        li.n nVar;
        org.telegram.ui.Components.jo0 jo0Var;
        org.telegram.ui.Components.jo0 jo0Var2;
        uy uyVar = this.f37791f;
        uyVar.f41428j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        uyVar.V3();
        ty tyVar = uyVar.f41400e0[0];
        if (tyVar != null) {
            if (uyVar.f41445n2 != null) {
                tyVar.f40990a.d1();
                dy dyVar = uyVar.C0;
                if (dyVar != null) {
                    ai.w0 w0Var = dyVar.f30122a0;
                    if (w0Var.f33538i1) {
                        w0Var.f33538i1 = false;
                        w0Var.L0(false);
                    }
                }
            }
            if (!uyVar.f41436l2) {
                ci.e4 e4Var = uyVar.f41453p0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ci.e4 e4Var2 = uyVar.f41458q0;
                if (e4Var2 != null) {
                    e4Var2.e(true);
                }
            }
        }
        jx jxVar = uyVar.E0;
        if (jxVar != null && jxVar.getPremiumHint() != null) {
            uyVar.E0.getPremiumHint().e(true);
        }
        if (!uyVar.K) {
            uyVar.L4(0.0f);
        }
        uyVar.i5(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        nVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
        nVar.g();
        dy dyVar2 = uyVar.C0;
        if (dyVar2 != null && (jo0Var2 = dyVar2.f30125d0) != null) {
            jo0Var2.f10612c = gg.f0.All;
        }
        if ((dyVar2 != null && (jo0Var = dyVar2.f30125d0) != null && jo0Var.N()) || uyVar.getMessagesController().getTotalDialogsCount() > 10 || uyVar.f41473s3 || uyVar.K) {
            uyVar.f41432k2 = true;
            if (!uyVar.f41456p3) {
                uyVar.X4(true, false, true, false);
            }
        }
        uyVar.X.setCloseButtonVisible(true);
        uyVar.h5(true);
        uyVar.K3();
    }

    @Override
    public final void q(EditText editText) {
        dy dyVar;
        org.telegram.ui.Components.jo0 jo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        uy uyVar = this.f37791f;
        if (!isEmpty || (((dyVar = uyVar.C0) != null && (jo0Var = dyVar.f30125d0) != null && jo0Var.N()) || uyVar.f41473s3 || uyVar.K)) {
            uyVar.f41432k2 = true;
            if (!uyVar.f41456p3) {
                uyVar.X4(true, false, true, false);
            }
        }
        dy dyVar2 = uyVar.C0;
        if (dyVar2 != null) {
            View currentView = dyVar2.getCurrentView();
            boolean z11 = !dyVar2.f30128g0;
            if (!TextUtils.isEmpty(dyVar2.M0)) {
                z10 = z11;
            }
            dyVar2.M0 = obj;
            dyVar2.Q(currentView, dyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
