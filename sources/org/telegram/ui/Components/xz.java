package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public final class xz extends f2.c0 {
    public final lp d = new lp(this, 17);

    public final yz f34733e;

    public xz(yz yzVar) {
        this.f34733e = yzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        View view = o1Var.f5789a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            yz yzVar = this.f34733e;
            if (!yzVar.f35085n || (o1Var.b() == 0 && ((vz) yzVar.h.get(0)).f34075e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.c0.l(0, 0);
            }
        }
        return f2.c0.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f34733e.f35085n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((o1Var.b() == 0 || o1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        uz uzVar = this.f34733e.E;
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        yz yzVar = uzVar.d;
        ArrayList arrayList = yzVar.h;
        SparseIntArray sparseIntArray = yzVar.f35079g0;
        int size = arrayList.size();
        if (iB >= 0 && iB2 >= 0 && iB < size && iB2 < size) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(iB);
            MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(iB2);
            int i11 = dialogFilter.order;
            dialogFilter.order = dialogFilter2.order;
            dialogFilter2.order = i11;
            dialogFilters.set(iB, dialogFilter2);
            dialogFilters.set(iB2, dialogFilter);
            vz vzVar = (vz) arrayList.get(iB);
            vz vzVar2 = (vz) arrayList.get(iB2);
            int i12 = vzVar.f34072a;
            vzVar.f34072a = vzVar2.f34072a;
            vzVar2.f34072a = i12;
            int i13 = sparseIntArray.get(iB);
            sparseIntArray.put(iB, sparseIntArray.get(iB2));
            sparseIntArray.put(iB2, i13);
            tz tzVar = yzVar.F;
            int i14 = vzVar2.f34072a;
            int i15 = vzVar.f34072a;
            org.telegram.ui.gw gwVar = (org.telegram.ui.gw) tzVar;
            while (true) {
                org.telegram.ui.fy[] fyVarArr = gwVar.f38485b.f38498a0;
                if (i10 >= fyVarArr.length) {
                    break;
                }
                org.telegram.ui.fy fyVar = fyVarArr[i10];
                int i16 = fyVar.h;
                if (i16 == i14) {
                    fyVar.h = i15;
                } else if (i16 == i15) {
                    fyVar.h = i14;
                }
                i10++;
            }
            int i17 = yzVar.G;
            if (i17 == iB) {
                yzVar.G = iB2;
                yzVar.H = vzVar.f34072a;
            } else if (i17 == iB2) {
                yzVar.G = iB;
                yzVar.H = vzVar2.f34072a;
            }
            int i18 = yzVar.m0;
            if (i18 == iB) {
                yzVar.m0 = iB2;
                yzVar.f35086n0 = vzVar.f34072a;
            } else if (i18 == iB2) {
                yzVar.m0 = iB;
                yzVar.f35086n0 = vzVar2.f34072a;
            }
            arrayList.set(iB, vzVar2);
            arrayList.set(iB2, vzVar);
            yzVar.j();
            yzVar.f35099y = true;
            yzVar.B.setItemAnimator(yzVar.f35087o0);
            uzVar.p(iB, iB2);
        }
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        if (i10 != 0) {
            yz yzVar = this.f34733e;
            yzVar.B.I0(false);
            o1Var.f5789a.setPressed(true);
            o1Var.f5789a.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(yzVar.U, yzVar.f35068a));
        } else {
            lp lpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(lpVar);
            AndroidUtilities.runOnUIThread(lpVar, 320L);
        }
        if (o1Var != null) {
            o1Var.f5789a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }
}
