package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class n20 extends s4.r0 {
    public final q50 f39391a;

    public n20(q50 q50Var) {
        this.f39391a = q50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        q50 q50Var = this.f39391a;
        w40 w40Var = q50Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.f3) q50Var).backgroundPaddingTop;
            if ((q50Var.f40476y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && w40Var.canScrollVertically(1)) {
                w40Var.getChildAt(0);
                org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) w40Var.K(0);
                if (sl0Var != null) {
                    View view = sl0Var.f45910a;
                    if (view.getTop() > 0) {
                        w40Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.r40 r40Var = q50Var.m0;
        if (r40Var != null) {
            r40Var.b(true);
        }
        org.telegram.ui.Components.r40 r40Var2 = q50Var.f40427n0;
        if (r40Var2 != null) {
            r40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        q50 q50Var = this.f39391a;
        if (q50Var.Q.getChildCount() > 0 && (call = q50Var.f40375a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && q50Var.Y.N0() > q50Var.P.F - 5) {
                q50Var.f40375a1.loadMembers(false);
            }
            q50.K0(q50Var);
            f50 f50Var = q50Var.U0;
            if (f50Var != null) {
                f50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
            viewGroup.invalidate();
        }
    }
}
