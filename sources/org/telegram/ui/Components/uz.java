package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class uz extends f2.d0 {
    public final np d = new np(this, 17);
    public final vz f33173e;

    public uz(vz vzVar) {
        this.f33173e = vzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        View view = q1Var.f5501a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            vz vzVar = this.f33173e;
            if (!vzVar.f34047n || (q1Var.b() == 0 && ((sz) vzVar.h.get(0)).f32575e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.d0.l(0, 0);
            }
        }
        return f2.d0.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f33173e.f34047n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        int i9 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((q1Var.b() == 0 || q1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        rz rzVar = this.f33173e.E;
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        vz vzVar = rzVar.d;
        ArrayList arrayList = vzVar.h;
        SparseIntArray sparseIntArray = vzVar.f34041g0;
        int size = arrayList.size();
        if (b10 >= 0 && b11 >= 0 && b10 < size && b11 < size) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(b10);
            MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(b11);
            int i10 = dialogFilter.order;
            dialogFilter.order = dialogFilter2.order;
            dialogFilter2.order = i10;
            dialogFilters.set(b10, dialogFilter2);
            dialogFilters.set(b11, dialogFilter);
            sz szVar = (sz) arrayList.get(b10);
            sz szVar2 = (sz) arrayList.get(b11);
            int i11 = szVar.f32572a;
            szVar.f32572a = szVar2.f32572a;
            szVar2.f32572a = i11;
            int i12 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i12);
            qz qzVar = vzVar.F;
            int i13 = szVar2.f32572a;
            int i14 = szVar.f32572a;
            org.telegram.ui.dw dwVar = (org.telegram.ui.dw) qzVar;
            while (true) {
                org.telegram.ui.cy[] cyVarArr = dwVar.f37619b.f37629a0;
                if (i9 >= cyVarArr.length) {
                    break;
                }
                org.telegram.ui.cy cyVar = cyVarArr[i9];
                int i15 = cyVar.h;
                if (i15 == i13) {
                    cyVar.h = i14;
                } else if (i15 == i14) {
                    cyVar.h = i13;
                }
                i9++;
            }
            int i16 = vzVar.G;
            if (i16 == b10) {
                vzVar.G = b11;
                vzVar.H = szVar.f32572a;
            } else if (i16 == b11) {
                vzVar.G = b10;
                vzVar.H = szVar2.f32572a;
            }
            int i17 = vzVar.m0;
            if (i17 == b10) {
                vzVar.m0 = b11;
                vzVar.f34048n0 = szVar.f32572a;
            } else if (i17 == b11) {
                vzVar.m0 = b10;
                vzVar.f34048n0 = szVar2.f32572a;
            }
            arrayList.set(b10, szVar2);
            arrayList.set(b11, szVar);
            vzVar.j();
            vzVar.f34061y = true;
            vzVar.B.setItemAnimator(vzVar.f34049o0);
            rzVar.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        Boolean bool;
        if (i9 != 0) {
            vz vzVar = this.f33173e;
            vzVar.B.I0(false);
            q1Var.f5501a.setPressed(true);
            q1Var.f5501a.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(vzVar.U, vzVar.f34030a));
        } else {
            np npVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(npVar);
            AndroidUtilities.runOnUIThread(npVar, 320L);
        }
        if (q1Var != null) {
            View view = q1Var.f5501a;
            int i10 = R.id.dragging;
            if (i9 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i10, bool);
        }
    }

    @Override
    public final void q(f2.q1 q1Var) {
    }
}
