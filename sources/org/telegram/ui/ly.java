package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ly extends org.telegram.ui.ActionBar.g5 {
    public final uy f35559f;

    public ly(uy uyVar) {
        this.f35559f = uyVar;
    }

    @Override
    public final boolean b() {
        uy uyVar = this.f35559f;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (uyVar.f38267n2 != null) {
            uyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.f35559f;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (!kVar.s() && uyVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.t00 t00Var;
        uy uyVar = this.f35559f;
        ky kyVar = uyVar.X;
        if (kyVar != null) {
            ArrayList arrayList = kyVar.F;
            if (!arrayList.isEmpty() && kyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((zx) kyVar.H).h((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        uyVar.f38250j2 = false;
        uyVar.f38254k2 = false;
        ty tyVar = uyVar.f38222e0[0];
        if (tyVar != null) {
            qy qyVar = tyVar.f37752a;
            if (uyVar.V2 == 0) {
                t00Var = tyVar.f37759w;
            } else {
                t00Var = null;
            }
            qyVar.setEmptyView(t00Var);
            uyVar.O4(false, false, true, false);
        }
        uyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        uyVar.X.setCloseButtonVisible(false);
        uyVar.Y4(true);
        uyVar.B3();
        uyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.rn0 rn0Var;
        org.telegram.ui.Components.rn0 rn0Var2;
        uy uyVar = this.f35559f;
        uyVar.f38250j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        uyVar.M3();
        ty tyVar = uyVar.f38222e0[0];
        if (tyVar != null) {
            if (uyVar.f38267n2 != null) {
                tyVar.f37752a.c1();
                ey eyVar = uyVar.C0;
                if (eyVar != null) {
                    ai.w0 w0Var = eyVar.V;
                    if (w0Var.f25955i1) {
                        w0Var.f25955i1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!uyVar.f38258l2) {
                ci.f4 f4Var = uyVar.f38275p0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                ci.f4 f4Var2 = uyVar.f38280q0;
                if (f4Var2 != null) {
                    f4Var2.e(true);
                }
            }
        }
        lx lxVar = uyVar.E0;
        if (lxVar != null && lxVar.getPremiumHint() != null) {
            uyVar.E0.getPremiumHint().e(true);
        }
        if (!uyVar.K) {
            uyVar.C4(0.0f);
        }
        uyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        uyVar.m3();
        ey eyVar2 = uyVar.C0;
        if (eyVar2 != null && (rn0Var2 = eyVar2.f30284b0) != null) {
            rn0Var2.f9760c = gg.f0.All;
        }
        if ((eyVar2 != null && (rn0Var = eyVar2.f30284b0) != null && rn0Var.N()) || uyVar.getMessagesController().getTotalDialogsCount() > 10 || uyVar.f38295s3 || uyVar.K) {
            uyVar.f38254k2 = true;
            if (!uyVar.f38278p3) {
                uyVar.O4(true, false, true, false);
            }
        }
        uyVar.X.setCloseButtonVisible(true);
        uyVar.Y4(true);
        uyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        ey eyVar;
        org.telegram.ui.Components.rn0 rn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        uy uyVar = this.f35559f;
        if (!isEmpty || (((eyVar = uyVar.C0) != null && (rn0Var = eyVar.f30284b0) != null && rn0Var.N()) || uyVar.f38295s3 || uyVar.K)) {
            uyVar.f38254k2 = true;
            if (!uyVar.f38278p3) {
                uyVar.O4(true, false, true, false);
            }
        }
        ey eyVar2 = uyVar.C0;
        if (eyVar2 != null) {
            View currentView = eyVar2.getCurrentView();
            boolean z11 = !eyVar2.f30287e0;
            if (!TextUtils.isEmpty(eyVar2.K0)) {
                z10 = z11;
            }
            eyVar2.K0 = obj;
            eyVar2.O(currentView, eyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
