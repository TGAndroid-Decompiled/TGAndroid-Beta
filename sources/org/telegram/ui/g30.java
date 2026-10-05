package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class g30 extends s4.s0 {
    public final h60 f36495a;

    public g30(h60 h60Var) {
        this.f36495a = h60Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        h60 h60Var = this.f36495a;
        o50 o50Var = h60Var.Q;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.f3) h60Var).backgroundPaddingTop;
            if ((h60Var.f37007y0 - dp) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && o50Var.canScrollVertically(1)) {
                o50Var.getChildAt(0);
                org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) o50Var.K(0);
                if (il0Var != null) {
                    View view = il0Var.f46538a;
                    if (view.getTop() > 0) {
                        o50Var.w0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.m40 m40Var = h60Var.m0;
        if (m40Var != null) {
            m40Var.b(true);
        }
        org.telegram.ui.Components.m40 m40Var2 = h60Var.f36958n0;
        if (m40Var2 != null) {
            m40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        h60 h60Var = this.f36495a;
        if (h60Var.Q.getChildCount() > 0 && (call = h60Var.f36906a1) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && h60Var.Y.N0() > h60Var.P.F - 5) {
                h60Var.f36906a1.loadMembers(false);
            }
            h60.J0(h60Var);
            w50 w50Var = h60Var.U0;
            if (w50Var != null) {
                w50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
            viewGroup.invalidate();
        }
    }
}
