package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class g30 extends s4.t0 {
    public final i60 f37903a;

    public g30(i60 i60Var) {
        this.f37903a = i60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        i60 i60Var = this.f37903a;
        o50 o50Var = i60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.e3) i60Var).backgroundPaddingTop;
            if ((i60Var.f38782y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && o50Var.canScrollVertically(1)) {
                o50Var.getChildAt(0);
                org.telegram.ui.Components.gm0 gm0Var = (org.telegram.ui.Components.gm0) o50Var.K(0);
                if (gm0Var != null) {
                    View view = gm0Var.f47897a;
                    if (view.getTop() > 0) {
                        o50Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.c50 c50Var = i60Var.m0;
        if (c50Var != null) {
            c50Var.b(true);
        }
        org.telegram.ui.Components.c50 c50Var2 = i60Var.f38733n0;
        if (c50Var2 != null) {
            c50Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        i60 i60Var = this.f37903a;
        if (i60Var.Q.getChildCount() > 0 && (call = i60Var.f38681a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && i60Var.Y.N0() > i60Var.P.F - 5) {
                i60Var.f38681a1.loadMembers(false);
            }
            i60.K0(i60Var);
            x50 x50Var = i60Var.U0;
            if (x50Var != null) {
                x50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) i60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
