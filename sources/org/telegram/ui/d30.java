package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class d30 extends s4.s0 {
    public final f60 f32500a;

    public d30(f60 f60Var) {
        this.f32500a = f60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        f60 f60Var = this.f32500a;
        l50 l50Var = f60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.f3) f60Var).backgroundPaddingTop;
            if ((f60Var.f33199y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && l50Var.canScrollVertically(1)) {
                l50Var.getChildAt(0);
                org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) l50Var.K(0);
                if (wk0Var != null) {
                    View view = wk0Var.f42627a;
                    if (view.getTop() > 0) {
                        l50Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.j40 j40Var = f60Var.m0;
        if (j40Var != null) {
            j40Var.b(true);
        }
        org.telegram.ui.Components.j40 j40Var2 = f60Var.f33150n0;
        if (j40Var2 != null) {
            j40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        f60 f60Var = this.f32500a;
        if (f60Var.Q.getChildCount() > 0 && (call = f60Var.f33099a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && f60Var.Y.N0() > f60Var.P.F - 5) {
                f60Var.f33099a1.loadMembers(false);
            }
            f60.J0(f60Var);
            u50 u50Var = f60Var.U0;
            if (u50Var != null) {
                u50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
