package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class v00 extends s4.v {
    public final kq d = new kq(this, 17);
    public final w00 e;

    public v00(w00 w00Var) {
        this.e = w00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f44838a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            w00 w00Var = this.e;
            if (!w00Var.f30711n || (b1Var.b() == 0 && ((s00) w00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f30711n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((b1Var.b() == 0 || b1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        r00 r00Var = this.e.I;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        w00 w00Var = r00Var.d;
        ArrayList arrayList = w00Var.h;
        SparseIntArray sparseIntArray = w00Var.f30709k0;
        int size = arrayList.size();
        if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(b10);
            MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(b11);
            int i11 = dialogFilter.order;
            dialogFilter.order = dialogFilter2.order;
            dialogFilter2.order = i11;
            dialogFilters.set(b10, dialogFilter2);
            dialogFilters.set(b11, dialogFilter);
            s00 s00Var = (s00) arrayList.get(b10);
            s00 s00Var2 = (s00) arrayList.get(b11);
            int i12 = s00Var.f28978a;
            s00Var.f28978a = s00Var2.f28978a;
            s00Var2.f28978a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            q00 q00Var = w00Var.J;
            int i14 = s00Var2.f28978a;
            int i15 = s00Var.f28978a;
            org.telegram.ui.xw xwVar = (org.telegram.ui.xw) q00Var;
            while (true) {
                org.telegram.ui.xy[] xyVarArr = xwVar.f41972b.f42325e0;
                if (i10 >= xyVarArr.length) {
                    break;
                }
                org.telegram.ui.xy xyVar = xyVarArr[i10];
                int i16 = xyVar.h;
                if (i16 == i14) {
                    xyVar.h = i15;
                } else if (i16 == i15) {
                    xyVar.h = i14;
                }
                i10++;
            }
            int i17 = w00Var.K;
            if (i17 == b10) {
                w00Var.K = b11;
                w00Var.L = s00Var.f28978a;
            } else if (i17 == b11) {
                w00Var.K = b10;
                w00Var.L = s00Var2.f28978a;
            }
            int i18 = w00Var.f30715q0;
            if (i18 == b10) {
                w00Var.f30715q0 = b11;
                w00Var.f30717r0 = s00Var.f28978a;
            } else if (i18 == b11) {
                w00Var.f30715q0 = b10;
                w00Var.f30717r0 = s00Var2.f28978a;
            }
            arrayList.set(b10, s00Var2);
            arrayList.set(b11, s00Var);
            w00Var.j();
            w00Var.f30727y = true;
            w00Var.F.setItemAnimator(w00Var.f30719s0);
            r00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            w00 w00Var = this.e;
            w00Var.F.I0(false);
            b1Var.f44838a.setPressed(true);
            b1Var.f44838a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(w00Var.f30698b0, w00Var.f30695a));
        } else {
            kq kqVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(kqVar);
            AndroidUtilities.runOnUIThread(kqVar, 320L);
        }
        if (b1Var != null) {
            View view = b1Var.f44838a;
            int i11 = R.id.dragging;
            if (i10 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i11, bool);
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
