package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class i20 extends s4.v {
    public final FiltersSetupActivity d;

    public i20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f41610a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f41613f != 2) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (c1Var.f41613f != c1Var2.f41613f) {
            return false;
        }
        f20 f20Var = this.d.f29913b;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        FiltersSetupActivity filtersSetupActivity = f20Var.e;
        int i10 = filtersSetupActivity.f29917r;
        ArrayList arrayList = filtersSetupActivity.f29916n;
        if (b10 >= i10 && b11 >= i10) {
            d20 d20Var = (d20) arrayList.get(b10);
            d20 d20Var2 = (d20) arrayList.get(b11);
            if (d20Var != null && d20Var2 != null && (dialogFilter = d20Var.d) != null && (dialogFilter2 = d20Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f29917r, d20Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f29917r, d20Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            this.d.f29912a.I0(false);
            c1Var.f41610a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new i10(this, 4));
            AndroidUtilities.runOnUIThread(new i10(this, 4), 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f41610a;
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
