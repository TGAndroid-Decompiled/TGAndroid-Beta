package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class k00 extends s4.v {
    public final yp d = new yp(this, 17);
    public final l00 e;

    public k00(l00 l00Var) {
        this.e = l00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f42960a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            l00 l00Var = this.e;
            if (!l00Var.f25950n || (c1Var.b() == 0 && ((h00) l00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f25950n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((c1Var.b() == 0 || c1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        g00 g00Var = this.e.I;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        l00 l00Var = g00Var.d;
        ArrayList arrayList = l00Var.h;
        SparseIntArray sparseIntArray = l00Var.f25948k0;
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
            h00 h00Var = (h00) arrayList.get(b10);
            h00 h00Var2 = (h00) arrayList.get(b11);
            int i12 = h00Var.f24583a;
            h00Var.f24583a = h00Var2.f24583a;
            h00Var2.f24583a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            f00 f00Var = l00Var.J;
            int i14 = h00Var2.f24583a;
            int i15 = h00Var.f24583a;
            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) f00Var;
            while (true) {
                org.telegram.ui.py[] pyVarArr = pwVar.f36686b.f37033e0;
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
            int i17 = l00Var.K;
            if (i17 == b10) {
                l00Var.K = b11;
                l00Var.L = h00Var.f24583a;
            } else if (i17 == b11) {
                l00Var.K = b10;
                l00Var.L = h00Var2.f24583a;
            }
            int i18 = l00Var.f25954q0;
            if (i18 == b10) {
                l00Var.f25954q0 = b11;
                l00Var.f25956r0 = h00Var.f24583a;
            } else if (i18 == b11) {
                l00Var.f25954q0 = b10;
                l00Var.f25956r0 = h00Var2.f24583a;
            }
            arrayList.set(b10, h00Var2);
            arrayList.set(b11, h00Var);
            l00Var.j();
            l00Var.f25966y = true;
            l00Var.F.setItemAnimator(l00Var.f25958s0);
            g00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            l00 l00Var = this.e;
            l00Var.F.I0(false);
            c1Var.f42960a.setPressed(true);
            c1Var.f42960a.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(l00Var.f25937b0, l00Var.f25934a));
        } else {
            yp ypVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(ypVar);
            AndroidUtilities.runOnUIThread(ypVar, 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f42960a;
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
