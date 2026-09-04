package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ly extends org.telegram.ui.ActionBar.g5 {
    public final uy f38514f;

    public ly(uy uyVar) {
        this.f38514f = uyVar;
    }

    @Override
    public final boolean b() {
        uy uyVar = this.f38514f;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(0);
        }
        if (uyVar.f41304n2 != null) {
            uyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        uy uyVar = this.f38514f;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (!kVar.s() && uyVar.R3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        org.telegram.ui.Components.t00 t00Var;
        uy uyVar = this.f38514f;
        ky kyVar = uyVar.X;
        if (kyVar != null) {
            ArrayList arrayList = kyVar.F;
            if (!arrayList.isEmpty() && kyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((hg.q0) arrayList.get(i10)).h) {
                        ((zx) kyVar.H).c((hg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        uyVar.f41287j2 = false;
        uyVar.f41291k2 = false;
        ty tyVar = uyVar.f41259e0[0];
        if (tyVar != null) {
            qy qyVar = tyVar.f40858a;
            if (uyVar.V2 == 0) {
                t00Var = tyVar.f40866w;
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
        org.telegram.ui.Components.rn0 rn0Var;
        org.telegram.ui.Components.rn0 rn0Var2;
        uy uyVar = this.f38514f;
        uyVar.f41287j2 = true;
        org.telegram.ui.ActionBar.v0 v0Var = uyVar.D1;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        uyVar.M3();
        ty tyVar = uyVar.f41259e0[0];
        if (tyVar != null) {
            if (uyVar.f41304n2 != null) {
                tyVar.f40858a.b1();
                ey eyVar = uyVar.C0;
                if (eyVar != null) {
                    bi.o0 o0Var = eyVar.V;
                    if (o0Var.f28210i1) {
                        o0Var.f28210i1 = false;
                        o0Var.J0(false);
                    }
                }
            }
            if (!uyVar.f41295l2) {
                di.f4 f4Var = uyVar.f41312p0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                di.f4 f4Var2 = uyVar.f41317q0;
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
        if (eyVar2 != null && (rn0Var2 = eyVar2.f32950b0) != null) {
            rn0Var2.f11072c = hg.f0.All;
        }
        if ((eyVar2 != null && (rn0Var = eyVar2.f32950b0) != null && rn0Var.N()) || uyVar.getMessagesController().getTotalDialogsCount() > 10 || uyVar.f41332s3 || uyVar.K) {
            uyVar.f41291k2 = true;
            if (!uyVar.f41315p3) {
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
        org.telegram.ui.Components.rn0 rn0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        uy uyVar = this.f38514f;
        if (!isEmpty || (((eyVar = uyVar.C0) != null && (rn0Var = eyVar.f32950b0) != null && rn0Var.N()) || uyVar.f41332s3 || uyVar.K)) {
            uyVar.f41291k2 = true;
            if (!uyVar.f41315p3) {
                uyVar.O4(true, false, true, false);
            }
        }
        ey eyVar2 = uyVar.C0;
        if (eyVar2 != null) {
            View currentView = eyVar2.getCurrentView();
            boolean z11 = !eyVar2.f32953e0;
            if (!TextUtils.isEmpty(eyVar2.K0)) {
                z10 = z11;
            }
            eyVar2.K0 = obj;
            eyVar2.O(currentView, eyVar2.getCurrentPosition(), obj, z10);
        }
    }
}
