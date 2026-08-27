package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

public final class o20 extends f2.b1 {

    public final s50 f40978a;

    public o20(s50 s50Var) {
        this.f40978a = s50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s50 s50Var = this.f40978a;
        y40 y40Var = s50Var.M;
        if (i10 != 0) {
            org.telegram.ui.Components.x30 x30Var = s50Var.f42444i0;
            if (x30Var != null) {
                x30Var.b(true);
            }
            org.telegram.ui.Components.x30 x30Var2 = s50Var.f42448j0;
            if (x30Var2 != null) {
                x30Var2.b(true);
                return;
            }
            return;
        }
        if ((s50Var.f42493u0 - AndroidUtilities.dp(74.0f)) + ((org.telegram.ui.ActionBar.e3) s50Var).backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !y40Var.canScrollVertically(1)) {
            return;
        }
        y40Var.getChildAt(0);
        org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) y40Var.K(0);
        if (lk0Var != null) {
            View view = lk0Var.f5789a;
            if (view.getTop() > 0) {
                y40Var.v0(0, view.getTop(), null);
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        s50 s50Var = this.f40978a;
        if (s50Var.M.getChildCount() <= 0 || (call = s50Var.W0) == null) {
            return;
        }
        if (!call.loadingMembers && !call.membersLoadEndReached && s50Var.U.N0() > s50Var.L.B - 5) {
            s50Var.W0.loadMembers(false);
        }
        s50.J0(s50Var);
        h50 h50Var = s50Var.Q0;
        if (h50Var != null) {
            h50Var.invalidate();
        }
        ((org.telegram.ui.ActionBar.e3) s50Var).containerView.invalidate();
    }
}
