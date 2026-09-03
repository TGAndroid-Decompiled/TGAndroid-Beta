package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class d30 extends f2.z0 {
    public final e60 f33313a;

    public d30(e60 e60Var) {
        this.f33313a = e60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        e60 e60Var = this.f33313a;
        l50 l50Var = e60Var.N;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.g3) e60Var).backgroundPaddingTop;
            if ((e60Var.f33703v0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && l50Var.canScrollVertically(1)) {
                l50Var.getChildAt(0);
                org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) l50Var.K(0);
                if (dl0Var != null) {
                    View view = dl0Var.f5774a;
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
        org.telegram.ui.Components.l40 l40Var = e60Var.f33654j0;
        if (l40Var != null) {
            l40Var.b(true);
        }
        org.telegram.ui.Components.l40 l40Var2 = e60Var.f33658k0;
        if (l40Var2 != null) {
            l40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        e60 e60Var = this.f33313a;
        if (e60Var.N.getChildCount() > 0 && (call = e60Var.X0) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && e60Var.V.N0() > e60Var.M.C - 5) {
                e60Var.X0.loadMembers(false);
            }
            e60.J0(e60Var);
            t50 t50Var = e60Var.R0;
            if (t50Var != null) {
                t50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
