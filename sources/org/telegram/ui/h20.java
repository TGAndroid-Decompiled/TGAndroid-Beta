package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class h20 extends s4.w {
    public final FiltersSetupActivity d;

    public h20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.f47897a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (d1Var.f47901f != 2) {
            return s4.w.l(0, 0);
        }
        return s4.w.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (d1Var.f47901f != d1Var2.f47901f) {
            return false;
        }
        e20 e20Var = this.d.f33600b;
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        FiltersSetupActivity filtersSetupActivity = e20Var.f36964e;
        int i10 = filtersSetupActivity.f33605r;
        ArrayList arrayList = filtersSetupActivity.f33604n;
        if (b10 >= i10 && b11 >= i10) {
            c20 c20Var = (c20) arrayList.get(b10);
            c20 c20Var2 = (c20) arrayList.get(b11);
            if (c20Var != null && c20Var2 != null && (dialogFilter = c20Var.d) != null && (dialogFilter2 = c20Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f33605r, c20Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f33605r, c20Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.f33602e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            this.d.f33599a.I0(false);
            d1Var.f47897a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new wz(this, 5));
            AndroidUtilities.runOnUIThread(new wz(this, 5), 320L);
        }
        if (d1Var != null) {
            View view = d1Var.f47897a;
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
    public final void q(s4.d1 d1Var) {
    }
}
