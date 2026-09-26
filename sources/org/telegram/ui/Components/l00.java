package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class l00 extends s4.v {
    public final zp d = new zp(this, 17);
    public final m00 e;

    public l00(m00 m00Var) {
        this.e = m00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f42959a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            m00 m00Var = this.e;
            if (!m00Var.f26242n || (c1Var.b() == 0 && ((i00) m00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f26242n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((c1Var.b() == 0 || c1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        h00 h00Var = this.e.I;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        m00 m00Var = h00Var.d;
        ArrayList arrayList = m00Var.h;
        SparseIntArray sparseIntArray = m00Var.f26240k0;
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
            i00 i00Var = (i00) arrayList.get(b10);
            i00 i00Var2 = (i00) arrayList.get(b11);
            int i12 = i00Var.f24923a;
            i00Var.f24923a = i00Var2.f24923a;
            i00Var2.f24923a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            g00 g00Var = m00Var.J;
            int i14 = i00Var2.f24923a;
            int i15 = i00Var.f24923a;
            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) g00Var;
            while (true) {
                org.telegram.ui.py[] pyVarArr = pwVar.f36685b.f37032e0;
                if (i10 >= pyVarArr.length) {
                    break;
                }
                org.telegram.ui.py pyVar = pyVarArr[i10];
                int i16 = pyVar.h;
                if (i16 == i14) {
                    pyVar.h = i15;
                } else if (i16 == i15) {
                    pyVar.h = i14;
                }
                i10++;
            }
            int i17 = m00Var.K;
            if (i17 == b10) {
                m00Var.K = b11;
                m00Var.L = i00Var.f24923a;
            } else if (i17 == b11) {
                m00Var.K = b10;
                m00Var.L = i00Var2.f24923a;
            }
            int i18 = m00Var.f26246q0;
            if (i18 == b10) {
                m00Var.f26246q0 = b11;
                m00Var.f26248r0 = i00Var.f24923a;
            } else if (i18 == b11) {
                m00Var.f26246q0 = b10;
                m00Var.f26248r0 = i00Var2.f24923a;
            }
            arrayList.set(b10, i00Var2);
            arrayList.set(b11, i00Var);
            m00Var.j();
            m00Var.f26258y = true;
            m00Var.F.setItemAnimator(m00Var.f26250s0);
            h00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            m00 m00Var = this.e;
            m00Var.F.I0(false);
            c1Var.f42959a.setPressed(true);
            c1Var.f42959a.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(m00Var.f26229b0, m00Var.f26226a));
        } else {
            zp zpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(zpVar);
            AndroidUtilities.runOnUIThread(zpVar, 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f42959a;
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
