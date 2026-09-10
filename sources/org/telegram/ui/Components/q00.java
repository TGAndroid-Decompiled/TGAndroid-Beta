package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class q00 extends s4.v {
    public final dq d = new dq(this, 17);
    public final r00 e;

    public q00(r00 r00Var) {
        this.e = r00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f41610a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            r00 r00Var = this.e;
            if (!r00Var.f26528n || (c1Var.b() == 0 && ((n00) r00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f26528n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((c1Var.b() == 0 || c1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        m00 m00Var = this.e.I;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        r00 r00Var = m00Var.d;
        ArrayList arrayList = r00Var.h;
        SparseIntArray sparseIntArray = r00Var.f26526k0;
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
            n00 n00Var = (n00) arrayList.get(b10);
            n00 n00Var2 = (n00) arrayList.get(b11);
            int i12 = n00Var.f25349a;
            n00Var.f25349a = n00Var2.f25349a;
            n00Var2.f25349a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            l00 l00Var = r00Var.J;
            int i14 = n00Var2.f25349a;
            int i15 = n00Var.f25349a;
            org.telegram.ui.vw vwVar = (org.telegram.ui.vw) l00Var;
            while (true) {
                org.telegram.ui.vy[] vyVarArr = vwVar.f37634b.f38431e0;
                if (i10 >= vyVarArr.length) {
                    break;
                }
                org.telegram.ui.vy vyVar = vyVarArr[i10];
                int i16 = vyVar.h;
                if (i16 == i14) {
                    vyVar.h = i15;
                } else if (i16 == i15) {
                    vyVar.h = i14;
                }
                i10++;
            }
            int i17 = r00Var.K;
            if (i17 == b10) {
                r00Var.K = b11;
                r00Var.L = n00Var.f25349a;
            } else if (i17 == b11) {
                r00Var.K = b10;
                r00Var.L = n00Var2.f25349a;
            }
            int i18 = r00Var.f26532q0;
            if (i18 == b10) {
                r00Var.f26532q0 = b11;
                r00Var.f26534r0 = n00Var.f25349a;
            } else if (i18 == b11) {
                r00Var.f26532q0 = b10;
                r00Var.f26534r0 = n00Var2.f25349a;
            }
            arrayList.set(b10, n00Var2);
            arrayList.set(b11, n00Var);
            r00Var.j();
            r00Var.f26544y = true;
            r00Var.F.setItemAnimator(r00Var.f26536s0);
            m00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            r00 r00Var = this.e;
            r00Var.F.I0(false);
            c1Var.f41610a.setPressed(true);
            c1Var.f41610a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(r00Var.f26515b0, r00Var.f26512a));
        } else {
            dq dqVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(dqVar);
            AndroidUtilities.runOnUIThread(dqVar, 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f41610a;
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
    public final void q(s4.c1 c1Var) {
    }
}
