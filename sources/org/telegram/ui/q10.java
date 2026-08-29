package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class q10 extends f2.b0 {
    public final FiltersSetupActivity d;

    public q10(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        View view = n1Var.f6432a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        if (n1Var.f6436f != 2) {
            return f2.b0.l(0, 0);
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (n1Var.f6436f != n1Var2.f6436f) {
            return false;
        }
        n10 n10Var = this.d.f35544b;
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        FiltersSetupActivity filtersSetupActivity = n10Var.f40685e;
        int i10 = filtersSetupActivity.f35549r;
        ArrayList arrayList = filtersSetupActivity.f35548n;
        if (b10 >= i10 && b11 >= i10) {
            l10 l10Var = (l10) arrayList.get(b10);
            l10 l10Var2 = (l10) arrayList.get(b11);
            if (l10Var != null && l10Var2 != null && (dialogFilter = l10Var.d) != null && (dialogFilter2 = l10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f35549r, l10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f35549r, l10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.f35546e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            this.d.f35543a.I0(false);
            n1Var.f6432a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new q00(this, 4));
            AndroidUtilities.runOnUIThread(new q00(this, 4), 320L);
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
