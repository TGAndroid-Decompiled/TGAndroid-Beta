package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class gy extends org.telegram.ui.ActionBar.i5 {
    public final py f37286f;

    public gy(py pyVar) {
        this.f37286f = pyVar;
    }

    @Override
    public final boolean b() {
        py pyVar = this.f37286f;
        org.telegram.ui.ActionBar.w0 w0Var = pyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (pyVar.f40234k2 != null) {
            pyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        py pyVar = this.f37286f;
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (!kVar.s() && pyVar.O3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.u00 u00Var;
        py pyVar = this.f37286f;
        fy fyVar = pyVar.U;
        if (fyVar != null) {
            ArrayList arrayList = fyVar.C;
            if (!arrayList.isEmpty() && fyVar.E != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((uf.e0) arrayList.get(i10)).h) {
                        ((ux) fyVar.E).d((uf.e0) arrayList.get(i10));
                    }
                }
            }
        }
        pyVar.f40214g2 = false;
        pyVar.f40219h2 = false;
        oy oyVar = pyVar.f40185b0[0];
        if (oyVar != null) {
            ly lyVar = oyVar.f39866a;
            if (pyVar.S2 == 0) {
                u00Var = oyVar.f39874w;
            } else {
                u00Var = null;
            }
            lyVar.setEmptyView(u00Var);
            pyVar.O4(false, false, true, false);
        }
        pyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        pyVar.U.setCloseButtonVisible(false);
        pyVar.Y4(true);
        pyVar.B3();
        pyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.xn0 xn0Var;
        org.telegram.ui.Components.xn0 xn0Var2;
        py pyVar = this.f37286f;
        pyVar.f40214g2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = pyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        pyVar.M3();
        oy oyVar = pyVar.f40185b0[0];
        if (oyVar != null) {
            if (pyVar.f40234k2 != null) {
                oyVar.f39866a.c1();
                yx yxVar = pyVar.f40306z0;
                if (yxVar != null) {
                    mh.d1 d1Var = yxVar.S;
                    if (d1Var.f31369f1) {
                        d1Var.f31369f1 = false;
                        d1Var.J0(false);
                    }
                }
            }
            if (!pyVar.f40224i2) {
                qh.f3 f3Var = pyVar.m0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                qh.f3 f3Var2 = pyVar.f40246n0;
                if (f3Var2 != null) {
                    f3Var2.e(true);
                }
            }
        }
        hx hxVar = pyVar.B0;
        if (hxVar != null && hxVar.getPremiumHint() != null) {
            pyVar.B0.getPremiumHint().e(true);
        }
        if (!pyVar.H) {
            pyVar.C4(0.0f);
        }
        pyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        pyVar.m3();
        yx yxVar2 = pyVar.f40306z0;
        if (yxVar2 != null && (xn0Var2 = yxVar2.V) != null) {
            xn0Var2.f48753c = uf.w.All;
        }
        if ((yxVar2 != null && (xn0Var = yxVar2.V) != null && xn0Var.N()) || pyVar.getMessagesController().getTotalDialogsCount() > 10 || pyVar.f40259p3 || pyVar.H) {
            pyVar.f40219h2 = true;
            if (!pyVar.f40243m3) {
                pyVar.O4(true, false, true, false);
            }
        }
        pyVar.U.setCloseButtonVisible(true);
        pyVar.Y4(true);
        pyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        yx yxVar;
        org.telegram.ui.Components.xn0 xn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z4 = true;
        py pyVar = this.f37286f;
        if (!isEmpty || (((yxVar = pyVar.f40306z0) != null && (xn0Var = yxVar.V) != null && xn0Var.N()) || pyVar.f40259p3 || pyVar.H)) {
            pyVar.f40219h2 = true;
            if (!pyVar.f40243m3) {
                pyVar.O4(true, false, true, false);
            }
        }
        yx yxVar2 = pyVar.f40306z0;
        if (yxVar2 != null) {
            View currentView = yxVar2.getCurrentView();
            boolean z10 = !yxVar2.f26598b0;
            if (!TextUtils.isEmpty(yxVar2.H0)) {
                z4 = z10;
            }
            yxVar2.H0 = obj;
            yxVar2.O(currentView, yxVar2.getCurrentPosition(), obj, z4);
        }
    }
}
