package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class g30 extends s4.s0 {
    public final i60 f33746a;

    public g30(i60 i60Var) {
        this.f33746a = i60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        i60 i60Var = this.f33746a;
        o50 o50Var = i60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.f3) i60Var).backgroundPaddingTop;
            if ((i60Var.f34510y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && o50Var.canScrollVertically(1)) {
                o50Var.getChildAt(0);
                org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) o50Var.K(0);
                if (vk0Var != null) {
                    View view = vk0Var.f42675a;
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
        org.telegram.ui.Components.i40 i40Var = i60Var.m0;
        if (i40Var != null) {
            i40Var.b(true);
        }
        org.telegram.ui.Components.i40 i40Var2 = i60Var.f34461n0;
        if (i40Var2 != null) {
            i40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        i60 i60Var = this.f33746a;
        if (i60Var.Q.getChildCount() > 0 && (call = i60Var.f34410a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && i60Var.Y.N0() > i60Var.P.F - 5) {
                i60Var.f34410a1.loadMembers(false);
            }
            i60.J0(i60Var);
            x50 x50Var = i60Var.U0;
            if (x50Var != null) {
                x50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
