package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ny extends org.telegram.ui.ActionBar.i5 {
    public final wy f35357f;

    public ny(wy wyVar) {
        this.f35357f = wyVar;
    }

    @Override
    public final boolean b() {
        wy wyVar = this.f35357f;
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (wyVar.f38476n2 != null) {
            wyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        wy wyVar = this.f35357f;
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        if (!lVar.s() && wyVar.R3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.a10 a10Var;
        wy wyVar = this.f35357f;
        my myVar = wyVar.X;
        if (myVar != null) {
            ArrayList arrayList = myVar.F;
            if (!arrayList.isEmpty() && myVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((fg.q0) arrayList.get(i10)).h) {
                        ((cy) myVar.H).g((fg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        wyVar.f38459j2 = false;
        wyVar.f38463k2 = false;
        vy vyVar = wyVar.f38431e0[0];
        if (vyVar != null) {
            sy syVar = vyVar.f37645a;
            if (wyVar.V2 == 0) {
                a10Var = vyVar.f37652w;
            } else {
                a10Var = null;
            }
            syVar.setEmptyView(a10Var);
            wyVar.O4(false, false, true, false);
        }
        wyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        wyVar.X.setCloseButtonVisible(false);
        wyVar.Y4(true);
        wyVar.B3();
        wyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Components.ao0 ao0Var;
        org.telegram.ui.Components.ao0 ao0Var2;
        wy wyVar = this.f35357f;
        wyVar.f38459j2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        wyVar.M3();
        vy vyVar = wyVar.f38431e0[0];
        if (vyVar != null) {
            if (wyVar.f38476n2 != null) {
                vyVar.f37645a.b1();
                gy gyVar = wyVar.C0;
                if (gyVar != null) {
                    bi.y1 y1Var = gyVar.V;
                    if (y1Var.f27973i1) {
                        y1Var.f27973i1 = false;
                        y1Var.J0(false);
                    }
                }
            }
            if (!wyVar.f38467l2) {
                bi.x4 x4Var = wyVar.f38484p0;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                bi.x4 x4Var2 = wyVar.f38489q0;
                if (x4Var2 != null) {
                    x4Var2.e(true);
                }
            }
        }
        nx nxVar = wyVar.E0;
        if (nxVar != null && nxVar.getPremiumHint() != null) {
            wyVar.E0.getPremiumHint().e(true);
        }
        if (!wyVar.K) {
            wyVar.C4(0.0f);
        }
        wyVar.Z4(false, false);
        lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
        lVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        wyVar.m3();
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null && (ao0Var2 = gyVar2.f23713b0) != null) {
            ao0Var2.f8030c = fg.e0.All;
        }
        if ((gyVar2 != null && (ao0Var = gyVar2.f23713b0) != null && ao0Var.N()) || wyVar.getMessagesController().getTotalDialogsCount() > 10 || wyVar.f38504s3 || wyVar.K) {
            wyVar.f38463k2 = true;
            if (!wyVar.f38487p3) {
                wyVar.O4(true, false, true, false);
            }
        }
        wyVar.X.setCloseButtonVisible(true);
        wyVar.Y4(true);
        wyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        gy gyVar;
        org.telegram.ui.Components.ao0 ao0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        wy wyVar = this.f35357f;
        if (!isEmpty || (((gyVar = wyVar.C0) != null && (ao0Var = gyVar.f23713b0) != null && ao0Var.N()) || wyVar.f38504s3 || wyVar.K)) {
            wyVar.f38463k2 = true;
            if (!wyVar.f38487p3) {
                wyVar.O4(true, false, true, false);
            }
        }
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null) {
            View currentView = gyVar2.getCurrentView();
            boolean z11 = !gyVar2.f23716e0;
            if (!TextUtils.isEmpty(gyVar2.K0)) {
                z10 = z11;
            }
            gyVar2.K0 = obj;
            gyVar2.O(currentView, gyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
