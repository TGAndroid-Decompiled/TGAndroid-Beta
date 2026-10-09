package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ky extends org.telegram.ui.ActionBar.g5 {
    public final ty f39369f;

    public ky(ty tyVar) {
        this.f39369f = tyVar;
    }

    @Override
    public final boolean b() {
        ty tyVar = this.f39369f;
        org.telegram.ui.ActionBar.v0 v0Var = tyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (tyVar.f42219n2 != null) {
            tyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ty tyVar = this.f39369f;
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (!kVar.t() && tyVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.j10 j10Var;
        ty tyVar = this.f39369f;
        jy jyVar = tyVar.X;
        if (jyVar != null) {
            ArrayList arrayList = jyVar.F;
            if (!arrayList.isEmpty() && jyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.p0) arrayList.get(i10)).h) {
                        ((yx) jyVar.H).d((gg.p0) arrayList.get(i10));
                    }
                }
            }
        }
        tyVar.f42202j2 = false;
        tyVar.f42206k2 = false;
        sy syVar = tyVar.f42174e0[0];
        if (syVar != null) {
            py pyVar = syVar.f41790a;
            if (tyVar.V2 == 0) {
                j10Var = syVar.f41798w;
            } else {
                j10Var = null;
            }
            pyVar.setEmptyView(j10Var);
            tyVar.L4(false, false, true, false);
        }
        tyVar.W4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        tyVar.X.setCloseButtonVisible(false);
        tyVar.V4(true);
        tyVar.y3();
        tyVar.j3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.wo0 wo0Var;
        org.telegram.ui.Components.wo0 wo0Var2;
        ty tyVar = this.f39369f;
        tyVar.f42202j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = tyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        tyVar.J3();
        sy syVar = tyVar.f42174e0[0];
        if (syVar != null) {
            if (tyVar.f42219n2 != null) {
                syVar.f41790a.c1();
                dy dyVar = tyVar.C0;
                if (dyVar != null) {
                    ai.w0 w0Var = dyVar.V;
                    if (w0Var.f30202g1) {
                        w0Var.f30202g1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!tyVar.f42210l2) {
                ci.d4 d4Var = tyVar.f42227p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                ci.d4 d4Var2 = tyVar.f42232q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
        kx kxVar = tyVar.E0;
        if (kxVar != null && kxVar.getPremiumHint() != null) {
            tyVar.E0.getPremiumHint().e(true);
        }
        if (!tyVar.K) {
            tyVar.z4(0.0f);
        }
        tyVar.W4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        tyVar.j3();
        dy dyVar2 = tyVar.C0;
        if (dyVar2 != null && (wo0Var2 = dyVar2.f25766b0) != null) {
            wo0Var2.f10617c = gg.e0.All;
        }
        if ((dyVar2 != null && (wo0Var = dyVar2.f25766b0) != null && wo0Var.N()) || tyVar.getMessagesController().getTotalDialogsCount() > 10 || tyVar.f42247s3 || tyVar.K) {
            tyVar.f42206k2 = true;
            if (!tyVar.f42230p3) {
                tyVar.L4(true, false, true, false);
            }
        }
        tyVar.X.setCloseButtonVisible(true);
        tyVar.V4(true);
        tyVar.y3();
    }

    @Override
    public final void q(EditText editText) {
        dy dyVar;
        org.telegram.ui.Components.wo0 wo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        ty tyVar = this.f39369f;
        if (!isEmpty || (((dyVar = tyVar.C0) != null && (wo0Var = dyVar.f25766b0) != null && wo0Var.N()) || tyVar.f42247s3 || tyVar.K)) {
            tyVar.f42206k2 = true;
            if (!tyVar.f42230p3) {
                tyVar.L4(true, false, true, false);
            }
        }
        dy dyVar2 = tyVar.C0;
        if (dyVar2 != null) {
            View currentView = dyVar2.getCurrentView();
            boolean z11 = !dyVar2.f25769e0;
            if (!TextUtils.isEmpty(dyVar2.K0)) {
                z10 = z11;
            }
            dyVar2.K0 = obj;
            dyVar2.O(currentView, dyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
