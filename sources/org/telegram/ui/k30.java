package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class k30 extends s4.r0 {
    public final n60 f37223a;

    public k30(n60 n60Var) {
        this.f37223a = n60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        n60 n60Var = this.f37223a;
        t50 t50Var = n60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.e3) n60Var).backgroundPaddingTop;
            if ((n60Var.f38258y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && t50Var.canScrollVertically(1)) {
                t50Var.getChildAt(0);
                org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) t50Var.K(0);
                if (wl0Var != null) {
                    View view = wl0Var.f44838a;
                    if (view.getTop() > 0) {
                        t50Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.v40 v40Var = n60Var.m0;
        if (v40Var != null) {
            v40Var.b(true);
        }
        org.telegram.ui.Components.v40 v40Var2 = n60Var.f38209n0;
        if (v40Var2 != null) {
            v40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        n60 n60Var = this.f37223a;
        if (n60Var.Q.getChildCount() > 0 && (call = n60Var.f38157a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && n60Var.Y.N0() > n60Var.P.F - 5) {
                n60Var.f38157a1.loadMembers(false);
            }
            n60.K0(n60Var);
            c60 c60Var = n60Var.U0;
            if (c60Var != null) {
                c60Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
