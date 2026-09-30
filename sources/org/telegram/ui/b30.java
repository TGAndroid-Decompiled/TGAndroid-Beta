package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class b30 extends s4.s0 {
    public final d60 f32383a;

    public b30(d60 d60Var) {
        this.f32383a = d60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        d60 d60Var = this.f32383a;
        j50 j50Var = d60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.e3) d60Var).backgroundPaddingTop;
            if ((d60Var.f33113y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && j50Var.canScrollVertically(1)) {
                j50Var.getChildAt(0);
                org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) j50Var.K(0);
                if (jl0Var != null) {
                    View view = jl0Var.f43068a;
                    if (view.getTop() > 0) {
                        j50Var.w0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.m40 m40Var = d60Var.m0;
        if (m40Var != null) {
            m40Var.b(true);
        }
        org.telegram.ui.Components.m40 m40Var2 = d60Var.f33064n0;
        if (m40Var2 != null) {
            m40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        d60 d60Var = this.f32383a;
        if (d60Var.Q.getChildCount() > 0 && (call = d60Var.f33013a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && d60Var.Y.N0() > d60Var.P.F - 5) {
                d60Var.f33013a1.loadMembers(false);
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
