package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class j00 extends f2.b0 {
    public final up d = new up(this, 17);
    public final k00 e;

    public j00(k00 k00Var) {
        this.e = k00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        View view = l1Var.f5774a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            k00 k00Var = this.e;
            if (!k00Var.f26106n || (l1Var.b() == 0 && ((h00) k00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.b0.l(0, 0);
            }
        }
        return f2.b0.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f26106n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((l1Var.b() == 0 || l1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        g00 g00Var = this.e.F;
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        k00 k00Var = g00Var.d;
        ArrayList arrayList = k00Var.h;
        SparseIntArray sparseIntArray = k00Var.f26101h0;
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
            int i12 = h00Var.f25280a;
            h00Var.f25280a = h00Var2.f25280a;
            h00Var2.f25280a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            f00 f00Var = k00Var.G;
            int i14 = h00Var2.f25280a;
            int i15 = h00Var.f25280a;
            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) f00Var;
            while (true) {
                org.telegram.ui.py[] pyVarArr = qwVar.f37510b.f37527b0;
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
            int i17 = k00Var.H;
            if (i17 == b10) {
                k00Var.H = b11;
                k00Var.I = h00Var.f25280a;
            } else if (i17 == b11) {
                k00Var.H = b10;
                k00Var.I = h00Var2.f25280a;
            }
            int i18 = k00Var.f26107n0;
            if (i18 == b10) {
                k00Var.f26107n0 = b11;
                k00Var.f26108o0 = h00Var.f25280a;
            } else if (i18 == b11) {
                k00Var.f26107n0 = b10;
                k00Var.f26108o0 = h00Var2.f25280a;
            }
            arrayList.set(b10, h00Var2);
            arrayList.set(b11, h00Var);
            k00Var.j();
            k00Var.f26121y = true;
            k00Var.C.setItemAnimator(k00Var.f26109p0);
            g00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            k00 k00Var = this.e;
            k00Var.C.I0(false);
            l1Var.f5774a.setPressed(true);
            l1Var.f5774a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(k00Var.V, k00Var.f26090a));
        } else {
            up upVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(upVar);
            AndroidUtilities.runOnUIThread(upVar, 320L);
        }
        if (l1Var != null) {
            View view = l1Var.f5774a;
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
    public final void q(f2.l1 l1Var) {
    }
}
