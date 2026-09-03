package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class e20 extends f2.b0 {
    public final FiltersSetupActivity d;

    public e20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        View view = l1Var.f5774a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        if (l1Var.f5777f != 2) {
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
        if (l1Var.f5777f != l1Var2.f5777f) {
            return false;
        }
        b20 b20Var = this.d.f31572b;
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        FiltersSetupActivity filtersSetupActivity = b20Var.e;
        int i10 = filtersSetupActivity.f31576r;
        ArrayList arrayList = filtersSetupActivity.f31575n;
        if (b10 >= i10 && b11 >= i10) {
            z10 z10Var = (z10) arrayList.get(b10);
            z10 z10Var2 = (z10) arrayList.get(b11);
            if (z10Var != null && z10Var2 != null && (dialogFilter = z10Var.d) != null && (dialogFilter2 = z10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f31576r, z10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f31576r, z10Var.d);
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
            this.d.f31571a.I0(false);
            l1Var.f5774a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new d10(this, 4));
            AndroidUtilities.runOnUIThread(new d10(this, 4), 320L);
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
