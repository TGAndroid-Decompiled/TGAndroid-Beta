package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class c20 extends f2.b0 {
    public final FiltersSetupActivity d;

    public c20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        View view = l1Var.f5785a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        if (l1Var.f5788f != 2) {
            return f2.b0.l(0, 0);
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (l1Var.f5788f != l1Var2.f5788f) {
            return false;
        }
        z10 z10Var = this.d.f31598b;
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        FiltersSetupActivity filtersSetupActivity = z10Var.e;
        int i10 = filtersSetupActivity.f31602r;
        ArrayList arrayList = filtersSetupActivity.f31601n;
        if (b10 >= i10 && b11 >= i10) {
            x10 x10Var = (x10) arrayList.get(b10);
            x10 x10Var2 = (x10) arrayList.get(b11);
            if (x10Var != null && x10Var2 != null && (dialogFilter = x10Var.d) != null && (dialogFilter2 = x10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f31602r, x10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f31602r, x10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            this.d.f31597a.I0(false);
            l1Var.f5785a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new c10(this, 4));
            AndroidUtilities.runOnUIThread(new c10(this, 4), 320L);
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
