package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class fy extends org.telegram.ui.ActionBar.h5 {
    public final oy f34416f;

    public fy(oy oyVar) {
        this.f34416f = oyVar;
    }

    @Override
    public final boolean b() {
        oy oyVar = this.f34416f;
        org.telegram.ui.ActionBar.w0 w0Var = oyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (oyVar.f37057k2 != null) {
            oyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        oy oyVar = this.f34416f;
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (!kVar.s() && oyVar.O3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.t00 t00Var;
        oy oyVar = this.f34416f;
        ey eyVar = oyVar.U;
        if (eyVar != null) {
            ArrayList arrayList = eyVar.C;
            if (!arrayList.isEmpty() && eyVar.E != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((tf.e0) arrayList.get(i10)).h) {
                        ((tx) eyVar.E).d((tf.e0) arrayList.get(i10));
                    }
                }
            }
        }
        oyVar.f37037g2 = false;
        oyVar.f37042h2 = false;
        ny nyVar = oyVar.f37009b0[0];
        if (nyVar != null) {
            ky kyVar = nyVar.f36741a;
            if (oyVar.S2 == 0) {
                t00Var = nyVar.f36748w;
            } else {
                t00Var = null;
            }
            kyVar.setEmptyView(t00Var);
            oyVar.O4(false, false, true, false);
        }
        oyVar.Z4(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        oyVar.U.setCloseButtonVisible(false);
        oyVar.Y4(true);
        oyVar.B3();
        oyVar.m3();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.wn0 wn0Var;
        org.telegram.ui.Components.wn0 wn0Var2;
        oy oyVar = this.f34416f;
        oyVar.f37037g2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = oyVar.A1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        oyVar.M3();
        ny nyVar = oyVar.f37009b0[0];
        if (nyVar != null) {
            if (oyVar.f37057k2 != null) {
                nyVar.f36741a.c1();
                xx xxVar = oyVar.f37129z0;
                if (xxVar != null) {
                    lh.e1 e1Var = xxVar.S;
                    if (e1Var.f28736f1) {
                        e1Var.f28736f1 = false;
                        e1Var.J0(false);
                    }
                }
            }
            if (!oyVar.f37047i2) {
                ph.f3 f3Var = oyVar.m0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                ph.f3 f3Var2 = oyVar.f37069n0;
                if (f3Var2 != null) {
                    f3Var2.e(true);
                }
            }
        }
        gx gxVar = oyVar.B0;
        if (gxVar != null && gxVar.getPremiumHint() != null) {
            oyVar.B0.getPremiumHint().e(true);
        }
        if (!oyVar.H) {
            oyVar.C4(0.0f);
        }
        oyVar.Z4(false, false);
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        kVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        oyVar.m3();
        xx xxVar2 = oyVar.f37129z0;
        if (xxVar2 != null && (wn0Var2 = xxVar2.V) != null) {
            wn0Var2.f44893c = tf.w.All;
        }
        if ((xxVar2 != null && (wn0Var = xxVar2.V) != null && wn0Var.N()) || oyVar.getMessagesController().getTotalDialogsCount() > 10 || oyVar.f37082p3 || oyVar.H) {
            oyVar.f37042h2 = true;
            if (!oyVar.f37066m3) {
                oyVar.O4(true, false, true, false);
            }
        }
        oyVar.U.setCloseButtonVisible(true);
        oyVar.Y4(true);
        oyVar.B3();
    }

    @Override
    public final void q(EditText editText) {
        xx xxVar;
        org.telegram.ui.Components.wn0 wn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z4 = true;
        oy oyVar = this.f34416f;
        if (!isEmpty || (((xxVar = oyVar.f37129z0) != null && (wn0Var = xxVar.V) != null && wn0Var.N()) || oyVar.f37082p3 || oyVar.H)) {
            oyVar.f37042h2 = true;
            if (!oyVar.f37066m3) {
                oyVar.O4(true, false, true, false);
            }
        }
        xx xxVar2 = oyVar.f37129z0;
        if (xxVar2 != null) {
            View currentView = xxVar2.getCurrentView();
            boolean z10 = !xxVar2.f24318b0;
            if (!TextUtils.isEmpty(xxVar2.H0)) {
                z4 = z10;
            }
            xxVar2.H0 = obj;
            xxVar2.O(currentView, xxVar2.getCurrentPosition(), obj, z4);
        }
    }
}
