package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class p00 extends s4.v {
    public final xp d = new xp(this, 18);
    public final q00 e;

    public p00(q00 q00Var) {
        this.e = q00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f46342a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            q00 q00Var = this.e;
            if (!q00Var.f29721n || (b1Var.b() == 0 && ((n00) q00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f29721n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((b1Var.b() == 0 || b1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        m00 m00Var = this.e.I;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        q00 q00Var = m00Var.d;
        ArrayList arrayList = q00Var.h;
        SparseIntArray sparseIntArray = q00Var.f29719k0;
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
            int i12 = n00Var.f28740a;
            n00Var.f28740a = n00Var2.f28740a;
            n00Var2.f28740a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            l00 l00Var = q00Var.J;
            int i14 = n00Var2.f28740a;
            int i15 = n00Var.f28740a;
            org.telegram.ui.dw dwVar = (org.telegram.ui.dw) l00Var;
            while (true) {
                org.telegram.ui.dy[] dyVarArr = dwVar.f36730b.f37034e0;
                if (i10 >= dyVarArr.length) {
                    break;
                }
                org.telegram.ui.dy dyVar = dyVarArr[i10];
                int i16 = dyVar.h;
                if (i16 == i14) {
                    dyVar.h = i15;
                } else if (i16 == i15) {
                    dyVar.h = i14;
                }
                i10++;
            }
            int i17 = q00Var.K;
            if (i17 == b10) {
                q00Var.K = b11;
                q00Var.L = n00Var.f28740a;
            } else if (i17 == b11) {
                q00Var.K = b10;
                q00Var.L = n00Var2.f28740a;
            }
            int i18 = q00Var.f29725q0;
            if (i18 == b10) {
                q00Var.f29725q0 = b11;
                q00Var.f29727r0 = n00Var.f28740a;
            } else if (i18 == b11) {
                q00Var.f29725q0 = b10;
                q00Var.f29727r0 = n00Var2.f28740a;
            }
            arrayList.set(b10, n00Var2);
            arrayList.set(b11, n00Var);
            q00Var.j();
            q00Var.f29737y = true;
            q00Var.F.setItemAnimator(q00Var.f29729s0);
            m00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            q00 q00Var = this.e;
            q00Var.F.I0(false);
            b1Var.f46342a.setPressed(true);
            org.telegram.ui.ActionBar.r6.i(q00Var.f29708b0, b1Var.f46342a, q00Var.f29705a);
        } else {
            xp xpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            AndroidUtilities.runOnUIThread(xpVar, 320L);
        }
        if (b1Var != null) {
            View view = b1Var.f46342a;
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
