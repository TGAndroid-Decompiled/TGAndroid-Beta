package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class gy extends org.telegram.ui.ActionBar.i5 {
    public final py f37182f;

    public gy(py pyVar) {
        this.f37182f = pyVar;
    }

    @Override
    public final boolean b() {
        py pyVar = this.f37182f;
        org.telegram.ui.ActionBar.w0 w0Var = pyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (pyVar.f40204k2 != null) {
            pyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        py pyVar = this.f37182f;
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (!kVar.s() && pyVar.O3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.u00 u00Var;
        py pyVar = this.f37182f;
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
        pyVar.f40184g2 = false;
        pyVar.f40189h2 = false;
        oy oyVar = pyVar.f40155b0[0];
        if (oyVar != null) {
            ly lyVar = oyVar.f39822a;
            if (pyVar.S2 == 0) {
                u00Var = oyVar.f39830w;
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
        org.telegram.ui.Components.wn0 wn0Var;
        org.telegram.ui.Components.wn0 wn0Var2;
        py pyVar = this.f37182f;
        pyVar.f40184g2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = pyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        pyVar.M3();
        oy oyVar = pyVar.f40155b0[0];
        if (oyVar != null) {
            if (pyVar.f40204k2 != null) {
                oyVar.f39822a.b1();
                yx yxVar = pyVar.f40276z0;
                if (yxVar != null) {
                    mh.d1 d1Var = yxVar.S;
                    if (d1Var.f31092f1) {
                        d1Var.f31092f1 = false;
                        d1Var.J0(false);
                    }
                }
            }
            if (!pyVar.f40194i2) {
                qh.e3 e3Var = pyVar.m0;
                if (e3Var != null) {
                    e3Var.e(true);
                }
                qh.e3 e3Var2 = pyVar.f40216n0;
                if (e3Var2 != null) {
                    e3Var2.e(true);
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
        yx yxVar2 = pyVar.f40276z0;
        if (yxVar2 != null && (wn0Var2 = yxVar2.V) != null) {
            wn0Var2.f48789c = uf.w.All;
        }
        if ((yxVar2 != null && (wn0Var = yxVar2.V) != null && wn0Var.N()) || pyVar.getMessagesController().getTotalDialogsCount() > 10 || pyVar.f40229p3 || pyVar.H) {
            pyVar.f40189h2 = true;
            if (!pyVar.f40213m3) {
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
        org.telegram.ui.Components.wn0 wn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z4 = true;
        py pyVar = this.f37182f;
        if (!isEmpty || (((yxVar = pyVar.f40276z0) != null && (wn0Var = yxVar.V) != null && wn0Var.N()) || pyVar.f40229p3 || pyVar.H)) {
            pyVar.f40189h2 = true;
            if (!pyVar.f40213m3) {
                pyVar.O4(true, false, true, false);
            }
        }
        yx yxVar2 = pyVar.f40276z0;
        if (yxVar2 != null) {
            View currentView = yxVar2.getCurrentView();
            boolean z10 = !yxVar2.f26321b0;
            if (!TextUtils.isEmpty(yxVar2.H0)) {
                z4 = z10;
            }
            yxVar2.H0 = obj;
            yxVar2.O(currentView, yxVar2.getCurrentPosition(), obj, z4);
        }
    }
}
