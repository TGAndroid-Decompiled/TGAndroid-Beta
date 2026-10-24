package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class q20 extends s4.r0 {
    public final u50 f40692a;

    public q20(u50 u50Var) {
        this.f40692a = u50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        org.telegram.ui.Components.vl0 vl0Var;
        u50 u50Var = this.f40692a;
        z40 z40Var = u50Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            z40Var.getChildAt(0);
            i11 = ((org.telegram.ui.ActionBar.h3) u50Var).backgroundPaddingTop;
            if ((u50Var.f42318y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && z40Var.canScrollVertically(1) && (vl0Var = (org.telegram.ui.Components.vl0) z40Var.K(0)) != null) {
                View view = vl0Var.f46342a;
                if (view.getTop() > 0) {
                    z40Var.v0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.p40 p40Var = u50Var.m0;
        if (p40Var != null) {
            p40Var.b(true);
        }
        org.telegram.ui.Components.p40 p40Var2 = u50Var.f42269n0;
        if (p40Var2 != null) {
            p40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        u50 u50Var = this.f40692a;
        if (u50Var.Q.getChildCount() > 0 && (call = u50Var.f42217a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && u50Var.Y.N0() > u50Var.P.F - 5) {
                u50Var.f42217a1.loadMembers(false);
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
