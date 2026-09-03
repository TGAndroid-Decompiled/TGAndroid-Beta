package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class hy extends org.telegram.ui.ActionBar.h5 {
    public final qy f34769f;

    public hy(qy qyVar) {
        this.f34769f = qyVar;
    }

    @Override
    public final boolean b() {
        qy qyVar = this.f34769f;
        org.telegram.ui.ActionBar.w0 w0Var = qyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (qyVar.f37575k2 != null) {
            qyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        qy qyVar = this.f34769f;
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        if (!kVar.s() && qyVar.O3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.u00 u00Var;
        qy qyVar = this.f34769f;
        gy gyVar = qyVar.U;
        if (gyVar != null) {
            ArrayList arrayList = gyVar.C;
            if (!arrayList.isEmpty() && gyVar.E != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((tf.e0) arrayList.get(i10)).h) {
                        ((vx) gyVar.E).d((tf.e0) arrayList.get(i10));
                    }
                }
            }
        }
        qyVar.f37555g2 = false;
        qyVar.f37560h2 = false;
        py pyVar = qyVar.f37527b0[0];
        if (pyVar != null) {
            my myVar = pyVar.f37246a;
            if (qyVar.S2 == 0) {
                u00Var = pyVar.f37253w;
            } else {
                u00Var = null;
            }
            myVar.setEmptyView(u00Var);
            qyVar.O4(false, false, true, false);
        }
        qyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        qyVar.U.setCloseButtonVisible(false);
        qyVar.Y4(true);
        qyVar.B3();
        qyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.vn0 vn0Var;
        org.telegram.ui.Components.vn0 vn0Var2;
        qy qyVar = this.f34769f;
        qyVar.f37555g2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = qyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        qyVar.M3();
        py pyVar = qyVar.f37527b0[0];
        if (pyVar != null) {
            if (qyVar.f37575k2 != null) {
                pyVar.f37246a.b1();
                zx zxVar = qyVar.f37647z0;
                if (zxVar != null) {
                    lh.e1 e1Var = zxVar.S;
                    if (e1Var.f28497f1) {
                        e1Var.f28497f1 = false;
                        e1Var.J0(false);
                    }
                }
            }
            if (!qyVar.f37565i2) {
                ph.f3 f3Var = qyVar.m0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                ph.f3 f3Var2 = qyVar.f37587n0;
                if (f3Var2 != null) {
                    f3Var2.e(true);
                }
            }
        }
        ix ixVar = qyVar.B0;
        if (ixVar != null && ixVar.getPremiumHint() != null) {
            qyVar.B0.getPremiumHint().e(true);
        }
        if (!qyVar.H) {
            qyVar.C4(0.0f);
        }
        qyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        qyVar.m3();
        zx zxVar2 = qyVar.f37647z0;
        if (zxVar2 != null && (vn0Var2 = zxVar2.V) != null) {
            vn0Var2.f44955c = tf.w.All;
        }
        if ((zxVar2 != null && (vn0Var = zxVar2.V) != null && vn0Var.N()) || qyVar.getMessagesController().getTotalDialogsCount() > 10 || qyVar.f37600p3 || qyVar.H) {
            qyVar.f37560h2 = true;
            if (!qyVar.f37584m3) {
                qyVar.O4(true, false, true, false);
            }
        }
        qyVar.U.setCloseButtonVisible(true);
        qyVar.Y4(true);
        qyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        zx zxVar;
        org.telegram.ui.Components.vn0 vn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z4 = true;
        qy qyVar = this.f34769f;
        if (!isEmpty || (((zxVar = qyVar.f37647z0) != null && (vn0Var = zxVar.V) != null && vn0Var.N()) || qyVar.f37600p3 || qyVar.H)) {
            qyVar.f37560h2 = true;
            if (!qyVar.f37584m3) {
                qyVar.O4(true, false, true, false);
            }
        }
        zx zxVar2 = qyVar.f37647z0;
        if (zxVar2 != null) {
            View currentView = zxVar2.getCurrentView();
            boolean z10 = !zxVar2.f23984b0;
            if (!TextUtils.isEmpty(zxVar2.H0)) {
                z4 = z10;
            }
            zxVar2.H0 = obj;
            zxVar2.O(currentView, zxVar2.getCurrentPosition(), obj, z4);
        }
    }
}
