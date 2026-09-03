package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class d20 extends f2.b0 {
    public final FiltersSetupActivity d;

    public d20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        View view = m1Var.f5875a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        if (m1Var.f5879f != 2) {
            return f2.b0.l(0, 0);
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (m1Var.f5879f != m1Var2.f5879f) {
            return false;
        }
        a20 a20Var = this.d.f34118b;
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        FiltersSetupActivity filtersSetupActivity = a20Var.f35001e;
        int i10 = filtersSetupActivity.f34123r;
        ArrayList arrayList = filtersSetupActivity.f34122n;
        if (b10 >= i10 && b11 >= i10) {
            x10 x10Var = (x10) arrayList.get(b10);
            x10 x10Var2 = (x10) arrayList.get(b11);
            if (x10Var != null && x10Var2 != null && (dialogFilter = x10Var.d) != null && (dialogFilter2 = x10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f34123r, x10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f34123r, x10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.f34120e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            this.d.f34117a.I0(false);
            m1Var.f5875a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new c10(this, 4));
            AndroidUtilities.runOnUIThread(new c10(this, 4), 320L);
        }
        if (m1Var != null) {
            View view = m1Var.f5875a;
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
    public final void q(f2.m1 m1Var) {
    }
}
