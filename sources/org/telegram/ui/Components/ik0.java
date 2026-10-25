package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ik0 extends s4.h0 {
    public final int f29311c;
    public final Context d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final boolean f29312f;
    public final pk0 h;

    public ik0(pk0 pk0Var, int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this.h = pk0Var;
        this.f29311c = i10;
        this.d = context;
        this.e = u6Var;
        this.f29312f = z10;
    }

    @Override
    public final int h() {
        int i10;
        pk0 pk0Var = this.h;
        int size = pk0Var.f31586n.size();
        if (!pk0Var.H.isEmpty() && !MessagesController.getInstance(this.f29311c).premiumFeaturesBlocked()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 < this.h.f31586n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f47738f == 0) {
            ((org.telegram.ui.Cells.s6) e1Var.f47735a).setUserReaction((TLRPC.MessagePeerReaction) this.h.f31586n.get(i10));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout s6Var;
        if (i10 != 0) {
            pk0 pk0Var = this.h;
            mb0 mb0Var = pk0Var.J;
            if (mb0Var != null) {
                if (mb0Var.getParent() != null) {
                    ((ViewGroup) pk0Var.J.getParent()).removeView(pk0Var.J);
                }
            } else {
                pk0Var.i();
            }
            Context context = this.d;
            s6Var = new FrameLayout(context);
            View view = new View(context);
            org.telegram.ui.ActionBar.f7.j(view, org.telegram.ui.ActionBar.f7.L(0.06f, org.telegram.ui.ActionBar.y6.E8), this.e);
            s6Var.addView(view, gb1.g(8.0f, -1));
            s6Var.addView(pk0Var.J, gb1.h(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            s6Var = new org.telegram.ui.Cells.s6(0, this.f29311c, this.d, this.e, true, this.f29312f);
        }
        return new s4.e1(s6Var);
    }
}
