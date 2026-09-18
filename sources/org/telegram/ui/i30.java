package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class i30 extends s4.s0 {
    public final k60 f34427a;

    public i30(k60 k60Var) {
        this.f34427a = k60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        k60 k60Var = this.f34427a;
        q50 q50Var = k60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.g3) k60Var).backgroundPaddingTop;
            if ((k60Var.f35117y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && q50Var.canScrollVertically(1)) {
                q50Var.getChildAt(0);
                org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) q50Var.L(0);
                if (wk0Var != null) {
                    View view = wk0Var.f42702a;
                    if (view.getTop() > 0) {
                        q50Var.w0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.i40 i40Var = k60Var.m0;
        if (i40Var != null) {
            i40Var.b(true);
        }
        org.telegram.ui.Components.i40 i40Var2 = k60Var.f35068n0;
        if (i40Var2 != null) {
            i40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        k60 k60Var = this.f34427a;
        if (k60Var.Q.getChildCount() > 0 && (call = k60Var.f35017a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && k60Var.Y.N0() > k60Var.P.F - 5) {
                k60Var.f35017a1.loadMembers(false);
            }
            k60.J0(k60Var);
            z50 z50Var = k60Var.U0;
            if (z50Var != null) {
                z50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
