package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class jy extends org.telegram.ui.ActionBar.e5 {
    public final sy f39175f;

    public jy(sy syVar) {
        this.f39175f = syVar;
    }

    @Override
    public final boolean b() {
        sy syVar = this.f39175f;
        org.telegram.ui.ActionBar.u0 u0Var = syVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (syVar.f41986n2 != null) {
            syVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        sy syVar = this.f39175f;
        kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        if (!kVar.t() && syVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.k10 k10Var;
        sy syVar = this.f39175f;
        iy iyVar = syVar.X;
        if (iyVar != null) {
            ArrayList arrayList = iyVar.F;
            if (!arrayList.isEmpty() && iyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.p0) arrayList.get(i10)).h) {
                        ((xx) iyVar.H).d((gg.p0) arrayList.get(i10));
                    }
                }
            }
        }
        syVar.f41969j2 = false;
        syVar.f41973k2 = false;
        ry ryVar = syVar.f41941e0[0];
        if (ryVar != null) {
            oy oyVar = ryVar.f41564a;
            if (syVar.V2 == 0) {
                k10Var = ryVar.f41572w;
            } else {
                k10Var = null;
            }
            oyVar.setEmptyView(k10Var);
            syVar.L4(false, false, true, false);
        }
        syVar.W4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        syVar.X.setCloseButtonVisible(false);
        syVar.V4(true);
        syVar.y3();
        syVar.j3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.xo0 xo0Var;
        org.telegram.ui.Components.xo0 xo0Var2;
        sy syVar = this.f39175f;
        syVar.f41969j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = syVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        syVar.J3();
        ry ryVar = syVar.f41941e0[0];
        if (ryVar != null) {
            if (syVar.f41986n2 != null) {
                ryVar.f41564a.c1();
                cy cyVar = syVar.C0;
                if (cyVar != null) {
                    ai.w0 w0Var = cyVar.V;
                    if (w0Var.f30556g1) {
                        w0Var.f30556g1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!syVar.f41977l2) {
                ci.d4 d4Var = syVar.f41994p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                ci.d4 d4Var2 = syVar.f41999q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
        jx jxVar = syVar.E0;
        if (jxVar != null && jxVar.getPremiumHint() != null) {
            syVar.E0.getPremiumHint().e(true);
        }
        if (!syVar.K) {
            syVar.z4(0.0f);
        }
        syVar.W4(false, false);
        kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        syVar.j3();
        cy cyVar2 = syVar.C0;
        if (cyVar2 != null && (xo0Var2 = cyVar2.f26165b0) != null) {
            xo0Var2.f10616c = gg.e0.All;
        }
        if ((cyVar2 != null && (xo0Var = cyVar2.f26165b0) != null && xo0Var.N()) || syVar.getMessagesController().getTotalDialogsCount() > 10 || syVar.f42014s3 || syVar.K) {
            syVar.f41973k2 = true;
            if (!syVar.f41997p3) {
                syVar.L4(true, false, true, false);
            }
        }
        syVar.X.setCloseButtonVisible(true);
        syVar.V4(true);
        syVar.y3();
    }

    @Override
    public final void q(EditText editText) {
        cy cyVar;
        org.telegram.ui.Components.xo0 xo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        sy syVar = this.f39175f;
        if (!isEmpty || (((cyVar = syVar.C0) != null && (xo0Var = cyVar.f26165b0) != null && xo0Var.N()) || syVar.f42014s3 || syVar.K)) {
            syVar.f41973k2 = true;
            if (!syVar.f41997p3) {
                syVar.L4(true, false, true, false);
            }
        }
        cy cyVar2 = syVar.C0;
        if (cyVar2 != null) {
            View currentView = cyVar2.getCurrentView();
            boolean z11 = !cyVar2.f26168e0;
            if (!TextUtils.isEmpty(cyVar2.K0)) {
                z10 = z11;
            }
            cyVar2.K0 = obj;
            cyVar2.O(currentView, cyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
