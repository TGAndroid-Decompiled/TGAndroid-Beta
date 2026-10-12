package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class py extends org.telegram.ui.ActionBar.e5 {
    public final yy f39305f;

    public py(yy yyVar) {
        this.f39305f = yyVar;
    }

    @Override
    public final boolean b() {
        yy yyVar = this.f39305f;
        org.telegram.ui.ActionBar.u0 u0Var = yyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (yyVar.f42371n2 != null) {
            yyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        yy yyVar = this.f39305f;
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (!kVar.t() && yyVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.f10 f10Var;
        yy yyVar = this.f39305f;
        oy oyVar = yyVar.X;
        if (oyVar != null) {
            ArrayList arrayList = oyVar.F;
            if (!arrayList.isEmpty() && oyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((hg.p0) arrayList.get(i10)).h) {
                        ((ey) oyVar.H).c((hg.p0) arrayList.get(i10));
                    }
                }
            }
        }
        yyVar.f42353j2 = false;
        yyVar.f42358k2 = false;
        xy xyVar = yyVar.f42325e0[0];
        if (xyVar != null) {
            uy uyVar = xyVar.f41980a;
            if (yyVar.V2 == 0) {
                f10Var = xyVar.f41987w;
            } else {
                f10Var = null;
            }
            uyVar.setEmptyView(f10Var);
            yyVar.L4(false, false, true, false);
        }
        yyVar.W4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        yyVar.X.setCloseButtonVisible(false);
        yyVar.V4(true);
        yyVar.y3();
        yyVar.j3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.so0 so0Var;
        org.telegram.ui.Components.so0 so0Var2;
        yy yyVar = this.f39305f;
        yyVar.f42353j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = yyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        yyVar.J3();
        xy xyVar = yyVar.f42325e0[0];
        if (xyVar != null) {
            if (yyVar.f42371n2 != null) {
                xyVar.f41980a.c1();
                iy iyVar = yyVar.C0;
                if (iyVar != null) {
                    bi.o0 o0Var = iyVar.V;
                    if (o0Var.f27425g1) {
                        o0Var.f27425g1 = false;
                        o0Var.K0(false);
                    }
                }
            }
            if (!yyVar.f42362l2) {
                di.d4 d4Var = yyVar.f42379p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                di.d4 d4Var2 = yyVar.f42384q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
        px pxVar = yyVar.E0;
        if (pxVar != null && pxVar.getPremiumHint() != null) {
            yyVar.E0.getPremiumHint().e(true);
        }
        if (!yyVar.K) {
            yyVar.z4(0.0f);
        }
        yyVar.W4(false, false);
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        yyVar.j3();
        iy iyVar2 = yyVar.C0;
        if (iyVar2 != null && (so0Var2 = iyVar2.f31915b0) != null) {
            so0Var2.f10566c = hg.e0.All;
        }
        if ((iyVar2 != null && (so0Var = iyVar2.f31915b0) != null && so0Var.N()) || yyVar.getMessagesController().getTotalDialogsCount() > 10 || yyVar.f42399s3 || yyVar.K) {
            yyVar.f42358k2 = true;
            if (!yyVar.f42382p3) {
                yyVar.L4(true, false, true, false);
            }
        }
        yyVar.X.setCloseButtonVisible(true);
        yyVar.V4(true);
        yyVar.y3();
    }

    @Override
    public final void q(EditText editText) {
        iy iyVar;
        org.telegram.ui.Components.so0 so0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        yy yyVar = this.f39305f;
        if (!isEmpty || (((iyVar = yyVar.C0) != null && (so0Var = iyVar.f31915b0) != null && so0Var.N()) || yyVar.f42399s3 || yyVar.K)) {
            yyVar.f42358k2 = true;
            if (!yyVar.f42382p3) {
                yyVar.L4(true, false, true, false);
            }
        }
        iy iyVar2 = yyVar.C0;
        if (iyVar2 != null) {
            View currentView = iyVar2.getCurrentView();
            boolean z11 = !iyVar2.f31918e0;
            if (!TextUtils.isEmpty(iyVar2.K0)) {
                z10 = z11;
            }
            iyVar2.K0 = obj;
            iyVar2.O(currentView, iyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
