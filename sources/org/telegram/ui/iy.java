package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class iy extends org.telegram.ui.ActionBar.f5 {
    public final ry f34281f;

    public iy(ry ryVar) {
        this.f34281f = ryVar;
    }

    @Override
    public final boolean b() {
        ry ryVar = this.f34281f;
        org.telegram.ui.ActionBar.v0 v0Var = ryVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (ryVar.f37023n2 != null) {
            ryVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        ry ryVar = this.f34281f;
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        if (!kVar.s() && ryVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.u00 u00Var;
        ry ryVar = this.f34281f;
        hy hyVar = ryVar.X;
        if (hyVar != null) {
            ArrayList arrayList = hyVar.F;
            if (!arrayList.isEmpty() && hyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((wx) hyVar.H).h((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        ryVar.f37006j2 = false;
        ryVar.f37010k2 = false;
        qy qyVar = ryVar.f36978e0[0];
        if (qyVar != null) {
            ny nyVar = qyVar.f36629a;
            if (ryVar.V2 == 0) {
                u00Var = qyVar.f36636w;
            } else {
                u00Var = null;
            }
            nyVar.setEmptyView(u00Var);
            ryVar.O4(false, false, true, false);
        }
        ryVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        ryVar.X.setCloseButtonVisible(false);
        ryVar.Y4(true);
        ryVar.B3();
        ryVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.rn0 rn0Var;
        org.telegram.ui.Components.rn0 rn0Var2;
        ry ryVar = this.f34281f;
        ryVar.f37006j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = ryVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        ryVar.M3();
        qy qyVar = ryVar.f36978e0[0];
        if (qyVar != null) {
            if (ryVar.f37023n2 != null) {
                qyVar.f36629a.c1();
                ay ayVar = ryVar.C0;
                if (ayVar != null) {
                    ai.w0 w0Var = ayVar.V;
                    if (w0Var.f26208i1) {
                        w0Var.f26208i1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!ryVar.f37014l2) {
                ci.e4 e4Var = ryVar.f37031p0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ci.e4 e4Var2 = ryVar.f37036q0;
                if (e4Var2 != null) {
                    e4Var2.e(true);
                }
            }
        }
        ix ixVar = ryVar.E0;
        if (ixVar != null && ixVar.getPremiumHint() != null) {
            ryVar.E0.getPremiumHint().e(true);
        }
        if (!ryVar.K) {
            ryVar.C4(0.0f);
        }
        ryVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        ryVar.m3();
        ay ayVar2 = ryVar.C0;
        if (ayVar2 != null && (rn0Var2 = ayVar2.f30335b0) != null) {
            rn0Var2.f9746c = gg.f0.All;
        }
        if ((ayVar2 != null && (rn0Var = ayVar2.f30335b0) != null && rn0Var.N()) || ryVar.getMessagesController().getTotalDialogsCount() > 10 || ryVar.f37051s3 || ryVar.K) {
            ryVar.f37010k2 = true;
            if (!ryVar.f37034p3) {
                ryVar.O4(true, false, true, false);
            }
        }
        ryVar.X.setCloseButtonVisible(true);
        ryVar.Y4(true);
        ryVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        ay ayVar;
        org.telegram.ui.Components.rn0 rn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        ry ryVar = this.f34281f;
        if (!isEmpty || (((ayVar = ryVar.C0) != null && (rn0Var = ayVar.f30335b0) != null && rn0Var.N()) || ryVar.f37051s3 || ryVar.K)) {
            ryVar.f37010k2 = true;
            if (!ryVar.f37034p3) {
                ryVar.O4(true, false, true, false);
            }
        }
        ay ayVar2 = ryVar.C0;
        if (ayVar2 != null) {
            View currentView = ayVar2.getCurrentView();
            boolean z11 = !ayVar2.f30338e0;
            if (!TextUtils.isEmpty(ayVar2.K0)) {
                z10 = z11;
            }
            ayVar2.K0 = obj;
            ayVar2.O(currentView, ayVar2.getCurrentPosition(), obj, z10);
        }
    }
}
