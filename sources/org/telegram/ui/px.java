package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class px extends org.telegram.ui.ActionBar.s0 {
    public final cy f42674a;

    public px(cy cyVar) {
        this.f42674a = cyVar;
    }

    @Override
    public final boolean b() {
        cy cyVar = this.f42674a;
        org.telegram.ui.ActionBar.w0 w0Var = cyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (cyVar.f38629n2 != null) {
            cyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        cy cyVar = this.f42674a;
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        if (!kVar.q() && cyVar.R3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h() {
        oi.q qVar;
        org.telegram.ui.Components.c10 c10Var;
        cy cyVar = this.f42674a;
        ox oxVar = cyVar.X;
        if (oxVar != null) {
            ArrayList arrayList = oxVar.F;
            if (!arrayList.isEmpty() && oxVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((ig.p0) arrayList.get(i10)).h) {
                        ((ix) oxVar.H).f((ig.p0) arrayList.get(i10));
                    }
                }
            }
        }
        cyVar.f38611j2 = false;
        cyVar.f38616k2 = false;
        ay ayVar = cyVar.f38583e0[0];
        if (ayVar != null) {
            wx wxVar = ayVar.f37910a;
            if (cyVar.W2 == 0) {
                c10Var = ayVar.f37917w;
            } else {
                c10Var = null;
            }
            wxVar.setEmptyView(c10Var);
            cyVar.W4(false, false, true, false);
        }
        cyVar.i5(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        cyVar.X.setCloseButtonVisible(false);
        cyVar.h5(true);
        cyVar.J3();
        qVar = ((org.telegram.ui.ActionBar.r2) cyVar).glassEngine;
        qVar.g();
    }

    @Override
    public final void i() {
        org.telegram.ui.ActionBar.k kVar;
        oi.q qVar;
        org.telegram.ui.Components.wo0 wo0Var;
        org.telegram.ui.Components.wo0 wo0Var2;
        cy cyVar = this.f42674a;
        cyVar.f38611j2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = cyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        cyVar.U3();
        ay ayVar = cyVar.f38583e0[0];
        if (ayVar != null) {
            if (cyVar.f38629n2 != null) {
                ayVar.f37910a.c1();
                jx jxVar = cyVar.C0;
                if (jxVar != null) {
                    bi.r1 r1Var = jxVar.f27931a0;
                    if (r1Var.f30630g1) {
                        r1Var.f30630g1 = false;
                        r1Var.K0(false);
                    }
                }
            }
            if (!cyVar.f38620l2) {
                fi.v3 v3Var = cyVar.f38637p0;
                if (v3Var != null) {
                    v3Var.e(true);
                }
                fi.v3 v3Var2 = cyVar.f38642q0;
                if (v3Var2 != null) {
                    v3Var2.e(true);
                }
            }
        }
        qw qwVar = cyVar.E0;
        if (qwVar != null && qwVar.getPremiumHint() != null) {
            cyVar.E0.getPremiumHint().e(true);
        }
        if (!cyVar.K) {
            cyVar.K4(0.0f);
        }
        cyVar.i5(false, false);
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        qVar = ((org.telegram.ui.ActionBar.r2) cyVar).glassEngine;
        qVar.g();
        jx jxVar2 = cyVar.C0;
        if (jxVar2 != null && (wo0Var2 = jxVar2.f27934d0) != null) {
            wo0Var2.f14074c = ig.f0.All;
        }
        if ((jxVar2 != null && (wo0Var = jxVar2.f27934d0) != null && wo0Var.M()) || cyVar.getMessagesController().getTotalDialogsCount() > 10 || cyVar.f38662t3 || cyVar.K) {
            cyVar.f38616k2 = true;
            if (!cyVar.f38645q3) {
                cyVar.W4(true, false, true, false);
            }
        }
        cyVar.X.setCloseButtonVisible(true);
        cyVar.h5(true);
        cyVar.J3();
    }

    @Override
    public final void l(EditText editText) {
        jx jxVar;
        org.telegram.ui.Components.wo0 wo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        cy cyVar = this.f42674a;
        if (!isEmpty || (((jxVar = cyVar.C0) != null && (wo0Var = jxVar.f27934d0) != null && wo0Var.M()) || cyVar.f38662t3 || cyVar.K)) {
            cyVar.f38616k2 = true;
            if (!cyVar.f38645q3) {
                cyVar.W4(true, false, true, false);
            }
        }
        jx jxVar2 = cyVar.C0;
        if (jxVar2 != null) {
            View currentView = jxVar2.getCurrentView();
            boolean z11 = !jxVar2.f27937g0;
            if (!TextUtils.isEmpty(jxVar2.M0)) {
                z10 = z11;
            }
            jxVar2.M0 = obj;
            jxVar2.P(currentView, jxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
