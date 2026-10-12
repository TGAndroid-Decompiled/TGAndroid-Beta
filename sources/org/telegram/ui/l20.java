package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class l20 extends s4.v {
    public final FiltersSetupActivity d;

    public l20(FiltersSetupActivity filtersSetupActivity) {
        this.d = filtersSetupActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f44838a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f44841f != 2) {
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
        if (b1Var.f44841f != b1Var2.f44841f) {
            return false;
        }
        i20 i20Var = this.d.f32089b;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        FiltersSetupActivity filtersSetupActivity = i20Var.e;
        int i10 = filtersSetupActivity.f32093r;
        ArrayList arrayList = filtersSetupActivity.f32092n;
        if (b10 >= i10 && b11 >= i10) {
            g20 g20Var = (g20) arrayList.get(b10);
            g20 g20Var2 = (g20) arrayList.get(b11);
            if (g20Var != null && g20Var2 != null && (dialogFilter = g20Var.d) != null && (dialogFilter2 = g20Var2.d) != null) {
                int i11 = dialogFilter.order;
                dialogFilter.order = dialogFilter2.order;
                dialogFilter2.order = i11;
                ArrayList<MessagesController.DialogFilter> arrayList2 = filtersSetupActivity.getMessagesController().dialogFilters;
                try {
                    arrayList2.set(b10 - filtersSetupActivity.f32093r, g20Var2.d);
                    arrayList2.set(b11 - filtersSetupActivity.f32093r, g20Var.d);
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
            this.d.f32088a.I0(false);
            b1Var.f44838a.setPressed(true);
        } else {
            AndroidUtilities.cancelRunOnUIThread(new zz(this, 5));
            AndroidUtilities.runOnUIThread(new zz(this, 5), 320L);
        }
        if (b1Var != null) {
            View view = b1Var.f44838a;
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
