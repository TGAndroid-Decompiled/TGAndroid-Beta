package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class my extends org.telegram.ui.ActionBar.e5 {
    public final vy f40147f;

    public my(vy vyVar) {
        this.f40147f = vyVar;
    }

    @Override
    public final boolean b() {
        vy vyVar = this.f40147f;
        org.telegram.ui.ActionBar.u0 u0Var = vyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (vyVar.f42948n2 != null) {
            vyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        vy vyVar = this.f40147f;
        kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
        if (!kVar.u() && vyVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.m10 m10Var;
        vy vyVar = this.f40147f;
        ly lyVar = vyVar.X;
        if (lyVar != null) {
            ArrayList arrayList = lyVar.F;
            if (!arrayList.isEmpty() && lyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.p0) arrayList.get(i10)).h) {
                        ((ay) lyVar.H).d((gg.p0) arrayList.get(i10));
                    }
                }
            }
        }
        vyVar.f42931j2 = false;
        vyVar.f42935k2 = false;
        uy uyVar = vyVar.f42903e0[0];
        if (uyVar != null) {
            ry ryVar = uyVar.f42611a;
            if (vyVar.V2 == 0) {
                m10Var = uyVar.f42619w;
            } else {
                m10Var = null;
            }
            ryVar.setEmptyView(m10Var);
            vyVar.L4(false, false, true, false);
        }
        vyVar.W4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        vyVar.X.setCloseButtonVisible(false);
        vyVar.V4(true);
        vyVar.y3();
        vyVar.j3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.cp0 cp0Var;
        org.telegram.ui.Components.cp0 cp0Var2;
        vy vyVar = this.f40147f;
        vyVar.f42931j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = vyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        vyVar.J3();
        uy uyVar = vyVar.f42903e0[0];
        if (uyVar != null) {
            if (vyVar.f42948n2 != null) {
                uyVar.f42611a.c1();
                fy fyVar = vyVar.C0;
                if (fyVar != null) {
                    ai.w0 w0Var = fyVar.V;
                    if (w0Var.f32453g1) {
                        w0Var.f32453g1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!vyVar.f42939l2) {
                ci.d4 d4Var = vyVar.f42956p0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                ci.d4 d4Var2 = vyVar.f42961q0;
                if (d4Var2 != null) {
                    d4Var2.e(true);
                }
            }
        }
        mx mxVar = vyVar.E0;
        if (mxVar != null && mxVar.getPremiumHint() != null) {
            vyVar.E0.getPremiumHint().e(true);
        }
        if (!vyVar.K) {
            vyVar.z4(0.0f);
        }
        vyVar.W4(false, false);
        kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        vyVar.j3();
        fy fyVar2 = vyVar.C0;
        if (fyVar2 != null && (cp0Var2 = fyVar2.f27591b0) != null) {
            cp0Var2.f10615c = gg.e0.All;
        }
        if ((fyVar2 != null && (cp0Var = fyVar2.f27591b0) != null && cp0Var.N()) || vyVar.getMessagesController().getTotalDialogsCount() > 10 || vyVar.f42976s3 || vyVar.K) {
            vyVar.f42935k2 = true;
            if (!vyVar.f42959p3) {
                vyVar.L4(true, false, true, false);
            }
        }
        vyVar.X.setCloseButtonVisible(true);
        vyVar.V4(true);
        vyVar.y3();
    }

    @Override
    public final void q(EditText editText) {
        fy fyVar;
        org.telegram.ui.Components.cp0 cp0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        vy vyVar = this.f40147f;
        if (!isEmpty || (((fyVar = vyVar.C0) != null && (cp0Var = fyVar.f27591b0) != null && cp0Var.N()) || vyVar.f42976s3 || vyVar.K)) {
            vyVar.f42935k2 = true;
            if (!vyVar.f42959p3) {
                vyVar.L4(true, false, true, false);
            }
        }
        fy fyVar2 = vyVar.C0;
        if (fyVar2 != null) {
            View currentView = fyVar2.getCurrentView();
            boolean z11 = !fyVar2.f27594e0;
            if (!TextUtils.isEmpty(fyVar2.K0)) {
                z10 = z11;
            }
            fyVar2.K0 = obj;
            fyVar2.O(currentView, fyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
