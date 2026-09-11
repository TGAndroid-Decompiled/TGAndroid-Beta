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
    public final wp d = new wp(this, 17);
    public final k00 f27294e;

    public j00(k00 k00Var) {
        this.f27294e = k00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f45738a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            k00 k00Var = this.f27294e;
            if (!k00Var.f27621n || (c1Var.b() == 0 && ((g00) k00Var.h.get(0)).f26220e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f27294e.f27621n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((c1Var.b() == 0 || c1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        f00 f00Var = this.f27294e.I;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        k00 k00Var = f00Var.d;
        ArrayList arrayList = k00Var.h;
        SparseIntArray sparseIntArray = k00Var.f27619k0;
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
            int i12 = g00Var.f26217a;
            g00Var.f26217a = g00Var2.f26217a;
            g00Var2.f26217a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            e00 e00Var = k00Var.J;
            int i14 = g00Var2.f26217a;
            int i15 = g00Var.f26217a;
            org.telegram.ui.tw twVar = (org.telegram.ui.tw) e00Var;
            while (true) {
                org.telegram.ui.ty[] tyVarArr = twVar.f40841b.f41259e0;
                if (i10 >= tyVarArr.length) {
                    break;
                }
                org.telegram.ui.ty tyVar = tyVarArr[i10];
                int i16 = tyVar.h;
                if (i16 == i14) {
                    tyVar.h = i15;
                } else if (i16 == i15) {
                    tyVar.h = i14;
                }
                i10++;
            }
            int i17 = k00Var.K;
            if (i17 == b10) {
                k00Var.K = b11;
                k00Var.L = g00Var.f26217a;
            } else if (i17 == b11) {
                k00Var.K = b10;
                k00Var.L = g00Var2.f26217a;
            }
            int i18 = k00Var.f27625q0;
            if (i18 == b10) {
                k00Var.f27625q0 = b11;
                k00Var.f27627r0 = g00Var.f26217a;
            } else if (i18 == b11) {
                k00Var.f27625q0 = b10;
                k00Var.f27627r0 = g00Var2.f26217a;
            }
            arrayList.set(b10, g00Var2);
            arrayList.set(b11, g00Var);
            k00Var.j();
            k00Var.f27637y = true;
            k00Var.F.setItemAnimator(k00Var.f27629s0);
            f00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            k00 k00Var = this.f27294e;
            k00Var.F.I0(false);
            c1Var.f45738a.setPressed(true);
            c1Var.f45738a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(k00Var.f27607b0, k00Var.f27604a));
        } else {
            wp wpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(wpVar);
            AndroidUtilities.runOnUIThread(wpVar, 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f45738a;
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
