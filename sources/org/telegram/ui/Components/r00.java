package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class r00 extends s4.w {
    public final bq d = new bq(this, 19);
    public final s00 e;

    public r00(s00 s00Var) {
        this.e = s00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        View view = e1Var.f47738a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            s00 s00Var = this.e;
            if (!s00Var.f32377n || (e1Var.b() == 0 && ((p00) s00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.w.l(0, 0);
            }
        }
        return s4.w.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f32377n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((e1Var.b() == 0 || e1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        o00 o00Var = this.e.I;
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        s00 s00Var = o00Var.d;
        ArrayList arrayList = s00Var.h;
        SparseIntArray sparseIntArray = s00Var.f32375k0;
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
            p00 p00Var = (p00) arrayList.get(b10);
            p00 p00Var2 = (p00) arrayList.get(b11);
            int i12 = p00Var.f31401a;
            p00Var.f31401a = p00Var2.f31401a;
            p00Var2.f31401a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            n00 n00Var = s00Var.J;
            int i14 = p00Var2.f31401a;
            int i15 = p00Var.f31401a;
            org.telegram.ui.rx rxVar = (org.telegram.ui.rx) n00Var;
            while (true) {
                org.telegram.ui.ay[] ayVarArr = rxVar.f43310b.f38586e0;
                if (i10 >= ayVarArr.length) {
                    break;
                }
                org.telegram.ui.ay ayVar = ayVarArr[i10];
                int i16 = ayVar.h;
                if (i16 == i14) {
                    ayVar.h = i15;
                } else if (i16 == i15) {
                    ayVar.h = i14;
                }
                i10++;
            }
            int i17 = s00Var.K;
            if (i17 == b10) {
                s00Var.K = b11;
                s00Var.L = p00Var.f31401a;
            } else if (i17 == b11) {
                s00Var.K = b10;
                s00Var.L = p00Var2.f31401a;
            }
            int i18 = s00Var.f32381q0;
            if (i18 == b10) {
                s00Var.f32381q0 = b11;
                s00Var.f32383r0 = p00Var.f31401a;
            } else if (i18 == b11) {
                s00Var.f32381q0 = b10;
                s00Var.f32383r0 = p00Var2.f31401a;
            }
            arrayList.set(b10, p00Var2);
            arrayList.set(b11, p00Var);
            s00Var.j();
            s00Var.f32393y = true;
            s00Var.F.setItemAnimator(s00Var.f32385s0);
            o00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            s00 s00Var = this.e;
            s00Var.F.I0(false);
            e1Var.f47738a.setPressed(true);
            org.telegram.ui.ActionBar.f7.i(s00Var.f32364b0, e1Var.f47738a, s00Var.f32361a);
        } else {
            bq bqVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(bqVar);
            AndroidUtilities.runOnUIThread(bqVar, 320L);
        }
        if (e1Var != null) {
            View view = e1Var.f47738a;
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
    public final void q(s4.e1 e1Var) {
    }
}
