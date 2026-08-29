package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class p20 extends f2.a1 {
    public final r50 f41283a;

    public p20(r50 r50Var) {
        this.f41283a = r50Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        int i11;
        r50 r50Var = this.f41283a;
        x40 x40Var = r50Var.M;
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(74.0f);
            i11 = ((org.telegram.ui.ActionBar.f3) r50Var).backgroundPaddingTop;
            if ((r50Var.f41951u0 - dp) + i11 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && x40Var.canScrollVertically(1)) {
                x40Var.getChildAt(0);
                org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) x40Var.K(0);
                if (vk0Var != null) {
                    View view = vk0Var.f6432a;
                    if (view.getTop() > 0) {
                        x40Var.v0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        org.telegram.ui.Components.g40 g40Var = r50Var.f41902i0;
        if (g40Var != null) {
            g40Var.b(true);
        }
        org.telegram.ui.Components.g40 g40Var2 = r50Var.f41906j0;
        if (g40Var2 != null) {
            g40Var2.b(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ChatObject.Call call;
        ViewGroup viewGroup;
        r50 r50Var = this.f41283a;
        if (r50Var.M.getChildCount() > 0 && (call = r50Var.W0) != null) {
            if (!call.loadingMembers && !call.membersLoadEndReached && r50Var.U.N0() > r50Var.L.B - 5) {
                r50Var.W0.loadMembers(false);
            }
            r50.J0(r50Var);
            g50 g50Var = r50Var.Q0;
            if (g50Var != null) {
                g50Var.invalidate();
            }
            viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
            viewGroup.invalidate();
        }
    }
}
