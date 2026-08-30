package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class b30 extends f2.z0 {
    public final c60 f32777a;

    public b30(c60 c60Var) {
        this.f32777a = c60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        c60 c60Var = this.f32777a;
        j50 j50Var = c60Var.N;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.g3) c60Var).backgroundPaddingTop;
            if ((c60Var.f33184v0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && j50Var.canScrollVertically(1)) {
                j50Var.getChildAt(0);
                org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) j50Var.K(0);
                if (el0Var != null) {
                    View view = el0Var.f5785a;
                    if (view.getTop() > 0) {
                        j50Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.k40 k40Var = c60Var.f33135j0;
        if (k40Var != null) {
            k40Var.b(true);
        }
        org.telegram.ui.Components.k40 k40Var2 = c60Var.f33139k0;
        if (k40Var2 != null) {
            k40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        c60 c60Var = this.f32777a;
        if (c60Var.N.getChildCount() > 0 && (call = c60Var.X0) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && c60Var.V.N0() > c60Var.M.C - 5) {
                c60Var.X0.loadMembers(false);
            }
            c60.J0(c60Var);
            r50 r50Var = c60Var.R0;
            if (r50Var != null) {
                r50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
