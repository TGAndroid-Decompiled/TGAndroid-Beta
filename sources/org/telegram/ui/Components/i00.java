package org.telegram.ui.Components;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class i00 extends f2.b0 {
    public final vp d = new vp(this, 17);
    public final j00 e;

    public i00(j00 j00Var) {
        this.e = j00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        View view = l1Var.f5785a;
        view.setPressed(false);
        view.setBackground(null);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            j00 j00Var = this.e;
            if (!j00Var.f25830n || (l1Var.b() == 0 && ((g00) j00Var.h.get(0)).e && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                return f2.b0.l(0, 0);
            }
        }
        return f2.b0.l(12, 0);
    }

    @Override
    public final boolean k() {
        return this.e.f25830n;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        int i10 = 0;
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked() && ((l1Var.b() == 0 || l1Var2.b() == 0) && !UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
            return false;
        }
        f00 f00Var = this.e.F;
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        j00 j00Var = f00Var.d;
        ArrayList arrayList = j00Var.h;
        SparseIntArray sparseIntArray = j00Var.f25825h0;
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
            int i12 = g00Var.f25005a;
            g00Var.f25005a = g00Var2.f25005a;
            g00Var2.f25005a = i12;
            int i13 = sparseIntArray.get(b10);
            sparseIntArray.put(b10, sparseIntArray.get(b11));
            sparseIntArray.put(b11, i13);
            e00 e00Var = j00Var.G;
            int i14 = g00Var2.f25005a;
            int i15 = g00Var.f25005a;
            org.telegram.ui.ow owVar = (org.telegram.ui.ow) e00Var;
            while (true) {
                org.telegram.ui.ny[] nyVarArr = owVar.f36989b.f37009b0;
                if (i10 >= nyVarArr.length) {
                    break;
                }
                org.telegram.ui.ny nyVar = nyVarArr[i10];
                int i16 = nyVar.h;
                if (i16 == i14) {
                    nyVar.h = i15;
                } else if (i16 == i15) {
                    nyVar.h = i14;
                }
                i10++;
            }
            int i17 = j00Var.H;
            if (i17 == b10) {
                j00Var.H = b11;
                j00Var.I = g00Var.f25005a;
            } else if (i17 == b11) {
                j00Var.H = b10;
                j00Var.I = g00Var2.f25005a;
            }
            int i18 = j00Var.f25831n0;
            if (i18 == b10) {
                j00Var.f25831n0 = b11;
                j00Var.f25832o0 = g00Var.f25005a;
            } else if (i18 == b11) {
                j00Var.f25831n0 = b10;
                j00Var.f25832o0 = g00Var2.f25005a;
            }
            arrayList.set(b10, g00Var2);
            arrayList.set(b11, g00Var);
            j00Var.j();
            j00Var.f25845y = true;
            j00Var.C.setItemAnimator(j00Var.f25833p0);
            f00Var.p(b10, b11);
        }
        return true;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            j00 j00Var = this.e;
            j00Var.C.I0(false);
            l1Var.f5785a.setPressed(true);
            l1Var.f5785a.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(j00Var.V, j00Var.f25814a));
        } else {
            vp vpVar = this.d;
            AndroidUtilities.cancelRunOnUIThread(vpVar);
            AndroidUtilities.runOnUIThread(vpVar, 320L);
        }
        if (l1Var != null) {
            View view = l1Var.f5785a;
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
