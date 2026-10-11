package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class e30 extends s4.t0 {
    public final g60 f37230a;

    public e30(g60 g60Var) {
        this.f37230a = g60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        g60 g60Var = this.f37230a;
        m50 m50Var = g60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.e3) g60Var).backgroundPaddingTop;
            if ((g60Var.f38004y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && m50Var.canScrollVertically(1)) {
                m50Var.getChildAt(0);
                org.telegram.ui.Components.bm0 bm0Var = (org.telegram.ui.Components.bm0) m50Var.K(0);
                if (bm0Var != null) {
                    View view = bm0Var.f47782a;
                    if (view.getTop() > 0) {
                        m50Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.a50 a50Var = g60Var.m0;
        if (a50Var != null) {
            a50Var.b(true);
        }
        org.telegram.ui.Components.a50 a50Var2 = g60Var.f37955n0;
        if (a50Var2 != null) {
            a50Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        g60 g60Var = this.f37230a;
        if (g60Var.Q.getChildCount() > 0 && (call = g60Var.f37903a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && g60Var.Y.N0() > g60Var.P.F - 5) {
                g60Var.f37903a1.loadMembers(false);
            }
            g60.K0(g60Var);
            v50 v50Var = g60Var.U0;
            if (v50Var != null) {
                v50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.e3) g60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
