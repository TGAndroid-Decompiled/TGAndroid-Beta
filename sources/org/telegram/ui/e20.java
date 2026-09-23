package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class e20 extends s4.v {
    public final FiltersSetupActivity d;

    public e20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f42627a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f42630f != 2) {
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
        if (c1Var.f42630f != c1Var2.f42630f) {
            return false;
        }
        b20 b20Var = this.d.f30771b;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        FiltersSetupActivity filtersSetupActivity = b20Var.e;
        int i10 = filtersSetupActivity.f30775r;
        ArrayList arrayList = filtersSetupActivity.f30774n;
        if (b10 >= i10 && b11 >= i10) {
            z10 z10Var = (z10) arrayList.get(b10);
            z10 z10Var2 = (z10) arrayList.get(b11);
            if (z10Var != null && z10Var2 != null && (dialogFilter = z10Var.d) != null && (dialogFilter2 = z10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f30775r, z10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f30775r, z10Var.d);
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
            this.d.f30770a.I0(false);
            c1Var.f42627a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new d10(this, 4));
            AndroidUtilities.runOnUIThread(new d10(this, 4), 320L);
        }
        if (c1Var != null) {
            View view = c1Var.f42627a;
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
