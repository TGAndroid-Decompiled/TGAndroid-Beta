package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class m00 extends s4.v {
    public final aq d = new aq(this, 17);
    public final n00 f28487e;

    public m00(n00 n00Var) {
        this.f28487e = n00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f46524a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            n00 n00Var = this.f28487e;
            if (!n00Var.f28781n || (c1Var.b() == 0 && ((j00) n00Var.h.get(0)).f27547e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return s4.v.l(0, 0);
            }
        }
        return s4.v.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f28487e.f28781n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((c1Var.b() == 0 || c1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        i00 i00Var = this.f28487e.I;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        n00 n00Var = i00Var.d;
        ArrayList arrayList = n00Var.h;
        SparseIntArray sparseIntArray = n00Var.f28779k0;
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
            j00 j00Var = (j00) arrayList.get(b10);
            j00 j00Var2 = (j00) arrayList.get(b11);
            int i12 = j00Var.f27544a;
            j00Var.f27544a = j00Var2.f27544a;
            j00Var2.f27544a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            h00 h00Var = n00Var.J;
            int i14 = j00Var2.f27544a;
            int i15 = j00Var.f27544a;
            org.telegram.ui.ly lyVar = (org.telegram.ui.ly) h00Var;
            while (true) {
                org.telegram.ui.ty[] tyVarArr = lyVar.f38360b.f41393e0;
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
            int i17 = n00Var.K;
            if (i17 == b10) {
                n00Var.K = b11;
                n00Var.L = j00Var.f27544a;
            } else if (i17 == b11) {
                n00Var.K = b10;
                n00Var.L = j00Var2.f27544a;
            }
            int i18 = n00Var.f28785q0;
            if (i18 == b10) {
                n00Var.f28785q0 = b11;
                n00Var.f28787r0 = j00Var.f27544a;
            } else if (i18 == b11) {
                n00Var.f28785q0 = b10;
                n00Var.f28787r0 = j00Var2.f27544a;
            }
            arrayList.set(b10, j00Var2);
            arrayList.set(b11, j00Var);
            n00Var.j();
            n00Var.f28797y = true;
            n00Var.F.setItemAnimator(n00Var.f28789s0);
            i00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            n00 n00Var = this.f28487e;
            n00Var.F.J0(false);
            c1Var.f46524a.setPressed(true);
            c1Var.f46524a.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(n00Var.f28767b0, n00Var.f28764a));
        } else {
            aq aqVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(aqVar);
            AndroidUtilities.runOnUIThread(aqVar, 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f46524a;
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
