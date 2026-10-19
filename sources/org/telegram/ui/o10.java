package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class o10 extends s4.v {
    public final FiltersSetupActivity d;

    public o10(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f45912a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f45915f != 2) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        MessagesController.DialogFilter dialogFilter;
        MessagesController.DialogFilter dialogFilter2;
        if (b1Var.f45915f != b1Var2.f45915f) {
            return false;
        }
        l10 l10Var = this.d.f33135b;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        FiltersSetupActivity filtersSetupActivity = l10Var.e;
        int i10 = filtersSetupActivity.f33139r;
        ArrayList arrayList = filtersSetupActivity.f33138n;
        if (b10 >= i10 && b11 >= i10) {
            j10 j10Var = (j10) arrayList.get(b10);
            j10 j10Var2 = (j10) arrayList.get(b11);
            if (j10Var != null && j10Var2 != null && (dialogFilter = j10Var.d) != null && (dialogFilter2 = j10Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f33139r, j10Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f33139r, j10Var.d);
                } catch (Exception unused) {
                }
                filtersSetupActivity.e = true;
                filtersSetupActivity.Z(true);
            }
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        Boolean bool;
        if (i10 != 0) {
            this.d.f33134a.I0(false);
            b1Var.f45912a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new dz(this, 5));
            AndroidUtilities.runOnUIThread(new dz(this, 5), 320L);
        }
        if (b1Var != null) {
            View view = b1Var.f45912a;
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
    public final void q(s4.b1 b1Var) {
    }
}
