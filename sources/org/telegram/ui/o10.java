package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class o10 extends f2.d0 {
    public final FiltersSetupActivity d;

    public o10(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        View view = q1Var.f5501a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        if (q1Var.f5505f != 2) {
            return f2.d0.l(0, 0);
        }
        return f2.d0.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (q1Var.f5505f != q1Var2.f5505f) {
            return false;
        }
        l10 l10Var = this.d.f35477b;
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        FiltersSetupActivity filtersSetupActivity = l10Var.f39968e;
        int i9 = filtersSetupActivity.f35482r;
        ArrayList arrayList = filtersSetupActivity.f35481n;
        if (b10 >= i9 && b11 >= i9) {
            j10 j10Var = (j10) arrayList.get(b10);
            j10 j10Var2 = (j10) arrayList.get(b11);
            if (j10Var != null && j10Var2 != null && (dialogFilter = j10Var.d) != null && (dialogFilter2 = j10Var2.d) != null) {
                int i10 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i10;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f35482r, j10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f35482r, j10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.f35479e = true;
                filtersSetupActivity.Y(true);
            }
        }
        return true;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        Boolean bool;
        if (i9 != 0) {
            this.d.f35476a.I0(false);
            q1Var.f5501a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new o00(this, 4));
            AndroidUtilities.runOnUIThread(new o00(this, 4), 320L);
        }
        if (q1Var != null) {
            View view = q1Var.f5501a;
            int i10 = R.id.dragging;
            if (i9 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i10, bool);
        }
    }

    @Override
    public final void q(f2.q1 q1Var) {
    }
}
