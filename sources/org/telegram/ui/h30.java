package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class h30 extends s4.s0 {
    public final j60 f33258a;

    public h30(j60 j60Var) {
        this.f33258a = j60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        j60 j60Var = this.f33258a;
        p50 p50Var = j60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.h3) j60Var).backgroundPaddingTop;
            if ((j60Var.f34036y0 - dp) + i11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && p50Var.canScrollVertically(1)) {
                p50Var.getChildAt(0);
                org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) p50Var.K(0);
                if (fl0Var != null) {
                    View view = fl0Var.f41610a;
                    if (view.getTop() > 0) {
                        p50Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.s40 s40Var = j60Var.m0;
        if (s40Var != null) {
            s40Var.b(true);
        }
        org.telegram.ui.Components.s40 s40Var2 = j60Var.f33987n0;
        if (s40Var2 != null) {
            s40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        j60 j60Var = this.f33258a;
        if (j60Var.Q.getChildCount() > 0 && (call = j60Var.f33936a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && j60Var.Y.N0() > j60Var.P.F - 5) {
                j60Var.f33936a1.loadMembers(false);
            }
            j60.J0(j60Var);
            y50 y50Var = j60Var.U0;
            if (y50Var != null) {
                y50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
