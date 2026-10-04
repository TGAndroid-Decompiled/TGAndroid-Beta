package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class g20 extends s4.v {
    public final FiltersSetupActivity d;

    public g20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f46523a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f46527f != 2) {
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
        if (c1Var.f46527f != c1Var2.f46527f) {
            return false;
        }
        d20 d20Var = this.d.f33751b;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        FiltersSetupActivity filtersSetupActivity = d20Var.f35621e;
        int i10 = filtersSetupActivity.f33756r;
        ArrayList arrayList = filtersSetupActivity.f33755n;
        if (b10 >= i10 && b11 >= i10) {
            b20 b20Var = (b20) arrayList.get(b10);
            b20 b20Var2 = (b20) arrayList.get(b11);
            if (b20Var != null && b20Var2 != null && (dialogFilter = b20Var.d) != null && (dialogFilter2 = b20Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f33756r, b20Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f33756r, b20Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.f33753e = true;
                filtersSetupActivity.Y(true);
            }
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            this.d.f33750a.J0(false);
            c1Var.f46523a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new g10(this, 4));
            AndroidUtilities.runOnUIThread(new g10(this, 4), 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f46523a;
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
