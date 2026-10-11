package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class a10 extends s4.w {
    public final nq d = new nq(this, 17);
    public final b10 f24405e;

    public a10(b10 b10Var) {
        this.f24405e = b10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.f47748a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            b10 b10Var = this.f24405e;
            if (!b10Var.f24761n || (d1Var.b() == 0 && ((x00) b10Var.h.get(0)).f32787e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.w.l(0, 0);
            }
        }
        return s4.w.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f24405e.f24761n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((d1Var.b() == 0 || d1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        w00 w00Var = this.f24405e.I;
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        b10 b10Var = w00Var.d;
        ArrayList arrayList = b10Var.h;
        SparseIntArray sparseIntArray = b10Var.f24759k0;
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
            x00 x00Var = (x00) arrayList.get(b10);
            x00 x00Var2 = (x00) arrayList.get(b11);
            int i12 = x00Var.f32784a;
            x00Var.f32784a = x00Var2.f32784a;
            x00Var2.f32784a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            v00 v00Var = b10Var.J;
            int i14 = x00Var2.f32784a;
            int i15 = x00Var.f32784a;
            org.telegram.ui.rw rwVar = (org.telegram.ui.rw) v00Var;
            while (true) {
                org.telegram.ui.ry[] ryVarArr = rwVar.f41520b.f41907e0;
                if (i10 >= ryVarArr.length) {
                    break;
                }
                org.telegram.ui.ry ryVar = ryVarArr[i10];
                int i16 = ryVar.h;
                if (i16 == i14) {
                    ryVar.h = i15;
                } else if (i16 == i15) {
                    ryVar.h = i14;
                }
                i10++;
            }
            int i17 = b10Var.K;
            if (i17 == b10) {
                b10Var.K = b11;
                b10Var.L = x00Var.f32784a;
            } else if (i17 == b11) {
                b10Var.K = b10;
                b10Var.L = x00Var2.f32784a;
            }
            int i18 = b10Var.f24765q0;
            if (i18 == b10) {
                b10Var.f24765q0 = b11;
                b10Var.f24767r0 = x00Var.f32784a;
            } else if (i18 == b11) {
                b10Var.f24765q0 = b10;
                b10Var.f24767r0 = x00Var2.f32784a;
            }
            arrayList.set(b10, x00Var2);
            arrayList.set(b11, x00Var);
            b10Var.j();
            b10Var.f24777y = true;
            b10Var.F.setItemAnimator(b10Var.f24769s0);
            w00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            b10 b10Var = this.f24405e;
            b10Var.F.I0(false);
            d1Var.f47748a.setPressed(true);
            d1Var.f47748a.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(b10Var.f24747b0, b10Var.f24744a));
        } else {
            nq nqVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(nqVar);
            AndroidUtilities.runOnUIThread(nqVar, 320L);
        }
        if (d1Var != null) {
            View view = d1Var.f47748a;
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
