package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class e00 extends f2.b0 {
    public final rp d = new rp(this, 17);
    public final f00 f27901e;

    public e00(f00 f00Var) {
        this.f27901e = f00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        View view = n1Var.f6432a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            f00 f00Var = this.f27901e;
            if (!f00Var.f28243n || (n1Var.b() == 0 && ((c00) f00Var.h.get(0)).f27254e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.b0.l(0, 0);
            }
        }
        return f2.b0.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.f27901e.f28243n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((n1Var.b() == 0 || n1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        b00 b00Var = this.f27901e.E;
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        f00 f00Var = b00Var.d;
        ArrayList arrayList = f00Var.h;
        SparseIntArray sparseIntArray = f00Var.f28237g0;
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
            c00 c00Var = (c00) arrayList.get(b10);
            c00 c00Var2 = (c00) arrayList.get(b11);
            int i12 = c00Var.f27251a;
            c00Var.f27251a = c00Var2.f27251a;
            c00Var2.f27251a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            a00 a00Var = f00Var.F;
            int i14 = c00Var2.f27251a;
            int i15 = c00Var.f27251a;
            org.telegram.ui.fw fwVar = (org.telegram.ui.fw) a00Var;
            while (true) {
                org.telegram.ui.ey[] eyVarArr = fwVar.f38242b.f38256a0;
                if (i10 >= eyVarArr.length) {
                    break;
                }
                org.telegram.ui.ey eyVar = eyVarArr[i10];
                int i16 = eyVar.h;
                if (i16 == i14) {
                    eyVar.h = i15;
                } else if (i16 == i15) {
                    eyVar.h = i14;
                }
                i10++;
            }
            int i17 = f00Var.G;
            if (i17 == b10) {
                f00Var.G = b11;
                f00Var.H = c00Var.f27251a;
            } else if (i17 == b11) {
                f00Var.G = b10;
                f00Var.H = c00Var2.f27251a;
            }
            int i18 = f00Var.m0;
            if (i18 == b10) {
                f00Var.m0 = b11;
                f00Var.f28244n0 = c00Var.f27251a;
            } else if (i18 == b11) {
                f00Var.m0 = b10;
                f00Var.f28244n0 = c00Var2.f27251a;
            }
            arrayList.set(b10, c00Var2);
            arrayList.set(b11, c00Var);
            f00Var.j();
            f00Var.f28257y = true;
            f00Var.B.setItemAnimator(f00Var.f28245o0);
            b00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            f00 f00Var = this.f27901e;
            f00Var.B.I0(false);
            n1Var.f6432a.setPressed(true);
            n1Var.f6432a.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(f00Var.U, f00Var.f28226a));
        } else {
            rp rpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(rpVar);
            AndroidUtilities.runOnUIThread(rpVar, 320L);
        }
        if (n1Var != null) {
            View view = n1Var.f6432a;
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
    public final void q(f2.n1 n1Var) {
    }
}
