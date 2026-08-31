package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class c30 extends f2.a1 {
    public final d60 f35664a;

    public c30(d60 d60Var) {
        this.f35664a = d60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        d60 d60Var = this.f35664a;
        k50 k50Var = d60Var.N;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.h3) d60Var).backgroundPaddingTop;
            if ((d60Var.f36098v0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && k50Var.canScrollVertically(1)) {
                k50Var.getChildAt(0);
                org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) k50Var.K(0);
                if (fl0Var != null) {
                    View view = fl0Var.f5875a;
                    if (view.getTop() > 0) {
                        k50Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.m40 m40Var = d60Var.f36049j0;
        if (m40Var != null) {
            m40Var.b(true);
        }
        org.telegram.ui.Components.m40 m40Var2 = d60Var.f36053k0;
        if (m40Var2 != null) {
            m40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        d60 d60Var = this.f35664a;
        if (d60Var.N.getChildCount() > 0 && (call = d60Var.X0) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && d60Var.V.N0() > d60Var.M.C - 5) {
                d60Var.X0.loadMembers(false);
            }
            d60.J0(d60Var);
            s50 s50Var = d60Var.R0;
            if (s50Var != null) {
                s50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
