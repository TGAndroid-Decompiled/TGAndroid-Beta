package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class hy extends org.telegram.ui.ActionBar.g5 {
    public final ty f34303f;

    public hy(ty tyVar) {
        this.f34303f = tyVar;
    }

    @Override
    public final boolean b() {
        ty tyVar = this.f34303f;
        org.telegram.ui.ActionBar.w0 w0Var = tyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(0);
        }
        if (tyVar.f38021n2 != null) {
            tyVar.finishFragment();
            return false;
        }
        return true;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.l lVar;
        ty tyVar = this.f34303f;
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        if (!lVar.t() && tyVar.Q3 == null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        li.l lVar;
        org.telegram.ui.Components.v00 v00Var;
        ty tyVar = this.f34303f;
        gy gyVar = tyVar.X;
        if (gyVar != null) {
            ArrayList arrayList = gyVar.F;
            if (!arrayList.isEmpty() && gyVar.H != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((gg.q0) arrayList.get(i10)).h) {
                        ((zx) gyVar.H).d((gg.q0) arrayList.get(i10));
                    }
                }
            }
        }
        tyVar.f38004j2 = false;
        tyVar.f38008k2 = false;
        sy syVar = tyVar.f37976e0[0];
        if (syVar != null) {
            py pyVar = syVar.f37593a;
            if (tyVar.V2 == 0) {
                v00Var = syVar.f37600w;
            } else {
                v00Var = null;
            }
            pyVar.setEmptyView(v00Var);
            tyVar.X4(false, false, true, false);
        }
        tyVar.i5(false, false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
        tyVar.X.setCloseButtonVisible(false);
        tyVar.h5(true);
        tyVar.K3();
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).glassEngine;
        lVar.f();
    }

    @Override
    public final void n() {
        org.telegram.ui.ActionBar.l lVar;
        li.l lVar2;
        org.telegram.ui.Components.fo0 fo0Var;
        org.telegram.ui.Components.fo0 fo0Var2;
        ty tyVar = this.f34303f;
        tyVar.f38004j2 = true;
        org.telegram.ui.ActionBar.w0 w0Var = tyVar.D1;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        tyVar.V3();
        sy syVar = tyVar.f37976e0[0];
        if (syVar != null) {
            if (tyVar.f38021n2 != null) {
                syVar.f37593a.d1();
                ay ayVar = tyVar.C0;
                if (ayVar != null) {
                    ai.w0 w0Var2 = ayVar.W;
                    if (w0Var2.f30695i1) {
                        w0Var2.f30695i1 = false;
                        w0Var2.L0(false);
                    }
                }
            }
            if (!tyVar.f38012l2) {
                ci.e4 e4Var = tyVar.f38029p0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ci.e4 e4Var2 = tyVar.f38034q0;
                if (e4Var2 != null) {
                    e4Var2.e(true);
                }
            }
        }
        hx hxVar = tyVar.E0;
        if (hxVar != null && hxVar.getPremiumHint() != null) {
            tyVar.E0.getPremiumHint().e(true);
        }
        if (!tyVar.K) {
            tyVar.L4(0.0f);
        }
        tyVar.i5(false, false);
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        lVar.setBackButtonContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        lVar2 = ((org.telegram.ui.ActionBar.o2) tyVar).glassEngine;
        lVar2.f();
        ay ayVar2 = tyVar.C0;
        if (ayVar2 != null && (fo0Var2 = ayVar2.f26496c0) != null) {
            fo0Var2.f9751c = gg.f0.All;
        }
        if ((ayVar2 != null && (fo0Var = ayVar2.f26496c0) != null && fo0Var.N()) || tyVar.getMessagesController().getTotalDialogsCount() > 10 || tyVar.f38049s3 || tyVar.K) {
            tyVar.f38008k2 = true;
            if (!tyVar.f38032p3) {
                tyVar.X4(true, false, true, false);
            }
        }
        tyVar.X.setCloseButtonVisible(true);
        tyVar.h5(true);
        tyVar.K3();
    }

    @Override
    public final void q(EditText editText) {
        ay ayVar;
        org.telegram.ui.Components.fo0 fo0Var;
        String obj = editText.getText().toString();
        boolean isEmpty = obj.isEmpty();
        boolean z10 = true;
        ty tyVar = this.f34303f;
        if (!isEmpty || (((ayVar = tyVar.C0) != null && (fo0Var = ayVar.f26496c0) != null && fo0Var.N()) || tyVar.f38049s3 || tyVar.K)) {
            tyVar.f38008k2 = true;
            if (!tyVar.f38032p3) {
                tyVar.X4(true, false, true, false);
            }
        }
        ay ayVar2 = tyVar.C0;
        if (ayVar2 != null) {
            View currentView = ayVar2.getCurrentView();
            boolean z11 = !ayVar2.f26499f0;
            if (!TextUtils.isEmpty(ayVar2.L0)) {
                z10 = z11;
            }
            ayVar2.L0 = obj;
            ayVar2.P(currentView, ayVar2.getCurrentPosition(), obj, z10);
        }
    }
}
