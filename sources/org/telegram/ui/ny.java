package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ny extends org.telegram.ui.ActionBar.h5 {
    public final wy f36175f;

    public ny(wy wyVar) {
        this.f36175f = wyVar;
    }

    @Override
    public final boolean b() {
        wy wyVar = this.f36175f;
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (wyVar.f39260n2 != null) {
            wyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        wy wyVar = this.f36175f;
        kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        if (!kVar.s() && wyVar.R3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.t00 t00Var;
        wy wyVar = this.f36175f;
        my myVar = wyVar.X;
        if (myVar != null) {
            ArrayList arrayList = myVar.F;
            if (!arrayList.isEmpty() && myVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((cy) myVar.H).h((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        wyVar.f39243j2 = false;
        wyVar.f39247k2 = false;
        vy vyVar = wyVar.f39215e0[0];
        if (vyVar != null) {
            sy syVar = vyVar.f38522a;
            if (wyVar.V2 == 0) {
                t00Var = vyVar.f38529w;
            } else {
                t00Var = null;
            }
            syVar.setEmptyView(t00Var);
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.sn0 sn0Var;
        org.telegram.ui.Components.sn0 sn0Var2;
        wy wyVar = this.f36175f;
        wyVar.f39243j2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = wyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        wyVar.M3();
        vy vyVar = wyVar.f39215e0[0];
        if (vyVar != null) {
            if (wyVar.f39260n2 != null) {
                vyVar.f38522a.d1();
                gy gyVar = wyVar.C0;
                if (gyVar != null) {
                    ai.w0 w0Var2 = gyVar.W;
                    if (w0Var2.f26177i1) {
                        w0Var2.f26177i1 = false;
                        w0Var2.L0(false);
                    }
                }
            }
            if (!wyVar.f39251l2) {
                ci.f4 f4Var = wyVar.f39268p0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                ci.f4 f4Var2 = wyVar.f39273q0;
                if (f4Var2 != null) {
                    f4Var2.e(true);
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
        kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        wyVar.m3();
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null && (sn0Var2 = gyVar2.f30548c0) != null) {
            sn0Var2.f9764c = gg.f0.All;
        }
        if ((gyVar2 != null && (sn0Var = gyVar2.f30548c0) != null && sn0Var.N()) || wyVar.getMessagesController().getTotalDialogsCount() > 10 || wyVar.f39288s3 || wyVar.K) {
            wyVar.f39247k2 = true;
            if (!wyVar.f39271p3) {
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
        org.telegram.ui.Components.sn0 sn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        wy wyVar = this.f36175f;
        if (!isEmpty || (((gyVar = wyVar.C0) != null && (sn0Var = gyVar.f30548c0) != null && sn0Var.N()) || wyVar.f39288s3 || wyVar.K)) {
            wyVar.f39247k2 = true;
            if (!wyVar.f39271p3) {
                wyVar.O4(true, false, true, false);
            }
        }
        gy gyVar2 = wyVar.C0;
        if (gyVar2 != null) {
            View currentView = gyVar2.getCurrentView();
            boolean z11 = !gyVar2.f30551f0;
            if (!TextUtils.isEmpty(gyVar2.L0)) {
                z10 = z11;
            }
            gyVar2.L0 = obj;
            gyVar2.P(currentView, gyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
