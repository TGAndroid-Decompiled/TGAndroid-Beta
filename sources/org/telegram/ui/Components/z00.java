package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class z00 extends s4.w {
    public final nq d = new nq(this, 17);
    public final a10 f33408e;

    public z00(a10 a10Var) {
        this.f33408e = a10Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.f47658a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            a10 a10Var = this.f33408e;
            if (!a10Var.f24515n || (d1Var.b() == 0 && ((w00) a10Var.h.get(0)).f32501e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.w.l(0, 0);
            }
        }
        return s4.w.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f33408e.f24515n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((d1Var.b() == 0 || d1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        v00 v00Var = this.f33408e.I;
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        a10 a10Var = v00Var.d;
        ArrayList arrayList = a10Var.h;
        SparseIntArray sparseIntArray = a10Var.f24513k0;
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
            w00 w00Var = (w00) arrayList.get(b10);
            w00 w00Var2 = (w00) arrayList.get(b11);
            int i12 = w00Var.f32498a;
            w00Var.f32498a = w00Var2.f32498a;
            w00Var2.f32498a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            u00 u00Var = a10Var.J;
            int i14 = w00Var2.f32498a;
            int i15 = w00Var.f32498a;
            org.telegram.ui.sw swVar = (org.telegram.ui.sw) u00Var;
            while (true) {
                org.telegram.ui.sy[] syVarArr = swVar.f41780b.f42174e0;
                if (i10 >= syVarArr.length) {
                    break;
                }
                org.telegram.ui.sy syVar = syVarArr[i10];
                int i16 = syVar.h;
                if (i16 == i14) {
                    syVar.h = i15;
                } else if (i16 == i15) {
                    syVar.h = i14;
                }
                i10++;
            }
            int i17 = a10Var.K;
            if (i17 == b10) {
                a10Var.K = b11;
                a10Var.L = w00Var.f32498a;
            } else if (i17 == b11) {
                a10Var.K = b10;
                a10Var.L = w00Var2.f32498a;
            }
            int i18 = a10Var.f24519q0;
            if (i18 == b10) {
                a10Var.f24519q0 = b11;
                a10Var.f24521r0 = w00Var.f32498a;
            } else if (i18 == b11) {
                a10Var.f24519q0 = b10;
                a10Var.f24521r0 = w00Var2.f32498a;
            }
            arrayList.set(b10, w00Var2);
            arrayList.set(b11, w00Var);
            a10Var.j();
            a10Var.f24531y = true;
            a10Var.F.setItemAnimator(a10Var.f24523s0);
            v00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            a10 a10Var = this.f33408e;
            a10Var.F.I0(false);
            d1Var.f47658a.setPressed(true);
            d1Var.f47658a.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(a10Var.f24501b0, a10Var.f24498a));
        } else {
            nq nqVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(nqVar);
            AndroidUtilities.runOnUIThread(nqVar, 320L);
        }
        if (d1Var != null) {
            View view = d1Var.f47658a;
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
