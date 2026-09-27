package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class e30 extends s4.s0 {
    public final g60 f33117a;

    public e30(g60 g60Var) {
        this.f33117a = g60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        g60 g60Var = this.f33117a;
        m50 m50Var = g60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.g3) g60Var).backgroundPaddingTop;
            if ((g60Var.f33826y0 - dp) + i11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && m50Var.canScrollVertically(1)) {
                m50Var.getChildAt(0);
                org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) m50Var.L(0);
                if (il0Var != null) {
                    View view = il0Var.f43005a;
                    if (view.getTop() > 0) {
                        m50Var.w0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.l40 l40Var = g60Var.m0;
        if (l40Var != null) {
            l40Var.b(true);
        }
        org.telegram.ui.Components.l40 l40Var2 = g60Var.f33777n0;
        if (l40Var2 != null) {
            l40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        g60 g60Var = this.f33117a;
        if (g60Var.Q.getChildCount() > 0 && (call = g60Var.f33726a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && g60Var.Y.N0() > g60Var.P.F - 5) {
                g60Var.f33726a1.loadMembers(false);
            }
            g60.J0(g60Var);
            v50 v50Var = g60Var.U0;
            if (v50Var != null) {
                v50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.g3) g60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
