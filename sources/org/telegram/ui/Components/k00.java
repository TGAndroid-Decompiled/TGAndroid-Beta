package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class k00 extends f2.b0 {
    public final xp d = new xp(this, 17);
    public final l00 f28240e;

    public k00(l00 l00Var) {
        this.f28240e = l00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        View view = m1Var.f5875a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            l00 l00Var = this.f28240e;
            if (!l00Var.f28503n || (m1Var.b() == 0 && ((i00) l00Var.h.get(0)).f27637e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.b0.l(0, 0);
            }
        }
        return f2.b0.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f28240e.f28503n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((m1Var.b() == 0 || m1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        h00 h00Var = this.f28240e.F;
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        l00 l00Var = h00Var.d;
        ArrayList arrayList = l00Var.h;
        SparseIntArray sparseIntArray = l00Var.f28498h0;
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
            int i12 = i00Var.f27634a;
            i00Var.f27634a = i00Var2.f27634a;
            i00Var2.f27634a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            g00 g00Var = l00Var.G;
            int i14 = i00Var2.f27634a;
            int i15 = i00Var.f27634a;
            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) g00Var;
            while (true) {
                org.telegram.ui.oy[] oyVarArr = pwVar.f40168b.f40185b0;
                if (i10 >= oyVarArr.length) {
                    break;
                }
                org.telegram.ui.oy oyVar = oyVarArr[i10];
                int i16 = oyVar.h;
                if (i16 == i14) {
                    oyVar.h = i15;
                } else if (i16 == i15) {
                    oyVar.h = i14;
                }
                i10++;
            }
            int i17 = l00Var.H;
            if (i17 == b10) {
                l00Var.H = b11;
                l00Var.I = i00Var.f27634a;
            } else if (i17 == b11) {
                l00Var.H = b10;
                l00Var.I = i00Var2.f27634a;
            }
            int i18 = l00Var.f28504n0;
            if (i18 == b10) {
                l00Var.f28504n0 = b11;
                l00Var.f28505o0 = i00Var.f27634a;
            } else if (i18 == b11) {
                l00Var.f28504n0 = b10;
                l00Var.f28505o0 = i00Var2.f27634a;
            }
            arrayList.set(b10, i00Var2);
            arrayList.set(b11, i00Var);
            l00Var.j();
            l00Var.f28518y = true;
            l00Var.C.setItemAnimator(l00Var.f28506p0);
            h00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            l00 l00Var = this.f28240e;
            l00Var.C.I0(false);
            m1Var.f5875a.setPressed(true);
            m1Var.f5875a.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(l00Var.V, l00Var.f28486a));
        } else {
            xp xpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            AndroidUtilities.runOnUIThread(xpVar, 320L);
        }
        if (m1Var != null) {
            View view = m1Var.f5875a;
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
    public final void q(f2.m1 m1Var) {
    }
}
