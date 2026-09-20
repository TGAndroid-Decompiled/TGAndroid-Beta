package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ly extends org.telegram.ui.ActionBar.g5 {
    public final uy f35540f;

    public ly(uy uyVar) {
        this.f35540f = uyVar;
    }

    @Override
    public final boolean b() {
        uy uyVar = this.f35540f;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (uyVar.f38301n2 != null) {
            uyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.f35540f;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (!kVar.s() && uyVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.t00 t00Var;
        uy uyVar = this.f35540f;
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
        uyVar.f38284j2 = false;
        uyVar.f38288k2 = false;
        ty tyVar = uyVar.f38256e0[0];
        if (tyVar != null) {
            qy qyVar = tyVar.f37904a;
            if (uyVar.V2 == 0) {
                t00Var = tyVar.f37911w;
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
        org.telegram.ui.Components.eo0 eo0Var;
        org.telegram.ui.Components.eo0 eo0Var2;
        uy uyVar = this.f35540f;
        uyVar.f38284j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        uyVar.M3();
        ty tyVar = uyVar.f38256e0[0];
        if (tyVar != null) {
            if (uyVar.f38301n2 != null) {
                tyVar.f37904a.d1();
                ey eyVar = uyVar.C0;
                if (eyVar != null) {
                    ai.w0 w0Var = eyVar.W;
                    if (w0Var.f29193i1) {
                        w0Var.f29193i1 = false;
                        w0Var.L0(false);
                    }
                }
            }
            if (!uyVar.f38292l2) {
                ci.f4 f4Var = uyVar.f38309p0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                ci.f4 f4Var2 = uyVar.f38314q0;
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
        if (eyVar2 != null && (eo0Var2 = eyVar2.f26196c0) != null) {
            eo0Var2.f9764c = gg.f0.All;
        }
        if ((eyVar2 != null && (eo0Var = eyVar2.f26196c0) != null && eo0Var.N()) || uyVar.getMessagesController().getTotalDialogsCount() > 10 || uyVar.f38329s3 || uyVar.K) {
            uyVar.f38288k2 = true;
            if (!uyVar.f38312p3) {
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
        org.telegram.ui.Components.eo0 eo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        uy uyVar = this.f35540f;
        if (!isEmpty || (((eyVar = uyVar.C0) != null && (eo0Var = eyVar.f26196c0) != null && eo0Var.N()) || uyVar.f38329s3 || uyVar.K)) {
            uyVar.f38288k2 = true;
            if (!uyVar.f38312p3) {
                uyVar.O4(true, false, true, false);
            }
        }
        ey eyVar2 = uyVar.C0;
        if (eyVar2 != null) {
            View currentView = eyVar2.getCurrentView();
            boolean z11 = !eyVar2.f26199f0;
            if (!TextUtils.isEmpty(eyVar2.L0)) {
                z10 = z11;
            }
            eyVar2.L0 = obj;
            eyVar2.P(currentView, eyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
