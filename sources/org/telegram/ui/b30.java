package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class b30 extends s4.s0 {
    public final d60 f32311a;

    public b30(d60 d60Var) {
        this.f32311a = d60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        d60 d60Var = this.f32311a;
        j50 j50Var = d60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
            if ((d60Var.f33035y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && j50Var.canScrollVertically(1)) {
                j50Var.getChildAt(0);
                org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) j50Var.K(0);
                if (il0Var != null) {
                    View view = il0Var.f42962a;
                    if (view.getTop() > 0) {
                        j50Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.l40 l40Var = d60Var.m0;
        if (l40Var != null) {
            l40Var.b(true);
        }
        org.telegram.ui.Components.l40 l40Var2 = d60Var.f32986n0;
        if (l40Var2 != null) {
            l40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        d60 d60Var = this.f32311a;
        if (d60Var.Q.getChildCount() > 0 && (call = d60Var.f32935a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && d60Var.Y.N0() > d60Var.P.F - 5) {
                d60Var.f32935a1.loadMembers(false);
            }
            d60.J0(d60Var);
            s50 s50Var = d60Var.U0;
            if (s50Var != null) {
                s50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
