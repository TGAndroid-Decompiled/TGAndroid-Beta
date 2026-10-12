package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class c10 extends s4.w {
    public final pq d = new pq(this, 17);
    public final d10 f24791e;

    public c10(d10 d10Var) {
        this.f24791e = d10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.f47889a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            d10 d10Var = this.f24791e;
            if (!d10Var.f25180n || (d1Var.b() == 0 && ((z00) d10Var.h.get(0)).f33237e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.w.l(0, 0);
            }
        }
        return s4.w.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f24791e.f25180n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((d1Var.b() == 0 || d1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        y00 y00Var = this.f24791e.I;
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        d10 d10Var = y00Var.d;
        ArrayList arrayList = d10Var.h;
        SparseIntArray sparseIntArray = d10Var.f25178k0;
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
            z00 z00Var = (z00) arrayList.get(b10);
            z00 z00Var2 = (z00) arrayList.get(b11);
            int i12 = z00Var.f33234a;
            z00Var.f33234a = z00Var2.f33234a;
            z00Var2.f33234a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            x00 x00Var = d10Var.J;
            int i14 = z00Var2.f33234a;
            int i15 = z00Var.f33234a;
            org.telegram.ui.uw uwVar = (org.telegram.ui.uw) x00Var;
            while (true) {
                org.telegram.ui.uy[] uyVarArr = uwVar.f42601b.f42903e0;
                if (i10 >= uyVarArr.length) {
                    break;
                }
                org.telegram.ui.uy uyVar = uyVarArr[i10];
                int i16 = uyVar.h;
                if (i16 == i14) {
                    uyVar.h = i15;
                } else if (i16 == i15) {
                    uyVar.h = i14;
                }
                i10++;
            }
            int i17 = d10Var.K;
            if (i17 == b10) {
                d10Var.K = b11;
                d10Var.L = z00Var.f33234a;
            } else if (i17 == b11) {
                d10Var.K = b10;
                d10Var.L = z00Var2.f33234a;
            }
            int i18 = d10Var.f25184q0;
            if (i18 == b10) {
                d10Var.f25184q0 = b11;
                d10Var.f25186r0 = z00Var.f33234a;
            } else if (i18 == b11) {
                d10Var.f25184q0 = b10;
                d10Var.f25186r0 = z00Var2.f33234a;
            }
            arrayList.set(b10, z00Var2);
            arrayList.set(b11, z00Var);
            d10Var.j();
            d10Var.f25196y = true;
            d10Var.F.setItemAnimator(d10Var.f25188s0);
            y00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            d10 d10Var = this.f24791e;
            d10Var.F.I0(false);
            d1Var.f47889a.setPressed(true);
            d1Var.f47889a.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(d10Var.f25166b0, d10Var.f25163a));
        } else {
            pq pqVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(pqVar);
            AndroidUtilities.runOnUIThread(pqVar, 320L);
        }
        if (d1Var != null) {
            View view = d1Var.f47889a;
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
    public final void q(s4.d1 d1Var) {
    }
}
