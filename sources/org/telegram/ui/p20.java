package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class p20 extends s4.r0 {
    public final s50 f39959a;

    public p20(s50 s50Var) {
        this.f39959a = s50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        s50 s50Var = this.f39959a;
        y40 y40Var = s50Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.f3) s50Var).backgroundPaddingTop;
            if ((s50Var.f41035y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && y40Var.canScrollVertically(1)) {
                y40Var.getChildAt(0);
                org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) y40Var.K(0);
                if (sl0Var != null) {
                    View view = sl0Var.f45958a;
                    if (view.getTop() > 0) {
                        y40Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.r40 r40Var = s50Var.m0;
        if (r40Var != null) {
            r40Var.b(true);
        }
        org.telegram.ui.Components.r40 r40Var2 = s50Var.f40986n0;
        if (r40Var2 != null) {
            r40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        s50 s50Var = this.f39959a;
        if (s50Var.Q.getChildCount() > 0 && (call = s50Var.f40934a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && s50Var.Y.N0() > s50Var.P.F - 5) {
                s50Var.f40934a1.loadMembers(false);
            }
            s50.K0(s50Var);
            h50 h50Var = s50Var.U0;
            if (h50Var != null) {
                h50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
            viewGroup.invalidate();
        }
    }
}
