package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class j00 extends s4.v {
    public final xp d = new xp(this, 17);
    public final k00 e;

    public j00(k00 k00Var) {
        this.e = k00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f42702a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            k00 k00Var = this.e;
            if (!k00Var.f25495n || (c1Var.b() == 0 && ((g00) k00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f25495n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((c1Var.b() == 0 || c1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        f00 f00Var = this.e.I;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        k00 k00Var = f00Var.d;
        ArrayList arrayList = k00Var.h;
        SparseIntArray sparseIntArray = k00Var.f25493k0;
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
            g00 g00Var = (g00) arrayList.get(b10);
            g00 g00Var2 = (g00) arrayList.get(b11);
            int i12 = g00Var.f24054a;
            g00Var.f24054a = g00Var2.f24054a;
            g00Var2.f24054a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            e00 e00Var = k00Var.J;
            int i14 = g00Var2.f24054a;
            int i15 = g00Var.f24054a;
            org.telegram.ui.vw vwVar = (org.telegram.ui.vw) e00Var;
            while (true) {
                org.telegram.ui.vy[] vyVarArr = vwVar.f38516b.f39221e0;
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
            int i17 = k00Var.K;
            if (i17 == b10) {
                k00Var.K = b11;
                k00Var.L = g00Var.f24054a;
            } else if (i17 == b11) {
                k00Var.K = b10;
                k00Var.L = g00Var2.f24054a;
            }
            int i18 = k00Var.f25499q0;
            if (i18 == b10) {
                k00Var.f25499q0 = b11;
                k00Var.f25501r0 = g00Var.f24054a;
            } else if (i18 == b11) {
                k00Var.f25499q0 = b10;
                k00Var.f25501r0 = g00Var2.f24054a;
            }
            arrayList.set(b10, g00Var2);
            arrayList.set(b11, g00Var);
            k00Var.j();
            k00Var.f25511y = true;
            k00Var.F.setItemAnimator(k00Var.f25503s0);
            f00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            k00 k00Var = this.e;
            k00Var.F.J0(false);
            c1Var.f42702a.setPressed(true);
            c1Var.f42702a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(k00Var.f25482b0, k00Var.f25479a));
        } else {
            xp xpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(xpVar);
            AndroidUtilities.runOnUIThread(xpVar, 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f42702a;
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
