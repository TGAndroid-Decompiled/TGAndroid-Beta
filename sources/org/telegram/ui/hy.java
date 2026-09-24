package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class hy extends org.telegram.ui.ActionBar.e5 {
    public final qy f34310f;

    public hy(qy qyVar) {
        this.f34310f = qyVar;
    }

    @Override
    public final boolean b() {
        qy qyVar = this.f34310f;
        org.telegram.ui.ActionBar.u0 u0Var = qyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(0);
        }
        if (qyVar.f37066n2 != null) {
            qyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.f34310f;
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (!kVar.s() && qyVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.u00 u00Var;
        qy qyVar = this.f34310f;
        gy gyVar = qyVar.X;
        if (gyVar != null) {
            ArrayList arrayList = gyVar.F;
            if (!arrayList.isEmpty() && gyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((vx) gyVar.H).h((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        qyVar.f37049j2 = false;
        qyVar.f37053k2 = false;
        py pyVar = qyVar.f37021e0[0];
        if (pyVar != null) {
            my myVar = pyVar.f36679a;
            if (qyVar.V2 == 0) {
                u00Var = pyVar.f36686w;
            } else {
                u00Var = null;
            }
            myVar.setEmptyView(u00Var);
            qyVar.O4(false, false, true, false);
        }
        qyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        qyVar.X.setCloseButtonVisible(false);
        qyVar.Y4(true);
        qyVar.B3();
        qyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.eo0 eo0Var;
        org.telegram.ui.Components.eo0 eo0Var2;
        qy qyVar = this.f34310f;
        qyVar.f37049j2 = true;
        org.telegram.ui.ActionBar.u0 u0Var = qyVar.D1;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        qyVar.M3();
        py pyVar = qyVar.f37021e0[0];
        if (pyVar != null) {
            if (qyVar.f37066n2 != null) {
                pyVar.f36679a.c1();
                zx zxVar = qyVar.C0;
                if (zxVar != null) {
                    ai.w0 w0Var = zxVar.V;
                    if (w0Var.f30080i1) {
                        w0Var.f30080i1 = false;
                        w0Var.K0(false);
                    }
                }
            }
            if (!qyVar.f37057l2) {
                ci.e4 e4Var = qyVar.f37074p0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ci.e4 e4Var2 = qyVar.f37079q0;
                if (e4Var2 != null) {
                    e4Var2.e(true);
                }
            }
        }
        hx hxVar = qyVar.E0;
        if (hxVar != null && hxVar.getPremiumHint() != null) {
            qyVar.E0.getPremiumHint().e(true);
        }
        if (!qyVar.K) {
            qyVar.C4(0.0f);
        }
        qyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        qyVar.m3();
        zx zxVar2 = qyVar.C0;
        if (zxVar2 != null && (eo0Var2 = zxVar2.f26144b0) != null) {
            eo0Var2.f9745c = gg.f0.All;
        }
        if ((zxVar2 != null && (eo0Var = zxVar2.f26144b0) != null && eo0Var.N()) || qyVar.getMessagesController().getTotalDialogsCount() > 10 || qyVar.f37094s3 || qyVar.K) {
            qyVar.f37053k2 = true;
            if (!qyVar.f37077p3) {
                qyVar.O4(true, false, true, false);
            }
        }
        qyVar.X.setCloseButtonVisible(true);
        qyVar.Y4(true);
        qyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        zx zxVar;
        org.telegram.ui.Components.eo0 eo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        qy qyVar = this.f34310f;
        if (!isEmpty || (((zxVar = qyVar.C0) != null && (eo0Var = zxVar.f26144b0) != null && eo0Var.N()) || qyVar.f37094s3 || qyVar.K)) {
            qyVar.f37053k2 = true;
            if (!qyVar.f37077p3) {
                qyVar.O4(true, false, true, false);
            }
        }
        zx zxVar2 = qyVar.C0;
        if (zxVar2 != null) {
            View currentView = zxVar2.getCurrentView();
            boolean z11 = !zxVar2.f26147e0;
            if (!TextUtils.isEmpty(zxVar2.K0)) {
                z10 = z11;
            }
            zxVar2.K0 = obj;
            zxVar2.O(currentView, zxVar2.getCurrentPosition(), obj, z10);
        }
    }
}
