package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class q20 extends s4.r0 {
    public final u50 f40611a;

    public q20(u50 u50Var) {
        this.f40611a = u50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.wl0 wl0Var;
        u50 u50Var = this.f40611a;
        z40 z40Var = u50Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            z40Var.getChildAt(0);
            i11 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
            if ((u50Var.f42272y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && z40Var.canScrollVertically(1) && (wl0Var = (org.telegram.ui.Components.wl0) z40Var.K(0)) != null) {
                View view = wl0Var.f46343a;
                if (view.getTop() > 0) {
                    z40Var.v0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.r40 r40Var = u50Var.m0;
        if (r40Var != null) {
            r40Var.b(true);
        }
        org.telegram.ui.Components.r40 r40Var2 = u50Var.f42223n0;
        if (r40Var2 != null) {
            r40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        u50 u50Var = this.f40611a;
        if (u50Var.Q.getChildCount() > 0 && (call = u50Var.f42171a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && u50Var.Y.N0() > u50Var.P.F - 5) {
                u50Var.f42171a1.loadMembers(false);
            }
            u50.J0(u50Var);
            j50 j50Var = u50Var.U0;
            if (j50Var != null) {
                j50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
            viewGroup.invalidate();
        }
    }
}
